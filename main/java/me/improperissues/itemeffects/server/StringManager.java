package me.improperissues.itemeffects.server;

import java.util.ArrayList;
import java.util.List;

public class StringManager {

    public static String addStringEffects(String string) {
        return string.replaceAll("&","§");
    }

    public static List<String> addListEffects(String string) {
        String[] sections = string.split("->");
        List<String> list = new ArrayList<>();
        for (String section : sections) {
            list.add(section.trim());
        }
        return list;
    }
}
