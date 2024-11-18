public class StringLoops
{
    // default constructor; no instance variables
    public StringLoops() { }

    /* Returns the number of times "character" appears in "searchString"

       This should be case sensitive!

       Examples:
       - if character = "a" and searchString = "Apples and bananas",
         this method returns 4 (it finds BOTH "A" and "a")
       - if character = "A" and searchString = "Apples and bananas",
         this method returns 1 (it finds BOTH "A" and "a")
       - if character = "!" and searchString = "Hello! Nice day!",
         this method returns 2
      */
    public int countCharacters(String character, String searchString)
    {
        /* if you finished this in the last lesson, start with “reverseString2” */
        /* if you did not, complete this now! */
    }


    public String reverseString(String origString)
    {
        String print = origString;
        String newStr = "";
        for(int i = 0; i < print.length(); i++)
        {
            String letter = (print.substring(print.length() - i -1, print.length() - i));

            System.out.println(letter);
    }

// --- FIVE NEW METHODS TO ADD & IMPLEMENT ARE BELOW ---

    /* Returns the original string reversed -- SECOND IMPLEMENTATION

     Examples:
     - if origString = "hello!" this method returns "!olleh"
     - if origString = "Apples and bananas" this method returns "sananab dna selppA"
    */
    public String reverseString2(String origString)
    {

    }
