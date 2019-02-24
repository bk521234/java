/******************************************************************************
 *  Compilation:  javac UseThree.java
 *  Execution:    java UseThree yourname
 *
 *  Prints "Hi, Bob. How are you?" where "Bob" is replaced by the
 *  command-line argument.
 *
 *  % java UseThree Bob Joe Sue
 *  Hi, Sue, Joe, Bob. 
 *
 ******************************************************************************/
public class UseThree {
    public static void main(String[] args) {
        System.out.print("Hi ");
        System.out.print(args[2]);
        System.out.print(", ");
        System.out.print(args[1]);
        System.out.print(", and ");
        System.out.print(args[0]);
        System.out.println(".");
    }
}
