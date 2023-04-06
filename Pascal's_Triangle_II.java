import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<List<Integer>> triangle = new ArrayList<>(rowIndex + 1);
        List<Integer> row = new ArrayList<>();
        row.add(1);
        triangle.add(row);
        for (int i = 1; i <= rowIndex; i++) {
            row = new ArrayList<>();
            List<Integer> prev_row = triangle.get(i - 1);
            row.add(1);
            for (int j = 1; j < i; j++) {
                row.add(prev_row.get(j) + prev_row.get(j - 1));
            }
            row.add(1);
            triangle.add(row);
        }
        return triangle.get(rowIndex);
    }
}