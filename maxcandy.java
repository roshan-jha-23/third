import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class maxcandy {
    public static void main(String[] args) {
        ArrayList<Boolean> list = new ArrayList<>();
        int[] arr = new int[4];
        Scanner sc=new Scanner(System.in);
        for(int j=0;j<4;j++){
            arr[j]=sc.nextInt();
        }


            System.out.println(kidsWithCandies(arr, 2));


    }

    static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
            int n=extraCandies;
            ArrayList<Boolean> list=new ArrayList<>(candies.length);
            int max=candies[0];
            for(int i=0;i<candies.length;i++){
                if(candies[i]>max){
                    max=candies[i];

                }
            }
            int maxval=max;
            int sum=0;
            for(int j=0;j<candies.length;j++){
                sum=candies[j]+n;
                if(sum>=maxval){
                    list.add(true);
                }else{
                    list.add(false);
                }
            }

            return list;
        }
    }

