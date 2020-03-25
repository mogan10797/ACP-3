import java.util.Scanner;


public class Math{

    public static void main(String args[]) {
        Scanner scn =new Scanner(System.in);
        int a=scn.nextInt();
        int b=scn.nextInt();
        char c=scn.next().charAt(0);
        switch(c){
            case'+':
            System.out.println(a+"+"+b+"="+(a+b));
            break;
            case'*':
            System.out.println(a+"*"+b+"="+(a*b));
            break;
        }
    }
}