package com.epam.mjc.collections.list;

import java.util.ArrayList;
import java.util.List;

public class ArrayListCreator {
    public ArrayList<String> createArrayList(List<String> sourceList) {
        ArrayList<String> targetList = new ArrayList<>();
        for (int i = 2; i < sourceList.size(); i += 3) {
            targetList.add(sourceList.get(i));
            targetList.add(sourceList.get(i));
        }

        return targetList;
    }
}
