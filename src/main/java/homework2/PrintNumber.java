package homework2;

public class PrintNumber {
    public static void main(String[] args) {
        int result=0;
        for(int i=1;i<=100;i++){
            if(i%7==0){
                result+=i;
            }
        }
        System.out.println(result);
    }
}
