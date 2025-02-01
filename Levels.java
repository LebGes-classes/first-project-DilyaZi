public class Levels {
	private static String[][] maze1 = {	{"+", ".", "X", "X", "X"},
										{"X", ".", "X", "X", "X"},
    									{".", ".", "X", ".", "X"},
    									{"X", ".", ".", ".", "X"},
    									{"X", "X", "X", ".", "W"}};

    private static String[][] maze2 = {	{"+", "X", ".", "W", "."},
										{".", "X", "X", "X", "."},
    									{".", "X", "X", ".", "."},
    									{".", ".", ".", "X", "."},
    									{"X", "X", ".", ".", "."}};

    private static String[][] maze3 = {	{"+", ".", "X", "X", "X"},
										{"X", ".", ".", ".", "X"},
    									{".", "X", "X", ".", "X"},
    									{"X", ".", ".", ".", "X"},
    									{"X", "X", "W", "X", "."}};

    private int numOfLevel;
    private static String[][] mainMaze;
    private static int playerX;
    private static int playerY;

    public Levels() {
    }

    public static void chooseLevel(int numOfLevel) {
        Game game = new Game();
    	switch (numOfLevel) {
    		case 1:
                mainMaze = maze1;
                game.startGame(mainMaze);
    			break;
    		case 2:
                mainMaze = maze2;
                game.startGame(mainMaze);
    			break;
    		case 3:
                mainMaze = maze3;
                game.startGame(mainMaze);
    			break;
    		}
    	}

    public boolean defaultFlag(boolean flag) {
    	return flag = true;
    }

    public int playerStartCoordinateX(int playerX) {
        return playerX = 0;
    }

    public int playerStartCoordinateY(int playerY) {
        return playerY = 0;
    }


    public void setNumOfLevel(int numOfLevel) {
    	this.numOfLevel = numOfLevel;
    }
    public int getNumOfLevel() {
    	return numOfLevel;
    }

    public void setLevelCoordinateX(int playerX) {
        this.playerX = playerX;
    }
    public int getLevelCoordinateX() {
        return playerX;
    }

    public void setLevelCoordinateY(int playerY) {
        this.playerY = playerY;
    }
    public int getLevelCoordinateY() {
        return playerY;
    }
}