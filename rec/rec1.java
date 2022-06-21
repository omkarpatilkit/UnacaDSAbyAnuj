package rec;

public class rec1 {

    static int recSumofDigit(int a) {

       
        if (a <= 0)
            return 0;
        
        int digit=  a % 10;
        return digit + recSumofDigit(a/10);

    }




    public static void main(String[] args) {
        int a = 1234;
        System.out.println(recSumofDigit(a));
    }
}
