package com.trycloud.utilities;

public class TryCloudJavaUtils {

    public static String normalizeCase(String string){
        string = string.substring(0,1).toUpperCase() + string.substring(1).toLowerCase();
        return string;
    }
}
