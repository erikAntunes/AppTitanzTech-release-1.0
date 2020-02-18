package com.titanz.titanztech.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.squareup.picasso.Picasso
import com.titanz.titanztech.R
import com.titanz.titanztech.interfaces.ServicosListener
import com.titanz.titanztech.models.Servicos
import de.hdodenhof.circleimageview.CircleImageView

class ServicosAdapter(private val listaServicos: List<Servicos>, private val servicosListener: ServicosListener) : RecyclerView.Adapter<ServicosAdapter.DetalheServicosViewHolder>() {


    override fun onCreateViewHolder(viewGroup: ViewGroup, i: Int): ServicosAdapter.DetalheServicosViewHolder {

        val view = LayoutInflater.from(viewGroup.context).inflate(R.layout.celula_servicos, viewGroup, false)

        return DetalheServicosViewHolder(view)
    }


    override fun onBindViewHolder(detalheServicosViewHolder: DetalheServicosViewHolder, i: Int) {
        val servicos = listaServicos[i]

        detalheServicosViewHolder.setupServicos(servicos)

        detalheServicosViewHolder.itemView.setOnClickListener { servicosListener.onServicoClicado(listaServicos[i]) }

    }

    override fun getItemCount(): Int {
        return listaServicos.size
    }

    inner class DetalheServicosViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        private val textDescricaoServicosView: TextView

        private val textIdServicosView: TextView

        private val servicosImageView: CircleImageView

        init {

            textDescricaoServicosView = itemView.findViewById(R.id.textDescricaoServicosView_id)
            textIdServicosView = itemView.findViewById(R.id.servicos_textView_id_id)
            servicosImageView = itemView.findViewById(R.id.servicos_imageView_id)
        }

        fun setupServicos(servicos: Servicos) {

            textDescricaoServicosView.text = servicos.nome
            textIdServicosView.text = servicos.id
            Picasso.get().load(servicos.imagem).into(servicosImageView)
        }

    }

}
