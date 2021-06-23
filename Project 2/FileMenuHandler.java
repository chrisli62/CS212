import javax.swing.*;
import java.awt.*;
import java.avt.event*;
import java.io.*;

public class FileMenuHandler implements ActionListener{
    Jframe jframe;

    public FileMenuHandler(Jframe frame){
        jframe = frame;
    }

    public void ActionPerform(ActionEvent event){
        String menuName = event.getActionCommand();
        if(menuName.equals("Open")){
            final JFileChooser fileChoose = new JFileChooser();
            fileChoose.showOpenDialog(null);
            File file = fileChoose.getSelectedFile();
            String input = file.getPath();
            Project3.readNumber(input);
            ((BoxGUI) this.jframe).setTextArea(Project3.unsortBox, Project3.sortBox);
        }
        else if(menuName.equals("Quit")){
            System.exit(0);
        }
    }
}