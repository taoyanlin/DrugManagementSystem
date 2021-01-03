package com.punguin.drugmanagementsystem.utils;

import java.util.UUID;

public class IDUtil {
    public static String getID() {
        return UUID.randomUUID().toString().replace("_", "");
    }

}
