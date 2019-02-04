import org.junit.jupiter.api.Test;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.*;


/**
 * Created by Stephen West on 04/02/2019.
 */
class FibonacciTest {

    private static final long TOL = 200;

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

    @Test
    void testThatFib4returns3(){
        assertEquals(3,Fibonacci.getFib(4));
    }

    @Test
    void testThatFib0ThrowsIllegalArgumentException(){
        assertThrows(IllegalArgumentException.class, ()-> Fibonacci.getFib(0));
    }

    @Test
    void testThatFibLessThan0ThrowsIllegalArgumentException(){
        assertThrows(IllegalArgumentException.class, ()-> Fibonacci.getFib(-1));
    }

    @Test
    void testThatFibLargeNumberReturnsCorrectNumber(){
        assertTimeout(Duration.ofMillis(TOL), ()-> assertEquals(102334155,Fibonacci.getFib(40)));
    }
}