package week01.day05;

import java.util.Arrays;
public class Task2_ArrayPractice {
    public static void printArrayNoLib(int[] arr) {
        System.out.print("[");
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);

            if(i < arr.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");

    }

    public static void printArray(int[] arr) {
        System.out.println(Arrays.toString(arr));
    }

    public static int[] reverseArray(int[] arr) {
        int[] arr1 = new int[arr.length];

        for(int i = arr.length - 1; i >= 0; i--) {
            arr1[arr1.length - i - 1] = arr[i];
        }
        return arr1;
    }

    public static int[] removeDuplicates(int[] arr) {
        int[] temp = new int[arr.length];
        int count =  0;

        for(int i = 0; i < arr.length; i++) {
            boolean isDuplicate =  false;
            for(int j = 0; j < count; j++) {
                if(arr[i] == temp[j]) {
                    isDuplicate = true;
                    break;
                }
            }
            if(!isDuplicate) {
                temp[count] = arr[i];
                count++;
            }
        }
        int[] result = new int[count];
        for(int i = 0;   i < count;  i++) {
            result[i] = temp[i];
        }
        return result;
    }

    public static int[] merge(int[] s1, int[] s2) {
        int[] result = new int[s1.length + s2.length];
        int i = 0; //s1
        int j = 0; //s2
        int k = 0; //result

        while(i < s1.length && j < s2.length) {
            if(s1[i] <= s2[j]) {
                result[k] = s1[i];
                i++;
            }else{
                result[k] = s2[j];
                j++;
            }
            k++;
        }

        //neu mang 1 con phan tu thi day het vao result
        while(i < s1.length) {
            result[k] = s1[i];
            i++;
            k++;
        }
        //neu mang 2 con phan tu thi day het vao result
        while(j < s2.length) {
            result[k] = s2[j];
            j++;
            k++;
        }

        return result;
    }

    public static int binarySearch(int[] sortArr, int target){
         int mid = 0;
         int low = 0;
         int high = sortArr.length - 1;
         while(low <= high) {
             mid = (high + low) / 2;
             if(target == sortArr[mid]) {
                 return mid;
             }else if(target > sortArr[mid]) {
                 low = mid + 1;
             }else{
                 high =  mid - 1;
             }
         }
         return -1;
    }

    public static void main(String[]  args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        printArrayNoLib(arr);
        printArray(arr);
        System.out.println("------------------");

        int[] arr1 = reverseArray(arr);
        System.out.println("Original Array: " + Arrays.toString(arr));
        System.out.println("Reverse Array: " + Arrays.toString(arr1));
        System.out.println("------------------");

        int[] arr2_t = {1,2,4,5,2,4,3};
        int[] arr2 = removeDuplicates(arr2_t);
        System.out.println("Original Array: " + Arrays.toString(arr2_t));
        System.out.println("Array No Duplicate: " + Arrays.toString(arr2));
        System.out.println("------------------");

        int[] s1 = {1,3,5,7};
        int[] s2 = {2,4,6,8};
        int[] result = merge(s1, s2);
        System.out.println("Array 1: " + Arrays.toString(s1));
        System.out.println("Array 2: " + Arrays.toString(s2));
        System.out.println("Merge Arrays: " + Arrays.toString(result));
        System.out.println("------------------");

        int[] s3 = {1,3,5,7,9,11};
        System.out.println("My array: "+ Arrays.toString(s3));
        System.out.println("Index of target: " + binarySearch(s3,11));

    }
}
