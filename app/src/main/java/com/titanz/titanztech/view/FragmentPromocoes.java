package com.titanz.titanztech.view;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.titanz.titanztech.R;
import com.titanz.titanztech.adapters.PromocoesAdapter;
import com.titanz.titanztech.adapters.ServicosAdapter;
import com.titanz.titanztech.models.Promocoes;

import java.util.ArrayList;


public class FragmentPromocoes extends Fragment {

    private RecyclerView recyclerViewPromocoes;
    private PromocoesAdapter promocoesAdapter;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.promocoes_fragment,container,false);

        ArrayList<Promocoes> promocoesArrayList = new ArrayList<>();

        Promocoes promocoes1 = new Promocoes();
        promocoes1.setDescricao("Desenvolvimento de Aplicativo Comercial");
        promocoes1.setValor("R$ 500,00");
        promocoesArrayList.add(promocoes1);

        Promocoes promocoes2 = new Promocoes();
        promocoes2.setDescricao("Formatação + Limpeza - Notebook ");
        promocoes2.setValor("R$ 100,00");
        promocoesArrayList.add(promocoes2);

        Promocoes promocoes3 = new Promocoes();
        promocoes3.setDescricao("Formatação + Limpeza - Desktop");
        promocoes3.setValor("R$ 120,00");
        promocoesArrayList.add(promocoes3);

        Promocoes promocoes4 = new Promocoes();
        promocoes4.setDescricao("Formatação + SSD 120GB");
        promocoes4.setValor("R$ 220,00");
        promocoesArrayList.add(promocoes4);


        recyclerViewPromocoes = view.findViewById(R.id.promocoes_recyclerView_id);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getContext());

        promocoesAdapter = new PromocoesAdapter(promocoesArrayList);

        recyclerViewPromocoes.setAdapter(promocoesAdapter);
        recyclerViewPromocoes.setLayoutManager(layoutManager);
        return view;
    }
}
