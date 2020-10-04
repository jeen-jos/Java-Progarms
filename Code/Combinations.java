//Code to find combination of numbers in a array without repetition

package com.company.coding;

public class Combinations {
    public static void main(String[] args) {
        int[] intArray = {1,2,3,4,5};
        System.out.println("The combinations are :");
        displayCombinations(intArray,intArray.length);
        // 1 combination containing all elements
        for (int j = 0; j < intArray.length; j++)
            System.out.print(intArray[j] + " ");
    }

     static void displayCombinations(int[] intArray, int arrayLength) {
        int[] temp= new int[arrayLength];
        for(int k=0;k<arrayLength;k++)
                findCombination(intArray,temp,0,arrayLength-1,0,k);
    }

     static void findCombination(int[] intArray, int[] temp, int start, int end, int index, int k) {
        if (index == k)
        {
            for (int j = 0; j < k; j++)
               System.out.print(temp[j] + " ");
            System.out.println();
        }

        for (int i = start; i <= end && ((end - i + 1) >= (k - index)); i++)
        {
            temp[index] = intArray[i];
            //Using recursion we are incrementing indices of temp and inputArray.
            findCombination(intArray, temp, i + 1, end, index + 1, k);
        }
    }
}
