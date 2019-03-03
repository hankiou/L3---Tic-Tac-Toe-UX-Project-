package application;

import engine.*;

public class Application {
	
	Config cfg;

	public void launch() {
		// GUI things //
		
		cfg = new Config();
		/// SET PARAMETERS ///
		cfg.setAgainstAI(false);
		
		Game game = new Game(cfg);
		game.run();
	}
}
