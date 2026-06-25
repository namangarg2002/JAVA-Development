public class Searching {
    public static void main(String[] args) {

        int nums[] = {5, 7, 9, 11, 13};
        int target = 11;

        // int result = linearSearch(nums, target);
        // int result = binarySearch(nums, target);
        int result = recursiveBinarySearch(nums, target, 0, nums.length -1);

        if(result != -1){
            System.out.println("Element found at index: " + result);
        }else{
            System.out.println("Element not found");
        }
    }

    public static int linearSearch(int nums[], int target){
        int steps = 0;
        for(int i=0; i<nums.length; i++){
            steps++;
            if(nums[i] == target){
                System.out.println("Steps taken by Linear : "+ steps);
                return i;
            }
        }
        System.out.println("Steps taken by Linear : "+ steps);
        return -1;
    }

    public static int binarySearch(int nums[], int target){

        int steps = 0;

        int s = 0;
        int e = nums.length - 1;
        while(s<=e){
            int mid = s + (e-s)/2;
            steps++;

            if(nums[mid] == target){
                System.out.println("Steps taken by Binary : "+ steps);
                return mid;
            }else if(nums[mid] > target){
                e = mid - 1;
            }else{
                s = mid + 1;
            }
        }
        System.out.println("Steps taken by Binary : "+ steps);
        return -1;
    }

    public static int recursiveBinarySearch(int nums[], int target, int s, int e){

        int steps = 0;

        while(s<=e){
            int mid = s + (e-s)/2;
            steps++;

            if(nums[mid] == target){
                System.out.println("Steps taken by Binary : "+ steps);
                return mid;
            }else if(nums[mid] > target){
                return recursiveBinarySearch(nums, target, s, mid-1);
            }else{
                return recursiveBinarySearch(nums, target, mid+1, e);
            }
        }
        System.out.println("Steps taken by Binary : "+ steps);
        return -1;
    }
}