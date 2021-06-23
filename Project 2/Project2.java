import.java.util.StringTokenizer;

public class Project2{
    public static StringTokenizer;
    public static BoxList sorted_boxes, unsorted_boxes;
    public static BoxGUI gui;

    public static void readNumber(String fileName){
        sorted_boxes = new SortedBoxList();
        unsorted_boxes = new UnsortedBoxList();
        TextFileInput input = new TextFileInput(fileName);
        StringTokenizer Tokens;
        while(line != null){
            Tokens = new StringTokenizer(line, ",");
            try{
                Box temp = new Box(Integer.parseInt(Tokens.nextToken()), Integer.parseInt(Tokens.nextToken()), 
                    Integer.parseInt(Tokens.nextToken()));
                sorted_boxes.add(temp);
                unsorted_boxes.add(temp);
            }
            catch(IllegalArguementException e){
                System.out.println(e + ": " + line);
            }
            line = input.readLine();
        }
    }

    public static void display(){
        BoxGUI.initialization();
        BoxGUI.rowBoxes.setText(unsorted_boxes.toString());
        BoxGUI.sorted_boxes.setText(sorted_boxes.toStrin());
        BoxGUI.frame.setVisible(True);
    }

    public static void main(String[] args){
        readNumber(args[0]);
        display();
    }
}