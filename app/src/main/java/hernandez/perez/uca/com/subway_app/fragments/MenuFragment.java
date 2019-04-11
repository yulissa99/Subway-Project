package hernandez.perez.uca.com.subway_app.fragments;

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

import hernandez.perez.uca.com.subway_app.Adapters.MenuAdapter;
import hernandez.perez.uca.com.subway_app.Entities.Food;
import hernandez.perez.uca.com.subway_app.R;
import hernandez.perez.uca.com.subway_app.classes.NgFood;

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
        inflater.inflate(R.menu.main, menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int itemId = item.getItemId();

        if (itemId == R.id.action_salads) {
            recyclerView.removeAllViews();
            ArrayList<Food> foods =  new NgFood().getSalads();
            MenuAdapter adapter = new MenuAdapter(foods);
            recyclerView.setAdapter(adapter);

        } else if (itemId == R.id.action_sandwich) {
            ArrayList<Food> foods =  new NgFood().getSubway();
            MenuAdapter adapter = new MenuAdapter(foods);
            recyclerView.setAdapter(adapter);
        } else if (itemId == R.id.action_snacks) {
            ArrayList<Food> foods =  new NgFood().getSnacks();
            MenuAdapter adapter = new MenuAdapter(foods);
            recyclerView.setAdapter(adapter);
        }

        return super.onOptionsItemSelected(item);
    }
    private void initView (){
        recyclerView = view.findViewById(R.id.recycler_view);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this.getContext()));
        ArrayList<Food> foods =  new NgFood().getSubway();
        MenuAdapter adapter = new MenuAdapter(foods);
        recyclerView.setAdapter(adapter);
    }

}
