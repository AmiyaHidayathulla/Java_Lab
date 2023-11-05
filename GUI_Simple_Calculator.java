package OOPJLAB;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.text.JTextComponent;

public class SimpleCalculator implements ActionListener{
	JTextField t1;
	JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14,b15,b16;
	SimpleCalculator(){
		JFrame f = new JFrame("Simple Calculator");
		JPanel p = new JPanel();
		p.setLayout(null);
		t1 = new JTextField();
		t1.setBounds(100,100,200,30);
		
		b1 = new JButton("1");
		b1.setBounds(100,140,50,30);
		b2 = new JButton("2");
		b2.setBounds(150,140,50,30);
		b3 = new JButton("3");
		b3.setBounds(200,140,50,30);
		b4 = new JButton("+");
		b4.setBounds(250,140,50,30);
		
		b5 = new JButton("4");
		b5.setBounds(100,170,50,30);
		b6 = new JButton("5");
		b6.setBounds(150,170,50,30);
		b7 = new JButton("6");
		b7.setBounds(200,170,50,30);
		b8 = new JButton("-");
		b8.setBounds(250,170,50,30);
		
		b9 = new JButton("7");
		b9.setBounds(100,200,50,30);
		b10 = new JButton("8");
		b10.setBounds(150,200,50,30);
		b11 = new JButton("9");
		b11.setBounds(200,200,50,30);
		b12 = new JButton("*");
		b12.setBounds(250,200,50,30);
		
		b13 = new JButton("/");
		b13.setBounds(100,230,50,30);
		b14 = new JButton("0");
		b14.setBounds(150,230,50,30);
		b15 = new JButton("=");
		b15.setBounds(200,230,50,30);
		b16 = new JButton("C");
		b16.setBounds(250,230,50,30);
	
		p.add(t1);
		p.add(b1);
		p.add(b2);
		p.add(b3);
		p.add(b4);
		p.add(b5);
		p.add(b6);
		p.add(b7);
		p.add(b8);
		p.add(b9);
		p.add(b10);
		p.add(b11);
		p.add(b12);
		p.add(b13);
		p.add(b14);
		p.add(b15);
		p.add(b16);
		f.setContentPane(p);
		f.setSize(400,400);
		f.setVisible(true);
		
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		b5.addActionListener(this);
		b6.addActionListener(this);
		b7.addActionListener(this);
		b8.addActionListener(this);
		b9.addActionListener(this);
		b10.addActionListener(this);
		b11.addActionListener(this);
		b12.addActionListener(this);
		b13.addActionListener(this);
		b14.addActionListener(this);
		b15.addActionListener(this);
		b16.addActionListener(this);		
	}
	

	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==b1)
			t1.setText(t1.getText().concat("1"));
		if(e.getSource()==b2)
			t1.setText(t1.getText().concat("2"));
		if(e.getSource()==b3)
			t1.setText(t1.getText().concat("3"));
		if(e.getSource()==b4)
			t1.setText(t1.getText().concat("+"));
		if(e.getSource()==b5)
			t1.setText(t1.getText().concat("4"));
		if(e.getSource()==b6)
			t1.setText(t1.getText().concat("5"));
		if(e.getSource()==b7)
			t1.setText(t1.getText().concat("6"));
		if(e.getSource()==b8)
			t1.setText(t1.getText().concat("-"));
		if(e.getSource()==b9)
			t1.setText(t1.getText().concat("7"));
		if(e.getSource()==b10)
			t1.setText(t1.getText().concat("8"));
		if(e.getSource()==b11)
			t1.setText(t1.getText().concat("9"));
		if(e.getSource()==b12)
			t1.setText(t1.getText().concat("*"));
		if(e.getSource()==b13)
			t1.setText(t1.getText().concat("/"));
		if(e.getSource()==b14)
			t1.setText(t1.getText().concat("0"));
		if(e.getSource()==b15)
			t1.setText(t1.getText().concat("="));
		if(e.getSource()==b16)
			t1.setText(t1.getText().concat("C"));	
	}
	public static void main(String[] args) {
		new SimpleCalculator();
	}
}
