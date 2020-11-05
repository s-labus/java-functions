// Straxinja Labus on 05/2020

import java.util.Random;

public class FillInFunctions
{
	
public static void main( String[] args ){

	System.out.println("Watch as we demonstrate functions.");
	System.out.println();
	System.out.println("I am going to get a random character from A-Z");
	System.out.println("The character is: " + rndChar());
	System.out.println();
	System.out.println("Now let's count from -10 to 10 ");
	ctn();
	System.out.println("Now we take the absolute value of a number.");
	System.out.println("|-7| = " + abs(-7) + "\n");
	credits();
 }

public static void credits(){

	System.out.println("That's all. This program has been brought to you by: \n");
	System.out.println("programmed by Graham Mitchell \nmodified by Straxinja \nThis code is distributed under the terms of the standard BSD licence. Do with it as you wish.");

}

public static int abs(int n){
	return Math.abs(n);
}

public static void ctn(){
	for(int i = -10; i <= 10; i++){
		System.out.print(i + " ");
	}
	System.out.print("How was that?\n\n");
}

public static String rndChar(){
	Random r = new Random();
	int choice = 1 + r.nextInt(26);
	String slovo = "";
	switch(choice){
		case 1:
		slovo = "A";
		break;
		case 2:
		slovo = "B";
		break;
		case 3:
		slovo = "C";
		break;
		case 4:
		slovo = "D";
		break;
		case 5:
		slovo = "E";
		break;
		case 6:
		slovo = "F";
		break;
		case 7:
		slovo = "G";
		break;
		case 8:
		slovo = "H";
		break;
		case 9:
		slovo = "I";
		break;
		case 10:
		slovo = "J";
		break;
		case 11:
		slovo = "K";
		break;
		case 12:
		slovo = "L";
		break;
		case 13:
		slovo = "M";
		break;
		case 14:
		slovo = "N";
		break;
		case 15:
		slovo = "O";
		break;
		case 16:
		slovo = "P";
		break;
		case 17:
		slovo = "Q";
		break;
		case 18:
		slovo = "R";
		break;
		case 19:
		slovo = "S";
		break;
		case 20:
		slovo = "T";
		break;
		case 21:
		slovo = "U";
		break;
		case 22:
		slovo = "V";
		break;
		case 23:
		slovo = "W";
		break;
		case 24:
		slovo = "X";
		break;
		case 25:
		slovo = "Y";
		break;
		case 26:
		slovo = "Z";
		break;
	}
	return slovo;

}
}

