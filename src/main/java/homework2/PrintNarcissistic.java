package homework2;

public class PrintNarcissistic {
    public static void main(String[] args) {
        for(int i=100;i<1000;i++){
            int one=i%10;
            int ten=i/10%10;
            int hundred=i/100;
            if(i==one*one*one+ten*ten*ten+hundred*hundred*hundred){
                System.out.println(i);
            }
        }
    }
}
