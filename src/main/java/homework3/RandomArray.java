package homework3;

import java.util.Arrays;
import java.lang.Math;
import java.util.Scanner;

public class RandomArray {
    public static void main(String[] args) {
        int length=10;
        int [] arr=new int[length];
        for(int i=0;i<10;i++){
            arr[i]=(int)(Math.random()*90+10);
        }
        Arrays.sort(arr);
        System.out.print("原来的数组为:");
        for(int num:arr){
            System.out.print(num+" ");
        }
        System.out.println();
        Scanner scanner=new Scanner(System.in);
        int addNumber=scanner.nextInt();
        int [] newArr=new int[length+1];
        newArr=Arrays.copyOf(arr,11);
        newArr[length]=addNumber;
        Arrays.sort(newArr);
        System.out.print("添加后的数组为：");
        for (int num:newArr){
            System.out.print(num+" ");
        }
    }
}
