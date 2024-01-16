package com.epam.mjc.collections.list;

import java.util.Comparator;
import java.util.List;

public class ListSorter {
    public void sort(List<String> sourceList) {
        sourceList.sort(new ListComparator());
    }
}

class ListComparator implements Comparator<String> {
    @Override
    public int compare(String a, String b) {
        int x = Integer.parseInt(a);
        int y = Integer.parseInt(b);

        int c = Math.abs(x);
        int d = Math.abs(y);

        if (c == d) {
            return Integer.compare(x, y);
        } else {
            return Integer.compare(c, d);
        }
    }
}
