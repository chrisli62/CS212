import java.util.StringTokenizer;

public class Project1{

    public static StringTokenizer Tokens;
    public static Box[] rowBoxes = new Box[100];
    public static Box[] sortedBoxes = new Box[100];
    public static BoxGUI gui;
    public static int size;

    public static void readFile(String fileName){
        TextFileInput input = new TextFileInput(fileName);
        String line = input.readLine();
        StringTokenizer Tokens;
        int index = 0;
        while(line != null && index < 100){
            Tokens = new StringTokenizer(line, ",");
            try{
            	int length, width, height;
            	length = Integer.parseInt(Tokens.nextToken());
            	width = Integer.parseInt(Tokens.nextToken());
            	height = Integer.parseInt(Tokens.nextToken());
            	Box newBox = new Box(length, width, height);
            	
                rowBoxes[index] = newBox;
                sortedBoxes[index] = newBox;
                index++;
            }
            catch(IllegalArgumentException e){
                System.out.println(e + ": " + line);
            }
            line = input.readLine();
        }
        size = index;
    }

    public static void selectionSortBox(Box[] sorted){
        for(int i = 0; i < (size - 1); i++){
            int minIndex = i;
            for(int j = i+1; j < size; j++){
                if(sorted[minIndex].compareTo(sorted[j]) > 0){
                    minIndex = j;
                }
            }
            Box temp = new Box();
            temp = sorted[minIndex];
            sorted[minIndex] = sorted[i];
            sorted[i] = temp;
        }
    }

    public static void main(String[] args){
        readFile(args[0]);
        selectionSortBox(sortedBoxes);
        String row = "";
        String sorted = "";
        for(int i = 0; i < size; i++){
            row += rowBoxes[i].toString() + "\n";
            sorted += sortedBoxes[i].toString() + "\n";
        }
        BoxGUI.initialize();
        BoxGUI.rowBoxes.setText(row);
        BoxGUI.sortedBoxes.setText(sorted);
        BoxGUI.myFrame.setVisible(true);
    }
}
