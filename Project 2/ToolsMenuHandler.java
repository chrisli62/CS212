import javax.swing.*;
import java.awt.*;
import java.avt.event*;
import java.io.*;
import java.util.StringTokenizer;

public class ToolsMenuHandler implements ActionListener{
    Jframe jframe;

    public FileMenuHandler(Jframe frame){
        jframe = frame;
    }

    public void ActionPerform(ActionEvent event){
        String menuName = event.getActionCommand();
        if(menuName.equals("Search")){
            if(Project3.sortBox == null){
                JOptionPane.showMessageDialog(null, "Please select a file to display a list of boxes")
                return;
            }
            String input = JOptionPane.showInputDialog(null, "Input the dimensions of the box with the format xx,xx,xx");
            StringTokenizer tokens = new StringTokenizer(input, "Input the 3 dimensions of the box");
            if(tokens.countTokens() != 1){
                JOptionPane.showMessageDialog(null, " ");
                return;
            }
            int width, length, height;
            try(
                width = Integer.parseInt(tokens.nextToken);
                length = Integer.parseInt(tokens.nextToken);
                height = Integer.parseInt(tokens.nextToken);
            )
            catch(NumberFormatException e){
                JOptionPane.showMessageDialog(null, "Please input 3 values for the dimension of the box");
                return;
            }

            if(width < 1 || length < 1 || height < 1){
                JOptionPane.showMessageDialog(null, "Please input valid values for the dimension of the box")
            }

            int volume = width * length * height;
            JFrame resultFrame = new Jframe();
            resultFrame.setsize(400,400);
            resultFrame.setlocation(250;250);
            myFrame.setTitle("Boxes that fit for " + volume);

            BoxNode cur = Project3.sortBox.first.next;
            while(cur != null){
                if(cur.box.volume() >= volume){
                    resultTextArea.append(cur.box.toString() + "\n");
                }
                cur = cur.next;
            }
            resultFrame.setVisible(true);
        }
    }
}