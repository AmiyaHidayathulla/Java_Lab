package OOPJLAB;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
public class GUITrafficLight extends JPanel implements ActionListener  {

JRadioButton r1,r2,r3;
Color red,yellow,green;
public GUITrafficLight()
{
	r1=new JRadioButton("RED");
	r2=new JRadioButton("YELLOW");
	r3=new JRadioButton("GREEN");
	r1.setSelected(true);
	red=Color.red;
	yellow=getBackground();
	green=getBackground();
	ButtonGroup bg=new ButtonGroup();
	bg.add(r1);
	bg.add(r2);
	bg.add(r3);
	
	add(r1);
	add(r2);
	add(r3);
	
	r1.addActionListener(this);
	r2.addActionListener(this);
	r3.addActionListener(this);

}

public void paintComponent(Graphics g)
{
super.paintComponent(g);
g.drawOval(50, 50, 50, 50);
g.drawOval(50, 110, 50, 50);
g.drawOval(50, 170, 50, 50);
g.setColor(red);
g.fillOval(50,50,50,50);
g.setColor(yellow);
g.fillOval(50,110,50,50);
g.setColor(green);
g.fillOval(50,170,50,50);

}
public void actionPerformed(ActionEvent e) {

if(r1.isSelected()==true)
{
red=Color.red;
yellow=getBackground();
green=getBackground();

}
else if(r2.isSelected()==true)
{
yellow=Color.yellow;
red=getBackground();
green=getBackground();
}
else if(r3.isSelected()==true)
{
green=Color.green;
red=getBackground();
yellow=getBackground();
}
repaint();
}
public static void main(String[] args) {
GUITrafficLight obj=new GUITrafficLight();
JFrame f=new JFrame("Traffic Light");
f.setSize(300,300);
f.setVisible(true);
f.add(obj);
}
}

