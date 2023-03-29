package com.example.medicmaster;

import android.os.Bundle;

import androidx.fragment.app.FragmentActivity;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps2);
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
        LatLng ad = new LatLng(19.1868, 72.9676);
        LatLng af = new LatLng(19.2097, 72.9724);
        LatLng de = new LatLng(19.252562, 72.980057);
        LatLng df = new LatLng(19.2238, 72.9794);
        LatLng dj = new LatLng(19.2094, 72.9622);
        LatLng dh = new LatLng(19.2135, 72.9770);
        LatLng dv = new LatLng(19.2358, 72.9756);
        LatLng dk = new LatLng(19.1986, 72.9780);
        mMap.addMarker(new MarkerOptions().position(ad).title("Horizon Hospital"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(ad));
        mMap.addMarker(new MarkerOptions().position(af).title("Jupiter Hospital"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(af));
        mMap.addMarker(new MarkerOptions().position(de).title("Hiranandani Hospital"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(de));
        mMap.addMarker(new MarkerOptions().position(df).title("Highland Super Speciality Hospital"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(df));
        mMap.addMarker(new MarkerOptions().position(dj).title("Oscar Medical Foundation & Research Center And Hospital"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(dj));
        mMap.addMarker(new MarkerOptions().position(dh).title("Sai Ashutosh  Hospital"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(dh));
        mMap.addMarker(new MarkerOptions().position(dv).title("Metropol Multispeciality Hospital"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(dv));
        mMap.addMarker(new MarkerOptions().position(dk).title("Thane Civil Hospital"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(dk));
    }
}
