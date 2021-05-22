package com.example.visualization50;

import android.content.res.AssetManager;

import com.google.android.gms.maps.GoogleMap;

public class BusCart {
    AssetManager assetManager;
    int amount=2;
    public BusCart(AssetManager assetManager,int amount){

        this.assetManager=assetManager;
        this.amount=amount;
    }
    public void bus110 (AssetManager assetManager, GoogleMap mMap){ //ничего что теперь метод?
        //System.out.println("Сколько поставим автобусов на 110-й маршрут?");
        //Scanner sc =new Scanner(System.in); //remake
        //amount = sc.nextInt();
        Bus[] buses = new Bus[amount];
        for(int i=0;i<amount;i++) {
            buses[i]= new Bus(assetManager, mMap, "bus110.csv", "bus110n1.csv", i);
        }

    }
    public void bus32(AssetManager assetManager, GoogleMap mMap){
        //System.out.println("Сколько поставим автобусов на 32-й маршрут?");
        //amount = sc.nextInt();
        Bus[] buses = new Bus[amount];
        for(int i=0;i<amount;i++) {
            buses[i]= new Bus(assetManager, mMap, "bus32n.csv", "bus32n1.csv", i);
        }
    }
    public void bus79(AssetManager assetsManager,GoogleMap mMap){
        //System.out.println("Сколько поставим автобусов на 79-й маршрут?");
        //amount = sc.nextInt();
        Bus[] buses = new Bus[amount];
        for(int i=0;i<amount;i++) {
            buses[i]= new Bus(assetManager, mMap, "bus79.csv", "bus79n1.csv", i);
        }
    }
    public void bus61(AssetManager assetManager,GoogleMap mMap){
        //System.out.println("Сколько поставим автобусов на 61-й маршрут?");
        //amount = sc.nextInt();
        Bus[] buses = new Bus[amount];
        for(int i=0;i<amount;i++) {
            buses[i]= new Bus(assetManager, mMap, "bus61.csv", "bus61n1.csv", i);
        }
    }
    public void trolleybus4(AssetManager assetManager,GoogleMap mMap){
        //System.out.println("Сколько поставим автобусов на 4-й маршрут?");
        //amount = sc.nextInt();
        Bus[] buses = new Bus[amount];
            for(int i=0;i<amount;i++) {
            buses[i]= new Bus(assetManager, mMap, "trolleybus4.csv", "trolleybus4n1.csv", i);
        }
    }

}
