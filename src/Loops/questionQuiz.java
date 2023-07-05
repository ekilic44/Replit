package Loops;

public class questionQuiz {
    public static void main(String[] args) {
        int num = 10;
        do {
            num += 5; //num=num+5==> num=10+5= 15

        } while (num < 15);

        System.out.println(num);
        int i= 0;
        do {
            System.out.println(i++);


        }while (i<100);
        System.out.println(i);


    }

}
//Do...While Loop: Repeatedly executes the same set of statement while condition is true.
// The statement is executed once initially then condition is checked
// Code in loop will execute at least once.
// Do Block and while condition.
// If the loop body must be executed before the condition is checked do while loop must be used.

// Even if the condition is false the statement is gets executed one time.