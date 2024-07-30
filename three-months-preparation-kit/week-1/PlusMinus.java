/*
Some issues that I had:
    If you perform a division between two integer numbers, the result will be a integer. So you have to cast the denominator or the numerator (or both) to float type.
    Array and list have different methods.
*/


public static void plusMinus(List<Integer> arr) {
    int i;
    int countPos = 0, countNeg = 0, countZero = 0;
        for (i = 0; i < arr.size(); i++){
            if (arr.get(i) == 0) {
            countZero++;
            }else if (arr.get(i) < 0) {
            countNeg++;
            }
            else {
            countPos++;
            }
        }
    float ratioPos = (float) countPos/arr.size();
    float ratioNeg = (float) countNeg/arr.size();
    float ratioZero = (float) countZero/arr.size();
    System.out.printf("%.6f %n", ratioPos);
    System.out.printf("%.6f %n", ratioNeg);
    System.out.printf("%.6f %n", ratioZero);
}