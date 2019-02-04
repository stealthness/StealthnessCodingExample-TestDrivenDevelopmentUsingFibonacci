import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;


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

    @Test
    void testThatFib4returns3(){
        assertEquals(3,Fibonacci.getFib(4));
    }

    @Test
    void testThatFib0ThrowsIllegalArgumentException(){
        assertThrows(IllegalArgumentException.class, ()->{
            Fibonacci.getFib(0);
        });
    }

    @Test
    void testThatFibLessThan0ThrowsIllegalArgumentException(){
        assertThrows(IllegalArgumentException.class, ()->{
            Fibonacci.getFib(-1);
        });
    }
}