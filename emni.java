import java.util.Arrays;

public class emni {
    public static void main(String[] args) {
        int[][] arr={
                {1,20,45,89},
                {2,22,65,90},
                {34,44,77,91},
                {92,93,94,95}//row and column wise matrix mein ye formula kaam karega
        };
        System.out.println(Arrays.toString(bs(arr,95)));

    }
    static  int[] bs(int[][]arr, int target){
        int row=0;
        int col=arr[0].length-1;
        while(row< arr.length && col>=0){
            if(arr[row][col]==target){
                return new int[]{row, col};//madharchod ho tum

            }
            if(arr[row][col]>target){
                col--;
            }else{
                row++;
            }
        }
        return  new int[]{-1,-1};
    }
}
