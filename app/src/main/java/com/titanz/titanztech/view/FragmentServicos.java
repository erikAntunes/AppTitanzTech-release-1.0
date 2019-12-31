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
        servico1.setImagem("https://lh3.googleusercontent.com/8eTppY66V5uBrjfYnCIG6SGTkDI3c74RJIlWbqzji9pjz18Rbn3uxLmFTtm4Pa7cdAxjN4MzP2IIyL2t8Zc7kpgrTPJnyoaUryBgn3z_HNfb77BfZzu9Z_6PGnex6ETxXpP74CVjYsh3LnKvddem78UKijKVodwgQ0CRc8e3U1LS7M0oZhFksloWLOJXHJ2IfKQej7jdqI_8djOArPK8Kdp8jX1OLVdv9cd7W6o7EwGhxOrytF6NGiEJTdn5ucT0Fz_9cgulTwl8DH3UrVZtUazaewBb4SzNhM0F3vg0_75sKgH1fE1pt-H-cOKkLCIBC1aMsQrEv4p3h3nHmpNJwmuFyJraM2QFaCXZKwK1NKIUqkqqZJUbTmuyBg5gUmYxtItrpHpwZSNPyegxCcapZSwSP1MgGn6GHD34efVs2ZbLvDQsbd9x7Z_cGiYKe5h678M-15UPW_aKjTndHjqgu4PDn-w7j7-Pr-WyJo2aIA8FpMy27VcpMuHavs6f1O5TlwLa3WvlYfzg1RBORZ20itWR8P7Eo1HFvEquD7gQjMy5Z0qpyZwn9gvJyXZV7BLW9OrbKwybXjcCJQ3ehg7nnqBRMaL3EK7jGCoxDPWeXgd_UaB2rpaNln1aMNBSQEYuBtC3TM03yykqW1ORa9ci-_RWPLYeqDB-q0AYrQXJQC4PqxsCJvJ1wMQ=s800-no");
        servico1.setId("01");
        servicosArrayList.add(servico1);
        Servicos servico2 = new Servicos();
        servico2.setDescricao("Formatação de Notebooks");
        servico2.setImagem("https://lh3.googleusercontent.com/R3wZ_vgDCCIqTYuO3zfwY7-oHFBEO8e1FgyL67-PtdPUG19zqQ1EkFRIjGwVuRzXzsYkcw1rCSmKhUSo7_k97VnRmdSIiv4-i2Ntmt7mQ1WZOWC01dMO005VQsFPFm60kIEv1OpLtCgjmkMEJL0YqGSsPWO30r61uobM_VO324ZD7HmWkXpAIFRxIFyuCefQtAO-4Vu5mPBuimJ9zCktx7-YuDzofe_jhvpbFraTNPmxzMkzlYjQutRxUHHSgZR_IiSHHVbkjfrpec0suB2hwFW3GFagWwuo89T5SfNNxZhrEBYodWe2xmJaU1eLsnT5YseccjihxBfK5FYGJXCvQelLn1bToCP-D5oDv1ZEz-LaPRAeQJpMjavRlIWwq3IhV2BBd6wGAIryoqKD78eMypsRfTpDO8fDq5VrDB9ho3yANmMnfEvhl4wzwLpjIutYMzdAbteAN2JvpjdZLeZ5TMz3QRH8-y3rJQnIumr-ipBXnzQOovpJ86tBVjk5ojd84AJHFugDlzbvRLLARnzjfZdH-Ox5bER1vHYR8XFRwZCDsn_YbqrYzaouRJYmYIRgGhFwlP5GeLBD-rIx_l-TdEL6_wCi1swjpVpOMdFCc_jsrmVT4xj7Lhi1A-uvMJUL_cws27t1Tn2fD2zsjh3fhsSg_E0YWGtBRjx07dbOXNUiI8bjcolz2Yw=s800-no");
        servico2.setId("02");
        servicosArrayList.add(servico2);
        Servicos servico3 = new Servicos();
        servico3.setDescricao("Formatação de Desktops");
        servico3.setImagem("https://lh3.googleusercontent.com/Lw_MMG-RYW3LzjKdMnWF3qMcjS-vNEFVZMIKPL66UHtKrTG3sjiEK8dUqhMiCDwDAVzCexPDgsKAYIGgGPAHcX3Jkz5AZTHl9Lf37-nuQ_aXGjDWtJnb5ZQG8nzYC66G1q13YuOaNbkNkf1RinQGgPm7TyRlxtstvBRTPCFgnsaSdbOMvJF3oeKJA51aWkZysqwzMopqqmbSwUfXF05N0UvJm_vrqCluJgOMn4Zrbu3DPTt57QkJe0e23vQ4Nfy8PF8L_ofu0JYooc9aF9NU-9OcmbVhfXRj3SoYJGacS4epAWsmTyqGFGZoZk8rSMQIfJRE7Ho8bKuKkFsyheyYVp-A9kghfBl_NUbY3MT9WA7C-1NRmul_qmwRPa5wWIhvs7NBDCeBT0LmlysgKaXq-MRk-ym9H6LulMfJDEr25ru4YrrSnsnAgS1a1smKSDJrGsh4df25CWtN9RtFFzXpim66zjBWnQ2WITTQDxIZhogAEHsfRDtutAeNUx_v0UREwn0D__Hlfb95WGQmveMRqOB6g1j8264afKDJyi4sGyA4w2eCUMH9CU8pScJku6ZrzlTSLSZHG5BOIuFYuewUFz46avvgCq7MsMaGN9r0pHBZ4A_8TMav0h2_xOxBwreIAi6neFX_y3zmGCmhmVI6MNcULvSDyX8KuvZXJ8EiwdKenNTU4Q98bII=s800-no");
        servico3.setId("03");
        servicosArrayList.add(servico3);
        Servicos servico4 = new Servicos();
        servico4.setDescricao("Backup de Arquivos Pessoais");
        servico4.setImagem("https://lh3.googleusercontent.com/IR0ZyB-S3r5VgyAxAcE7btyfuup05yFic1D_YNofMCAf4wT8jWOY_hhrDkl7aClwXvA_ONHgeBOaCI-k-L3VZjGU0dNmvCfYzJmY58w0yzJmf4Kz6y3YEIeceWNEMpVYTKJqcqPRgvpvNrVWkWu25_yWtjjG5QrBbwnSDXDmt-zvY40ILW0hnrABMUwM5o18xR49c6mYEZi3lK5T_kTn2lwKkeGHbHSfRIyl9cCkmNqJF3ZUGl0fyZbPUcrEUzlCNPFViqJ7ZCkyGfy7dsHYKVTZldpcF5DNol0HvuiCTy2TToCqIBlyfXmkUQIZ7LfWTPTRHJE1lNR_DUV4DePZKKKkgKRI4fHhh0oYQVkYV0gHVz-3O6drZ3BjiMsHFNqSfdadX1sIcVDY2Qja1UYYTwo9XZL1ea8Scw9I1UhCUEFZQANVlbV5UryYvhQHvHG3pzXTsgjECWdODt_u72lM-q458i0_moilqSGFO4RN8Oo30V9MKrIrZZ8kmt9WId7FYaL2vaJRJIQB4-4dxyFIC2nEGnpSnXj0-8WdeiL_w9c8MtSGjjDhsRSIqfJsxq6Mv0yKZtCr3D-9FngcGaOFSwwphoqtAiLd6HQ3C1__KycEmGGmLwof_KgR3-PiSxnM6H1o6FDd3tuz6EUOIIRMqLrKaYrpUvtMZl6YJFCPhFOab8w2bULIOwE=s800-no");
        servico4.setId("04");
        servicosArrayList.add(servico4);
        Servicos servico5 = new Servicos();
        servico5.setDescricao("Troca de Teclado - Notebook");
        servico5.setImagem("https://lh3.googleusercontent.com/CpDd_-GddeDeSF5Q8w7K3he-KHNLXLbr_4jslaETZHTW8-ehu8yJEfHgFRatOG4Ghm2GaxtvFay0eT3vCOr6IoUy10Z6iIerpUBDk0x76t0Udu-pL6m2Ct5_NnYGFFi58MG9n1zVYfcZz5uAac5uM02nSxfd41bya8SMVsJnkgZYd97WXbQ2zNZcl9-KipmYGvLIjSLCtmoOgyr-KibwtNP0Tu1zVASB00xsLnFDLct30gqjqf0IPnZhgTjokOB6aR5uVpSGR0RQHx8r20dKDX0R3FjOLeNXNnHXyvmQMLf2S4FXIwf7WcJu_fF8MKHiZzhJv_JRy8BRCxUSPdjxxRwLy4jaCEnaPUKJM2SIEU4mifkUo-24uif4p_gQQ3pzJbKWQC-vtWN6NIiRZAQKqN-PTIdT5204m7676uC-VejUR9larAjTHCRmmd0Pw_fMHIVV0XxlEHI1AlbBr8DV3ADrjml0eK2hgK-IofmoVk60HFSAsRqEirEROXxzowo8Nf8FTiP3ZwhV9Jbrv-fMZztLqXXFgU_Xlfd1Z1zFtiD-FaGhVi67m5rxvE8yYmAnadKIMPADtfRBrhspwNKyRrPqyEumxjaS2c2fEESGH9N7D3GPnC0wtj6rLIdCxVDuUAS3c9uBN81bcTcr5ud3v_Cn8aQoTVQkKB65kq28AAAXeCsz4cdcjF8=s800-no");
        servico5.setId("05");
        servicosArrayList.add(servico5);
        Servicos servico6 = new Servicos();
        servico6.setDescricao("Troca de HD - Notebook / Desktop");
        servico6.setImagem("https://lh3.googleusercontent.com/vCxmiLpruHK02v7tZgne5TwIsgjDFwZEzuPTDFUpDPhCn8F9GMaVQhA7e9bADPC1itdPp8WHF8av2XmYD83kBixum8iNyTx374SBRZ3Bpa3dITGl3qTThtpeI4RAWYCx0MqHyOLUMcGilLkENXlM3kGVZ6Ci8maFpNHj3e6OTBRh2VNGRRl5ZyyWmTsvAipYwOJHPO_PMQvYwUFNGWfq9oAFYql7njQRN4zfwa2sels1bHl3qyutnnE4XJ20QoRF3eTGznGxdDtlU72EpmJLjCQRVXKr0p_Noo0pSFEUS5f4XccbX22m-EqNiQW8TmvxllCvjCacygooKTZ6HcbUUvKmUCcj0MkBalxbWKlRjjYQCtRe3r8x51qmOofFnqaHlHhdP2VJfCbMqmufZ1synbLCimA38JXaVa6ruekvXLthQHA_CUJwM59kmO3QYaZvuwiCxtEHHvR_Bfx9oiOVDzVzhaxpC-PSAEQ9Q4b451rS-1C-obTQmp8uLmZSJOD4Fsb6xxXejDECt4wHBwHSq0f929wYDBOPab7985LfghXVrBlRptCTuaXz_MhJJfh2FPKeRzrlx6V16hQU_eBGifRzBJz4iZAtUCJSXSpWTtjq96Kqs9EMAzdVNvq5TFvqT1a5nkDSQXQeitKRp442vBB0aHyNa4ou-k-KLkI3_4IXmBIA7B1160Q=s800-no");
        servico6.setId("06");
        servicosArrayList.add(servico6);
        Servicos servico7 = new Servicos();
        servico7.setDescricao("Montagem de Desktop Gamer");
        servico7.setImagem("https://lh3.googleusercontent.com/6-vIrp-gLdAGc7yh8d-pA2eoodcwO-pYN560l2gBQcpB5rdcaRDvzTYMFraUVSXWTl4jSLEE0HImMynLybxVb3Pwbc0RNk-S7vX2VPwjaZOabGabRs9WdzXfy-wzL6BMUH9Uny0ClMQwlTI7rJjGTSiIR-O2QyZdtMSqq5cyWNIfm6s4wpGLw-cMl5irpoixpfrov0bztFXjvwMtmGytW6c6tSqoVgBDjPpS6Alf6B-nOWnftDao5rGP1QVs4w_SzaHd1swcZWIXXTVJdrb4U92VOzLAHgltKdFEUGAudyizhdKBv2km_4L3IPlplk9U_v9ecINsrk89bqFOzlp7nM3Hc2GVIRlTrgJxM_U7NliPbCsN-mlCCfoCP18gzAoHBcQY2UJRl-3tuvk5WNDnvuAEvKh8pdLYX0RNFlxHOwkeBMro9aerO2rWV8qG7WE03bBouKJtpQE199raA8rEjDjr4MZXj75eOwQzdCI3Yl4-bEC1i5AFz2maNJK-77UYJa5woJDtKEgz8YL-NHHcR9lWyiX-E5B6exjL5Zec_62eGVL7Ks8EmlIH0iacCsahhB3fvULMDFmqdOa-oeeHrz2EHEEIagk85MhiybhIOETdsfxphFgvEPXfFEXee79VOVNfsW9ETxElnOi827yHY6imFSpNUDn2mm9024QHk-KE91HOi6Yl91s=s328-no");
        servico7.setId("07");
        servicosArrayList.add(servico7);
        Servicos servico8 = new Servicos();
        servico8.setDescricao("Upgrade de Memória RAM");
        servico8.setImagem("https://lh3.googleusercontent.com/HKUrZf-ZEh_1-gjg51Yft3NxE4oJraGiw_fj_y_tYZZ4eX9CzTbWWt15RaEp4XBaP3bNhGXgOWJxdJEnpsbQ_bCNG68ZzBtCPbiHmnMalw5rn2VODdQDw8_qTfgh8mVTjDijbf2NJi8TViHpZwym9PRXmiua0MchZk4Rx5q0EtPd7wmRRD0tbXB3ETCIiPnRVtfUHiBYyYz44jdEqoBezNdHPb6YhuPbW1MclimHNPAA3hAlDcuwoj9cwxgRL5eyFD6FixTRNOWmEugoIciJAOA2g3tWRxcYYMa8R1BHPHwLzpHw3-KkzySx0UQaB1lalcqYymJ3vEVxmwo715Q7LRXbulk7IMfIzHVUxuE_bW0OGSCe63tHPXfvz4BwvYdIqqizbm8QVUwsl-O2ZYK8YM8DqPvMZaqCN69C_t9AJInbEyqZBum__8mo26SjSEhqlW7EiLjQ8xGwZiv7KPnHOSpP1RDC4St4kvPIjZEO7zQTkngs_K0dF2-AHtRwSFiTa0Ol49DjHSJITV0QbTIxO1VxpzlPy7GdxNiR2p6xfm1JK9xBTku-TufeScnq9f4p7Tu_hxC759wu3k9KucxxG9cj6aZF0VZU6ewixdgeo7nWwnZa41yecKCOmxTaprBaIjmOfbsKw0Z97EvPtjcbhjuKv9BImP0lEtsss0nozlrp3Oh2sYvGPlY=s800-no");
        servico8.setId("08");
        servicosArrayList.add(servico8);
        Servicos servico9 = new Servicos();
        servico9.setDescricao("Upgrade - HD para SSD");
        servico9.setImagem("https://lh3.googleusercontent.com/J_2u9WVKJk5LmxtsGx18peQXxASIt43LNYwJNzheL-4Or5g52EYXsi5VtTxvPKea4RPhnioEqHcyzP2y-YFdVOpZgI9w1Zp32-hKNUO8V_jrMH0SPFbK4xH9xm4RWIO4ubdWDan7SpUE82C9YqjTpF1Gc3KiNJ1LoO032M8PFQ1K1kpPXcLsmCHEFoA1kXGs0KOJ-AzggB6CDufDgHJe2jf-0VPXrGdBa2mh-zhfvueQU8L6D0_f75s_cw2qqHOwWlf08tKErR5eR12yql_c1f9KGXc-RSnBXH0YbyCVAPFu3fVXPMsl6h73o464m-azRe_MEoVx6muPAQx-QHAULxNdtgJCwLwTV9jO4lxn6ZmOnz1HyI9aVvDmMPA-XvobcqggipzIliRVQPdZEdTEGN_aIHsJbb9yvN5bOvgJlmbCpjd8LXRhZm25jgL0-eWjWJEpLA75WGGAINSCSo18C_p7IWYBEGPX19uCuiOTv_CGuTZ_lAHVMKPI-ie9Zch-avJV99O5CCf1tNufOg99x0nYa444pYaJ-ArSsW-TgG4eNGVJZmw4jotxxdiJyC1L9wTNMNV3dh7wvZy2h0JPTVWjNKQneTwdKhSx6JduuCON1bWx06HoP2gMWg8qMBqx5KogdULv_8M_A-s4P0L2JXEppejf1YMY3snrY0DyPk9aucQjDI17QkM=s800-no");
        servico9.setId("09");
        servicosArrayList.add(servico9);
        Servicos servico10 = new Servicos();
        servico10.setDescricao("Upgrade - Processadores");
        servico10.setImagem("https://lh3.googleusercontent.com/gJIwxlvlmUdISyD-yM4X4cHCCEltlMIquegbndfQhq77L_R13CdMTiGVIQJgv1zy0YG9ALd3UtNCup1RRItjY4SSVxkOZT-zzupccQ8FSWaqJToHDdFEvhchLI4rBvTJzsp4bWTKPlzOidi9T2UEQUKIeMVCS788wFaCZq2P5kJUr6mjBsL5TFCsszaH4sNhvtYwWaEe0cHvvzams94bAs9tjZAzFn0FtMHoaCQ3flKaVKt4gU1BsJ4plq9kihMoJNnpO8MmBnMpYkAvQ--QSIIo_5tq-psX26tLwQswEwIzU-meU84J2ou2BRi8tEc3a4ZouJ2GbPcbnAq6XQ7rA1rJ353Kp3g4HOVVS5z33zKhhoCxJNR277otLmbKq4AsxDFXHuRBVym8H2C9s_TSBBaw7Bb93kNN3xEfvvGqrFlOq-txNYhXY3xv5YoC8sUpuCMbJiuHjRnJvNPVtkYhwEovlZ45C2iif89wOFZQE5R3bWUk6KtzwiFCsgJCWGQtlZyKt741bJ5LjMDX_zsHtN6hAGSXq8PRFuLJfqXvZPlKN5z3VsbRve3qTw0tvjF01h6hl5tQHO08c1z7_xARnDnZKlDWkW9rnhGqV38wbyNdNmhFZLEqvBE1lQoXldq0TIrgU78yhsdqbBTGK_4w2KUK3yuCIE5zo5dVtCvWqqeWKdcGTTmfFaM=s328-no");
        servico10.setId("10");
        servicosArrayList.add(servico10);
        Servicos servico11 = new Servicos();
        servico11.setDescricao("Limpeza - Troca de Pasta Termica");
        servico11.setImagem("https://lh3.googleusercontent.com/GgUwE48W-EjDAvo4rdDwUA_85E878L0urMQE7i4u5TJIRyDhCnqS7QSFSj1f8rL5QwAQt5LiEQm075_dVLeu5nR_tLksxLNRKDaZoFfJJ3ECOjt0-0MYjLX1HSBAdnYRhvElkczsBvFlKA8WI6l7lxJrYhG_cDe4YBkhNlwzSSe50aNTEiXFAtYx4wUrZM5M_sNzvK3ReDpCDUI9VnQa8ogLDl8doP_YtRrE7TZB22tq_dvnpHMMflKzAmHuyjGkCPln7He0PERCT5Gfbl60wKtxLbo_1NJjLBXY8gRkqazqoGdLigSoNETCQADjPh_6tB2iuqWgT8wdW56FcW6hcVxVgHMbH2Ax1qKzQIuVt1OSeCzFXA-quLUcft_rPwZt0uZa6tZPeP0BfTwXW8fodID-Ke_A6-CXeEa1EghaQxKAiSCNTydLqQyZEbgfdwm3vh_mtgW39YTgx9yOGtkPqBddEYoKaBO-bFC3TO_2VUwXgYWfBzCxfcch8ZSRbn9BzB3qVV-27FQFuBBtz4z5oILPUcKxgwddALuoorNlhOlVjtZw74jPNBLBDfq9PoqpE5GIQ2Ruf5uIcYezT3ZtLUrjU99bU9KJ9bcfwbXoomupJzJbbQlAAjc0pIIUiYwL9DnrI0uuRv-bdYgNiEvHByxc0Z1W6IBzgR7oDZ7Bmco4HNuKAiD017g=s800-no");
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