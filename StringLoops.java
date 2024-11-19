public class StringLoops
{
    // default constructor; no instance variables
    public StringLoops() { }

    public int countCharacters(String character, String searchString){
    int count = 0;

    for (int i = 0; i < searchString.length(); i++) {

        if(searchString.substring(i, i + 1).equals(character)){


       count++; }





    }
        return count;
}


    public String reverseString(String origString) {
        String newStr = "";

        for (int i = 0; i < origString.length(); i++) {
            newStr += origString.substring(origString.length() - i - 1, origString.length() - i);
        }

        System.out.println(newStr);

        return newStr;
    }

    // Reverse a string (Method 2)
    public String reverseString2(String origString) {
        String reversed = "";

        for (int i = origString.length() - 1; i >= 0; i--) {
            reversed += origString.charAt(i);
        }

        return reversed;
    }}