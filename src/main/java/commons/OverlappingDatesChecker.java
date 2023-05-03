package commons;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalField;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class OverlappingDatesChecker {
    public static boolean hasOverlappingDates(List<String> dateRanges) {
        List<DateRange> ranges = dateRanges.stream().map(OverlappingDatesChecker::parseDateRange).filter(Objects::nonNull).sorted(Comparator.comparing(r -> r.start)).collect(Collectors.toList());

        // Check for overlapping date ranges
        return IntStream.range(0, ranges.size() - 1).anyMatch(i -> !ranges.get(i).end.isBefore(ranges.get(i + 1).start));
    }

    private static DateRange parseDateRange(String rangeStr) {
        String[] parts = rangeStr.replaceAll("\\s", "").split("-");
        if (parts.length != 2) {
            return null; // invalid format
        }

        try {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
            LocalDate start = LocalDate.parse(parts[0], formatter);
            LocalDate end = LocalDate.parse(parts[1], formatter);
            return new DateRange(start, end);
        } catch (Exception e) {
            return null; // invalid date format
        }
    }

    private static class DateRange {
        public LocalDate start;
        public LocalDate end;

        public DateRange(LocalDate start, LocalDate end) {
            this.start = start;
            this.end = end;
        }
    }
}
