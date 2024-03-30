package com.zipcodewilmington.arrayutility;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by leon on 3/6/18.
 */
public class ArrayUtility<T> {
    T[] objectArray;
    public ArrayUtility (T[] objectArray){
        this.objectArray = objectArray;
    }

    public Integer countDuplicatesInMerge(T[] arrayToMerge, T valueToEvaluate) {
        int count=0;
        //Created newArr to merge arrayToMerge array
        List<T> newArr = new ArrayList<>(Arrays.asList(objectArray));
        newArr.addAll(Arrays.asList(arrayToMerge));

        //Find the duplicates and count it
        for (int i=0; i<newArr.size(); i++)
        {
            if(newArr.get(i).equals(valueToEvaluate)){
                count++;
            }
        }
        return count;
    }

    public T getMostCommonFromMerge(T[] arrayToMerge) {
        //Merge array
        int count=0;
        T mostCommon = null;
        //Created newArr to merge arrayToMerge array
        List<T> newArr = new ArrayList<>(Arrays.asList(objectArray));
        newArr.addAll(Arrays.asList(arrayToMerge));

        //Find the most common in an array
        for (T value : objectArray) {
            if (getNumberOfOccurrences(value) > count){
                count =count + getNumberOfOccurrences(value);
                mostCommon = value;
            }
        }
        return mostCommon;
    }

    public Integer getNumberOfOccurrences(T valueToEvaluate) {
        int count =0;
        for (T value : objectArray){
            if (value.equals(valueToEvaluate)){
                count++;
            }
        }
        return count;
    }

    public T[] removeValue(T valueToRemove) {
        //crete a new ArrayList to store value from array except valueToRemove
        List<T> newArr = new ArrayList<>();

        return null;
    }
}
