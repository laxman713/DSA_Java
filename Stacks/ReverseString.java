/* ### Next Stack Question: Next Greater Element

Given an array, for each element find the **first greater element on its right side**.

**Input:**

```text
[4, 5, 2, 10, 8]
```

**Expected Output:**

```text
[5, 10, 10, -1, -1]
```

For example:

* `4 → 5`
* `5 → 10`
* `2 → 10`
* `10 → -1`
* `8 → -1`

Implement this using a **Stack**.
 */

import java.util.*;

public class ReverseString {

    public static String reverse(String s) {

        Stack<Character> st = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
      st.push(s.charAt(i));
        }

        String result = "";

        for (int i = 0; i < s.length(); i++) {
           result = result+st.pop();
        }

        return result;
    }

    public static void main(String[] args) {

        String s = "hello";

        System.out.println(reverse(s));
    }
}