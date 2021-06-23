public abstract class BoxList{
    protected BoxNode first;
    protected BoxNode last;
    protected int length;
    
    public BoxList(){
        this.first = new BoxNode(null);
        this.last.next = temp;
        this.last = temp;
        this.length++;
    }

    public int getLength(){
        return length;
    }

    public void append(Box b){
        BoxNode temp = new BoxNode(b);
        this.last.next = temp;
        this.last = temp;
        this.length++;
    }

    public abstract void add(Box b)

    public String toString(){
        String result = "";
        BoxNode cur = this.first.next;
        while(cur != null){
            result += cur.box.toString() + "\n"
            cur = cur.next;
        }
        return result;
    }
}