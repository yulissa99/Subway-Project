package hernandez.perez.uca.com.subway_app.Adapters;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import hernandez.perez.uca.com.subway_app.Entities.Food;
import hernandez.perez.uca.com.subway_app.R;

public class MenuAdapter extends RecyclerView.Adapter<MenuAdapter.ViewHolder> {
    List<Food> foods;

    public MenuAdapter(List<Food> foods) {
        this.foods = foods;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView image;
        TextView price;
        TextView name;
        TextView description;
        public ViewHolder(View view) {
            super(view);
            image = view.findViewById(R.id.card_image);
            price = view.findViewById(R.id.price);
            name = view.findViewById(R.id.name);
            description = view.findViewById(R.id.description);
        }
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.card_view, parent, false);
        return new MenuAdapter.ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        holder.price.setText("C$ "+foods.get(position).getPrice());
        holder.name.setText(foods.get(position).getName());
        holder.description.setText(foods.get(position).getDescription());
    }

    @Override
    public int getItemCount() {return foods.size();}
    
}

