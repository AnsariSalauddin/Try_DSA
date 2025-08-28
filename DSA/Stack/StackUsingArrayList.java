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
    public T pop(){
        if(isEmpty()) throw new RuntimeException("Stack is empty");
        return li.remove(li.size()-1);
    }
    public T peek(){
         if(isEmpty()) throw new RuntimeException("Stack is empty");
        return li.get(li.size()-1);
    }

    public static void main(String[] args) {
        StackUsingArrayList<Integer> st=new StackUsingArrayList<>();
        st.push(1);
        st.push(2);
        System.out.println(st.pop());
        System.out.println(st.pop());
    }
}
