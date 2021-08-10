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

}
