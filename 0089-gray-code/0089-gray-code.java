class Solution {
    public List<Integer> grayCode(int n) {
        List<Integer> li = new ArrayList<>();
                
        for(int i = 0; i < (1 << n); i++){
            li.add(i ^ (i >> 1));
        }
        return li;
    }
}