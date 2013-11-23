package hangmanPkg;


public class GameRunnerApp {

	public static void main(String[] args) {
		GameRunner myGR = new GameRunner();
		myGR.userGuess("e");
		System.out.println(myGR.getLetters());

		System.out.println(myGR.getWord());
		System.out.println("guess: e");

		System.out.println("wrong guesses: "+myGR.getWrongGuessCounter ());
		System.out.println("index of correct guesses: "+myGR.getIndexOfCorrectGuess());
		System.out.println("letters tried: "+myGR.getLettersTried());

		myGR.userGuess("h");
		System.out.println("guess: h");

		System.out.println("wrong guesses: "+myGR.getWrongGuessCounter ());
		System.out.println("index of correct guesses: "+myGR.getIndexOfCorrectGuess());
		System.out.println("letters tried: "+myGR.getLettersTried());
		myGR.userGuess("r");
		System.out.println("guess: r");

		System.out.println("wrong guesses: "+myGR.getWrongGuessCounter ());
		System.out.println("index of correct guesses: "+myGR.getIndexOfCorrectGuess());
		System.out.println("letters tried: "+myGR.getLettersTried());

	}

}
