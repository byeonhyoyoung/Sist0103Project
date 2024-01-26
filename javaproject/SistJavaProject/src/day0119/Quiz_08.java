package day0119;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.LineBorder;

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
		lblResult = new JLabel("내가 가본 나라는 없습니다.", JLabel.CENTER);
		lblResult.setBounds(20, 200, 300, 50);
		lblResult.setBorder(new LineBorder(Color.PINK,5));
		this.add(lblResult);
		
		//4개국 나라 체크박스
		String [] countrys= {"일본","중국","미국","프랑스"};
		int xpos=20;
		
		for(int i=0;i<cbCountry.length;i++)
		{
			cbCountry[i]=new JCheckBox(countrys[i]);
			cbCountry[i].setBounds(xpos, 100, 80, 30);
			cbCountry[i].setOpaque(false);
			cbCountry[i].addItemListener(this); 
            this.add(cbCountry[i]);
            xpos+=80;
		}
		
		//색깔 버튼?
		btnColor=new JButton("색깔 출력");
		btnColor.setBounds(60, 140, 200, 30);
		this.add(btnColor);
		
		btnColor.addActionListener(this); //버튼에 이벤트 추가
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		new Quiz_08("0119 주말 과제물"); 
	}
	

}