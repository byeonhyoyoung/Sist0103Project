package day0119;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class SwingLabelRandom_01 extends JFrame implements ActionListener{
	
	
	Container cp;
	JLabel [] lblLabel=new JLabel[9];
	String [] str= {"삼겹살","샐러드","파스타","치킨","피자","햄버거","샤브샤브","그릭요거트","제로콜라"};
	JButton btn;

	public SwingLabelRandom_01(String title) {  
		super(title);
		
		cp=this.getContentPane();
		
		this.setBounds(300, 100, 500, 300);
		cp.setBackground(new Color(255,204,204));
		intiDesign();
		this.setVisible(true);
	}
	
	public void intiDesign() 
	{
		//패널을 프레임의 센터에 추가
		Panel pCenter=new Panel(new GridLayout(3, 3));
		this.add(pCenter,BorderLayout.CENTER);
		
		//라벨을 패널에 추가
		for(int i=0;i<lblLabel.length;i++)
		{
			lblLabel[i]=new JLabel(str[i],JLabel.CENTER); //라벨 중앙에
			
			//rgb컬러는 0~255사이의 색 R,G,B
			int r=(int)(Math.random()*256);
			int g=(int)(Math.random()*256);
			int b=(int)(Math.random()*256);
			lblLabel[i].setBackground(new Color(r,g,b)); //rgb 랜덤으로하니 색상변경편함
			
			//패널에 라벨추가
			pCenter.add(lblLabel[i]);
			//글꼴변경
			lblLabel[i].setFont(new Font("궁서체", Font.BOLD, 15));
			lblLabel[i].setOpaque(true);
		}
		
		//프레임의 하단에 버튼생성후 추가
		btn=new JButton("라벨색상변경");
		//버튼에 이벤트 추가..하단에 위치
		btn.addActionListener(this);
		this.add(btn,BorderLayout.SOUTH);
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		for(int i=0;i<lblLabel.length;i++)
		{
			//rgb컬러는 0~255사이의 색 R,G,B
			int r=(int)(Math.random()*256);
			int g=(int)(Math.random()*256);
			int b=(int)(Math.random()*256);
			lblLabel[i].setBackground(new Color(r,g,b));
			//lblLabel[i].setBackground(new Color(?,?,?)); //랜덤숫자
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		new SwingLabelRandom_01("랜덤컬러생성_1"); 
	}
}