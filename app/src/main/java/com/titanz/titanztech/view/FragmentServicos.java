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
import com.titanz.titanztech.adapters.ServicosAdapter;
import com.titanz.titanztech.models.Servicos;

import java.util.ArrayList;

public class FragmentServicos extends Fragment {

    private RecyclerView recyclerViewServicos;
    private ServicosAdapter servicosAdapter;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.servicos_fragment,container,false);

        ArrayList<Servicos> servicosArrayList = new ArrayList<>();

        Servicos servico1 = new Servicos();
        servico1.setDescricao("Desenvolvimento De Aplicativos Android");
        servicosArrayList.add(servico1);
        Servicos servico2 = new Servicos();
        servico2.setDescricao("Design de Aplicativos Android");
        servicosArrayList.add(servico2);
        Servicos servico3 = new Servicos();
        servico3.setDescricao("Manutenção de Computadores");
        servicosArrayList.add(servico3);

        recyclerViewServicos = view.findViewById(R.id.servicos_recyclerView_id);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getContext());

        servicosAdapter = new ServicosAdapter(servicosArrayList);

        recyclerViewServicos.setAdapter(servicosAdapter);
        recyclerViewServicos.setLayoutManager(layoutManager);

        return view;
    }
}