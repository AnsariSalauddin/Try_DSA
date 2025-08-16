package DSA.Arrays;

public class SecondLargestElmenet {
    public static int secondLargestElmenet(int[] arr){
        int largest = Integer.MIN_VALUE;
        int seondLargest = Integer.MIN_VALUE;
        for(int i=0; i<=arr.length-1; i++){
            if(arr[i]>largest){
                seondLargest=largest;
                largest=arr[i];
            }else if(arr[i]>seondLargest && arr[i]<largest){
                seondLargest=arr[i];
            }
        }
        if(seondLargest==Integer.MIN_VALUE){
            System.out.println("Same Element are present into array");
        }
        return seondLargest;
    }
    
    public static void main(String[] args) {
        // int[] arr = {-10, -20, -3, -50, -7};
        // int[] arr = {7, 7, 7, 7};
        // int[] arr = {5, 10, 15, 20};
        int[] arr = {50, 40, 30, 20, 10};
       int n= secondLargestElmenet(arr);
       System.out.println(n);
    }
}
