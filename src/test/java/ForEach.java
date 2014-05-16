import org.hamcrest.Matchers;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static java.util.Arrays.asList;
import static org.hamcrest.CoreMatchers.hasItems;
import static org.hamcrest.MatcherAssert.assertThat;

public class ForEach {

  @Test
  public void convertToString() {
    List<Integer> integers = Arrays.asList(1, 2, 3, 4, 5);
    List<String> strings = new ArrayList<>();
    for (Integer integer : integers) {
      strings.add(String.valueOf(integer));
    }
    assertThat(strings, Matchers.hasItems("1", "2", "3", "4", "5"));
  }

  @Test
  public void convertToStringUsingJ8() {
    List<Integer> integers = Arrays.asList(1, 2, 3, 4, 5);
    List<String> strings = new ArrayList<>();
    integers.forEach(i -> strings.add(String.valueOf(i)));
    assertThat(strings, Matchers.hasItems("1", "2", "3", "4", "5"));
  }

  @Test
  public void removeEven() {
    List<Integer> toIterate = Arrays.asList(1, 2, 3, 4, 5);
    List<Integer> toOperate = new ArrayList<>(toIterate);
    for (Integer integer : toIterate) {
      if (integer % 2 == 0) {
        toOperate.remove(integer);
      }
    }
    Assert.assertThat(toOperate, hasItems(1, 3, 5));
  }

  @Test
  public void removeEvenUsingJ8() {
    List<Integer> toOperate = new ArrayList<>(asList(1, 2, 3, 4, 5));
    toOperate.removeIf(i -> i % 2 == 0);
    Assert.assertThat(toOperate, hasItems(1, 3, 5));
  }
}
