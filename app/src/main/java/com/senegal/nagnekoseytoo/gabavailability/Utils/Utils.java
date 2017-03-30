package com.senegal.nagnekoseytoo.gabavailability.Utils;

import android.content.Context;
import android.os.Environment;
import android.provider.Settings;
import android.telephony.TelephonyManager;

import java.io.File;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * Created by christophe on 3/29/17.
 */
public class Utils {

    public static String getAndroidId(Context c) {
        return Settings.Secure.getString(c.getContentResolver(),
                Settings.Secure.ANDROID_ID);
    }

    public static Date addDays(Date date, int days) {
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        cal.add(Calendar.DATE, days); //minus number would decrement the days
        return cal.getTime();
    }

    public static String formatDate(Date date) {
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        return format.format(date);
    }

    public static String formatDate(Date date, String pattern) {
        if(pattern == null)
            return formatDate(date);

        SimpleDateFormat format = new SimpleDateFormat(pattern);
        return format.format(date);
    }


    public static String format(Date date) {
        DateFormat df;
        df = new SimpleDateFormat("dd/MM/yy HH:mm:ss");
        return df.format(date);
    }

    public static String getPhoneNumber(Context ctx) {
        TelephonyManager tMgr = (TelephonyManager)ctx.getSystemService(Context.TELEPHONY_SERVICE);
        String phoneNumber = tMgr.getLine1Number();
        return phoneNumber;
    }

    public static long getCurrentDateInLong(){
        Calendar calendar1 = Calendar.getInstance();
        Date date1 = calendar1.getTime();
        long currentDate = date1.getTime();

        return currentDate;
    }

}
