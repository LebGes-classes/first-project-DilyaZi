//Зиатдинова Диляра 11-402 Проект "Лабиринт"

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ClearConsole clear = new ClearConsole();
    	System.out.println("*** Чтобы начать игру, нажмите на любую клавишу ***");
    	Scanner scan = new Scanner(System.in);
    	String button = scan.nextLine();
        clear.clearConsole();
    	Menu menu = new Menu(button);
    	while (button != "0") {
    		if (button != "start" && button != "r") {
    			menu.getMenu();
            }
    	 	menu.choice(button); 
    	 	button = scan.nextLine();
            clear.clearConsole();
    	}
    }
}


