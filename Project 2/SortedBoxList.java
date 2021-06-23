public class SortedBoxList extends BoxList{
    public SortedBoxList(){
        super();
    }

    public void add(Box b){
        BoxNode temp = new BoxNode(b);
        BoxNode pre = this.first;
        while(pre.next != null && pre.next.box.compareTo(b) < 0){
            pre = pre.next;
        }
        temp.next = pre.next;
        pre.next = temp;
        this.length++;
    }
}