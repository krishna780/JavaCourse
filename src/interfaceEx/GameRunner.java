package interfaceEx;

public class GameRunner {

	public static void main(String[] args) {

		//MarioGame game = new MarioGame();
		GamingConsole game= new ChessGame();
		game.up();
		game.right();
		game.down();
		game.left();

	}

}
