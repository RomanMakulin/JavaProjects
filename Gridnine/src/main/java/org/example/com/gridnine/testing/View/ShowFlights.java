package org.example.com.gridnine.testing.View;

import org.example.com.gridnine.testing.Model.Flight;

import java.util.List;

public class ShowFlights {
    public void printSegments(List<Flight> flightList){
        for (int i = 0; i < flightList.size(); i++) {
            System.out.println(i + " " + flightList.get(i));
        }
        System.out.println();
    }
}
