package com.uddeshyaSingh.MyFirstApplciation.HelperFunctions;

public class HelperFunction {

    public static String DoesNotExist(String _id) {
        if(_id.isEmpty()) return "Note does not exist";
        return "Note does not exist, id: " + _id;
    }
}
