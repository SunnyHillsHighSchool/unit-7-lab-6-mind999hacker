//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Shahmir Ahmad

//import static java.lang.System.*;

public class Word
{
   private static Character[] vowels = {'a','e','i','o','u'}; //char array to compare to the letters later on
     	//why is this here?
   																//why is it static?
   
   //add an instance variable
   private String word = ""; //new string word
	//create a constructor
	public Word(String tmp) //new constructor method
  {
    word = tmp.toLowerCase(); //set word to tmp String lowercased
  }
	//create other methods
  public int getNumVowels() //new int method getNumVowels
  {
    if(word.length() == 0) //check if word.length is == 0 just to make sure if they forget to set a word
    {
      return -1; //if yes return -1
    }

    int count = 0;  //new int count
    for(int i = 0;i<word.length();i++){ //loop from 0 till word.length add 1 every loop
      for(Character x: vowels) //new for each loop iterate thru vowels array
      {
        if(word.charAt(i)==x) //get the char at the idex and see if it equals the currunt vowels char
        {
          count++; //if yes add 1 to count
        }
      }
    }
    return count; //retrn count
  }

  public int getLength() //new int getLength method
  {
    return word.length(); //return length of the word
  }
  public void setWord(String tmp) { //new setWord method 
    word = tmp.toLowerCase(); //set word to tmp String lowercased

  }
	//look at the sample runner code
	//on the lab handout

	//create a toString method
  public String toString() //new toString method
  {
    return word; //return word
  }

}