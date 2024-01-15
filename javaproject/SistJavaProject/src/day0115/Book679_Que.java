package day0115;

import java.util.LinkedList;
import java.util.Queue;

class Message {
	public String command;
	public String to;
	
	public Message(String command, String to) {
		this.command=command;
		this.to=to;
		
	}
}

public class Book679_Que {

	public static void main(String[] args) {
		//Queue 컬렉션 생성
		Queue<Message> messagesQueue=new LinkedList<>();
		
		messagesQueue.offer(new Message("sendMail", "홍길동"));
		messagesQueue.offer(new Message("sendSMS", "신용권"));
		messagesQueue.offer(new Message("sendkakaotalk", "김자바"));
		
		//메세지를 하나씩 꺼내어 처리
		while(!messagesQueue.isEmpty()) {
			Message message=messagesQueue.poll();
			switch(message.command) {
				case "sendMail":
				System.out.println(message.to+ "님에게 메일을 보냅니다.");
				break;
				case "sendSMS":
				System.out.println(message.to+ "님에게 SMS를 보냅니다.");
				break;
				case "sendkakaotalk":
				System.out.println(message.to+ "님에게 카카오톡을 보냅니다.");
				break;
				
			}
		}
			
			
	}

}
