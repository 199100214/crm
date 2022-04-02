package com.bjpowernode.crm.util;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTimeUtil {
    public static String getSysTime(){
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:MM:ss");
        Date date = new Date();
        return sdf.format(date);
    }
}
