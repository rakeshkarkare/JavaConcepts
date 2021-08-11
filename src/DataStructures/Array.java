package DataStructures;

public class Array {
    private int [] items;
    private int count;

    public Array(int length){
        items = new int[length];
    }

    public void insert(int item){
        //if array is full, resize it
        if(items.length == count){


            //create a new array (twice the size)

            int[] newItems = new int[count * 2];
            //copy all the existing items

            for(int i=0; i<count; i++)
                newItems[i] = items[i];
            // set items to this new array

            items = newItems;

        }
        //Add the new item at the end of the array

        items[count++] = item;
    }

    public void print(){
        for(int i=0; i< count; i++){
            System.out.println(items[i]);
        }
    }

    public void removeAt(int index){
        //Validate the index

        if(index < 0 || index >= count){
            throw new IllegalArgumentException();
        }

        //Shift the items to the left to fill the hole
        // [10, 20, 30, 40]
        // index: 1
        // 1 <- 2
        // 2 <- 3
        for(int i= index; i<count; i++)
            items[i] = items[i+1];

        count--;

    }

    public int indexOf(int item){
        //If we find it, return index
        // Otherwise return -1

        for(int i=0; i < count; i++){
            if(items[i] == item)
                return i;
        }
        return -1;
    }

}
