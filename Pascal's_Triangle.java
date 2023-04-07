class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> triangle = new ArrayList<>();
        List<Integer> row = new ArrayList<>();
        row.add(1);
        triangle.add(row);
        for (int i = 1; i < numRows; i++) {
            row = new ArrayList<>();
            List<Integer> prev_row = triangle.get(i - 1);
            row.add(1);
            for (int j = 1; j < i; j++) {
                row.add(prev_row.get(j) + prev_row.get(j - 1));
            }
            row.add(1);
            triangle.add(row);
        }
        return triangle;  
    }
}