import java.awt.GridLayout;
import java.awt.TextArea;
import javax.swing.*;

public class BoxGUI extends JFrame {
	TextArea rawBoxes, sortBoxes;
	
	//Using similar BoxGUI from Project2
	public BoxGUI(String title, int height, int width) {
		setTitle(title);
		setSize(height, width);
		setLocation(600, 600);
		createMenu();
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(new GridLayout(1,2));
		this.rawBoxes = new TextArea();
		this.sortBoxes = new TextArea();
		this.getContentPane().add(rawBoxes);
		this.getContentPane().add(sortBoxes);
		setVisible(true);
	}
	
	private void createMenu() {
		JMenuItem item;
		JMenuBar menuBar = new JMenuBar();
		JMenu fileMenu = new JMenu("File");
		FileMenuHandler fmh = new FileMenuHandler(this);
		ToolsMenuHandler tmh = new ToolsMenuHandler(this);
		
		item = new JMenuItem("Open"); //Opens
		item.addActionListener(fmh);
		fileMenu.add(item);
		
		fileMenu.addSeparator();  
		
		item = new JMenuItem("Quit"); //Quits program
		item.addActionListener(fmh);
		fileMenu.add(item);
		
		menuBar.add(fileMenu);
		
		JMenu toolMenu = new JMenu("Tools");
		
		item = new JMenuItem("Search");
		item.addActionListener(tmh);
		toolMenu.add(item);
		
		setJMenuBar(menuBar);
		menuBar.add(toolMenu);
	}

	public void setTextArea (String left, String right) {
		this.rawBoxes.setText(left);
		this.sortBoxes.setText(right);
	}
}