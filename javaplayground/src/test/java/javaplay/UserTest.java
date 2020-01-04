/**
 * RohanTest
 */

package javaplay;
import java.util.logging.Logger;
import static org.junit.Assert.assertEquals;
import org.junit.Test;
public class UserTest {

    @Test
    public void testUser(){
        User p = new User("Rohan Swaby", "Rohan@gmail.com");
        Logger logger = Logger.getLogger(Person.class.getName());
        logger.info("userName: "+ p.getUsername());
        logger.info("Email: "+ p.getEmail());
    
        assertEquals("Rohan Swaby", p.getUsername());
        assertEquals("Rohan@gmail.com", p.getEmail());
   
        
    }

    @Test
    public void anotherRohanTest() {
        
    }
}