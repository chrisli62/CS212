import java.util.HashMap;
import java.util.StringTokenizer;
import java.util.TreeMap;

public class Project4 {
	public static StringTokenizer Tokens;
	public static HashMap<Integer, Box> unsortBox;
	public static TreeMap<Box, Integer> sortBox;
	public static BoxGUI gui;
	
	public static void readValue (String fileName) {
		sortBox = new TreeMap<Box, Integer>();
		unsortBox = new HashMap<Integer, Box>();
		TextFileInput input = new TextFileInput(fileName);
		String line = input.readLine();
		int index = 0;
		
		while (line != null) {
			Tokens = new StringTokenizer(line, ",");
			try {
				Box temp = new Box(Integer.parseInt(Tokens.nextToken()), Integer.parseInt(Tokens.nextToken()),
						Integer.parseInt(Tokens.nextToken()));
				unsortBox.put(index++, temp);
				if (sortBox.containsKey(temp)) {
					sortBox.put(temp,  sortBox.get(temp)+1);
				} else {
					sortBox.put(temp, 1);
				}
			} catch (IllegalBoxException e) {
				System.err.println (e + ": " + line);
			}
			line = input.readLine();
		}
	}
	
	public static void main(String[] args) {
		BoxGUI gui = new BoxGUI ("Project4", 500, 400);
	}

}