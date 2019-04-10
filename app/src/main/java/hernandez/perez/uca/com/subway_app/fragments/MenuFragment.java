package hernandez.perez.uca.com.subway_app.fragments;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

import hernandez.perez.uca.com.subway_app.Adapters.HomeAdapter;
import hernandez.perez.uca.com.subway_app.Adapters.MenuAdapter;
import hernandez.perez.uca.com.subway_app.Entities.Food;
import hernandez.perez.uca.com.subway_app.Entities.Promotion;
import hernandez.perez.uca.com.subway_app.R;

public class MenuFragment extends Fragment {
    View view;
    private RecyclerView recyclerView;
    MenuItem menu;
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_menu, container, false);
        initView();
        setHasOptionsMenu(true);
        return view;
    }
    public void onCreateOptionsMenu(Menu menu, MenuInflater inflater) {
        this.menu = menu.add("add");
        this.menu.setIcon(R.drawable.ic_more_vert_black_24dp);
    }

    private void initView (){
        recyclerView = view.findViewById(R.id.recycler_view);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this.getContext()));
        ArrayList<Food> foods = new ArrayList<>();
        MenuAdapter adapter = new MenuAdapter(foods);
        recyclerView.setAdapter(adapter);
    }

}
