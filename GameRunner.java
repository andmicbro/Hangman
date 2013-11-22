package hangmanPkg;

import java.util.ArrayList;

public class GameRunner {
	private String word;
	private ArrayList<String> lettersOfWord = new ArrayList<>();
	private ArrayList<String> lettersTried = new ArrayList<>();
	private ArrayList<Integer> indexOfCorrectGuess = new ArrayList<>();
	private int wrongGuessCounter;
	
	public GameRunner(){
		WordList myWordList = new WordList();
		word = myWordList.pickWord();
		lettersOfWord = (myWordList.getWord(word));
		wrongGuessCounter = 0;
	}//end ctor
	
	public void userGuess(String guess){
		if(!lettersTried.contains(guess)){
			lettersTried.add(guess);
			int counter = 0;
			for(int i = 0; i<lettersOfWord.size();i++){
				if(lettersOfWord.get(i).equals(guess)){
					indexOfCorrectGuess.add(i);
					counter++;
				}
			}
			if (counter==0)
				wrongGuessCounter++;
			
		}else{
			//tell the user that they have already picked that letter, error or showMessageDialog or something.
			System.out.println("already tried that one");
		}
	}//end userGuess

	//Getters are here for testing in GameRunnerApp
	public String getWord() {
		return word;
	}

	public ArrayList<String> getLetters() {
		return lettersOfWord;
	}

	public ArrayList<Integer> getIndexOfCorrectGuess() {
		return indexOfCorrectGuess;
	}

	public int getWrongGuessCounter() {
		return wrongGuessCounter;
	}
	
	public ArrayList<String> getLettersTried(){
		return lettersTried;
	}
	
	
}//end class
