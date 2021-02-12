// This program draws several text figures
// It uses static methods to capture structure and
// eliminate redundancy.
public class B_EggFigures {
	public static void main(String[] args) {
		egg();
		cup();
		stopSign();
		hat();
	}

	public static void egg() {
		eggTop();
		eggBottom();
		System.out.println();
	}

	public static void eggTop() {
		System.out.println("  ______");
		System.out.println(" /      \\");
		System.out.println("/        \\");
	}

	public static void eggBottom() {
		System.out.println("\\        /");
		System.out.println(" \\______/");
	}

	public static void line() {
		System.out.println("+--------+");
	}

	public static void cup() {
		eggBottom();
		line();
		System.out.println();
	}

	public static void stopSign() {
		eggTop();
		System.out.println("|  STOP  |");
		eggBottom();
		System.out.println();
	}

	public static void hat() {
		eggTop();
		line();
	}
}