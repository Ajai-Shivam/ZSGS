public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1};
        Bubble_sort(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void Bubble_sort(int[] arr){
        for (int i = 1; i <= arr.length; i++) {
            for (int j = 0; j < arr.length-1; j++) {
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
}
