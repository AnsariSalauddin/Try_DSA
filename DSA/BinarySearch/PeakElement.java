package DSA.BinarySearch;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PeakElement {
    //brut force approach
    public static int peakElmenet(ArrayList<Integer> arr){
        int size=arr.size();
        for(int i=0; i<size;i++){
            if((i==0 || arr.get(i)>arr.get(i-1)) && (i==size-1 || arr.get(i)>arr.get(i+1))){
                return i;
            }
        }
        return -1;
    }
//optimal Approach
public static int findPeakElmenet(List<Integer> ls){
    int si=ls.size();
    if(si==1)return 0;
    if(ls.get(0)>ls.get(1))return 0;
    if(ls.get(si-1)>ls.get(si-2))return si-1;

    int left=1;
    int right=si-2;
    while(left<=right){
        int mid=(left+right)/2;

        if(ls.get(mid)>ls.get(mid-1) && ls.get(mid)>ls.get(mid+1))return mid;
        if(ls.get(mid)>ls.get(mid-1)) left=mid+1;
        else right=mid-1;
    }
    return -1;
}

    public static void main(String[] args) {
         ArrayList<Integer> arr =
            new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 5, 1));
           
           int i= findPeakElmenet(arr);
           System.out.println(arr.get(i));
    }
}
