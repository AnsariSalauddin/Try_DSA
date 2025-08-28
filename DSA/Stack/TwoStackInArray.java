// Implement two Stacks in an Array
package DSA.Stack;

public class TwoStackInArray {
    int[] arr;
    int size;
    int top1, top2;

    public TwoStackInArray(int size) {
        this.size = size;
        arr = new int[size];
        top1 = -1;           
        top2 = size;        
    }

    // Push in stack1
    public void push1(int x) {
        if (top1 < top2 - 1) {  
            arr[++top1] = x;
        } else {
            System.out.println("Stack Overflow in stack1");
        }
    }

    // Push in stack2
    public void push2(int x) {
        if (top1 < top2 - 1) {  
            arr[--top2] = x;
        } else {
            System.out.println("Stack Overflow in stack2");
        }
    }

    // Pop from stack1
    public int pop1() {
        if (top1 >= 0) {
            return arr[top1--];
        } else {
            System.out.println("Stack Underflow in stack1");
            return -1;
        }
    }

    // Pop from stack2
    public int pop2() {
        if (top2 < size) {
            return arr[top2++];
        } else {
            System.out.println("Stack Underflow in stack2");
            return -1;
        }
    }

    public boolean isEmpty1() {
        return top1 == -1;
    }

    public boolean isEmpty2() {
        return top2 == size;
    }

    public static void main(String[] args) {
        TwoStackInArray ts = new TwoStackInArray(6);

        ts.push1(1);
        ts.push1(2);
        ts.push2(9);
        ts.push2(8);
        ts.push2(10);

        System.out.println(ts.pop1()); // 2
        System.out.println(ts.pop2()); // 8
        System.out.println(ts.pop1()); // 1
        System.out.println(ts.pop2()); // 9
    }
}
