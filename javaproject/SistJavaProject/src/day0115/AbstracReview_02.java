package day0115;

abstract class Game{
	abstract public void play();
	abstract public void stop();
}
/////////////////////////
class Kim extends Game{

	@Override
	public void play() {
		// TODO Auto-generated method stub
		System.out.println("kim게임시작");	
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		System.out.println("kim게임중단");	
	}
	
}
///////////////////
class Lee extends Game{

	@Override
	public void play() {
		// TODO Auto-generated method stub
		System.out.println("lee게임시작");
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		System.out.println("lee게임중단");
	}
	
}
//////////////////
class  Choi extends Game{

	@Override
	public void play() {
		// TODO Auto-generated method stub
		System.out.println("choi게임시작");
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		System.out.println("choi게임중단");
	}
	
}

public class AbstracReview_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*Game game=null;
		
		game=new Kim();
		game.play();
		game.stop();
		
		game=new Lee();
		game.play();
		game.stop();
		
		game=new Choi();
		game.play();
		game.stop();*/
		
		Game[] game=new Game[3]; //선언
		game[0]=new Kim(); //생성
		game[1]=new Lee();
		game[2]=new Choi();
		
		for(int i=0;i<game.length;i++)
		{
			game[i].play();
		}
		System.out.println("===============");
		for(int i=game.length-1;i>=0;i--)
		{
			game[i].stop();
		}
		
	}

}
