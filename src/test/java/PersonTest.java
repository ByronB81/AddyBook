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

  // @Test
  // public void Person_name_String(){
  //   Person testPerson = new Person("Byron","3017 NE Hoyst","Portland",97232,626,2508882);
  //   String expectedOutput = "Byron";
  //   assertEquals(expectedOutput, testPerson.name);
  // }

}
