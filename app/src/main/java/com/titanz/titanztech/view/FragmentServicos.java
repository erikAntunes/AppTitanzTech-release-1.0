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
        servico1.setDescricao("Desenvolvimento - Android Mobile");
        servico1.setId("01");
        servico1.setImagem("https://lh3.googleusercontent.com/8eTppY66V5uBrjfYnCIG6SGTkDI3c74RJIlWbqzji9pjz18Rbn3uxLmFTtm4Pa7cdAxjN4MzP2IIyL2t8Zc7kpgrTPJnyoaUryBgn3z_HNfb77BfZzu9Z_6PGnex6ETxXpP74CVjYsh3LnKvddem78UKijKVodwgQ0CRc8e3U1LS7M0oZhFksloWLOJXHJ2IfKQej7jdqI_8djOArPK8Kdp8jX1OLVdv9cd7W6o7EwGhxOrytF6NGiEJTdn5ucT0Fz_9cgulTwl8DH3UrVZtUazaewBb4SzNhM0F3vg0_75sKgH1fE1pt-H-cOKkLCIBC1aMsQrEv4p3h3nHmpNJwmuFyJraM2QFaCXZKwK1NKIUqkqqZJUbTmuyBg5gUmYxtItrpHpwZSNPyegxCcapZSwSP1MgGn6GHD34efVs2ZbLvDQsbd9x7Z_cGiYKe5h678M-15UPW_aKjTndHjqgu4PDn-w7j7-Pr-WyJo2aIA8FpMy27VcpMuHavs6f1O5TlwLa3WvlYfzg1RBORZ20itWR8P7Eo1HFvEquD7gQjMy5Z0qpyZwn9gvJyXZV7BLW9OrbKwybXjcCJQ3ehg7nnqBRMaL3EK7jGCoxDPWeXgd_UaB2rpaNln1aMNBSQEYuBtC3TM03yykqW1ORa9ci-_RWPLYeqDB-q0AYrQXJQC4PqxsCJvJ1wMQ=s800-no");
        servicosArrayList.add(servico1);
        Servicos servico2 = new Servicos();
        servico2.setDescricao("Formatação de Notebooks");
        servico2.setId("02");
        servicosArrayList.add(servico2);
        Servicos servico3 = new Servicos();
        servico3.setDescricao("Formatação de Desktops");
        servico3.setId("03");
        servicosArrayList.add(servico3);
        Servicos servico4 = new Servicos();
        servico4.setDescricao("Backup de Arquivos Pessoais");
        servicosArrayList.add(servico4);
        servico4.setId("04");
        Servicos servico5 = new Servicos();
        servico5.setDescricao("Troca de Teclado - Notebook");
        servico5.setId("05");
        servicosArrayList.add(servico5);
        Servicos servico6 = new Servicos();
        servico6.setDescricao("Troca de HD - Notebook / Desktop");
        servico6.setId("06");
        servicosArrayList.add(servico6);
        Servicos servico7 = new Servicos();
        servico7.setDescricao("Montagem de Desktop Gamer");
        servico7.setId("07");
        servicosArrayList.add(servico7);
        Servicos servico8 = new Servicos();
        servico8.setDescricao("Upgrade de Memória RAM");
        servico8.setId("08");
        servicosArrayList.add(servico8);
        Servicos servico9 = new Servicos();
        servico9.setDescricao("Upgrade - HD para SSD");
        servico9.setId("09");
        servicosArrayList.add(servico9);
        Servicos servico10 = new Servicos();
        servico10.setDescricao("Upgrade - Processadores");
        servico10.setId("10");
        servicosArrayList.add(servico10);
        Servicos servico11 = new Servicos();
        servico11.setDescricao("Limpeza - Troca de Pasta Termica");
        servico11.setId("11");
        servicosArrayList.add(servico11);

        recyclerViewServicos = view.findViewById(R.id.servicos_recyclerView_id);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getContext());

        servicosAdapter = new ServicosAdapter(servicosArrayList);

        recyclerViewServicos.setAdapter(servicosAdapter);
        recyclerViewServicos.setLayoutManager(layoutManager);

        return view;
    }
}