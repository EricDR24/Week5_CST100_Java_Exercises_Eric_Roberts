/** Program:  14.17 Hangman
  * File:     Hangman.java 
  * Summary:  Chapter 14, Exercise 17, Draw the Hangman in the game Hangman.
  * Author:   Eric Roberts
  * Date:     July 22, 2016
**/
import java.util.Scanner;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Polyline;
import javafx.scene.shape.Arc;
import javafx.scene.shape.ArcType;
import javafx.scene.layout.Pane;
import javafx.collections.ObservableList;

public class Hangman extends Application {
	@Override
	public void start(Stage primaryStage) {
		//create a pane
		Pane pane = new Pane();

		// create polylines and properties
		Polyline polyline1 = new Polyline();
		pane.getChildren().add(polyline1);
		polyline1.setStroke(Color.BLACK);
		ObservableList<Double> list = polyline1.getPoints();
		double x1 = 40.0;
		double y1 = 190.0;
		double y2 = 20.0;
		double x3 = 125.0;
		list.addAll(x1, y1, x1, y2, x3, y2, x3, y1 * .60);

		Polyline polyline2 = new Polyline();
		pane.getChildren().add(polyline2);
		polyline2.setStroke(Color.BLACK);
		ObservableList<Double> list2 = polyline2.getPoints();
		list2.addAll((x1 + x3) * .5, y1 * .5, x3, y1 * .25,
			x3 + (x3 - x1) * .5, y1 * .5);

		Polyline polyline3 = new Polyline();
		pane.getChildren().add(polyline3);
		polyline3.setStroke(Color.BLACK);
		ObservableList<Double> list3 = polyline3.getPoints();
		list3.addAll((x1 + x3) * .6, y1 * .80, x3, y1 * .60,
			x3 + (x3 - x1) * .3, y1 * .80);

		//create circle and properties
		Circle circle = new Circle(x3, y1 * .25, 15);
		circle.setFill(Color.WHITE);
		circle.setStroke(Color.BLACK);
		pane.getChildren().add(circle);

		//create arc and properties
		Arc arc = new Arc(x1, y1 + 1, 25, 15, 0, 180);
		arc.setFill(Color.WHITE);
		arc.setStroke(Color.BLACK);
		pane.getChildren().add(arc);

		//create scene and place it in the stage
		Scene scene = new Scene(pane, 200, 200);
		primaryStage.setTitle("Exercise_14_17"); // Set the stage title
		primaryStage.setScene(scene); // Place the scene in the stage
		primaryStage.show(); // Display the stage
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String play;
		do {
			// generate a random word 
			char[] word = getWord();
			
			// print each letter in the word as an asterisk.
			char[] asterisks = new char[word.length];
			fillAsterisks(asterisks);

			int wrong = 0; // number of wrong guesses
			do {
				// prompt the user to guess one letter
				char guess = getGuess(asterisks);		
				
				// check if is letter is correct
				if (!isCorrectGuess(word, asterisks, guess))
					wrong++;
					
			} while (!isWordFinish(asterisks));
			
			// print results
			print(word, wrong);
			
			//prompt play to play with another word
			System.out.println("Do you want to guess another word? Enter y or n>");
			play = sc.next();

		} while (play.charAt(0) == 'y');
	}

	//generate a word from a list
	public static char[] getWord() {
		String[] words = {"write", "that", "may", "june", "july", "august", "september", "october", "november", "december", "january", "febuary", "march", "april"};

		String pick = words[(int)(Math.random() * words.length)];
		char[] word = new char[pick.length()];

		for (int i = 0; i < word.length; i++) {
			word[i] = pick.charAt(i);
		}
		return word;
	}

	//fillAsterisks initializes a list with asterisks
	public static void fillAsterisks(char[] list) {
		for (int i = 0; i < list.length; i++) {
			list[i] = '*';
		}
	}

	//checkGuess tests if the users guess was correct
	public static boolean isCorrectGuess(char[] word, char[] blanks, char guess) {
		boolean correct = false;
		int message = 2;
		for (int i = 0; i < word.length; i++) {
			if (word[i] == guess) {
				correct = true;
				if (blanks[i] == guess)
					message = 1;
				else { 
					blanks[i] = guess;
					message = 0;
				}
			}
		}
		if (message > 0)
			print(message, guess);
		return correct;
	}

	//boolean to check if word is finished
	public static boolean isWordFinish(char[] blanks) {
		for (char e: blanks) {
			if (e == '*')
				return false;
		}
		return true;
	}

	//print overloaded
	public static void print(char[] word, int missed) {
		System.out.print("The word is ");
		System.out.print(word);
		System.out.println(" You missed " + missed + " time");
	}


	public static void print(int m, char guess) {
		System.out.print("\t" + guess);
		switch (m) {
			case 1 : System.out.println(" is already in the word"); break;
			case 2 : System.out.println(" is not in the word");
		}
	}

	//prompts the user to guess one letter at a time
	public static char getGuess(char[] asterisks){
		Scanner sc = new Scanner(System.in);
		System.out.print("(Guess) Enter a letter in word ");
		System.out.print(asterisks);
		System.out.print(" > ");
		String g = sc.next();
		return g.charAt(0);
	}
}
