class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();

        for(int i:nums1){
            set1.add(i);
        }
        for(int i:nums2){
            set2.add(i);
        }

        Set<Integer> temp1 = new HashSet<>(set1);
        temp1.removeAll(set2);

        Set<Integer> temp2 = new HashSet<>(set2);
        temp2.removeAll(set1);

        return Arrays.asList(
            new ArrayList<>(temp1),
            new ArrayList<>(temp2)
        );
        
    }
}