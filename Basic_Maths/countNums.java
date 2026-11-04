// Count the number of digits in an integer.

// Examples:
// Input:  12345
// Output: 5

// Input:  908
// Output: 3

// Input:  7
// Output: 1


 class Main {

    public static void main(String[] args) {

        int num = 123;
   int count = 0;
        // Your logic here
        while(num>0){
      count++;
    num = num/10;
        }
        System.out.println(count);

    }
}