package com.company;

// ASSIGNMENT --> Construct, maintain and heapify and MIN-HEAP.
public class MaxHeap {
    private int[] Heap;
    private int size;
    private int maxsize;

    MaxHeap(int maxsize) {
        this.maxsize = maxsize;
        Heap = new int[maxsize];
        this.size = 0;
    }

    private int parent(int index) {
        return (index - 1) / 2;
    }

    private int leftChild(int index) {
        return (2 * index) + 1;
    }

    private int rightChild(int index) {
        return (2 * index) + 2;
    }

    private void swap(int first_position, int second_position) {
        int temp;
        temp = Heap[first_position];
        Heap[first_position] = Heap[second_position];
        Heap[second_position] = temp;
    }

    public void insert(int element) {
        int position = size;
        Heap[position] = element;
        // Heap properties are violated here
        while(Heap[position] > Heap[parent(position)]) {
            swap(position, parent(position));
            position = parent(position);
        }
        ++size;
    }

    private boolean isLeaf(int position) {
        if(position > (size / 2) && position <= size) {
            return true;
        }
        return false;
    }

    public void maxHeapify(int position) {
        // Stop the comparision once you encounter a leaf node.
        if(isLeaf(position)) return;
        // Heap properties are getting violated
        if(Heap[position] < Heap[leftChild(position)] || Heap[position] < Heap[rightChild(position)]) {
            // Find the maximum between the left & right, and swap the position with the parent
            if(Heap[leftChild(position)] > Heap[rightChild(position)]) {
                swap(position, leftChild(position));
                maxHeapify(leftChild(position));
            } else {
                swap(position, rightChild(position));
                maxHeapify(rightChild(position));
            }
        }
    }

    public int extractMax() {
        int deleted = Heap[0];
        // Replacing Heap[0] (maximum most elt) with the last most element
        Heap[0] = Heap[--size];
        maxHeapify(0);
        return deleted;
    }

    public void display() {
        for(int i=0; i < size/2; i++) {
            System.out.print(" Parent Element - " + Heap[i]);
            // left child does not exist
            if(leftChild(i) < size) {
                System.out.print(" Left Child - " + Heap[leftChild(i)]);
            }
            // Right child does not exist
            if(rightChild(i) < size) {
                System.out.print(" Right Child - " + Heap[rightChild(i)]);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        MaxHeap heap = new MaxHeap(25);                         // heap[25], maxsize = 25, size = 0
        heap.insert(10);
        heap.insert(15);
        heap.insert(20);
        heap.insert(25);
        heap.insert(30);
        heap.insert(35);

        heap.display();                                                 // 35 30 25 20 15 10

        int deleted = heap.extractMax();
        System.out.println(deleted);
        System.out.println("-------- x --------");

        heap.display();                                                 // 30 25 20 15 10
    }
}
