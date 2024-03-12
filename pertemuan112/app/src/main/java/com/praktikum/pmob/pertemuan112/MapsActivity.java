package com.praktikum.pmob.pertemuan112;

import androidx.fragment.app.FragmentActivity;

import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import com.google.android.gms.maps.model.MarkerOptions;
import com.praktikum.pmob.pertemuan112.databinding.ActivityMapsBinding;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;
    private ActivityMapsBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMapsBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

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
        LatLng mandalakrida = new LatLng(-7.795725682142128, 110.38430379656072);
        mMap.addMarker(new MarkerOptions().position(mandalakrida).title("Marker in Mandala Krida"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(mandalakrida));

        // Add a marker in Sydney and move the camera
        LatLng alun = new LatLng(-7.803558712716182, 110.36466183095334);
        mMap.addMarker(new MarkerOptions().position(alun).title("Marker in Alun-alun Utara"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(alun));

        // Add a marker in Sydney and move the camera
        LatLng stasiun = new LatLng(-7.790121076898033, 110.37565000820054);
        mMap.addMarker(new MarkerOptions().position(stasiun).title("Marker in Stasiun Lempuyangan"));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(stasiun, 20));

        // Add a marker in Sydney and move the camera
        LatLng malioboro = new LatLng(-7.792374428896256, 110.36587518306875);
        mMap.addMarker(new MarkerOptions().position(malioboro).title("Marker in Malioboro"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(malioboro));

        // Add a marker in Sydney and move the camera
        LatLng tugu = new LatLng(-7.78276234428491, 110.36694695052834);
        mMap.addMarker(new MarkerOptions().position(tugu).title("Marker in Tugu"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(tugu));

        // Add a marker in Sydney and move the camera
        LatLng stasiunt = new LatLng(-7.78904827807802, 110.36382403888868);
        mMap.addMarker(new MarkerOptions().position(stasiunt).title("Marker in Stasiun Tugu"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(stasiunt));
    }
}