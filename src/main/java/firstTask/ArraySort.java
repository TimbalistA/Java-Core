package firstTask;

import java.util.ArrayList;

public class ArraySort {

    public static ArrayList<Integer> sort(ArrayList<Integer> array) {
        ArrayList<Integer> sortedArray = new ArrayList<Integer>();
        while (array.size() > 0) {
            int minElement = 0;
            for (int i = 1; i < array.size(); i++) {
                if (array.get(minElement) > array.get(i)) {
                    minElement = i;
                }
            }
            reverse(array, minElement);
            sortedArray.add(array.get(0));
            array.remove(0);
        }
        return sortedArray;
    }

    public static void reverse(ArrayList<Integer> array, int index) {
        int i = 0;
        while (i < index) {
            int temp = array.get(index);
            array.add(index, array.get(i));
            array.remove(index + 1);
            array.add(i, temp);
            array.remove(i + 1);
            index--;
            i++;
        }
    }

    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        arrayList.add(7);
        arrayList.add(2);
        arrayList.add(1);
        arrayList.add(4);
        arrayList.add(5);

        System.out.println("Sorted array: " + sort(arrayList));
    }

}
