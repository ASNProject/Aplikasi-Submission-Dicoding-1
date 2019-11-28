package com.asnproject.submission1;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

/**
 *
 */
public class ListMakananAdapter extends RecyclerView.Adapter<ListMakananAdapter.ListViewHolder> {
    private ArrayList<makanan> listMakanan;
    private OnItemClickCallback onItemClickCallback;

    public void setOnItemClickCallback(OnItemClickCallback onItemClickCallback){
        this.onItemClickCallback = onItemClickCallback;
    }

    public ListMakananAdapter(ArrayList<makanan> list){
        this.listMakanan = list;
    }

    @NonNull
    @Override
    public ListViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_row_makanan, viewGroup, false);
        return new ListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final ListViewHolder holder, int position) {
        makanan makanan = listMakanan.get(position);
        Glide.with(holder.itemView.getContext())
                .load(makanan.getGambar())
                .apply(new RequestOptions().override(55, 55))
                .into(holder.imgGambar);
        holder.tvMakanan.setText(makanan.getMakanan());
        holder.tvDetail.setText(makanan.getDetail());
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onItemClickCallback.onItemClicked(listMakanan.get(holder.getAdapterPosition()));

            }
        });
    }

    @Override
    public int getItemCount() {
        return listMakanan.size();
    }

    public class ListViewHolder extends RecyclerView.ViewHolder {
        ImageView imgGambar;
        TextView tvMakanan, tvDetail;

        public ListViewHolder(@NonNull View itemView) {
            super(itemView);
            imgGambar = itemView.findViewById(R.id.gambar);
            tvMakanan = itemView.findViewById(R.id.namaitem);
            tvDetail = itemView.findViewById(R.id.isidetail);

        }
    }

    public interface OnItemClickCallback {
        void onItemClicked(makanan data);
    }
}
