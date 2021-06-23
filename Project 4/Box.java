
public class Box implements Comparable<Box> {
	private int length, width, height;
	
	public Box() {
		length = 1;
		width = 1;
		height = 1;
	}
	
	public Box(int length, int width, int height) {
		if (length < 1 || width < 1 || height < 1) {
			throw new IllegalBoxException("Parameters should not be less than one");
			// catch illegalBoxException.
		} else {
			this.length = length;
			this.width = width;
			this.height = height;
		}
	}
	
	public int getLength() {
		return length;
	}
	
	public void setLength (int length) {
		if (length < 1) {
			throw new IllegalArgumentException("Length should not be less than one");
		}
		this.length = length;
		
	}
	
	public int getWidth() {
		return width;
	}
		
	public void setWidth (int width) {
		if (width < 1) {
			throw new IllegalArgumentException("Width should not be less than one");
		}
		this.width = width;
	}
	
	public int getHeight() {
		return height;
	}
	
	public void setHeight (int height) {
		if (height < 1) {
			throw new IllegalArgumentException("Height should not be less than one");
		}
		this.height = height;
	}
	
	public int volumn() {
		return this.length * this.width * this.height;
	}
	
	public boolean equals (Object other) {
		if (this == other) {
			return true;
		}
		if (other != null && this.getClass().equals(other.getClass())) {
			return this.length == ((Box) other).getLength() &&
					this.width == ((Box) other).getWidth() &&
					this.height == ((Box) other).getHeight();
		}
		return false;
	}
	
	public String toString() {
		return "L:" + this.length + " W:" + this.width + " H:" + this.height +
				"  (V: " + this.volumn() +")";
	}
	
	public int compareTo (Box other) {
		return this.volumn() - other.volumn();
	}
}