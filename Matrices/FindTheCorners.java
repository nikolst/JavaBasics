class ArrayOperations {
    public static void printCorners(int[][] twoDimArray) {
        int[] firstRow = twoDimArray[0];
        int[] lastRow = twoDimArray[twoDimArray.length - 1];

        System.out.println(firstRow[0] + " " + firsrtRow[firstRow.length - 1]);
        System.out.println(lastRow[0] + " " + lastRow[lastRow.length - 1]);
    }
}
