package com.example.medicmaster;

import android.os.Bundle;

import androidx.fragment.app.FragmentActivity;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class MapsActivity3 extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps4);
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
        LatLng bc = new LatLng(19.2397, 73.2397);
        LatLng bt = new LatLng(19.1863, 72.9674);
        LatLng bi = new LatLng(19.2004, 72.9466);
        LatLng bo = new LatLng(19.2018, 72.9653);
        LatLng bh = new LatLng(19.1720, 72.9476);
        LatLng bs = new LatLng(19.2397, 73.2397);
        LatLng bk = new LatLng(19.2397, 73.2397);
        mMap.addMarker(new MarkerOptions().position(bc).title("Star CT Scan Center"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(bc));
        mMap.addMarker(new MarkerOptions().position(bt).title("Jupiter Scan center"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(bt));
        mMap.addMarker(new MarkerOptions().position(bi).title("Scandent Imaging"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(bi));
        mMap.addMarker(new MarkerOptions().position(bo).title("Criticare Center"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(bo));
        mMap.addMarker(new MarkerOptions().position(bh).title("Gokul Scan Center"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(bh));
    }
}
