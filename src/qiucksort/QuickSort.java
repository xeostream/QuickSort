/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package qiucksort;

/**
 *
 * @author Xeon
 */
public class QuickSort {

    private int[] numbers = {1, 4, 2, 19, 34, 5, 3, 100, 40};

    public void quicksort(int i, int j) {
        if (i >= j) {
            return;
        }
        int temp = partion(i, j);
        quicksort(i, temp - 1);
        quicksort(temp + 1, j);
    }

    public int partion(int i, int j) {
        int tmp = numbers[i];
        while(i < j) {
            while(i < j && numbers[j] >= tmp) {
                j--;
            }
            numbers[i] = numbers[j];
            while(i < j && numbers[i] <= tmp) {
                i++;
            }
            numbers[j] = numbers[i];
        }
        numbers[i] = tmp;
        return i;
    }

    public void print() {
        for (int i = 0; i < 9; i++) {
            System.out.print(numbers[i] + " ");
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        QuickSort quick = new QuickSort();
        quick.quicksort(0, 8);
        quick.print();
    }
}
