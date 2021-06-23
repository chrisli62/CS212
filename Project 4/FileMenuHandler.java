import javax.swing.*;
import java.awt.event.*;
import java.io.*;

public class FileMenuHandler implements ActionListener{
    JFrame jframe;

    public FileMenuHandler(JFrame frame){
        jframe = frame;
    }
    public void actionPerformed(ActionEvent event){
        String menuName = event.getActionCommand();
        if(menuName.equals("Open")){ //Open to get file
            final JFileChooser fileChoose = new JFileChooser();
            fileChoose.showOpenDialog(null);
            File file = fileChoose.getSelectedFile();
            String input = file.getPath();
            Project4.readValue(input);
            String left = "", right = "";
            for(int i = 0; i < Project4.unsortBox.size(); i++) {
            	left += Project4.unsortBox.get(i).toString() + "\n";
            }
            for(Box b : Project4.sortBox.keySet()) {
            	int rep = Project4.sortBox.get(b);
            	for(int i = 0; i < rep; i++) {
            		right += b.toString() + "\n";
            	}
            }
            ((BoxGUI) this.jframe).setTextArea(left, right);
        }
        else if(menuName.equals("Quit")){ //Exits program when Quit is clicked on
            System.exit(0);
        }
    }
}