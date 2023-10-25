package org.example.com.gridnine.testing.Controller;

import org.example.com.gridnine.testing.Controller.Filter.SegmentsFilterImpl;
import org.example.com.gridnine.testing.Model.Flight;
import org.example.com.gridnine.testing.View.ShowFlights;

import java.util.List;

public class Controller {
    public void btnClick(){
        List<Flight> flightList = new FlightBuilder().createFlights();
        SegmentsFilterImpl filter = new SegmentsFilterImpl();
        final int hoursOnEarth = 2;

        List<Flight> flightListDep = filter.depBeforeLocalTimeNow(flightList);
        List<Flight> flightListArr = filter.arrBeforeDep(flightList);
        List<Flight> flightListOnEarth = filter.timeOnEarth(flightList, hoursOnEarth);

        new ShowFlights().printSegments(flightListOnEarth);
    }
}
