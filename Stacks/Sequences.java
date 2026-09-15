import java.util.Stack;

class Sequences{

    public static boolean validateStackSequences(int[] pushed, int[] popped) {

        Stack<Integer> st = new Stack<>();

        int j = 0;

        for (int i = 0; i < pushed.length; i++) {

            st.push(pushed[i]);

            while (!st.isEmpty() &&
                   j < popped.length &&
                   st.peek() == popped[j]) {

                st.pop();
                j++;
            }
        }

        return st.isEmpty();
    }

    public static void main(String[] args) {

        int[] pushed = {1, 2, 3, 4, 5};
        int[] popped = {4, 5, 3, 2, 1};

        boolean result = validateStackSequences(pushed, popped);

        System.out.println(result);
    }
}