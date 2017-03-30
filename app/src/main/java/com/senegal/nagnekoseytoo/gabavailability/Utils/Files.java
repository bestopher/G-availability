package com.senegal.nagnekoseytoo.gabavailability.Utils;

import android.os.Environment;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by christophe on 3/29/17.
 */
public class Files {
    public static void createFlyFile(String devId, String ext, String extras) {
       // String _L_ = TAG + "createFlyFile";
       // Flog.begin(_L_);

        DateFormat dateFormat = new SimpleDateFormat("ddMMyy-HHmmss");
        String flyMessage;
        if (extras == null || extras.equals("")) flyMessage = dateFormat.format(new Date()) + "-" + devId + ext;
        else flyMessage = dateFormat.format(new Date()) + "-" + devId + "-" + extras + ext;

        File flyFile = new File(Environment.getExternalStorageDirectory()  + "/" + flyMessage);

        if (flyFile.exists() == false) {
            try {
                flyFile.createNewFile();
            } catch (IOException e) {
             //   Flog.e(_L_, "IOException", e);
            }
        }
    }
}
