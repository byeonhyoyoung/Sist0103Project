package day0119;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionListener;
import java.awt.event.ItemListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Quiz_08 extends JFrame implements ActionListener, ItemListener{

	
	Container cp;
	JCheckBox [] cbCountry=new JCheckBox[4];
	JCheckBox cbGender;
	JButton [] btnColor;
	JLabel lblResult;
	
	
	public Quiz_08(String title) {  
		super(title);
		
		cp=this.getContentPane();
		
		this.setBounds(300, 100, 300, 300);
		cp.setBackground(new Color(255,204,204));
		initDesign();
		this.setVisible(true);
	}
	
	public void initDesign()
	{
		this.setLayout(null);
		
		cbGender=new JCheckBox("남자");
		cbGender.setBounds(20, 20, 100, 30);
		cbGender.setOpaque(false);
		cbGender.addItemListener(this);
		this.add(cbGender);
		
		//하단 결과물
		
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		new Quiz_08("0119 주말 과제물"); 
	}
	

}