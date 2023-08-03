package homework.task_6_exceptions;

public class ArrayValueCalculator {

    public int doCalc(String[][] arr) throws ArraySizeException, ArrayDataException  {
        if (arr.length != 4 || arr[0].length != 4) {
            throw new ArraySizeException("ArraySizeException: Array should be 4x4");
        }
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                try {
                    int value = Integer.parseInt(arr[i][j]);
                    sum += value;
                } catch (Exception e) {
                    throw new ArrayDataException ("ArrayDataException [" + i + "][" + j + "]");
                }
            }
        } return sum;
    }


    public static void main(String[] args) {
        String[][] arr = {
                {"1", "2", "3", "4" },
                {"5", "6", "7", "8" },
                {"9", "10", "11", "12" },
                {"13", "14", "15", "16"}
        };

        ArrayValueCalculator arrCalc = new ArrayValueCalculator();
        int result = arrCalc.doCalc(arr);
        System.out.println(result);
    }
}

