package DSA.Stack;

import java.util.ArrayList;
import java.util.List;

public class StackUsingArrayList<T> {
    private  List<T> li=new ArrayList<>();

    public boolean isEmpty(){
        return li.isEmpty();
    }
    public void push(T data){
        li.add(data);
    }

    public static void main(String[] args) {
        StackUsingArrayList<Integer> st=new StackUsingArrayList<>();
        st.push(1);
        st.push(2);
    }
}
