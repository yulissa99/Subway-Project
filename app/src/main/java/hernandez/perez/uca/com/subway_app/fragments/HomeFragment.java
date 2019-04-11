package hernandez.perez.uca.com.subway_app.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

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

        Promotion promotion = new Promotion();
        Promotion promotion2 = new Promotion();
        Promotion promotion3 = new Promotion();
        Promotion promotion4 = new Promotion();
        Promotion promotion5 = new Promotion();
        Promotion promotion7 = new Promotion();

        promotion.setTitle("Mañana 2x1 todos los subways");
        promotion.setDescrption("2x1");
        promotion.setIdImage(R.drawable.promocion_2x1_subway);
        promotions.add(promotion);

        promotion2.setTitle("Subway de atún del Caribe");
        promotion2.setDescrption("15% DESC");
        promotion2.setIdImage(R.drawable.promocion_atun_subway);
        promotions.add(promotion2);

        promotion3.setTitle("Nuevo costilla BBQ");
        promotion3.setDescrption("10% DESC");
        promotion3.setIdImage(R.drawable.promocion_bbq);
        promotions.add(promotion3);

        promotion4.setTitle("Subway de carne y queso");
        promotion4.setDescrption("2nd mitad de precio");
        promotion4.setIdImage(R.drawable.promocion_carne_queso);
        promotions.add(promotion4);

        promotion5.setTitle("Subway de jamón");
        promotion5.setDescrption("25% DESC");
        promotion5.setIdImage(R.drawable.promocion_jamon_subway);
        promotions.add(promotion5);

        promotion7.setTitle("Combo snacks y subway");
        promotion7.setDescrption("20% DESC");
        promotion7.setIdImage(R.drawable.promocion_pack);
        promotions.add(promotion7);

        HomeAdapter adapter = new HomeAdapter(promotions);
        recyclerView.setAdapter(adapter);
    }
}