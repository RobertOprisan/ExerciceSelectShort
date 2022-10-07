public class SelectionSortExample {
    public static void main(String[] args) {
        int[] array = {4, 1, 2, 3, 12, 42, 5};

        for (int i = 0; i < array.length ; i++) {
            int indexnumber = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[indexnumber]) {
                    indexnumber = j;
                }
            }
            int smallerNumber = array[indexnumber];
            array[indexnumber] = array[i];
            array[i] = smallerNumber;
            System.out.println(smallerNumber);
        }
    }
}





       
