import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GameTest {

    @Test
    public void fizzBuzzTest_whenInt5_thenReturn5AsString(){

         // GIVEN
         int a =5;

         //WHEN
         String actual = Game.fizzBuzz(a);

         // THEN
         assertEquals("5",actual);
     }

    @Test
    public  void isFizzTest_when3_thenReturnFizz(){

        //GIVEN
        int a = 3;

        //WHEN
        String actual = Game.fizzBuzz(a);

        //THEN
        assertEquals("fizz",actual);
    }

    @Test
    public void isFizzBuzzTest_when15_thenReturnFizzBuzz(){

        //GIVEN
        int a =15;

        //WHEN
        String actual = Game.fizzBuzz(a);

        //THEN
        assertEquals("fizzBuzz",actual);
    }
}
