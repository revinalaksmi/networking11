package com.example.globalstore.networking.Adapter;

import android.support.v7.app.AppCompatDelegate;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.globalstore.networking.Model.Pembeli;
import com.example.globalstore.networking.R;

import java.util.List;

public class PembeliAdapter extends RecyclerView.Adapter<PembeliAdapter.PembeliViewHolder>  {
    List<Pembeli> listPembeli;

    public PembeliAdapter(List<Pembeli> listPembeli) {
        this.listPembeli = listPembeli;
    }

    @Override
    public PembeliAdapter.PembeliViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        AppCompatDelegate.setCompatVectorFromResourcesEnabled(true);
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_pembeli, parent, false);
        PembeliViewHolder mHolder = new PembeliViewHolder(view);
        return mHolder;
    }

    @Override
    public void onBindViewHolder(PembeliAdapter.PembeliViewHolder holder, final int position) {
        holder.tvIdPembeli.setText(listPembeli.get(position).getIdPembeli());
        holder.tvNama.setText(listPembeli.get(position).getNama());
        holder.tvAlamat.setText(listPembeli.get(position).getAlamat());
        holder.tvTelp.setText(listPembeli.get(position).getTelp());
        if (listPembeli.get(position).getPhotoUrl() != null ){
            holder.tvIdPembeli.setText(listPembeli.get(position).getIdPembeli());
            holder.tvNama.setText(listPembeli.get(position).getNama());
            holder.tvAlamat.setText(listPembeli.get(position).getAlamat());
            holder.tvTelp.setText(listPembeli.get(position).getTelp());
        } else {
            Glide.with(holder.itemView.getContext()).load(R.drawable.default_user).into(holder
                    .mPhotoURL);

        }
    }

    @Override
    public int getItemCount() {
        return listPembeli.size();
    }
    public class PembeliViewHolder extends RecyclerView.ViewHolder {
        ImageView mPhotoURL;
        TextView tvIdPembeli, tvNama, tvAlamat, tvTelp;

        public PembeliViewHolder(View itemView) {
            super(itemView);
            mPhotoURL = (ImageView) itemView.findViewById(R.id.imgPembeli);
            tvIdPembeli = (TextView) itemView.findViewById(R.id.tvIdPembeli);
            tvNama = (TextView) itemView.findViewById(R.id.tvNama);
            tvAlamat = (TextView) itemView.findViewById(R.id.tvAlamatContent);
            tvTelp = (TextView) itemView.findViewById(R.id.tvTelpContent);

        }
    }
}
