//Зиатдинова Диляра 11-402 Проект "Лабиринт"

import java.util.Scanner;

public class Game {

	private static int playerX=0;
	private static int playerY=0;
    private static boolean flag=true;
    private static String[][] maze;

    public Game() {}


    public static void startGame(String[][] maze) {
        Scanner scan = new Scanner(System.in);
        Levels level = new Levels();
        flag = level.defaultFlag(flag);
        while (flag) {
            //System.out.println();
            mazePrint(maze);
            String button = scan.nextLine();
            playerMove(button, maze);
        }
        
    }

	public static void playerMove(String button, String[][] maze) {
        ClearConsole clear = new ClearConsole();
        clear.clearConsole();
   		int x = playerX;
        int y = playerY;

        switch (button) {
   			case "w":
   				x--;
   				break;
   			case "s":
   				x++;
   				break;
   			case "a":
   				y--;
   				break;
    		case "d":
                y++;
   				break;
            }

   		if (x < 0 || x >= maze.length || y < 0 || y >= maze[0].length || maze[x][y] == "X") {
   			System.out.println("*** Чуть-чуть не туда, вы сбились с пути, давайте еще раз ***");
            System.out.println();
    	} else {
    		maze[playerX][playerY] = ".";
            playerX = x;
            playerY = y;
            if (maze[playerX][playerY] == "W") {
                System.out.println("                 *** Вы выиграли! ***               ");
                System.out.println("*** Чтобы выйти в меню, нажмите на любую клавишу ***");
                flag = false;
                Levels level = new Levels();
                playerX = level.playerStartCoordinateX(playerX);
                playerY = level.playerStartCoordinateX(playerY);
                maze[playerX][playerY] = "+";
            } else {
                maze[playerX][playerY] = "+";
            }

    	}
    }

    public static void mazePrint(String[][] maze) {
        for (int i=0; i < 5; i++) {
            for (int j=0; j < 5; j++) {
                System.out.print(" " + maze[i][j] + " ");
            }
            System.out.println();
        }
    }

}