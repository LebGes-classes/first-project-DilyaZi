//Зиатдинова Диляра 11-402 Проект "Лабиринт"

class ClearConsole {

	public ClearConsole() {}

	public static void clearConsole() {
        try {
        	new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        } catch (Exception E) {
        	System.out.println(E);
        }
    }
}