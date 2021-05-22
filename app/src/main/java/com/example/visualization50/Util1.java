package com.example.visualization50;

import android.content.res.AssetManager;
import android.graphics.Color;

import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.PolylineOptions;

import java.io.InputStream;
import java.util.Scanner;

public class Util1 {
    public static PolylineOptions getCords(AssetManager assetManager, String filename, String filename1) {
        PolylineOptions polylineOptions = new PolylineOptions();

        polylineOptions.color(Color.GREEN);
        try {
        InputStream inputStream = assetManager.open(filename);
        InputStream inputStream1 =assetManager.open(filename1);

            Scanner scanner = new Scanner(inputStream);
            Scanner sc = new Scanner(inputStream1);
            while (scanner.hasNextLine()) {
                String row = scanner.nextLine();
                String[] coords = row.split(",");
                double lat = Double.parseDouble(coords[0]);
                double lng = Double.parseDouble(coords[1]);
                polylineOptions.add(new LatLng(lat, lng));

            }
            while (sc.hasNextLine()) {
                String row = sc.nextLine();
                String[] coords = row.split(",");
                double lat = Double.parseDouble(coords[0]);
                double lng = Double.parseDouble(coords[1]);
                polylineOptions.add(new LatLng(lat, lng));

            }
        }catch(Exception e){
            e.printStackTrace();
        }

        return polylineOptions;

    }
}
