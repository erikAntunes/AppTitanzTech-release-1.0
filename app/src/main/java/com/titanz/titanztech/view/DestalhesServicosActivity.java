package com.titanz.titanztech.view;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.widget.TextView;

import com.squareup.picasso.Picasso;
import com.titanz.titanztech.R;
import com.titanz.titanztech.models.Servicos;

import cn.pedant.SweetAlert.SweetAlertDialog;
import de.hdodenhof.circleimageview.CircleImageView;

public class DestalhesServicosActivity extends AppCompatActivity {

    private CircleImageView servicoImageView;
    private TextView detalheServicoTextView;
    private TextView nomeDetalheServicoTextViewm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_destalhes_servicos);
        getSupportActionBar().hide();

        final SweetAlertDialog pDialog = new SweetAlertDialog(this, SweetAlertDialog.PROGRESS_TYPE);
        pDialog.getProgressHelper().setBarColor(R.color.colorPrimary);
        pDialog.setTitleText("Carregando ...");

        pDialog.setCancelable(true);

        pDialog.show();
        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                pDialog.dismiss();
            }
        },1000);

        servicoImageView = findViewById(R.id.detalhes_servicos_circleImageView);
        detalheServicoTextView = findViewById(R.id.detalhes_servico_textView);
        nomeDetalheServicoTextViewm = findViewById(R.id.nome_detalhes_servico_textView);

        Intent intent = getIntent();

        Bundle bundle = intent.getExtras();

        Servicos servico = (Servicos) bundle.getSerializable("SERVICOS");

        nomeDetalheServicoTextViewm.setText(servico.getNome());
        detalheServicoTextView.setText(servico.getDescricao());
        Picasso.get().load(servico.getImagem()).into(servicoImageView);

    }
}
