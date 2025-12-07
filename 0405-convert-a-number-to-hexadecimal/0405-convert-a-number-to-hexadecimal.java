class Solution {
    public String toHex(int num) {

        long n = num & 0xffffffffL;

        StringBuilder sb = new StringBuilder();

        if(n == 0)return "0";

        while (n != 0) {
            long dividend = n / 16;
            int rem = (int)(n % 16);
            n = dividend;

            if (rem >= 0 && rem <= 9) {
                sb.append(rem);
            } else {
                switch (rem) {
                    case 10: sb.append('a'); break;
                    case 11: sb.append('b'); break;
                    case 12: sb.append('c'); break;
                    case 13: sb.append('d'); break;
                    case 14: sb.append('e'); break;
                    case 15: sb.append('f'); break;
                }
            }
        }

        return sb.reverse().toString();
    }
}
