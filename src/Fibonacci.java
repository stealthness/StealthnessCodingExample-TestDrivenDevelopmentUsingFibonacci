/**
 * Created by Stephen West on 04/02/2019.
 *
 * Fibonacci has one static method that gets the nth Fibonacci number in
 * the Fibonacci series. The series is created by add the two previous
 * numbers in the series to make th e next;
 *
 *      fib(n) = fib(n-1) + fib (n-2)
 *
 *      we have starting values of
 *
 *      fib(1) = fib(2) = 1
 *
 *      more information can be found
 *      https://en.wikipedia.org/wiki/Fibonacci_number
 */
public class Fibonacci {

    /**
     * returns the fib(number) of the fibonacci series
     * @param number
     * @return nth fibonacci number
     */
    public static int getFib(int number){

        switch (number){
            case 0:
                throw new IllegalArgumentException();
            case 1:
            case 2:
                return 1;
            default:
                return getFib(number-1) + getFib(number -2);
        }
    }


}
