/* Min Stack Problem

Design a stack that supports the following operations in O(1) time:

push(int val)
pop()
top()
getMin()

getMin() should return the minimum element currently present in the stack.

Example

Input:

push(-2)
push(0)
push(-3)
getMin()
pop()
top()
getMin()

Output:

-3
0
-2
Explanation

After:

push(-2)
push(0)
push(-3)

Stack:

-3  ← top
 0
-2

So:

getMin() → -3

After:

pop()

-3 is removed:

 0  ← top
-2

Therefore:

top()    → 0
getMin() → -2 */

import java.util.*;

class MinStack {

    Stack<int[]> s;

    public MinStack() {
        s = new Stack<>();
    }

    public void push(int val) {
        if(s.isEmpty()){
            s.push(new int[]{val,val});
        }else{
            int min = Math.min(val,s.peek()[1]);
            s.push(new int[]{val,min});
        }
    }

    public void pop() {
        s.pop();
    }

    public int top() {
      return  s.peek()[0];
    }

    public int getMin() {
      return  s.peek()[1];
    }

    public static void main(String[] args) {

        MinStack s = new MinStack();

        s.push(-2);
        s.push(0);
        s.push(-3);

        System.out.println(s.getMin());

        s.pop();

        System.out.println(s.top());
        System.out.println(s.getMin());
    }
}