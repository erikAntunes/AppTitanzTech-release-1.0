package com.titanz.titanztech.view
import android.content.Intent
import android.content.pm.PackageManager
import android.net.Uri
import android.os.Bundle
import android.os.Handler
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.titanz.titanztech.R
import cn.pedant.SweetAlert.SweetAlertDialog

class FragmentContato : Fragment() {

    private var whatsappButton: ImageView? = null
    private var localizacaoButton: ImageView? = null

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        val view = inflater.inflate(R.layout.contato_fragment, container, false)

        view.setBackgroundColor(resources.getColor(android.R.color.background_dark))

        localizacaoButton = view.findViewById(R.id.localizacao_imageView_id)
        localizacaoButton!!.setOnClickListener {

            Toast.makeText(context, "Em Breve =D", Toast.LENGTH_SHORT).show()
            //val intent = Intent(context, MapsActivity::class.java)
            //startActivity(intent)
        }

        whatsappButton = view.findViewById(R.id.titanz_whatsapp_button_id)

        whatsappButton!!.setOnClickListener { irParaTitanz() }


        return view
    }

    fun irParaTitanz() {

        val titanz = "+55 11986661870" // use country code with your phone number
        val url = "https://api.whatsapp.com/send?phone=$titanz"
        try {
            val pm = context!!.packageManager
            pm.getPackageInfo("com.whatsapp", PackageManager.GET_ACTIVITIES)
            val i = Intent(Intent.ACTION_VIEW)
            i.data = Uri.parse(url)
            startActivity(i)

            val pDialog = SweetAlertDialog(context!!, SweetAlertDialog.PROGRESS_TYPE)
            pDialog.progressHelper.barColor = R.color.colorPrimary
            pDialog.titleText = "Carregando ..."

            pDialog.setCancelable(true)

            pDialog.show()
            val handler = Handler()
            handler.postDelayed({ pDialog.dismiss() }, 500)
        } catch (e: PackageManager.NameNotFoundException) {
            Toast.makeText(context, "... poxa o Whatsapp não está instalado!!!", Toast.LENGTH_SHORT).show()
            e.printStackTrace()
        }

    }

}
