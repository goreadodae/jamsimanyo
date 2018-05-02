package jamsimanyo.view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;


public class ServerView extends JFrame{
	JPanel header = new JPanel();
	JPanel contents = new JPanel();
	JPanel rContents = new JPanel();
	JPanel footer = new JPanel();
	ArrayList <JPanel> student = new ArrayList<JPanel>();
	public void header() {
		header.setPreferredSize(new Dimension(800, 60));
		this.add(header, BorderLayout.NORTH);
	}
	public void contents() {
		contents.setPreferredSize(new Dimension(800*12/15, 600*4/5));
		rContents.setPreferredSize(new Dimension(800*2/15, 600*4/5));
		contents.setBackground(Color.white);
		contents.setLayout(new GridLayout(5,7));
		for(int i=0;i<30;i++) {
			student.add(new JPanel());
			if(i%2==1)	student.get(i).setBackground(Color.black);
			else student.get(i).setBackground(Color.yellow);
			contents.add(student.get(i));
		}
		this.add(contents, BorderLayout.CENTER);
		this.add(rContents, BorderLayout.WEST);
	}
	public void footer() {
		footer.setPreferredSize(new Dimension(800, 600/10));
		this.add(footer, BorderLayout.SOUTH);
	}
	public void comInit() {
		header();
		contents();
		footer();
	}
	public ServerView() {
		this.setSize(800,600);
		this.setTitle("jamsimanyo");
		this.setResizable(false);
		this.setLocationRelativeTo(this);
		this.setLayout(new BorderLayout());
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		comInit();
		this.setVisible(true);
	}
}
