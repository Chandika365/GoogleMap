package lk.nibm.googlemap

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.gms.maps.OnMapReadyCallback
import androidx.fragment.app.FragmentActivity
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.SupportMapFragment
import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.MarkerOptions
import com.google.android.gms.maps.CameraUpdateFactory

class MapsActivity : FragmentActivity(), OnMapReadyCallback {

    private lateinit var gMap: GoogleMap
    private lateinit var map: SupportMapFragment

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_maps)

        map = supportFragmentManager.findFragmentById(R.id.map) as SupportMapFragment
        map.getMapAsync(this)
    }

    override fun onMapReady(googleMap: GoogleMap) {
        gMap = googleMap

        val mapSriLanka = LatLng(7.8731, 80.7718) // Replace with actual coordinates
        gMap.addMarker(MarkerOptions().position(mapSriLanka).title("Marker in Sri Lanka"))
        gMap.moveCamera(CameraUpdateFactory.newLatLng(mapSriLanka))
    }
}
