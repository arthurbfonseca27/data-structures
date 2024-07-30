/* The reason for using long instead of int is to handle the potential overflow 
that can occur when summing large integers. In Java, the int data type has a maximum 
value of 2,147,483,647 (2^31 - 1). If the sum of the integers exceeds this value, 
an overflow will occur, leading to incorrect results. */   
   
public static void miniMaxSum(List<Integer> arr) {
    long sumMax = 0;
    long sumMin = 0;
    Collections.sort(arr);

    for (int i = 0; i < arr.size() - 1 ; i++){
        sumMin += arr.get(i);
    } 
    for (int i = 1; i < arr.size(); i++){
        sumMax += arr.get(i);
    }

    System.out.printf("%d %d %n", sumMin, sumMax);
}