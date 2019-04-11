package hernandez.perez.uca.com.subway_app.Adapters;

import android.support.annotation.NonNull;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.List;

import hernandez.perez.uca.com.subway_app.Entities.Promotion;
import hernandez.perez.uca.com.subway_app.R;

public class HomeAdapter extends RecyclerView.Adapter<HomeAdapter.ViewHolder> {
    List<Promotion> promotions;

    public HomeAdapter(List<Promotion> promotions) {
        this.promotions = promotions;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView image;
        TextView title;
        TextView desc;
        CardView card;
        public ViewHolder(View view) {
            super(view);
            image = view.findViewById(R.id.image);
            title = view.findViewById(R.id.title);
            desc = view.findViewById(R.id.desc);
            card = view.findViewById(R.id.card_image);
        }
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.card_promotions, parent, false);
        return new HomeAdapter.ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.title.setText(promotions.get(position).getTitle());
        holder.desc.setText(promotions.get(position).getDescrption());
        Glide.with(holder.card.getContext()).load(promotions.get(position).getIdImage()).apply(new RequestOptions().centerCrop()).into(holder.image);

    }

    @Override
    public int getItemCount() {return promotions.size();}


}
