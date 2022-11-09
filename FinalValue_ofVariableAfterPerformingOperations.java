public class FinalValue_ofVariableAfterPerformingOperations {
    public int finalValueAfterOperations(String[] operations) {
        int X = 0;
        for (String i : operations) {
            if (i.equals("--X") || i.equals("X--")) {
                X = X - 1;
            } else {
                X = X + 1;
            }
        }
        return X;
    }

    //    Driver Code;
    public static void main(String[] args) {
        FinalValue_ofVariableAfterPerformingOperations oj = new FinalValue_ofVariableAfterPerformingOperations();
        System.out.println(oj.finalValueAfterOperations(new String[]{"X++","++X","--X","X--"}));
    }
}
