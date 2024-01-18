package day0118;

import java.awt.Color;
import java.awt.Container;

import javax.swing.JFrame;

public class SwingStart_02 extends JFrame {

	Container cp;
	
	public SwingStart_02(String title) {
		super(title);
		
		cp=this.getContentPane();
		
		this.setBounds(300, 100, 300, 300);
		cp.setBackground(new Color(255,153,153));
		this.setVisible(true);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new SwingStart_02("스윙시작");
	}
}

//ctrl shift o