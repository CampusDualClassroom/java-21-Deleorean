package com.campusdual.classroom;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Exercise21 {

    public static Set<String> createHashSet() {
        Set<String> customSet = new HashSet<>();
        customSet.add("ELEMENT KPRBC");
        customSet.add("ELEMENT YPBTM");
        customSet.add("ELEMENT AADXU");
        customSet.add("ELEMENT RXCGJ");
        customSet.add("ELEMENT WYMVD");
        customSet.add("ELEMENT WFGEJ");
        customSet.add("ELEMENT TYGBS");
        customSet.add("ELEMENT MAPTK");
        customSet.add("ELEMENT GJXVE");
        customSet.add("ELEMENT BAFGL");
        return customSet;
    }

    public static Set<String> createTreeSet() {
        Set<String> customTreeSet = new TreeSet<>();
        customTreeSet.add("ELEMENT KPRBC");
        customTreeSet.add("ELEMENT YPBTM");
        customTreeSet.add("ELEMENT AADXU");
        customTreeSet.add("ELEMENT RXCGJ");
        customTreeSet.add("ELEMENT WYMVD");
        customTreeSet.add("ELEMENT WFGEJ");
        customTreeSet.add("ELEMENT TYGBS");
        customTreeSet.add("ELEMENT MAPTK");
        customTreeSet.add("ELEMENT GJXVE");
        customTreeSet.add("ELEMENT BAFGL");
        return customTreeSet;
    }

    private static void printSet(Set<String> customSet) {
        for (String element : customSet) {
            System.out.println(element);
        }
    }


    public static boolean addElementToSet(Set<String> set, String elementToAdd) {
        return set.add(elementToAdd);
    }

    public static void main(String[] args) {
        Set<String> customSet = createHashSet();
        Set<String> customTreeSet = createTreeSet();
        addElementToSet(customSet, "ELEMENT AAA");
        addElementToSet(customTreeSet, "ELEMENT AAA");
        printSet(customSet);
        System.out.println("");
        printSet(customTreeSet);
    }

}
