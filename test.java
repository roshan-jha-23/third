

import java.util.Arrays;
import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
//        int [] arr=new int[5];
//        arr[0]=1;
//        arr[1]=1;
//        arr[2]=4;
//        arr[3]=5;
//        arr[4]=6;
////arr=[1,1,4,5,6]
//        System.out.println(arr[4]);
//        int [] arr1={1,2,3,4,5};
//        System.out.println(arr1[4]);
        int[]ros;
        ros=new int[5];
        System.out.println(ros[1]);
        for(int i=0;i<ros.length;i++){
            ros[i]=sc.nextInt();
        }
        System.out.println(Arrays.toString(ros));
    }
}
