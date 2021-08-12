package com.datastructures.linkedlistconcepts;

import java.util.NoSuchElementException;

public class BuildingLinkedListExample {

    private class Node {
        private int value;
        private Node next;

        public Node(int value){
            this.value = value;
        }
    }

    private Node first;
    private Node last;

    //addFirst
    //addLast
    //deleteFirst
    //deleteLast
    //contains
    //indexOf

    public void addLast(int item){
        Node node = new Node(item);

        if (isEmpty())
            first = last = node;
        else{
            last.next = node;
            last = node;
        }

    }

    public void addFirst(int item){
        Node node = new Node(item);

        if (isEmpty())
            first = last = node;
        else{
            node.next = first;
            first = node;
        }
    }

    private boolean isEmpty(){
        return first == null;
    }

    public int indexOf(int item){

        int index = 0;
        Node current = first;
        while(current != null){
            if(current.value == item) return index;
            current = current.next;
            index ++;
        }
        return -1;
    }

    public boolean contains(int item){
        return indexOf(item) != -1;
    }

    public void removeFirst(){
        // [10 -> 20 -> 30]
        // first -> 20

        if (isEmpty())
            throw new NoSuchElementException();

        if (first == last){
            first = last = null;
            return;
        }

        Node second = first.next;
        first.next = null;
        first = second;
    }

    public void removeLast(){

        if(isEmpty())
            throw new NoSuchElementException();

        if(first == last){
            first = last = null;
            return;
        }

        Node previous = getPrevious(last);
        last = previous;
        last.next = null;

    }

    private Node getPrevious(Node node){
        Node current = first;
        while(current != null){
            if(current.next == node) return current;
            current = current.next;
        }
        return null;
    }

}
