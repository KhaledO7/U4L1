public class U4L4 {
    public static void main(String[] args){
        int result = 0;
        int k = 0;
        while (k < 4)
        {
            int m = 0;
            while (m < 3)
            {
                result++;
                m++;
                System.out.print("k: " + k);
                System.out.println(", m: " + m);
            }
            k++;
        }
        System.out.println("result: " + result);



        for (int j = 3; j < 6; j++)
        {
            int i = 1;
            while (i <= j)
            {
                System.out.print("*");
                i++;
            }
            System.out.println();
        }


    }
}
