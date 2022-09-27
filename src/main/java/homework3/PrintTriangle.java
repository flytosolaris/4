package homework3;

public class PrintTriangle {
    public static void main(String[] args) {
        int length=10;
        int arr[][]=new int[length][];
        for(int i=0;i<length;i++){
            arr[i]=new int[i+1];
            for(int j=0;j<=i;j++){
                if(i==0||j==0||j==i){
                    arr[i][j]=1;
                }else{
                    arr[i][j]=arr[i-1][j-1]+arr[i-1][j];
                }
                System.out.print(arr[i][j]);
                System.out.print(" ");
                    }
            System.out.println();
        }
    }
}
