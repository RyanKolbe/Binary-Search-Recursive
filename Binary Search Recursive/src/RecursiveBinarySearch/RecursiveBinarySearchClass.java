/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RecursiveBinarySearch;

/**
 *
 * @author Ryan Kolbe
 */
public class RecursiveBinarySearchClass {

    public static int recursiveBinarySearch(int[] data, int left, int right, int target) {
        if (left <= right) {
            int middle = (left + right) / 2;
            if (data[middle] == target) {
                return middle;
            } else if (data[middle] < target) {
                return recursiveBinarySearch(data, middle + 1, right, target);
            } else if (data[middle] > target) {
                return recursiveBinarySearch(data, left, middle - 1, target);
            } else {
                return -1;
            }
        }
        return -1;
    }
}