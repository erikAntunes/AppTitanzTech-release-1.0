package com.titanz.titanztech.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.titanz.titanztech.R;
import com.titanz.titanztech.models.Servicos;

import java.util.List;

public class ServicosAdapter extends RecyclerView.Adapter<ServicosAdapter.ViewHolder> {



    private List<Servicos> listaServicos;
    //private ServicosListener ServicosListener;

    public ServicosAdapter(List<Servicos> listaPaises){

        this.listaServicos = listaPaises;
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
        viewHolder.setupPais(servicos);

    }

    @Override
    public int getItemCount() {
        return listaServicos.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder {

        private TextView textDescricaoServicosView;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            textDescricaoServicosView = itemView.findViewById(R.id.textDescricaoServicosView_id);
        }

        public void setupPais(Servicos servicos){

            textDescricaoServicosView.setText(servicos.getDescricao());
        }

    }

}
