class Solution {
    public boolean areSentencesSimilar(String s1, String s2) {
        String[] a = s1.split(" ");
        String[] b = s2.split(" ");
        int i = 0, j = 0;
        while (i < a.length && j < b.length && a[i].equals(b[j])) {
            i++; j++;
        }
        int x = a.length - 1, y = b.length - 1;
        while (x >= i && y >= j && a[x].equals(b[y])) {
            x--; y--;
        }
        return i > x || j > y;
    }
}
