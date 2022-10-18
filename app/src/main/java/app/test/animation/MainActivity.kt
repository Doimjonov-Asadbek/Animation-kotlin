package app.test.animation

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val imageView = findViewById<ImageView>(R.id.imageView)

        imageView.setOnClickListener {

            imageView.animate().apply {
                duration = 1000
                rotationYBy(360f)
            }.withEndAction {
                imageView.animate().apply {
                    duration = 1000
                    rotationYBy(360f)
                }
            }.start()
        }
    }
}