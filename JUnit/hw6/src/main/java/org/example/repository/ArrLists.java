package org.example.repository;

import java.util.Arrays;
import java.util.List;

public class ArrLists {
    private List<Integer> list1 = Arrays.asList(1, 2, 5, 2, 1, 4);
    private List<Integer> list2 = Arrays.asList(3, 2, 5, 1, 6, 4);

    public List<Integer> getList1() {
        return list1;
    }
    public List<Integer> getList2() {
        return list2;
    }
}
