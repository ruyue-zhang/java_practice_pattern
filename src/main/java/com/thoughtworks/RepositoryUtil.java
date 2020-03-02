package com.thoughtworks;

import java.util.List;

public class RepositoryUtil {
    public static void printList(List<?> list) {
        for (Object o : list) {
            System.out.println(o.toString());
        }
    }
}
