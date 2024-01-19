package day0118;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class QuizSwingArrEvent_11 extends JFrame implements ActionListener{

	Container cp;
	JButton [] btn=new JButton[5];
	JLabel[] btnLabel = new JLabel[1]; // JLabel 배열로 수정
	//String [] btnLabel= {"Pink","Blue","White","Gray","Orange"};
	String [] str= {"안녕하세요"};
	Color [] btncolors= {Color.pink,Color.blue,Color.white,Color.gray,Color.orange};
	
	public QuizSwingArrEvent_11(String title) {  
		super(title);
		
		cp=this.getContentPane();
		
		this.setBounds(300, 100, 500, 300);
		cp.setBackground(new Color(255,204,204));
		initDesign();
		this.setVisible(true);
	}
	
	public void initDesign()
	{
		Panel pCenter=new Panel(new GridLayout(3, 3));
		this.add(pCenter,BorderLayout.CENTER);
		
		for(int i=0;i<btnLabel.length;i++)
		{
			btnLabel[i] = new JLabel(str[i], JLabel.CENTER);
            pCenter.add(btnLabel[i]); // 중앙 패널에 JLabel 추가
			
		}
		
		JPanel panel=new JPanel();
		panel.setBackground(Color.black);
		
		this.add(panel,BorderLayout.NORTH);
		
		for(int i=0;i<btn.length;i++)
		{
			//버튼 5개생성
			btn[i] = new JButton(btnLabel[0].getText()); // 버튼에 JLabel의 텍스트 설정
			//버튼 5개에 각각의 버튼백상변경(btnColors)
			btn[i].setBackground(btncolors[i]);
			
			//버튼5개에 이벤트추가
			btn[i].addActionListener(this);
			//panel에 버튼5개추가
			panel.add(btn[i]);
			
		}
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		Object ob=e.getSource();

		//각각의 버튼을 누르면 프레임의 배경색 변경
		for(int i=0;i<btn.length;i++)
		{
			if(ob==btn[i])
			{
				//각각의 버튼을 누르면 프레임의 배경색 변경
				cp.setBackground(btncolors[i]);
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		new QuizSwingArrEvent_11("Quiz Swing Array Event"); 
	}
}