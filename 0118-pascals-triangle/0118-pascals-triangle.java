class Solution {

    public static List<Integer> generateRow(int row) {
        List<Integer> list = new ArrayList<>();
        list.add(1);

        int ans = 1;

        for (int col = 1; col < row; ++col) {
            ans = ans * (row - col);
            ans = ans / col;
            list.add(ans);
        }

        return list;
    }
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans = new ArrayList<>();

        for (int row = 1; row <= numRows; ++row) {
            ans.add(generateRow(row));
        }

        return ans;
    }
}