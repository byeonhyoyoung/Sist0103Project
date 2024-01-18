package day0118;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class SwingBtnEvent_05 extends JFrame implements ActionListener{
	
	Container cp;
	JButton btn1,btn2;
	
	public SwingBtnEvent_05(String title) {  

		super(title);
		
		cp=this.getContentPane();
		
		this.setBounds(300, 100, 300, 300);
		cp.setBackground(new Color(255,153,153));
		initDesign();
		this.setVisible(true);
	}
	
	public void initDesign()
	{
		this.setLayout(new FlowLayout());
		
		btn1=new JButton("◀");
		btn2=new JButton("▶");
		
		
		//버튼색상
		btn1.setBackground(Color.RED);
		btn2.setBackground(Color.GREEN);
		
		//글자색상
		btn1.setForeground(Color.BLACK);
		btn2.setForeground(Color.BLACK);
		
		//이벤트객체
		btn1.addActionListener(this);
		btn2.addActionListener(this);
		
		this.add(btn1);
		this.add(btn2);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		Object ob=e.getSource();
		if(ob==btn1)
			JOptionPane.showConfirmDialog(this, "왼쪽버튼클릭!!");
		else if(ob==btn2)
			JOptionPane.showConfirmDialog(this, "오른쪽버튼클릭!!");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		new SwingBtnEvent_05("버튼이벤트5");
	}
}
