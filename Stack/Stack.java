import java.util.Stack;

class Stack {
    public static void main(String[] args) {

        // Initializing a empty stack with Stack Class from java Stack library
        Stack<String> _stack = new Stack<String>();

        // Pushing 3 objects with push() method
        _stack.push("Bishnudev");
        _stack.push("Arnab");
        _stack.push("Sudip");

        // Checking the stack is empty or not by empty() method
        System.out.println(_stack.empty()); // -> false

        // Printing the stack
        System.out.println(_stack);

        // Removing the top element from stack by pop() method
        _stack.pop();

        // Storing the next top value in myFriend variable with pop()
        String myFriend = _stack.pop();

        // Printing the remove item value
        System.out.println(myFriend);

        // Unlike pop() it removes the bottom value from a stack
        System.out.println(_stack.peek());

        // Returns the index of the search item, if not found then give -1
        System.out.println(_stack.search("Arnab")); // -> 2
        System.out.println(_stack.search("Anjishnu")); // -> -1


        // Stack heap memory full error

        for(int i=0;i<100000000;i++){
            _stack.push("Ultra Vegito");
        }

    }
}

/*

    What's Stack:
        1. It's a LIFO data structures
        2. Stores objects into a sort of "Vertical Tower"
        3. Push() to add to the top
        3. Pop() to remove from the top

    Uses of Stack:
        1. Undo/Redo features in softwares
        2. Moving back/forward in browsing history
        3. Some backtracking algorithms
        4. Calling functions (Call stack)

*/