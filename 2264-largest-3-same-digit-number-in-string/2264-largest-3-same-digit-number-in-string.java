class Solution {
    public String largestGoodInteger(String num) {
        // Step 1: convert once, so each lookup is a plain array access
        char[] digits = num.toCharArray();

        // Step 2: no good digit found yet
        char maxD = ' ';

        // Step 3: scan windows of 3
        for (int i = 0; i + 2 < digits.length; i++) {
            char d = digits[i];

            if (d == digits[i + 1] && d == digits[i + 2] && d > maxD) {
                maxD = d;

                // Step 3a: '9' is the best possible, so stop searching
                if (maxD == '9') {
                    break;
                }
            }
        }

        // Step 4: nothing found
        if (maxD == ' ') {
            return "";
        }

        // Step 5: build the answer
        String result = "" + maxD + maxD + maxD;
        return result;
    }
}