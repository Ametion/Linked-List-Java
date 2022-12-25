package com.learning.linkedList;

public class LinkedList<T> {
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
                curr.data = curr.next.data;
                curr.next = curr.next.next;

                size--;
                return;
            }

            curr = curr.next;
            i++;
        }
    }
}

class Node <T>{
    public T data;
    public Node<T> next;
}