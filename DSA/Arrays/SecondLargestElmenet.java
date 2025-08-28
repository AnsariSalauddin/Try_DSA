package DSA.Arrays;

public class SecondLargestElmenet {

    public static int secondLargestElmenet(int[] arr) {
        int largest = Integer.MIN_VALUE;
        int seondLargest = Integer.MIN_VALUE;
        for (int i = 0; i <= arr.length - 1; i++) {
            if (arr[i] > largest) {
                seondLargest = largest;
                largest = arr[i];
            } else if (arr[i] > seondLargest && arr[i] < largest) {
                seondLargest = arr[i];
            }
        }
        if (seondLargest == Integer.MIN_VALUE) {
            System.out.println("Same Element are present into array");
        }
        return seondLargest;
    }

    public static int secondSmallestElment(int[] arr) {
        int secondSmallest = Integer.MAX_VALUE;
        int smallest = Integer.MAX_VALUE;

        for (int n : arr) {
            if (n < smallest) {
                secondSmallest = smallest;
                smallest = n;
            } else if (n < smallest && n > secondSmallest) {
                secondSmallest = n;

            }
        }
        return secondSmallest;
    }

    public static int kthLargestElment(int[] arr, int k) {
        boolean[] identity = new boolean[arr.length];

        int kth = 0;
        for (int j = 0; j < k; j++) {
            int largest = Integer.MIN_VALUE;
            int index = -1;
            for (int i = 0; i < arr.length; i++) {

                if (!identity[i] && arr[i] > largest) {
                    largest = arr[i];
                    index = i;
                }
            }
            if (index != -1) {
                identity[index] = true;
                kth = largest;
            }
        }
        return kth;
    }

    public static void main(String[] args) {
        // int[] arr = {-10, -20, -3, -50, -7};
        // int[] arr = {7, 7, 7, 7};
        // int[] arr = {5, 10, 15, 20};
        int[] arr = {50, 40, 30, 20, 10};
        // int n = secondLargestElmenet(arr);
        // System.out.println(n);

        // int smallest = secondSmallestElment(arr);
        // System.out.println(smallest);
        int kth = kthLargestElment(arr, 3);
        System.out.println(kth);
    }
}
