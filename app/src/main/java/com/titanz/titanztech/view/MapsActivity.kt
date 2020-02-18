package com.titanz.titanztech.view
import androidx.fragment.app.FragmentActivity
import android.os.Bundle
import android.os.Handler
import com.google.android.gms.maps.CameraUpdateFactory
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.OnMapReadyCallback
import com.google.android.gms.maps.SupportMapFragment
import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.MarkerOptions
import com.titanz.titanztech.R
import cn.pedant.SweetAlert.SweetAlertDialog

class MapsActivity : FragmentActivity(), OnMapReadyCallback {

    private var mMap: GoogleMap? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_maps)
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        val mapFragment = supportFragmentManager
                .findFragmentById(R.id.map) as SupportMapFragment?
        mapFragment!!.getMapAsync(this)

        val pDialog = SweetAlertDialog(this, SweetAlertDialog.PROGRESS_TYPE)
        pDialog.progressHelper.barColor = R.color.colorPrimary
        pDialog.titleText = "Carregando ..."

        pDialog.setCancelable(true)

        pDialog.show()
        val handler = Handler()
        handler.postDelayed({ pDialog.dismiss() }, 2500)

    }


    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    override fun onMapReady(googleMap: GoogleMap) {
        mMap = googleMap

        // Add a marker in Sydney and move the camera
        val titanz = LatLng(-23.68173816, -46.65033102)
        mMap!!.addMarker(MarkerOptions().position(titanz).title("Titanz Tech"))
        mMap!!.moveCamera(CameraUpdateFactory.newLatLng(titanz))

        val update = CameraUpdateFactory.newLatLngZoom(titanz, 16f)
        mMap!!.animateCamera(update)
    }

}
