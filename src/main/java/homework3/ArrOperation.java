package homework3;

public class ArrOperation {
    public static void main(String[] args) {
        int c[][]={ {1,2,3},{4,5,6},{7,8,9}};
        int d[][]={{2,2,2},{1,1,1},{3,3,3}};
        int [][] addArr=ArrOperation.addArr(c,d);
        System.out.println("数组相加后为：");
        ArrOperation.printArr(addArr);
        int [][] multiArr=ArrOperation.multiArr(c,d);
        System.out.println("数组相乘后为：");
        ArrOperation.printArr(multiArr);
    }
    public static void printArr(int [][] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j <arr[0].length ; j++) {
                System.out.print(arr[i][j]+" ");
        }
            System.out.print(" ");
    }
        System.out.println();
    }
    public static int[][] addArr(int [][]c,int [][]d){
        if(c.length!=d.length||c[0].length!=d[0].length){
            return new int [0][0];
        }
        int [][] newArr =new int[c.length][c[0].length];
        for(int i=0;i<c.length;i++){
            for(int j=0;j<c[0].length;j++) {
                newArr[i][j]=c[i][j]+d[i][j];
            }
        }
        return newArr;
    }
        public static int [][] multiArr(int [][]c,int [][]d){
            if(c.length!=d.length||c[0].length!=d[0].length){
                return new int [0][0];
            }
            int [][] newArr =new int[c.length][c[0].length];
            for(int i=0;i<c.length;i++){
                for(int j=0;j<c[0].length;j++) {
                    newArr[i][j]=c[i][j]*d[i][j];
                }
            }
            return newArr;
        }
}
