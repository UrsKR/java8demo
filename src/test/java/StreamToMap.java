import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toMap;

public class StreamToMap {

  @Test
  public void histogram() {
    List<String> input = Arrays.asList("Tick", "Trick", "Track");
    Map<Integer, String> output = new TreeMap<>();
    for (String candidate : input) {
      int length = candidate.length();
      String currentString = output.get(length);
      if (currentString == null || currentString.isEmpty()) {
        output.put(length, candidate);
      }
      else {
        output.put(length, currentString + "," + candidate);
      }
    }
    System.out.println(output);
  }

  @Test
  public void histogramUsingJ8() {
    Stream<String> input = Stream.of("Tick", "Trick", "Track");
    Map output = input.collect(toMap(t -> t.length(), t -> t, (t, t2) -> t + "," + t2));
    System.out.println(output);
  }
}