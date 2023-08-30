package 게임만들기;

public class GameDummy implements GameRule{

	@Override
	public int random() {
		
		return 0;
	}

	@Override
	public String getQuizMsg() {
		
		return null;
	}

	@Override
	public boolean checkAnswer(int ans) {
		
		return false;
	}
	
	
	

}
