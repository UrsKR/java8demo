import org.junit.Test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.temporal.ChronoUnit;

public class DateTime {

  @Test
  public void creation() throws Exception {
    LocalDateTime now = LocalDateTime.now();
    System.out.println(now);
    LocalDate anotherNow = LocalDate.of(2014, Month.MAY, 16);
    System.out.println(anotherNow);
  }

  @Test
  public void modification() throws Exception {
    LocalDateTime timePoint = LocalDateTime.now();
    LocalDateTime thePast = timePoint.withDayOfMonth(10).withYear(2010);
    LocalDateTime theFuture = thePast.plusYears(5).plus(3, ChronoUnit.WEEKS);
    System.out.println(theFuture);
  }
}
