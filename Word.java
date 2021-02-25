//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

//import static java.lang.System.*;

public class Word
{
   //private static String[] vowels = {"a","e","i","o","u"}; 
     	//why is this here?
   																//why is it static?
   
   //add an instance variable
   private String word = "";
	//create a constructor
	public Word(String tmp)
  {
    word = tmp;
  }
	//create other methods
  public int getNumVowels()
  {
    if(word.length == 0)
    {
      return -1;
    }

    int count = 0;
    for(int i = 0;i<word.length;i++){
      for(String x: vowels)
      {
        if(word.charAt(0).toLowerCase.equals(x))
        {
          count++;
        }
      }
    }
    return count;
  }
	//look at the sample runner code
	//on the lab handout

	//create a toString method
}