package com.zipcodewilmington.looplabs;

/**
 * Created by leon on 1/29/18.
 * @ATTENTION_TO_STUDENTS You are forbidden from modifying the signature of this class.
 */
public final class IntegerDuplicateDeleter extends DuplicateDeleter<Integer>
{

    public IntegerDuplicateDeleter(Integer[] intArray)
    {
        super(intArray);
    }

    @Override
    public Integer[] removeDuplicates(int maxNumberOfDuplications) {
        Integer[] tempArray = new Integer[array.length];
        Integer newArrayIndex = 0;
        Integer counter;

        for (int a : array)
        {
            counter = arrayCounter(a);
            if(counter < maxNumberOfDuplications)
            {
                tempArray[newArrayIndex] = a;
                newArrayIndex ++;
            }
        }

        Integer[] finalArray = new Integer[newArrayIndex];

        System.arraycopy(tempArray, 0, finalArray, 0, newArrayIndex);
        return  finalArray;
    }

    public Integer[] removeDuplicatesExactly(int number)
    {
        Integer[] tempArray = new Integer[array.length];
        Integer newArrayIndex = 0;
        Integer counter;

        for (int a : array)
        {
            counter = arrayCounter(a);
            if(!counter.equals(number))
            {
                tempArray[newArrayIndex] = a;
                newArrayIndex ++;
            }
        }

        Integer[] finalArray = new Integer[newArrayIndex];

        System.arraycopy(tempArray, 0, finalArray, 0, newArrayIndex);
        return  finalArray;
    }

    public int arrayCounter(int number)
    {
        int counter = 0;
        for (int a : array)
        {
            if(a == number)
            {
                counter ++;
            }
        }
        return counter;
    }

}
