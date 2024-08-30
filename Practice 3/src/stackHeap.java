//1. Write a short program to demonstrate the difference between stack and heap memory using
// local and dynamic variables.

class random{
    int idk;// this is stored in heap memory
    public void random(){

    }
}

class stackHeap{
    public static void main(String[]args){
        int x= 10; // this is a stack memory
        random ran = new random();// this is stored in heap memory
        int a[];//this is stored in heap memory
        ran.random();// stored in stack memory

    }
}

//2. Explain the memory allocation when objects are created in Java and how it differs from primitive types
//
// primitive data types are stored in the stack memory for most of the time unless they are instance variables
//
// objects are stored in heap memory by default