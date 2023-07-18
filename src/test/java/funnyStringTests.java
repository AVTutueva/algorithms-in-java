import funnyString.Solution;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class funnyStringTests {
    @Test
    public void simpleCases(){
        Assertions.assertEquals("Funny", Solution.funnyString("acxz"));
        Assertions.assertEquals("Not Funny", Solution.funnyString("bcxz"));
    }
}
