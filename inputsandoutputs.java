import java.util.Scanner;
import java.util.Arrays;

public class inputsandoutputs {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int [] arr=new int[5];
//        for(int i=0;i< arr.length;i++){
//            arr[i]=sc.nextInt();
//
//        }
        for (int j:arr)
             {
              arr[j]=sc.nextInt();
              j++;
              System.out.println(j);
        }
        System.out.println(Arrays.toString(arr));
//        for(int i=0;i<arr.length;i++){
//            System.out.print(arr[i]+" ");
//        }
//        for(int j:arr){

//            System.out.println(arr);

////        }
//        System.out.println(Arrays.toString(arr));
        String [] naam=new String[4];
        for(int i=0;i< naam.length;i++){
            naam[i]=sc.next();
            System.out.println(naam[i]);
        }
        System.out.println(Arrays.toString(naam));


    }
}
