package org.example.com.gridnine.testing;


import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Flight> test = new FlightBuilder().createFlights();

        List<Segment> segmentList = new ArrayList<>();
        List<Segment> segmentListDep = new ArrayList<>();

        LocalDateTime localDateTime = LocalDateTime.now();


        // получаем все сегменты
        for (int i = 0; i < test.size(); i++) {
            segmentList.addAll(test.get(i).getSegments());
        }

        // вылет до текущего момента времени
        for (int i = 0; i < segmentList.size(); i++) {
            LocalDateTime dep = segmentList.get(i).getDepartureDate();
            if (dep.isBefore(localDateTime)){
                segmentListDep.add(segmentList.get(i));
            }
        }
        // проверка
        for (int i = 0; i < segmentListDep.size(); i++) {
            System.out.println(segmentListDep.get(i));
        }
    }
}