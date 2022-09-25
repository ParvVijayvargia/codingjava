import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
// check 2
        System.out.println("Please enter a number");
        int number = scan.nextInt();
        System.out.println (" sum is " + printTable(number));

    }
    private static int printTable(int number)
    {
        int sum=0;
        for(int i=0;i<10;i++)
        {
            sum= sum+number*(i+1);
            System.out.println(number + " * " + (i+1) + "= " + number*(i+1));
        }

        return sum;
    }

}