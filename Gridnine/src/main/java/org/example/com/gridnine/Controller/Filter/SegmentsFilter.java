package org.example.com.gridnine.Controller.Filter;

import org.example.com.gridnine.Model.Flight;

import java.util.List;

public interface SegmentsFilter {
    public List<Flight> depBeforeLocalTimeNow(List<Flight> flightList);
    public List<Flight> arrBeforeDep(List<Flight> flightList);
    public List<Flight> timeOnEarth(List<Flight> flightList, int hours);
}
