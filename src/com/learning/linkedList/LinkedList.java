package com.learning.linkedList;

import java.util.Iterator;

public class LinkedList<T> implements Iterable<T> {
    private Node<T> head;
    private int size;

    public LinkedList() {
        this.head = null;
        this.size = 0;
    }

    public LinkedList(T data){
        this.head.data = data;
        this.head.next = null;
        this.size = 1;
    }

    public int GetSize(){
        return size;
    }

    public T Get(int index){
        var curr = head;
        var i = 0;

        while(true){
            if(i == index){
                return curr.data;
            }

            curr = curr.next;
            i++;
        }
    }

    public void Add(T data){
        if(head ==  null){
            head = new Node<T>();
            head.data = data;
            head.next = null;
            size++;
            return;
        }

        var curr = head;

        while(true){
            if(curr.next == null){
                curr.next = new Node<T>();
                curr.next.data = data;
                curr.next.next = null;
                size++;
                break;
            }

            curr = curr.next;
        }
    }

    public void RemoveAt(int index){
        var curr = head;
        var i = 0;

        if(index == 0){
            head = head.next;
            size--;
            return;
        }

        while(true){
            if(i == index){
                if(curr.next == null){
                    RemoveLast();
                    return;
                }

                curr.data = curr.next.data;
                curr.next = curr.next.next;

                size--;
                return;
            }

            curr = curr.next;
            i++;
        }
    }

    public void RemoveFirst(){
        head = head.next;
        size--;
    }

    public void RemoveLast(){
        var curr = head;

        while(curr.next.next != null){
            curr = curr.next;
        }

        curr.next = null;
        size--;
    }

    public void Clear(){
        head = null;
    }

    public Iterator<T> iterator() {
        return new LinkedListIterator();
    }

    private class LinkedListIterator implements Iterator<T> {
        private Node<T> current = head;

        public boolean hasNext() {
            return current != null;
        }

        public T next() {
            T data = current.data;
            current = current.next;
            return data;
        }
    }

    private class Node <T>{
        public T data;
        public Node<T> next;
    }
}

