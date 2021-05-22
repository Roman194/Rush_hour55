package com.example.visualization50;

import android.content.res.AssetManager;
import android.os.CountDownTimer;

import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.model.BitmapDescriptor;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;

import java.util.ArrayList;
import java.util.Collections;

public class Bus {

    int index = 0;
    int index1 = 0;
    int i=0;
    int u=8;
    ArrayList<LatLng> busCoords;
    ArrayList<LatLng> busCoords1;
    Marker bus;
    BusSetPosition bsp;
    BitmapDescriptor icon = BitmapDescriptorFactory.fromResource(R.drawable.baseline_directions_bus_black_18);


    public Bus(AssetManager assetManager, GoogleMap mMap, String filename, String filename1,int i) {
        this.i=i;

        busCoords = Util.getCoords(assetManager, filename);
        busCoords1 = Util.getCoords(assetManager, filename1);

        bus = mMap.addMarker(new MarkerOptions().position(busCoords.get(index)).icon(icon).flat(true));



        MyuTimer myuTimer = new MyuTimer(100000, 100);
        myuTimer.start();
    }

    private class MyuTimer extends CountDownTimer {
        public MyuTimer(long millisInFuture, long countDownInterval) {
            super(millisInFuture, countDownInterval);
        }

        @Override
        public void onTick(long millisUntilFinished) {
            if (i>1){
                u=u-1;
                if(u<1){
                    i=i-2;
                }
            }else {
                if (i == 1) {
                    if (index1 < busCoords1.size()) {
                        bus.setPosition(busCoords1.get(index1));
                        index1++;
                    } else {
                        index1 = 0;
                        i=0;
                    }
                    //bsp = new BusSetPosition(busCoords1, bus, index);
                }else{
                    if (i == 0) {
                        //        bsp = new BusSetPosition(busCoords, bus ,index);

                        if (index < busCoords.size()) {
                            bus.setPosition(busCoords.get(index));
                            index++;
                        } else {
                            index = 0;
                            i=1;
                        }
                    }

                    //if (index1 < busCoords1.size()) {
                    //   bus1.setPosition(busCoords1.get(index1));
                    //   index1++;
                    //} else {
                    //   Collections.reverse(busCoords1);
                    //   index1 = 0;
                }
                u=8;
            }
        }
        @Override
        public void onFinish () {

        }
    }
}