import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class LambdaWithMultipleParameters {

  private static final Person YOUNG_PERSON = new Person("Bianca", 1986);
  private static final Person OLD_PERSON = new Person("Sebastian", 1984);
  private List<Person> persons;


  @Before
  public void setUp() {
    persons = Arrays.asList(OLD_PERSON, YOUNG_PERSON);
  }

  @Test
  public void sortByInnerClass() throws Exception {
    Collections.sort(persons, new Comparator<Person>() {
      @Override
      public int compare(Person person1, Person person2) {
        return person1.getBirthYear().compareTo(person2.getBirthYear());
      }
    });
    assertThat(persons.get(0), is(OLD_PERSON));
  }

  @Test
  public void sortByLambdaComparator() throws Exception {
    Collections.sort(persons, (Person a, Person b) -> a.getBirthYear().compareTo(b.getBirthYear()));
    assertThat(persons.get(0), is(OLD_PERSON));
  }

}
