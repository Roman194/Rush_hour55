package com.example.visualization50;

import android.content.res.AssetManager;
import android.graphics.Color;

import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.PolylineOptions;

import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

    public class DrawCart {
        AssetManager assetManager;
        public DrawCart(AssetManager assetManager) {this.assetManager = assetManager; }


        public PolylineOptions bus110(AssetManager assetsManager,String filename,String filename1) {
            PolylineOptions polylineOptions ;
            polylineOptions = Util1.getCords(assetsManager,filename,filename1);


            return polylineOptions;

        }

        public PolylineOptions bus32(AssetManager assetsManager,String filename,String filename1) {

            PolylineOptions polylineOptions ;
            polylineOptions = Util1.getCords(assetsManager,filename,filename1);




            return polylineOptions;
        }

        public PolylineOptions bus79(AssetManager assetsManager,String filename,String filename1) {

            PolylineOptions polylineOptions ;
            polylineOptions = Util1.getCords(assetsManager,filename,filename1);


            return polylineOptions;

        }

        public PolylineOptions trolleybus4(AssetManager assetsManager,String filename,String filename1) {

            PolylineOptions polylineOptions ;
            polylineOptions = Util1.getCords(assetsManager,filename,filename1);


            return polylineOptions;


        }

        public PolylineOptions bus61(AssetManager assetsManager,String filename,String filename1) {
            PolylineOptions polylineOptions ;
            polylineOptions = Util1.getCords(assetsManager,filename,filename1);


            return polylineOptions;
        }
    }
