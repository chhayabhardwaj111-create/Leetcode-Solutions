import java.util.*;

class Solution {
    public List<String> validateCoupons(String[] code, String[] businessLine, boolean[] isActive) {

        HashSet<String> li1 = new HashSet<>();
        li1.add("electronics");
        li1.add("grocery");
        li1.add("pharmacy");
        li1.add("restaurant");

        ArrayList<String[]> li2 = new ArrayList<>();

        for (int i = 0; i < code.length; i++) {
            if (isActive[i] && li1.contains(businessLine[i]) && str(code[i])) {
                li2.add(new String[]{businessLine[i], code[i]});
            }
        }

        Collections.sort(li2, (a, b) -> {
            if (!a[0].equals(b[0])) return a[0].compareTo(b[0]);
            return a[1].compareTo(b[1]);
        });

        ArrayList<String> ans = new ArrayList<>();
        for (String[] x : li2) ans.add(x[1]);
        return ans;
    }

    private boolean str(String s) {
        if (s.length() == 0) return false;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (!(Character.isLetterOrDigit(c) || c == '_')) return false;
        }
        return true;
    }
}
