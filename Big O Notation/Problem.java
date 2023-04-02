import java.util.*;

public class Problem{
    public static void main(String[] args){
        
    }
    // This function will take 100000 takes if n is given 100000 value
    // Time complexity of this function is O(n) -> depends on n
    static int addUp1(int n){
        int sum = 0;
        for(int i=0;i<=n;i++){
            sum += i;
        }
        return sum;
    }

    // We can get the same output of addUp1() by this function
    // It would take only 3 steps to execute
    // Time complexity is O(1) -> Constant time
    static int addUp2(int n){
        int sum = n * (n+1) / 2;
        return sum;
    }
}

/* Big O Notation -> To measure the time complexity of a code with respect to it's data grows

"How code slows as data grows"

Fasting Complexity Order

O(1) > O(logn) > O(n) > O(nlogn) > O(n^2)
