public class Infinitesortedarray {
    public static void main(String[] args) {
        int []arr={1,2,3,4,5,6,7,8,12,13,14,15,16,17,18,19,20,21,22,23,24};
       int target=15;
       int ans=arraygiven(arr,target);
        System.out.println(ans);

    }
    static int arraygiven(int[] arr,int target){
        int start=0;int end=1;
        while(target>arr[end]){
            int temp=end+1;
            end=end+(end-start+1)*2;//main ye formula hi hai
            start=temp;
        }
        while(start<=end){
            int mid=start+(end-start)/2;
            if(target>arr[mid]){
                start=mid+1;
            } else if (target<arr[mid]) {
                end=mid-1;

            }
            else{
                return mid;
            }
        }
        return -1;
    }
}
