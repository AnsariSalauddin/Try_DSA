package DSA.BinarySearch;

import java.util.ArrayList;
import java.util.Arrays;

public class SingleNonDuplicate {

    //brut force approach
    public static int singleNonDuplicate1(ArrayList<Integer> arrayList) {
        int v = 0;
        for (int i = 0; i < arrayList.size(); i++) {
            v = v ^ arrayList.get(i);
        }
        return v;
    }

    //brute force approach
    public static int singleNonDuplicate2(ArrayList<Integer> arrayList) {
        int n = arrayList.size();
        if (n == 1) {
            return arrayList.get(0);
        }
        for (int i = 0; i < n; i++) {
            if (i == 0) {
                if (!arrayList.get(i).equals(arrayList.get(i + 1))) {
                    return arrayList.get(i);
                }
            } else if (i == n - 1) {
                if (!arrayList.get(i).equals(arrayList.get(i - 1))) {
                    return arrayList.get(i);
                }
            } else {
                if ((!arrayList.get(i).equals(arrayList.get(i - 1))) && !(arrayList.get(i).equals(arrayList.get(i + 1)))) {
                    return arrayList.get(i);
                }
            }
        }
        // Dummy return statement:
        return -1;
    }

    //optimal solutiion
    public static int singleNonDuplicate3(ArrayList<Integer> arrayList) {
        int n = arrayList.size();

        if (n == 1) {
            return arrayList.get(0);
        }
        if (!arrayList.get(0).equals(arrayList.get(1))) {
            return arrayList.get(0);
        }
        if (!arrayList.get(n - 1).equals(arrayList.get(n - 2))) {
            return arrayList.get(n - 1);
        }

        int low = 1, high = n - 2;

        while (low <= high) {
            int mid = (low + high) / 2;

            // Found the single element
            if (!arrayList.get(mid).equals(arrayList.get(mid - 1))
                    && !arrayList.get(mid).equals(arrayList.get(mid + 1))) {
                return arrayList.get(mid);
            }

            // Binary search logic
            if ((mid % 2 == 0 && arrayList.get(mid).equals(arrayList.get(mid + 1)))
                    || (mid % 2 == 1 && arrayList.get(mid).equals(arrayList.get(mid - 1)))) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return -1; // not found
    }

    public static void main(String[] args) {
        ArrayList<Integer> arr
                = new ArrayList<>(Arrays.asList(1, 1, 2, 2, 3, 4, 4, 5, 5));
        int i = singleNonDuplicate1(arr);
        System.out.println(i);

        int i1 = singleNonDuplicate2(arr);
        System.out.println(i1);

        int i2 = singleNonDuplicate3(arr);
        System.out.println(i2);
    }
}
