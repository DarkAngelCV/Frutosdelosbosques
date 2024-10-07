package cl.ipvg.frutosdelosbosques;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;
    private ActivityMapsBiding bisding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        bisding = ActivityMapsBinding.inflate(getLayoutInflater());
        setContentView(bisding.getRoot());

        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.mapa);
        mapFragment.getMapAsync(this);

        @Override
        public void onMapReady (GoogleMap googleMap){
            mMap = googleMap;

            LatLng Pizzeria = new LatLng(-36.60124200933194, -72.09337420349259);
            LatLng Santos = new LatLng(-36.59989747975368, -72.0899141918543);
            LatLng Louvre = new LatLng(-36.606606271156764, -72.09796600163925);
            LatLng Pochito = new LatLng(-36.61642967758056, -72.09805229000035);
            LatLng Dgusta = new LatLng(-36.607777048744275, -72.09625437650922);

            mMap.addMarker(new MarkerOptions().position(Pizzeria).title("Pizzeria Le Moulin"));
            mMap.addMarker(new MarkerOptions().position(Santos).title("Santos Pecadores"));
            mMap.addMarker(new MarkerOptions().position(Louvre).title("Louvre Restobar"));
            mMap.addMarker(new MarkerOptions().position(Pochito).title("Pochito"));
            mMap.addMarker(new MarkerOptions().position(Dgusta).title("Dgusta"));
        }
    }