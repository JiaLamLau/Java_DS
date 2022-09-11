public class SelectionSort {
    public static void main(String[] args) {
        double[] list = {1.2,3.4,4,4.6,4,9};
        SelectionSort.selectSort(list);
        for (double a:list) {
            System.out.print(" "+a);
        }
    }
    public static void selectSort(double[] list) {
        for (int i = 0; i < list.length; i++) {
            double currentMin = list[i];
            int currentMinIndex = i;

          for (int j = i + 1; j < list.length; j++) {
            if (currentMin > list[j]) {
                currentMin = list[j];
                currentMinIndex = j;
            }
        }
        if (currentMinIndex != 1) {
            list[currentMinIndex] = list[i];
            list[i] = currentMin;
        }

    }
    }
}
