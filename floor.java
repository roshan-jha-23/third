public class floor {
    public static void main(String[] args) {
        int []arr={1,2,3,4,5,6,7,8,9,12,15,17,19,22,34,67,89,99};
        int target=16;
        int ans=floor(arr,target);
        System.out.println(ans);//the index is returned here.
        System.out.println(arr[ans]);//the element is returned here the floor value of the target element.
    }
    static int floor(int[]arr,int target){//ye jo dono hamne kiya hai ceiling and floor basic baat pe ki.
        //while jab failure ho jata yaa target element not found start>end.
        int n=arr.length;
        int start=0;
        int end=n-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(target>arr[mid])
            {
                start=mid+1;
            } else if (target<arr[mid]) {
                end=mid-1;
            }
            else {
                return mid;
            }

        }
        return end;
    }
}
