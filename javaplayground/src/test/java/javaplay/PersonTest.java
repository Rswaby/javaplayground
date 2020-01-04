
package javaplay;
import java.util.logging.Logger;
// import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertEquals;
import org.junit.Test;


public class PersonTest {
    @Test
    public void testPerson() {

        Person p = new Person("Rohan Swaby", 11, 173, 82, "Red", "male");
        Logger logger = Logger.getLogger(Person.class.getName());
        logger.info("Name: "+ p.getName());
        logger.info("Age: "+ p.getAge());
        logger.info("Height (cm):" + p.getHeight());
        logger.info("Weight (kg):" + p.getWeight());
        logger.info("Eye Color:" + p.getEyeColor());
        logger.info("Gender:" + p.getGender());

        assertEquals("Rohan Swaby", p.getName());
        assertEquals(11, p.getAge());
        assertEquals(173, p.getHeight());
        assertEquals(82, p.getWeight());
        assertEquals("Red", p.getEyeColor());
        assertEquals("male", p.getGender());

    }
}
