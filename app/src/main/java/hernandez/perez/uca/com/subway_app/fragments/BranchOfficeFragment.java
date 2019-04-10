package hernandez.perez.uca.com.subway_app.fragments;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.mapbox.mapboxsdk.Mapbox;
import com.mapbox.mapboxsdk.annotations.MarkerOptions;
import com.mapbox.mapboxsdk.geometry.LatLng;
import com.mapbox.mapboxsdk.maps.MapView;
import com.mapbox.mapboxsdk.maps.MapboxMap;
import com.mapbox.mapboxsdk.maps.OnMapReadyCallback;
import com.mapbox.mapboxsdk.maps.Style;

import java.util.Objects;

import hernandez.perez.uca.com.subway_app.R;

public class BranchOfficeFragment extends Fragment {
    View view;
    private MapView mapView;

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                                 Bundle savedInstanceState) {
        Mapbox.getInstance(Objects.requireNonNull(getContext()), "pk.eyJ1IjoiYWRyaWFuYXNhbG9tZTMxIiwiYSI6ImNqdThqd3VscjE4dG4zemxtbTFxYzBlMWEifQ.nlzdrcOzbjBmOetZjcc1RA");
        view = inflater.inflate(R.layout.fragment_branch_office, container, false);
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
                MarkerOptions marker = new MarkerOptions();
                //Primer Subway
                marker.title("Subway Los Robles");
                marker.setSnippet("Bocadillos personalizados y ensaladas en mostrador...");
                marker.position(new LatLng(12.1215892, -86.2601707));

                mapboxMap.addMarker(marker);

                //Segundo Subway
                marker.title("Subway Metrocentro");
                marker.setSnippet("Bocadillos personalizados y ensaladas en mostrador...");
                marker.position(new LatLng(12.1270997, -86.2647094));

                mapboxMap.addMarker(marker);

                //Tercero Subway
                marker.title("Subway Jean Paul Genie");
                marker.setSnippet("Bocadillos personalizados y ensaladas en mostrador...");
                marker.position(new LatLng(12.103247725681612, -86.25848601422257));
                mapboxMap.addMarker(marker);

                //Cuarto Subway
                marker.title("Subway Ciudad Jardin");
                marker.setSnippet("Bocadillos personalizados y ensaladas en mostrador...");
                marker.position(new LatLng(12.144301854568525, -86.2567075583695));
                mapboxMap.addMarker(marker);

                //Quinto Subway
                marker.title("Subway Galerías Santo Domingo");
                marker.setSnippet("Bocadillos personalizados y ensaladas en mostrador...");
                marker.position(new LatLng(12.103860129767114, -86.24901614826797));
                mapboxMap.addMarker(marker);

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
}
