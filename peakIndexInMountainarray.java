public class peakIndexInMountainarray {
    public static void main(String[] args) {
int[] arr={2,4,6,7,4,5,3};
int ans=indexofpivot(arr);
        System.out.println(ans);
    }
    //arr=[0,1,2,3,2,0] ans will be index of 3 means 3
    //arr=[2,3,4,2,1] ans will be 2 bcoz 4 is the pivot
    static int indexofpivot(int [] arr){
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] > arr[mid+1]) {
                // you are in dec part of array
                // this may be the ans, but look at left
                // this is why end != mid - 1
                end = mid;
            } else {
                // you are in asc part of array
                start = mid + 1; // because we know that mid+1 element > mid element
            }
        }
        // in the end, start == end and pointing to the largest number because of the 2 checks above
        // start and end are always trying to find max element in the above 2 checks
        // hence, when they are pointing to just one element, that is the max one because that is what the checks say
        // more elaboration: at every point of time for start and end, they have the best possible answer till that time
        // and if we are saying that only one item is remaining, hence cuz of above line that is the best possible ans
        return start; // or return end as both are =
    }
}
