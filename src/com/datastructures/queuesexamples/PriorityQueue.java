package com.datastructures.queuesexamples;

import java.util.Arrays;

public class PriorityQueue {

    private int[] items = new int[5];

    private int count;

    public void add(int item){

        if(isFull())
            throw new IllegalStateException();

        int i = ShiftItemsToInsert(item);
        items[i] = item;
        count++;

    }

    @Override
    public String toString(){
        return Arrays.toString(items);
    }

    public int remove(){
        if(isEmpty())
            throw new IllegalStateException();
        return items[--count];
    }

    public boolean isEmpty(){
        return count == 0;
    }

    public int ShiftItemsToInsert(int item){
        int i;
        for(i = count - 1; i >= 0; i--){
            if(items[i] > item)
                items[i + 1] = items[i];
            else
                break;
        }
        return i + 1;
    }

    public boolean isFull(){
        return count == items.length;
    }

}
