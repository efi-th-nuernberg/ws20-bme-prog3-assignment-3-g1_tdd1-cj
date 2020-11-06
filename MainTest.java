import org.junit.Test;
import static org.junit.Assert.*;

public class MainTest{

@Test
public void testNothing() {

}

@Test
public void testSomeStuff() {  
assertEquals("False", 5, 2+3);

String test = new String("test");
assertNotNull("Object is null", null);

assertTrue("False", 3 * 7 > 4 * 5);
}

}