package LabEXamPractice;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class CounterGUI implements ActionListener{
JButton up,down,reset;
JTextField t;
JLabel l;
CounterGUI(){
JFrame f = new JFrame("COUNTER");
JPanel p=new JPanel();
p.setLayout(new FlowLayout());
up = new JButton("Count UP");
down = new JButton("Count DOWN");
reset = new JButton("RESET");
t = new JTextField("0",10);
l=new JLabel("Counter :");
//l.setBounds(10, 10, 60, 30);
//t.setBounds(80, 10, 60, 30);
//up.setBounds(150, 10, 100, 30);
//down.setBounds(260, 10, 100, 30);
//reset.setBounds(370, 10, 100, 30);

up.addActionListener(this);
down.addActionListener(this);
reset.addActionListener(this);
p.add(l);
p.add(t);
p.add(up);
p.add(down);
p.add(reset);
f.add(p);
f.setSize(500,100);
f.setVisible(true);
}
public static void main(String[] args) {
new CounterGUI();
}

public void actionPerformed(ActionEvent e) {
if(e.getSource()==reset) {
t.setText("0");
}
if(e.getSource()==up) {
int num=Integer.parseInt(t.getText());
num++;
t.setText(Integer.toString(num));
}
if(e.getSource()==down) {
int num=Integer.parseInt(t.getText());
num--;
t.setText(Integer.toString(num));
}
}

}
