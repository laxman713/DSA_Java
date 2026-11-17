class LCM {
    public static void main(String[] args) {
        int lcm = 1;
        int num1 = 12;
        int num2 = 18;

        int i = Math.max(num1, num2);

        while (true) {
            if (i % num1 == 0 && i % num2 == 0) {
                lcm = i;
                break;
            } else {
                i++;
            }
        }

        System.out.println(lcm);
    }
}

