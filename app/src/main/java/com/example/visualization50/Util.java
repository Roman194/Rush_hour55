package com.example.visualization50;

import android.content.res.AssetManager;

import com.google.android.gms.maps.model.LatLng;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class Util {

    public static ArrayList<LatLng> getCoords(AssetManager assetManager, String filename) {
        ArrayList<LatLng> resultList = new ArrayList<>();
        try {
            InputStream inputStream = assetManager.open(filename);
            Scanner scanner = new Scanner(inputStream);
            while (scanner.hasNextLine()) {
                String row = scanner.nextLine();
                String[] coords = row.split(",");
                double lat = Double.parseDouble(coords[0]);
                double lng = Double.parseDouble(coords[1]);
                resultList.add(new LatLng(lat, lng));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return resultList;
    }

}
