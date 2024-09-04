//- Explain how stack and heap memory are used when creating objects in Java.
//- Write a program that demonstrates memory allocation in the stack and heap by creating objects in a method.


class randoexample{
int number;// this is stored in heap memory
int bonus;// this is stored in heap memory
}

class stackandheap{
    public static void main(String[]args){
        int x =10;// this is stored in stack memory
        int y=10;// this is stored in stack memory
        int z =x+y; // this is stored in stack memory

        randoexample obj1=new randoexample(); // this is stored in heap memory
    }
}

// stack memory is for local variables, primitive data types
// heap memory is for methods, initializaing varivables, non primitive data type