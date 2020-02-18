package com.titanz.titanztech.adapters
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.squareup.picasso.Picasso
import com.titanz.titanztech.R
import com.titanz.titanztech.interfaces.PromocoesListener
import com.titanz.titanztech.models.Promocoes
import de.hdodenhof.circleimageview.CircleImageView

class PromocoesAdapter(private val listaPromocoes: List<Promocoes>, private val promocoesListener: PromocoesListener) : RecyclerView.Adapter<PromocoesAdapter.DetalhePromocoesViewHolder>() {


    override fun onCreateViewHolder(viewGroup: ViewGroup, i: Int): PromocoesAdapter.DetalhePromocoesViewHolder {

        val view = LayoutInflater.from(viewGroup.context).inflate(R.layout.celula_promocoes, viewGroup, false)

        return DetalhePromocoesViewHolder(view)

    }


    override fun onBindViewHolder(detalhePromocoesViewHolder: DetalhePromocoesViewHolder, i: Int) {
        val promocoes = listaPromocoes[i]

        detalhePromocoesViewHolder.setupPromocoes(promocoes)

        detalhePromocoesViewHolder.itemView.setOnClickListener { promocoesListener.onPromocaoClicada(listaPromocoes[i]) }

    }

    override fun getItemCount(): Int {
        return listaPromocoes.size
    }

    inner class DetalhePromocoesViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        private val texNomePromocoesView: TextView

        private val textValorPromocoesView: TextView

        private val circleImagePromocoesView: CircleImageView


        init {

            texNomePromocoesView = itemView.findViewById(R.id.textPromocoesNomeView_id)
            textValorPromocoesView = itemView.findViewById(R.id.textValorPromocoesView_id)
            circleImagePromocoesView = itemView.findViewById(R.id.promocoes_imageView_id)


        }

        fun setupPromocoes(promocoes: Promocoes) {

            textValorPromocoesView.text = promocoes.valor
            texNomePromocoesView.text = promocoes.nome
            Picasso.get().load("https://i.ibb.co/NsJs4Qv/titanz-logo.png").into(circleImagePromocoesView)

        }

    }

}
