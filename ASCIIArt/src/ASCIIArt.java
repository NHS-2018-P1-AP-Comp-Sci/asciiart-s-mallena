/**
 * Unit 1 Project
 * 
 * In this project you have the opportunity to create a piece of artwork using
 * ASCII (American Standard Code for Information Interchange). Using the already
 * created file named `ASCIIArt.java` write a program that outputs your artwork
 * to the console. The goal of this project is to use ONLY what we have learned
 * in Unit 1 to create anything you would like so be creative (and school
 * appropriate). Artwork must also have a caption describing what it's
 * depicting.
 * 
 * For those of you who have dabbled in coding before, try to contain your code
 * to just what we have discussed in this unit.
 * 
 * @author Mr. Rasmussen
 *
 */

// YOUR CODE GOES HERE :)

public class ASCIIArt {

	/*
	 * +===========================+ | whitespace static methods |
	 * +===========================+
	 */
	public static void newLine() {
		System.out.println();
	}

	public static void space() {
		System.out.print(" ");
	}

	/*
	 * +=======================+ | Sun static methods | +=======================+
	 */
	public static void sunUpperCorner() {
		System.out.print("\\ /");
	}

	public static void sunLowerCorner() {
		System.out.print("/ \\");
	}

	public static void sunEyebrows() {
		System.out.print(" __  __ ");
	}

	public static void sunSpacing() {
		System.out.print("                             ");
	}

	/*
	 * +=======================+ | Tree static methods | +=======================+
	 */
	public static void treeApple() {
		System.out.print("(`)");
	}

	public static void tree2LeafCluster() {
		System.out.print("##");
	}

	public static void tree3LeafCluster() {
		System.out.print("###");
	}

	public static void tree4LeafCluster() {
		System.out.print("####");
	}

	public static void tree5LeafCluster() {
		System.out.print("#####");
	}

	/*
	 * +================================+ | Person static methods |
	 * +================================+
	 */
	public static void personHead() {
		System.out.print("()");
	}

	public static void personBody() {
		System.out.print("/[]\\");
	}

	public static void personFeet() {
		System.out.print("/\\");
	}

	/*
	 * +================================+ | Grass static methods |
	 * +================================+
	 */
	public static void grassPlain() {
		System.out.print("__ ,.");
	}

	public static void grassStep() {
		System.out.print("_/ \"");
	}

	public static void grassPatch() {
		System.out.print("\"\"");
	}

	/*
	 * +==================================+ | Description Box static method |
	 * +==================================+
	 */
	public static void boxHorizontal() {
		System.out.println("	+=======================================+");
	}

	/*
	 * +================================+ | Drawing static methods |
	 * +================================+
	 */
	public static void drawSun() {
		// Draws the sun in the upper right corner of the screen
		System.out.println("                                    ,");
		System.out.println("                               \\_!__!___/");
		sunSpacing();
		sunUpperCorner();
		sunEyebrows();
		sunUpperCorner();
		newLine();
		System.out.println("                            __|  ^ d ^   |__");
		System.out.println("                              |  ) v (   |");
		sunSpacing();
		sunLowerCorner();
		System.out.print("________");
		sunLowerCorner();
		newLine();
		System.out.println("                                !   !   \\");
		System.out.println("                                '   !    `");
	}

	public static void drawForeground() {
		// Draws the Tree, ground, and people in the scene
		System.out.print("         ");
		tree5LeafCluster();
		newLine();
		System.out.print("     ");
		tree5LeafCluster();
		space();
		tree3LeafCluster();
		space();
		tree4LeafCluster();
		newLine();
		space();
		space();
		tree3LeafCluster();
		space();
		tree4LeafCluster();
		space();
		System.out.print("___  ");
		tree3LeafCluster();
		space();
		tree4LeafCluster();
		newLine();
		space();
		tree3LeafCluster();
		space();
		tree3LeafCluster();
		space();
		space();
		treeApple();
		space();
		tree4LeafCluster();
		space();
		tree3LeafCluster();
		space();
		tree4LeafCluster();
		newLine();
		space();
		space();
		space();
		tree5LeafCluster();
		space();
		tree3LeafCluster();
		System.out.print("   _ ");
		tree3LeafCluster();
		System.out.print("  ____");
		tree3LeafCluster();
		newLine();
		space();
		tree4LeafCluster();
		System.out.print("  __- _/ ");
		treeApple();
		System.out.print("# /");
		tree2LeafCluster();
		space();
		treeApple();
		space();
		tree4LeafCluster();
		newLine();
		space();
		space();
		space();
		tree4LeafCluster();
		space();
		tree3LeafCluster();
		System.out.print("\\\\__");
		tree2LeafCluster();
		System.out.print(" /  _ -");
		tree3LeafCluster();
		space();
		tree3LeafCluster();
		newLine();
		System.out.print("     ");
		tree2LeafCluster();
		System.out.print("_____   \\ |  /___- ");
		tree4LeafCluster();
		newLine();
		System.out.print("      ");
		tree2LeafCluster();
		treeApple();
		System.out.print(" \\    \\  '   __#_");
		tree3LeafCluster();
		newLine();
		System.out.print("             | , \\    /  ");
		treeApple();
		System.out.print("\\_");
		tree2LeafCluster();
		newLine();
		System.out.print("              |   |  |       ");
		tree2LeafCluster();
		newLine();
		System.out.println("	      |       !");
		System.out.println("	      !  ' (  |");
		System.out.println("	      | /   \\ |");
		System.out.print("	     /  |    ` |                             ");
		System.out.println("          _/\\_");
		System.out.print("            {   @)   \\_ \\                        ");
		System.out.print("               ");
		personHead();
		newLine();
		System.out.print("            |   /   ) _    `_                ");
		personHead();
		System.out.print("                ");
		personBody();
		System.out.println("       _ _   _    -");
		System.out.print("-");
		grassPlain();
		grassPlain();
		System.out.print("_/   L     __ \\ __  _            ");
		personBody();
		System.out.print("          ");
		grassPlain();
		space();
		personFeet();
		space();
		grassPlain();
		grassStep();
		newLine();
		System.out.print("       \"       /   ^_    -       `");
		grassPlain();
		grassPlain();
		space();
		personFeet();
		System.out.print("_ ");
		grassPlain();
		space();
		grassStep();
		System.out.println("                   '");
		space();
		space();
		space();
		space();
		grassPatch();
		System.out.print("       \"             \"         '          \"     ");
		System.out.print("       '\"      ");
		grassPatch();
		newLine();
		System.out.print("         \"       '  \"          ");
		grassPatch();
		System.out.println("         \"          '           \"");
	}

	public static void drawDescriptionBox() {
		// A description of the scene
		boxHorizontal();
		System.out.println("	| ~Two people standing next to an       |");
		System.out.println("	|       apple tree under the summer sun |");
		boxHorizontal();
	}

	public static void main(String[] args) {
		drawSun();
		drawForeground();
		drawDescriptionBox();
	}
}