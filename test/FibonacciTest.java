import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


/**
 * Created by Stephen West on 04/02/2019.
 */
class FibonacciTest {

    @Test
    void testThatFib1returns1() {
        assertEquals(1,Fibonacci.getFib(1));
    }

    @Test
    void testThatFib2returns1(){
        assertEquals(1,Fibonacci.getFib(2));
    }

    @Test
    void testThatFib3returns2(){
        assertEquals(2,Fibonacci.getFib(3));
    }
}