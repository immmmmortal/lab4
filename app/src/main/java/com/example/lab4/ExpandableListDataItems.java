package com.example.lab4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ExpandableListDataItems {
    public static HashMap<String, List<String>> getData() {
        HashMap<String, List<String>> expandableDetailList = new HashMap<String, List<String>>();

        // As we are populating List of web, phone and map, using them here
        // We can modify them as per our choice.
        // And also choice of web/phone/map can be changed
        List<String> web = new ArrayList<String>();
        web.add("open web search");



        List<String> phone = new ArrayList<String>();
        phone.add("open phone");



        List<String> map = new ArrayList<String>();
        map.add("open map");



        // Fruits are grouped under Fruits Items. Similarly the rest two are under
        // Vegetable Items and Nuts Items respectively.
        // i.e. expandableDetailList object is used to map the group header strings to
        // their respective children using an ArrayList of Strings.
        expandableDetailList.put("Web", web);
        expandableDetailList.put("Phone", phone);
        expandableDetailList.put("Map", map);
        return expandableDetailList;
    }
}
