public class U4L34 {
    public static void main (String[] args){
        String print = "Print Me!";
        String newStr = "";
        for(int i = 0; i < print.length(); i++)
        {
           String letter = (print.substring(print.length() - i -1, print.length() - i));

            System.out.println(letter);
        }

    }
}
