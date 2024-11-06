import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner myScanner = new Scanner(System.in);
        System.out.println("Enter your birthday year :");
        int input=myScanner.nextInt();
        if((input % 4 == 0 && input % 100 != 0) || (input % 400 == 0)){
            System.out.println(input+" is a leap year");
        }else {
            System.out.println(input+" not a leap year");
        }
        myScanner.close();





    }
}