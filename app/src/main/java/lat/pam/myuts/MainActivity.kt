package lat.pam.myuts

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import androidx.activity.result.contract.ActivityResultContracts

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnSubmit =findViewById<Button>(R.id.button_submit)

        btnSubmit?.setOnClickListener(View.OnClickListener {
            Log.d("TOMBOL SUBMIT", "Button Clicked")
            val intent = Intent(this, MainActivity2::class.java)

            startActivity(intent)
        })
    }
}