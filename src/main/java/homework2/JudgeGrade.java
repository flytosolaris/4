package homework2;

import java.util.Scanner;

public class JudgeGrade {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        double grade=scanner.nextDouble();
        if(grade>=60){
            System.out.println("合格");
        }else{
            System.out.println("不合格");
        }
    }
}
