package org.example.com.gridnine.Controller.Filter;

import org.example.com.gridnine.Model.Flight;
import org.example.com.gridnine.Model.Segment;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;

public class SegmentsFilterImpl implements SegmentsFilter{
    protected LocalDateTime currentLocalTime = LocalDateTime.now();

    @Override
    public List<Flight> depBeforeLocalTimeNow(List<Flight> flightList) {
        List<Flight> tempFlights = new ArrayList<>();

        for (Flight flight : flightList) {
            List<Segment> tempSeg = new ArrayList<>(flight.getSegments());
            for (Segment segment : tempSeg) {
                LocalDateTime dep = segment.getDepartureDate();
                if (dep.isBefore(currentLocalTime)) {
                    tempFlights.add(flight);

                }
            }
        }
        return tempFlights;
    }

    @Override
    public List<Flight> arrBeforeDep(List<Flight> flightList) {
        List<Flight> tempFlights = new ArrayList<>();

        for (Flight flight : flightList) {
            List<Segment> tempSeg = new ArrayList<>(flight.getSegments());
            for (Segment segment : tempSeg) {
                LocalDateTime arr = segment.getArrivalDate();
                LocalDateTime dep = segment.getDepartureDate();
                if (arr.isBefore(dep)) {
                    tempFlights.add(flight);
                }
            }
        }

        return tempFlights;
    }

    @Override
    public List<Flight> timeOnEarth(List<Flight> flightList, int hours) {
        List<Flight> tempFlights = new ArrayList<>();

        for (Flight flight : flightList) {
            List<Segment> tempSeg = new ArrayList<>(flight.getSegments());
            for (Segment segment : tempSeg) {
                LocalDateTime arr = segment.getArrivalDate();
                LocalDateTime dep = segment.getDepartureDate();
                long hoursOnEarth = ChronoUnit.HOURS.between(arr, dep);
                if (hoursOnEarth >= hours) {
                    tempFlights.add(flight);
                    break;
                }
            }
        }
        return tempFlights;
    }

}
