public class Sorting {
    public static void main(String[] args) {
        
        int nums[] = {6,5,2,8,9,4};
        int size = nums.length;

        System.out.println("Before Sorting");
        for(int num: nums){
            System.out.print(num + " ");
        }
        System.out.println();


        // // Bubble Sort
        // bubbleSort(nums, size);

        // // Selection Sort
        // selectionSort(nums, size);

        // // Insertion Sort
        // insertionSort(nums, size);

        // // Quick Sort
        // QuickSort(nums, 0, size-1);

        // Merge Sort 
        mergeSort(nums, 0, size-1);


        System.out.println("After Sorting");
        for(int num: nums){
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void mergeSort(int[] nums, int s, int e) {
        if(s<e){
            int mid = s + (e-s)/2;
            mergeSort(nums, s, mid);
            mergeSort(nums, mid+1, e);
            merge(nums, s, e, mid);
        }
    }

    public static void merge(int[] nums, int s, int e, int mid) {
        int n1 = mid-s+1;
        int n2 = e-mid;
        int lArr[] = new int[n1];
        int rArr[] = new int[n2];

        // copying values
        for(int x1=0; x1<n1; x1++){
            lArr[x1] = nums[s+x1];
        }

        for(int x2=0; x2<n2; x2++){
            rArr[x2] = nums[mid+1+x2];
        }

        int i = 0;
        int j = 0;
        int k = s;


        while(i<n1 && j<n2){
            if(lArr[i] >= rArr[j]){
                nums[k] = rArr[j];
                j++;
            }else{
                nums[k] = lArr[i];
                i++;
            }

            k++;
        }

        while(i<n1){
            nums[k] = lArr[i];
            i++; 
            k++;
        }

        while(j<n2){
            nums[k] = rArr[j];
            j++;
            k++;
        }
    }

    public static void QuickSort(int[] nums, int s, int e) {
        if(s<e){

            int pi  = partition(nums, s, e);
            QuickSort(nums, s, pi-1);
            QuickSort(nums, pi+1,e);
        }
    }

    public static int partition(int[] nums, int s, int e) {
        int i = s-1;;
        int pivot = nums[e];
        for(int j=s; j<e; j++){
            if(nums[j] < pivot){
                i++;
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
            }
        }

        int temp = nums[i+1];
        nums[i+1] = nums[e];
        nums[e] = temp;

        return i+1;
    }

    public static void insertionSort(int[] nums, int size) {
        
        for(int i=1; i<size; i++){
            int key = nums[i];
            int j = i-1;

            while(j>=0 && nums[j] > key){
                nums[j+1] = nums[j];
                j--;
            }
            nums[j+1] = key;

            for(int num: nums){
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }

    public static void selectionSort(int[] nums, int size) {
        
        for(int i=0; i<size-1; i++){

            // MinIndex
            int minIdx = minIndex(nums, size, i);

            // Swapping min with current index
            int temp = nums[i];
            nums[i] = nums[minIdx];
            nums[minIdx] = temp;

            for(int num: nums){
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }

    public static int minIndex(int[] nums, int size, int start){
        int minIndex = start;
        for(int i = start + 1; i<size; i++){
            if (nums[i] < nums[minIndex]) {
                minIndex = i;
            }
        }

        return minIndex;
    }

    public static void bubbleSort(int[] nums, int size) {
        
        for(int i=0; i<size-1; i++){
            for(int j=0; j<size-i-1; j++){
                if(nums[j] > nums[j+1]){
                    // swapping the two values
                    int temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;

                }
            }
            for(int num: nums){
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}
