package com.titanz.titanztech.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.titanz.titanztech.R;
import com.titanz.titanztech.models.Promocoes;

import java.util.List;

public class PromocoesAdapter extends RecyclerView.Adapter<PromocoesAdapter.ViewHolder> {



    private List<Promocoes> listaPromocoes;
    //private PromocoesListener ServicosListener;

    public PromocoesAdapter(List<Promocoes> listaPromocoes){

        this.listaPromocoes = listaPromocoes;
    }



    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.celula_promocoes,viewGroup,false);
        return new ViewHolder(view);
    }


    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, final int i) {
        final Promocoes promocoes = listaPromocoes.get(i);
        viewHolder.setupPromocoes(promocoes);

    }

    @Override
    public int getItemCount() {
        return listaPromocoes.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder {

        private TextView textDescricaoPromocoesView;
        private TextView textValorPromocoesView;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            textDescricaoPromocoesView = itemView.findViewById(R.id.textPromocoesDescricaoView_id);
            textValorPromocoesView = itemView.findViewById(R.id.textValorPromocoesView_id);

        }

        public void setupPromocoes(Promocoes promocoes){

            textDescricaoPromocoesView.setText(promocoes.getDescricao());
            textValorPromocoesView.setText(promocoes.getValor());
        }

    }

}
