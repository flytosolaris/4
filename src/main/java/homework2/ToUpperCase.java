package homework2;

import java.util.Scanner;

public class ToUpperCase {
    public static void main(String[] args) {
        java.util.Scanner scanner=new Scanner(System.in);
        char input=scanner.next().charAt(0);
        switch(input){
                case 'a':
                System.out.println("A");
                break;
                case 'b':
                System.out.println("B");
                break;
                case 'c':
                System.out.println("C");
                break;
                case 'd':
                System.out.println("D");
                break;
                case 'e':
                System.out.println("E");
                break;
                default:
                System.out.println("other");
        }
    }

}
