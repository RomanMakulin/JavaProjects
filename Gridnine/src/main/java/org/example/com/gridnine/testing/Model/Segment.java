package org.example.com.gridnine.testing.Model;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Objects;


/**
 * Bean that represents a flight segment.
 */
public class Segment {
    private final LocalDateTime departureDate;

    private final LocalDateTime arrivalDate;

    public Segment(final LocalDateTime dep, final LocalDateTime arr) {
        departureDate = Objects.requireNonNull(dep);
        arrivalDate = Objects.requireNonNull(arr);
    }

    public LocalDateTime getDepartureDate() {
        return departureDate;
    }

    public LocalDateTime getArrivalDate() {
        return arrivalDate;
    }

    @Override
    public String toString() {
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");

        return "[arr: " + dateTimeFormatter.format(arrivalDate) + " | dep: " + dateTimeFormatter.format(departureDate)
                + ']';
    }
}