import java.util.ArrayList;
import java.util.List;

public class getRow {

    public List<Integer> getRow(int rowIndex) {

        if (rowIndex < 0) {
            return null;
        }
        List<Integer> result = new ArrayList<>();
        result.add(1);
        for (int i = 1; i <= rowIndex; i++) {
            for (int j = result.size() - 2; j >= 0; j--) {
                result.set(j + 1, result.get(j) + result.get(j + 1));
            }
            result.add(1);
        }

        return result;

    }
    public static void main(String[] args) {
        System.out.println(new getRow().getRow(5));
    }
}
