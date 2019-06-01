package com.example.commom_android

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.commons_android.R

/**
 *
 *
 * @author Rafael Pereira Ramos on 01/06/19
 */

open class AppActivity : AppCompatActivity() {

    //private val navHostFragment = findNavController(R.id.n)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_app)
    }
}