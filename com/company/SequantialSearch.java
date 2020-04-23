package com.company;

public class SequantialSearch {

    public static int sequentialSearch(int[] elements, int target)
    {
        for (int j = 0; j < elements.length; j++)
        {
            if (elements[j] == target)
            {
                return j;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] numbers = {81, 3, 50, -300, 432};

        int index = sequentialSearch(numbers,-300);
        System.out.println(index);

    }

}
