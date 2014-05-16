import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static java.lang.Math.abs;
import static java.util.Arrays.asList;
import static org.hamcrest.CoreMatchers.hasItems;
import static org.junit.Assert.assertThat;

public class MethodReference {

  @Test
  public void absolutes() {
    List<Integer> toIterate = asList(-1, -2, 3, 4, -5);
    List<Integer> toOperate = new ArrayList<>(toIterate);
    for (Integer integer : toIterate) {
      int index = toOperate.indexOf(integer);
      toOperate.remove(index);
      toOperate.add(index, Math.abs(integer));
    }
    toOperate.replaceAll(integer -> Math.abs(integer));
    assertThat(toOperate, hasItems(1, 2, 3, 4, 5));
  }

  @Test
  public void absolutesWithLambda() {
    List<Integer> toOperate = new ArrayList<>(asList(-1, -2, 3, 4, -5));
    toOperate.replaceAll(i -> abs(i));
    assertThat(toOperate, hasItems(1, 2, 3, 4, 5));
  }

  @Test
  public void absolutesWithMethodReferences() {
    List<Integer> toOperate = new ArrayList<>(asList(-1, -2, 3, 4, -5));
    toOperate.replaceAll(Math::abs);
    assertThat(toOperate, hasItems(1, 2, 3, 4, 5));
  }
}
