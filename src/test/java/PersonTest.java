import org.junit.*;
import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.List;

public class PersonTest {

  @Test
  public void getName_shouldReturnName_String() {
    Person testPerson = new Person("Byron","3017 NE Hoyt St","Portland",97232,626,2508882);
    String expectedOutput = "Byron";
    assertEquals(expectedOutput, testPerson.getName());
  }

  @Test
  public void getAddress_shouldReturnAddress_String() {
    Person testPerson = new Person("Byron","3017 NE Hoyt St","Portland",97232,626,2508882);
    String expectedOutput = "3017 NE Hoyt St";
    assertEquals(expectedOutput, testPerson.getAddress());
  }

  @Test
  public void getCity_shouldReturnCity_String() {
    Person testPerson = new Person("Byron","3017 NE Hoyt St","Portland",97232,626,2508882);
    String expectedOutput = "Portland";
    assertEquals(expectedOutput, testPerson.getCity());
  }

  @Test
  public void getZipCode_shouldReturnZipCode_int() {
    Person testPerson = new Person("Byron","3017 NE Hoyt St","Portland",97232,626,2508882);
    int expectedOutput = 97232;
    assertEquals(expectedOutput, testPerson.getZipCode());
  }

  @Test
  public void getAreaCode_shouldReturnAreaCode_int() {
    Person testPerson = new Person("Byron","3017 NE Hoyt St","Portland",97232,626,2508882);
    int expectedOutput = 626;
    assertEquals(expectedOutput, testPerson.getAreaCode());
  }

  @Test
  public void getPhone_shouldReturnPhoneNumber_int() {
    Person testPerson = new Person("Byron","3017 NE Hoyt St","Portland",97232,626,2508882);
    int expectedOutput = 2508882;
    assertEquals(expectedOutput, testPerson.getPhone());
  }
}
