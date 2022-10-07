public class ExerciceSelectShort {
    public static void selectionSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            int indexnumber = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[indexnumber]) {
                    indexnumber = j;
                }
            }
        }
    }
}