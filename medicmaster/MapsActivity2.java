package com.example.medicmaster;

import android.os.Bundle;

import androidx.fragment.app.FragmentActivity;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class MapsActivity2 extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps3);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
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

        // Add a marker in Sydney and move the camera
        LatLng sd = new LatLng(19.1876, 72.9680);
        LatLng sf = new LatLng(19.2008, 72.9749);
        LatLng sp = new LatLng(19.2219, 72.9772);
        LatLng sk = new LatLng(19.1878, 72.9673);
        LatLng sa = new LatLng(19.1903, 72.9712);
        mMap.addMarker(new MarkerOptions().position(sd).title("Navjivan Blood Bank"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(sd));
        mMap.addMarker(new MarkerOptions().position(sf).title("Bloodline Charitable Blood bank"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(sf));
        mMap.addMarker(new MarkerOptions().position(sp).title("Triumph Blood Bank"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(sp));
        mMap.addMarker(new MarkerOptions().position(sk).title("Vaidya Blood Bank"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(sk));
        mMap.addMarker(new MarkerOptions().position(sa).title("WamanRao Oka RaktPedhi"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(sa));
    }
}
