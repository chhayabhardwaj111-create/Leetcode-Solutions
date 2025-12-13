import java.util.*;

class Solution {
    public List<String> validateCoupons(String[] code, String[] businessLine, boolean[] isActive) {
        Set<String> allowed = new HashSet<>();
        allowed.add("electronics");
        allowed.add("grocery");
        allowed.add("pharmacy");
        allowed.add("restaurant");

        List<String[]> list = new ArrayList<>();

        for (int i = 0; i < code.length; i++) {
            if (isActive[i] && allowed.contains(businessLine[i]) && valid(code[i])) {
                list.add(new String[]{businessLine[i], code[i]});
            }
        }

        Collections.sort(list, (a, b) -> {
            if (!a[0].equals(b[0])) return a[0].compareTo(b[0]);
            return a[1].compareTo(b[1]);
        });

        List<String> ans = new ArrayList<>();
        for (String[] x : list) ans.add(x[1]);

        return ase;
    }

    private boolean valid(String s) {
        if (s.length() == 0) return false;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (!(Character.isLetterOrDigit(c) || c == '_')) return false;
        }
        return true;
    }
}
