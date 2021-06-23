import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.StringTokenizer;

public class ToolsMenuHandler implements ActionListener{
    JFrame jframe;

    public ToolsMenuHandler(JFrame frame){
        jframe = frame;
    }

    public void actionPerformed(ActionEvent event){
        String menuName = event.getActionCommand();
        if(menuName.equals("Search")){ //Search
            if(Project4.sortBox == null){
                JOptionPane.showMessageDialog(null, "Please select a file to display a list of boxes");
                return;
            }
            String input = JOptionPane.showInputDialog(null, "Input the dimensions of the box with the format xx,xx,xx");
            StringTokenizer tokens = new StringTokenizer(input, ",");
            if(tokens.countTokens() != 3){
                JOptionPane.showMessageDialog(null, "Please follow the format");
                return;
            }
            int width, length, height;
            try {
                width = Integer.parseInt(tokens.nextToken());
                length = Integer.parseInt(tokens.nextToken());
                height = Integer.parseInt(tokens.nextToken());
        	}
            catch(NumberFormatException e){
                JOptionPane.showMessageDialog(null, "Please input 3 values for the dimension of the box");
                return;
            }

            if(width < 1 || length < 1 || height < 1){ //Values cannot be less than 1
                JOptionPane.showMessageDialog(null, "Please input valid values for the dimension of the box");
            }

            int volume = width * length * height;
            JFrame resultFrame = new JFrame();
            resultFrame.setTitle("Boxes that fit for " + volume);
            resultFrame.setSize(400,400);
            resultFrame.setLocation(250,250);
            TextArea resultTextArea = new TextArea();
			resultFrame.getContentPane().add(resultTextArea);

            for(Box b : Project4.sortBox.keySet()){
            	if(b.volumn() >= volume) {
            		int rep = Project4.sortBox.get(b);
            		for(int i = 0; i < rep; i++){
            			resultTextArea.append(b.toString() + "\n");
            		}
            	}
            }
            resultFrame.setVisible(true);
        }
    }
}