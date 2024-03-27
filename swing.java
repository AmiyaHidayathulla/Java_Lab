package ExamPractice;
//import java.awt.FlowLayout;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
public class SwingTest1 implements ActionListener {
	JButton jb1,jb2;
	JFrame frame;
	JLabel label;
	JTextField tb;
	JPanel p;
	String msg;
	SwingTest1(){
		frame=new JFrame("FRAME");
		label=new JLabel("LABEL=");
	    tb=new JTextField(20);
	    jb1=new JButton("Submit");
	    jb2=new JButton("Retry");
	    p=new JPanel();
		p.setLayout(new FlowLayout(FlowLayout.CENTER));
		p.add(label);
		p.add(tb);
		p.add(jb1);
		p.add(jb2);
		frame.add(p);
		frame.setSize(400, 400);
		frame.setVisible(true);
		
		jb1.addActionListener(this);
		jb2.addActionListener(this);
		tb.addActionListener(this);
		}
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource()==jb1)
		{
			tb.setText("Success");
		}
		if(e.getSource()==jb2)
		{
			tb.setText("Re-entry");
		}
		
	}
	public static void main(String[] args) {
		new SwingTest1();
}
}
	
	
