package DSA.Arrays;

import java.util.HashSet;
import java.util.Set;

class RemoveDuplicateElment {
    //brut force
    public static int[] removeDuplicateElment(int[] arr) {
        Set<Integer> hs = new HashSet<>();
        int index = 0;
        for (int nu : arr) {
            hs.add(nu);
        }
        for(int h:hs){
            arr[index++]=h;
        }

        return arr;
    }

    //optiimize Solution
    public static int[] removeDuplicateElment11(int[] arr) {
        int j = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[j]) {
                arr[++j] = arr[i];
            }

        }
        return arr;
    }

    public static void main(String[] args) {
        // int[] arr = { 1, 1, 2, 3, 3, 4, 4, 5, 6 };
        int[] arr={1,2,3,4,5};
        int[] res = removeDuplicateElment11(arr);
        for (int num : res) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}