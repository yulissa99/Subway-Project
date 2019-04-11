package hernandez.perez.uca.com.subway_app.fragments;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.mapbox.mapboxsdk.Mapbox;
import com.mapbox.mapboxsdk.annotations.Marker;
import com.mapbox.mapboxsdk.annotations.MarkerOptions;
import com.mapbox.mapboxsdk.geometry.LatLng;
import com.mapbox.mapboxsdk.maps.MapView;
import com.mapbox.mapboxsdk.maps.MapboxMap;
import com.mapbox.mapboxsdk.maps.OnMapReadyCallback;
import com.mapbox.mapboxsdk.maps.Style;

import java.util.ArrayList;
import java.util.Objects;

import hernandez.perez.uca.com.subway_app.Entities.BranchOffice;
import hernandez.perez.uca.com.subway_app.R;
import hernandez.perez.uca.com.subway_app.classes.NgBranchOffice;

public class BranchOfficeFragment extends Fragment implements MapboxMap.OnMapClickListener,
        MapboxMap.OnMarkerClickListener, OnMapReadyCallback{

    View view;
    private MapView mapView;
    private LinearLayout bottomSheet;
    private ArrayList<BranchOffice> branchOffices;
    private MapboxMap.OnMapClickListener context = this;
    private MapboxMap.OnMarkerClickListener context2 = this;

    private ImageView img;
    private TextView name;
    private TextView schedule;
    private TextView address;
    private TextView description;

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                                 Bundle savedInstanceState) {
        Mapbox.getInstance(Objects.requireNonNull(getContext()), "pk.eyJ1IjoiYWRyaWFuYXNhbG9tZTMxIiwiYSI6ImNqdThqd3VscjE4dG4zemxtbTFxYzBlMWEifQ.nlzdrcOzbjBmOetZjcc1RA");
        view = inflater.inflate(R.layout.fragment_branch_office, container, false);
        bottomSheet = view.findViewById(R.id.bottom_sheet);

        return view;
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        mapView = view.findViewById(R.id.mapView);
        mapView.onCreate(savedInstanceState);
        mapView.getMapAsync(new OnMapReadyCallback() {
            @Override
            public void onMapReady(@NonNull MapboxMap mapboxMap) {

                NgBranchOffice n = new NgBranchOffice();
                branchOffices = n.getBranchOffices();
                for (BranchOffice b : n.getBranchOffices())
                {
                    MarkerOptions marker = new MarkerOptions();
                    //Primer Subway
                    marker.title(b.getName());
                    marker.setSnippet(b.getDescription());
                    marker.position(new LatLng(b.getLatitude(), b.getLongitude()));
                    mapboxMap.addMarker(marker);
                }
                mapboxMap.addOnMapClickListener(context);
                mapboxMap.setOnMarkerClickListener(context2);
                mapboxMap.setStyle(Style.MAPBOX_STREETS);
            }

        });
    }

    @Override
    public void onStart() {
        super.onStart();
        mapView.onStart();
    }

    @Override
    public void onResume() {
        super.onResume();
        mapView.onResume();
    }

    @Override
    public void onSaveInstanceState(@NonNull Bundle outState) {
        mapView.onSaveInstanceState(outState);
        super.onSaveInstanceState(outState);
    }

    @Override
    public void onPause() {
        super.onPause();
        mapView.onPause();
    }

    @Override
    public void onStop() {
        super.onStop();
        mapView.onStop();
    }

    @Override
    public void onLowMemory() {
        super.onLowMemory();
        mapView.onLowMemory();
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        mapView.onDestroy();
    }

    @Override
    public boolean onMapClick(@NonNull LatLng point) {
        bottomSheet.setVisibility(View.GONE);
        return false;
    }

    @Override
    public boolean onMarkerClick(@NonNull Marker marker) {
        bottomSheet.setVisibility(View.VISIBLE);
        for (BranchOffice b : branchOffices)
        {
            if (b.getName().equals(marker.getTitle()))
            {
                img = view.findViewById(R.id.imageBB);
                name = view.findViewById(R.id.name);
                schedule = view.findViewById(R.id.schedule);
                address = view.findViewById(R.id.address);
                description = view.findViewById(R.id.description);

                Glide.with(this).load(b.getIdImage()).apply(new RequestOptions().centerCrop()).into(img);
                name.setText(b.getName());
                schedule.setText(b.getSchedule());
                address.setText(b.getAddress());
                description.setText(b.getDescription());
            }
        }
        return false;
    }

    @Override
    public void onMapReady(@NonNull MapboxMap mapboxMap) {
        mapboxMap.addOnMapClickListener(this);
        mapboxMap.setOnMarkerClickListener(this);
    }

    private void defineData(){

    }
}
