

public class Problem{
    public static void main(String[] args){
        //hello();
        System.out.println(factorial(7));
    }

    private static void hello(){
        System.out.println("Hello I am a recursion. I am calling myself :)");
        hello();
    }
    private static int factorial(int x){
        if(x <= 1) return 1;
        return x * factorial(x-1);
    }
}


/*
Recursion:
    1. It's more like a self calling function.
    2. Apply the result of a procefure to a procedure.
    3. It can be a substitute for iteration.
    4. Divide a problem into sub-problems of the same type as the original.
    5. Commonly used with advanced sorting algorithms and navigating trees.

    Advantages:
        1. Easier to read/write
        2. Easier to debug

    Disadvantages:
        1. Sometimes slower
        2. Uses more memory

*/