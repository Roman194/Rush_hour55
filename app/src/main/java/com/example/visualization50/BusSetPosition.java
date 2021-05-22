package com.example.visualization50;

import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;

import java.util.ArrayList;

public class BusSetPosition {
    int index=0;
    Marker bus;
    ArrayList<LatLng> busCoords;
    public BusSetPosition(ArrayList <LatLng> busCoords, Marker bus,int index){
        this.index=index;
        this.bus=bus;
        this.busCoords=busCoords;

        if (index < busCoords.size()) {
            //System.out.println(index);
            //System.out.println(i);
            bus.setPosition(busCoords.get(index));
            index++;
        }else{
            index=0;
        }
    }
}
