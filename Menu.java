//Зиатдинова Диляра 11-402 Проект "Лабиринт"

import java.util.Scanner;

public class Menu {
	private String button;

	//Game game = new Game();
	Levels level = new Levels();

	public Menu(String button) {}

	public void getMenu() {
		System.out.println("*** Начать игру (start) ***");
    	System.out.println("***   Правила игры (r)  ***");
    	System.out.println();

	}
	public void choice(String button) {
    	switch (button) {
    		case "start":
    			ClearConsole clear = new ClearConsole();
   				System.out.println();
   				clear.clearConsole();
    			System.out.println("*** Выберите номер уровня: 1, 2 или 3 ***");
    			Scanner scan = new Scanner(System.in);
    			int numOfLevel = scan.nextInt();
    			clear.clearConsole();
    			level.chooseLevel(numOfLevel);
    			break;
    		case "r":
    			System.out.println("В этой игре вы - Крестик, а конец лабиринта - W (то есть WIN!");
    			System.out.println("- Передвигаться по лабиринту можно с помощью кнопок:\n  W(вперёд), A(влево), S(назад), D(вправо).");
    			System.out.println("- Цель - найти выход");
    			System.out.println();
    			break;

    	}
    }

    public void setButton(String button) {
    	this.button = button;
    }
    public String getButton() {
    	return button;
    }
}