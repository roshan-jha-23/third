import java.util.Scanner;

public class binarysearch {
    //bhai ye maine order agnostic binary search ka code likha likha hai jaha  pe user ko pata nahi hai ki ascending baa naa ki desecnding
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[]arr=new int[10];//intizalition of the array
        for(int i=0;i<10;i++){
            arr[i]=sc.nextInt();//input of the elements in thae array
        }
        System.out.println("enter the target element");
        int target=sc.nextInt();
        int ans=BinarySearch(arr,target);
        System.out.println(ans);

    }
    static int BinarySearch(int [] arr,int target){
        int n=arr.length;
        int start=0;
        int end=n-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(target==arr[mid]){
                return arr[mid];
            }
            //for the ascending order
            if(arr[start]<arr[end]){
                if(target >arr[mid]){
                    start=mid+1;
                } else if (target<arr[mid]) {
                    end=mid-1;

                }
            }
            else{
                if(target>arr[mid]){
                    end=mid-1;
                } else if (target<arr[mid]) {
                    start=mid+1;
                }
            }
        }
        return -1;
        //ek baat bolne chathate hai ki agar target element does not exist to ye -1 return toh karega hi saath mein ek condition aisa
        // aayega ki start jo hai vo end se zyada ho jayega .
    }
}
