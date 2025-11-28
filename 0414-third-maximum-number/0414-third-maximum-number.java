class Solution {
    public int thirdMax(int[] nums) {
        ArrayList<Integer> list = new ArrayList<>();

        for (int num : nums) {
            if (!list.contains(num)) {
                list.add(num);
            }
        }

        Collections.sort(list);

        if (list.size() < 3) {
            return list.get(list.size() - 1);
        }

        return list.get(list.size() - 3);
    }
}
