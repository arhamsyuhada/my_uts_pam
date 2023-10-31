package lat.pam.myuts

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val btnSeeMenus = findViewById<Button>(R.id.button_see_menus)

        btnSeeMenus?.setOnClickListener(View.OnClickListener {
            Log.d("TOMBOL SEE MENUS", "BUTTON CLICKED!!")
            val intent = Intent(this, MainActivity3::class.java)

            startActivity(intent)
        })
    }
}