package com.example.visualization50;

import androidx.fragment.app.FragmentActivity;

import android.content.Intent;
import android.content.res.AssetManager;
import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptor;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.maps.model.PolylineOptions;

import java.util.ArrayList;
import java.util.List;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;
    private List<LatLng> places = new ArrayList<>();
    int amount=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);

        places.add(new LatLng(54.994503, 73.250391));
        places.add(new LatLng(54.976128, 73.286632));
        places.add(new LatLng(54.94082, 73.383523));
        places.add(new LatLng(54.972338, 73.376209));

        Intent intent = getIntent();

        amount =intent.getIntExtra("amount",amount);
    }

    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        // 1st method
        LatLng omskLL = new LatLng(54.980882, 73.369194);

        //.icon(BitmapDescriptorFactory.fromFile("bus.png"))

        //BitmapDescriptor icon = BitmapDescriptorFactory.fromResource(R.drawable.baseline_directions_bus_black_18);

        //Marker mark= mMap.addMarker(new MarkerOptions().position(omskLL).title("omsk").flat(true).icon(icon));
        //mark.setPosition(new LatLng(54.908491,73.444194));
        //mark.setRotation(90.0f);

        //2nd method
        //MarkerOptions[] markers = new MarkerOptions[places.size()];
        //for (int i = 0; i < places.size(); i++) {
        //    markers[i] = new MarkerOptions().position(places.get(i)).title(i + 1 + "place");
        //    googleMap.addMarker(markers[i]);
        //}

        mMap.moveCamera(CameraUpdateFactory.newLatLng(omskLL));



        //polylineOptions.color(Color.RED);
        //polylineOptions.add(omskLL);
        //polylineOptions.add(new LatLng(54.880882, 73.469194));
        AssetManager assetManager = getAssets();
        DrawCart draw = new DrawCart(assetManager);


        PolylineOptions polylineOptions = draw.bus110(assetManager,"bus110.csv","bus110n1.csv");
        PolylineOptions polylineOptions1 = draw.bus32(assetManager, "bus32n.csv", "bus32n1.csv");
        PolylineOptions polylineOptions2 =draw.bus79(assetManager, "bus79.csv", "bus79n1.csv");
        PolylineOptions polylineOptions3 =draw.trolleybus4(assetManager,"trolleybus4.csv","trolleybus4n1.csv");
        PolylineOptions polylineOptions4 =draw.bus61(assetManager,"bus61.csv","bus61n1.csv");


        mMap.addPolyline(polylineOptions);
        mMap.addPolyline(polylineOptions1);
        mMap.addPolyline(polylineOptions2);
        mMap.addPolyline(polylineOptions3);
        mMap.addPolyline(polylineOptions4);

        //Scanner sc = new Scanner(System.in);
//автобус становится объектом класса а не маркером!

        BusCart bus = new BusCart(assetManager,amount);
        bus.bus110(assetManager,mMap);
        bus.bus32(assetManager,mMap);
        bus.bus61(assetManager,mMap);
        bus.bus79(assetManager,mMap);
        bus.trolleybus4(assetManager,mMap);
    }
}