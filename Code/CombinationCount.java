//Program to find number of combinations of elements in a array without repetition.

package com.company.coding;

public class CombinationCount {
    public static void main(String[] args) {
        int[] intArray = {1,2,3,4,5};
        combinationCount(intArray,intArray.length);
    }
    public static int count =0;
    static void combinationCount(int[] intArray, int length) {
        int[] temp= new int[length];
        for(int k=0;k<length;k++)
            findCombination(intArray,temp,0,length-1,0,k);
        System.out.println(" Total Number of combinations  is : "+count);
    }

    static void findCombination(int[] intArray, int[] temp, int start, int end, int index, int k) {
        if (index == k)
            count++;
        for (int i = start; i <= end && ((end - i + 1) >= (k - index)); i++)
        {
            temp[index] = intArray[i];
            findCombination(intArray, temp, i + 1, end, index + 1, k);
        }
    }
}
