import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class StringLaenge {

  @Test
  public void stringlaengeJava7() {
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
}