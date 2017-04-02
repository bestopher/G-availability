package com.senegal.nagnekoseytoo.gabavailability.Activities;


import android.support.v4.app.FragmentActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.google.android.gms.location.LocationListener;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.senegal.nagnekoseytoo.gabavailability.R;

public class MapActivity extends FragmentActivity implements OnMapReadyCallback {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_map);
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }

    @Override
    public void onMapReady(GoogleMap map) {
        // Add a marker in Sydney, Australia, and move the camera.
        LatLng sydney = new LatLng(-34, 151);
        map.addMarker(new MarkerOptions().position(sydney).title("Marker in Sydney"));
        map.moveCamera(CameraUpdateFactory.newLatLng(sydney));
    }



/*extends FragmentActivity  {

    private GoogleMap GMap;
    private LatLng yaounde = new LatLng(3.881501, 11.50818);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //on récupère le fragment définit dans le layout qui va contenir la carte
        GMap= ((SupportMapFragment)getSupportFragmentManager().findFragmentById(R.id.map)).getMapAsync(MapActivity.this);
        //on s'assure que l'objet map n'est pas vide
        if (GMap != null) {
            //mode d'affichage de la carte
            GMap.setTrafficEnabled(true);
            //on autorise l'api à afficher le bouton pour accéder à notre position courante
            if (ActivityCompat.checkSelfPermission(this, android.Manifest.permission.ACCESS_FINE_LOCATION) != PackageManager.PERMISSION_GRANTED && ActivityCompat.checkSelfPermission(this, android.Manifest.permission.ACCESS_COARSE_LOCATION) != PackageManager.PERMISSION_GRANTED) {
                // TODO: Consider calling
                //    ActivityCompat#requestPermissions
                // here to request the missing permissions, and then overriding
                //   public void onRequestPermissionsResult(int requestCode, String[] permissions,
                //                                          int[] grantResults)
                // to handle the case where the user grants the permission. See the documentation
                // for ActivityCompat#requestPermissions for more details.
                return;
            }
            GMap.setMyLocationEnabled(true);

            //définition du marqueur qui va se positionner sur le point qu'on désire afficher
            MarkerOptions markerOptions = new MarkerOptions();
            markerOptions.title("YAOUNDE");
            markerOptions.visible(true);
            markerOptions.position(yaounde);
            markerOptions.icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_YELLOW));

            //ajout du marqueur sur la carte
            GMap.addMarker(markerOptions);
            //zoom de la caméra sur la position qu'on désire afficher
            GMap.moveCamera(CameraUpdateFactory.newLatLngZoom(yaounde, 16));
            //animation le zoom toute les 2000ms
            GMap.animateCamera(CameraUpdateFactory.zoomTo(15), 2000, null);*/
      //  }
   // }

}
