package com.titanz.titanztech.view
import androidx.appcompat.app.AppCompatActivity
import android.content.Intent
import android.content.pm.PackageManager
import android.net.Uri
import android.os.Bundle
import android.os.Handler
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import com.squareup.picasso.Picasso
import com.titanz.titanztech.R
import com.titanz.titanztech.models.Promocoes
import cn.pedant.SweetAlert.SweetAlertDialog
import de.hdodenhof.circleimageview.CircleImageView

class DetalhesPromocoesActivity : AppCompatActivity() {

    private var detalhePromocoesImageView: CircleImageView? = null
    private var detalhePromocoesTextView: TextView? = null
    private var nomeDetalhePromocoesTextView: TextView? = null
    private var precoDetalhesPromocoesTextView: TextView? = null
    private var whatsappButton: ImageView? = null
    private var homeButtonServicos: ImageView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detalhes_promocoes)
        supportActionBar!!.hide()

        val pDialog = SweetAlertDialog(this, SweetAlertDialog.PROGRESS_TYPE)
        pDialog.progressHelper.barColor = R.color.colorPrimary
        pDialog.titleText = "Carregando ..."

        pDialog.setCancelable(true)

        pDialog.show()
        val handler = Handler()
        handler.postDelayed({ pDialog.dismiss() }, 1000)

        whatsappButton = findViewById(R.id.whatsapp_button_promocoes_imageView)
        whatsappButton!!.setOnClickListener { irParaTitanz() }

        homeButtonServicos = findViewById(R.id.home_button_promocoes_imageView)
        homeButtonServicos!!.setOnClickListener { irParaHome() }

        detalhePromocoesImageView = findViewById(R.id.detalhes_promocoes_circleImageView)
        detalhePromocoesTextView = findViewById(R.id.detalhes_promocoes_textView)
        nomeDetalhePromocoesTextView = findViewById(R.id.nome_detalhes_promocoes_textView)
        precoDetalhesPromocoesTextView = findViewById(R.id.preco_detalhes_promocoes_textView)

        val intent = intent

        val bundle = intent.extras

        val promocao = bundle!!.getSerializable("PROMOCOES") as Promocoes?

        nomeDetalhePromocoesTextView!!.text = promocao!!.nome
        detalhePromocoesTextView!!.text = promocao.descricao
        nomeDetalhePromocoesTextView!!.text = promocao.nome
        Picasso.get().load(promocao.imagem).into(detalhePromocoesImageView)
        precoDetalhesPromocoesTextView!!.text = promocao.valor
    }

    private fun irParaHome() {

        onBackPressed()
    }

    fun irParaTitanz() {

        val titanz = "+55 11986661870" // use country code with your phone number
        val url = "https://api.whatsapp.com/send?phone=$titanz"
        try {
            val pm = this.packageManager
            pm.getPackageInfo("com.whatsapp", PackageManager.GET_ACTIVITIES)
            val i = Intent(Intent.ACTION_VIEW)
            i.data = Uri.parse(url)
            startActivity(i)

            val pDialog = SweetAlertDialog(this, SweetAlertDialog.PROGRESS_TYPE)
            pDialog.progressHelper.barColor = R.color.colorPrimary
            pDialog.titleText = "Carregando ..."

            pDialog.setCancelable(true)

            pDialog.show()
            val handler = Handler()
            handler.postDelayed({ pDialog.dismiss() }, 500)
        } catch (e: PackageManager.NameNotFoundException) {
            Toast.makeText(this, "... poxa o Whatsapp não está instalado!!!", Toast.LENGTH_SHORT).show()
            e.printStackTrace()
        }

    }

}
