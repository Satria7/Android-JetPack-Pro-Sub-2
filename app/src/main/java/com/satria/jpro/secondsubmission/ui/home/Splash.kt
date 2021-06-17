package com.satria.jpro.secondsubmission.ui.home
//copyright satria junanda//
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.satria.jpro.secondsubmission.R

/**
 * Satria Junanda
 */

class Splash : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        object : Thread() {
            override fun run() {
                try {
                    sleep(2000)
                    startActivity(Intent(this@Splash, HomeActivity::class.java))
                    finish()
                } catch (e: InterruptedException) {
                    e.printStackTrace()
                }
            }
        }.start()
    }

}