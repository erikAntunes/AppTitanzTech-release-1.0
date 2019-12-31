package com.titanz.titanztech.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Picasso;
import com.titanz.titanztech.R;
import com.titanz.titanztech.models.Servicos;

import java.util.List;

import de.hdodenhof.circleimageview.CircleImageView;

public class ServicosAdapter extends RecyclerView.Adapter<ServicosAdapter.ViewHolder> {



    private List<Servicos> listaServicos;
    //private ServicosListener ServicosListener;

    public ServicosAdapter(List<Servicos> listaServicos){

        this.listaServicos = listaServicos;
    }



    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.celula_servicos,viewGroup,false);
        return new ViewHolder(view);
    }


    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, final int i) {
        final Servicos servicos = listaServicos.get(i);
        viewHolder.setupServicos(servicos);

    }

    @Override
    public int getItemCount() {
        return listaServicos.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder {

        private TextView textDescricaoServicosView;

        private TextView textIdServicosView;

        private CircleImageView servicosImageView;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            textDescricaoServicosView = itemView.findViewById(R.id.textDescricaoServicosView_id);
            textIdServicosView = itemView.findViewById(R.id.servicos_textView_id_id);
            servicosImageView = itemView.findViewById(R.id.servicos_imageView_id);
        }

        public void setupServicos(Servicos servicos){

            textDescricaoServicosView.setText(servicos.getDescricao());
            textIdServicosView.setText(servicos.getId());
            Picasso.get().load(servicos.getImagem()).into(servicosImageView);
        }

    }

}
