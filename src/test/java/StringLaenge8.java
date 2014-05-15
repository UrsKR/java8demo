import org.junit.Test;

import java.util.Map;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toMap;

public class StringLaenge8 {

  @Test
  public void stringlaengeJava8() {
    Stream<String> input = Stream.of("Tick", "Trick", "Track");
    Map output = input.collect(toMap(t -> t.length(), t -> t, (t, t2) -> t + "," + t2));
    System.out.println(output);
  }
}