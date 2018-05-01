package jamsimanyo.view;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class View extends JFrame{
	JPanel header = new JPanel();
	JPanel contents = new JPanel();
	JPanel rContents = new JPanel();
	JPanel footer = new JPanel();
	public void header() {
		
	}
	public void contents() {
		
	}
	public void footer() {
		
	}
	public void comInit() {
		header();
		contents();
		footer();
	}
	public View() {
		this.setSize(900,700);
		this.setTitle("jamsimanyo");
		this.setResizable(false);
		this.setLocationRelativeTo(this);
		this.setLayout(new BorderLayout());
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		comInit();
		this.setVisible(true);
	}
}
