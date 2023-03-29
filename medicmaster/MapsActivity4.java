package com.example.medicmaster;

import android.os.Build;
import android.os.Bundle;

import androidx.annotation.RequiresApi;
import androidx.fragment.app.FragmentActivity;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

import java.util.Objects;

public class MapsActivity4 extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    @RequiresApi(api = Build.VERSION_CODES.KITKAT)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps5);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        Objects.requireNonNull(mapFragment).getMapAsync(this);
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
        LatLng sydney = new LatLng(19.2055, 72.9831);
        LatLng ab = new LatLng(19.1838, 72.9768);
        LatLng cd = new LatLng(19.1668, 72.0272);
        LatLng er = new LatLng(19.1882, 72.0219);
        LatLng ef = new LatLng(19.2040, 72.9692);
        LatLng ty = new LatLng(19.1722, 72.9535);
        LatLng fy = new LatLng(19.1879, 72.8368);
        LatLng sy = new LatLng(19.2099, 72.9775);
        mMap.addMarker(new MarkerOptions().position(sydney).title("Nucleus Diagnostic Center"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(sydney));
        mMap.addMarker(new MarkerOptions().position(ab).title("SonoScan Diagnostic Center"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(ab));
        mMap.addMarker(new MarkerOptions().position(cd).title("Habib Diagnostic Center"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(cd));
        mMap.addMarker(new MarkerOptions().position(er).title("Khatri Diagnostic center"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(er));
        mMap.addMarker(new MarkerOptions().position(ef).title("Kimaya Kidney Center"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(ef));
        mMap.addMarker(new MarkerOptions().position(ty).title("Abhinav Kidney Dialysis And Health Center "));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(ty));
        mMap.addMarker(new MarkerOptions().position(fy).title("Apex Kidney Care "));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(fy));
        mMap.addMarker(new MarkerOptions().position(sy).title("Akshar Diagnostic Center"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(sy));

    }

}
