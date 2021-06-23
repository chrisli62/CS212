import java.util.StringTokenizer;

public class Project3{
    public static StringTokenizer tokens;
    public static BoxList sortBox, unsortBox;
    public static BoxGUI gui;

    public static void readValue(String fileName){
        sortBox = new SortedBoxList();
        unsortBox = new UnsortedBoxList();
        TextFileInput = new TextFileInput(fileName);
        String line = input.readline();
        while(line == null){
            tokens = new StringTokenizer(line, " ");
            try{
                Box temp = new Box(Integer.parseInt(tokens.nextToken()), 
                    Integer.parseInt(tokens.nextToken()), 
                    Integer.parseInt(tokens.nextToken());
                sortBox.add(temp);
                unsortBox.add(temp);
            }
            catch(IllegalBoxException exception){
                System.err.println(exception + " " + line);
            }
        }

        public static void main(String[] args){
            BoxGUI gui = new BoxGUI("Project3", 500, 500);
        }
    }
}