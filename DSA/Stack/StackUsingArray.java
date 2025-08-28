package DSA.Stack;

public class StackUsingArray<T> {

    T[] arr;
    int top;
    int capacity;

    @SuppressWarnings("unchecked")
    public StackUsingArray(int capacity) {
        this.capacity = capacity;
        this.top = -1;
        this.arr = (T[]) new Object[capacity];

    }

    public boolean isEmpty() {

        return top == -1;
    }

    public boolean isFull() {
        return top==capacity-1;
    }

    public void push(T number) {
        if(isFull()){
            return;
        }
        arr[++top]=number;
    }

    public T pop(){
        if(isEmpty())throw new RuntimeException( "Stack is isEmpty");
        return arr[top--];
    }
    
        public T peek() {
            if (isEmpty()) {
                throw new RuntimeException("Stack is empty");
            }
            return arr[top];
        }

    public static void main(String[] args) {
        StackUsingArray<Integer> st=new StackUsingArray<>(5);
        st.push(1);
        st.push(2);
        st.push(3);
        System.out.println(st.pop());
        System.out.println(st.isEmpty());
        System.out.println(st.isFull());


    }
}
