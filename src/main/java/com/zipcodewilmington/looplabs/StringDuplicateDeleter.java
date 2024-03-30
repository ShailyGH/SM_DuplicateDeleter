package com.zipcodewilmington.looplabs;

/**
 * Created by leon on 1/28/18.
 * @ATTENTION_TO_STUDENTS You are forbidden from modifying the signature of this class.
 */
public final class StringDuplicateDeleter extends DuplicateDeleter<String>
{


    public StringDuplicateDeleter(String[] intArray)
    {
        super(intArray);
    }

    @Override
    public String[] removeDuplicates(int maxNumberOfDuplications)
    {
        String[] tempArray = new String[array.length];
        Integer newArrayIndex = 0;
        Integer counter;

        for (String a : array)
        {
            counter = arrayCounter(a);
            if(counter < maxNumberOfDuplications)
            {
                tempArray[newArrayIndex] = a;
                newArrayIndex ++;
            }
        }

        String[] finalArray = new String[newArrayIndex];

        System.arraycopy(tempArray, 0, finalArray, 0, newArrayIndex);
        return  finalArray;
    }

    @Override
    public String[] removeDuplicatesExactly(int exactNumberOfDuplications)
    {
        return null;
    }

    public int arrayCounter(String myString)
    {
        int counter = 0;
        for (String a : array)
        {
            if(a.equals(myString))
            {
                counter ++;
            }
        }
        return counter;
    }

}
