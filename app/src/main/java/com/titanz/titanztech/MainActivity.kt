package com.titanz.titanztech
import androidx.appcompat.app.AppCompatActivity
import androidx.viewpager.widget.ViewPager
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.os.Build
import android.os.Bundle
import android.os.Handler
import android.view.WindowManager
import com.google.android.material.tabs.TabLayout
import com.titanz.titanztech.adapters.ViewPagerAdapter
import com.titanz.titanztech.view.FragmentServicos
import com.titanz.titanztech.view.FragmentPromocoes
import com.titanz.titanztech.view.FragmentContato
import cn.pedant.SweetAlert.SweetAlertDialog

class MainActivity : AppCompatActivity() {

    private var tabLayout: TabLayout? = null
    private var viewPager: ViewPager? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportActionBar!!.hide()


        tabLayout = findViewById(R.id.tablayout_main_id)
        viewPager = findViewById(R.id.viewpager_main_id)

        val bar = supportActionBar
        bar!!.setBackgroundDrawable(ColorDrawable(Color.parseColor("#000000")))


        //Adicionando Fragments

        val adapter = ViewPagerAdapter(supportFragmentManager)
        adapter.AddFragment(FragmentServicos(), "Serviços")
        adapter.AddFragment(FragmentPromocoes(), "Promoções")
        adapter.AddFragment(FragmentContato(), "Contato")

        viewPager!!.adapter = adapter
        tabLayout!!.setupWithViewPager(viewPager)

        changeStatusBarColor("#000000")

        val pDialog = SweetAlertDialog(this, SweetAlertDialog.PROGRESS_TYPE)
        pDialog.progressHelper.barColor = R.color.colorPrimary
        pDialog.titleText = "Carregando ..."

        pDialog.setCancelable(true)

        pDialog.show()
        val handler = Handler()
        handler.postDelayed({ pDialog.dismiss() }, 2000)


    }

    private fun changeStatusBarColor(color: String) {
        if (Build.VERSION.SDK_INT >= 21) {
            val window = window
            window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS)
            window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS)
            window.statusBarColor = Color.parseColor(color)
        }
    }
}
