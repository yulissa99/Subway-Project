package hernandez.perez.uca.com.subway_app.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

import hernandez.perez.uca.com.subway_app.Adapters.HomeAdapter;
import hernandez.perez.uca.com.subway_app.Entities.Promotion;
import hernandez.perez.uca.com.subway_app.R;

public class HomeFragment extends Fragment {
    private View view;
    private RecyclerView recyclerView;



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_home, container, false);
        initView();
        return view;
    }

    private void initView (){
        recyclerView = view.findViewById(R.id.recycler_view);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this.getContext()));
        ArrayList<Promotion> promotions = new ArrayList<>();
        Promotion p = new Promotion();

        p.setTitle("Italian Subway");
        p.setDescrption("70% DESC");
        promotions.add(p);
        promotions.add(p);
        promotions.add(p);
        promotions.add(p);
        promotions.add(p);
        promotions.add(p);
        promotions.add(p);
        promotions.add(p);
        HomeAdapter adapter = new HomeAdapter(promotions);
        recyclerView.setAdapter(adapter);
    }
}