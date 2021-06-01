package com.example.semat_app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.filmapp.BaseActivity


class MainActivity : BaseActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        if (savedInstanceState == null) {
            val fragment = ProjectOverviewFragment()
            supportFragmentManager.beginTransaction()
                    .replace(R.id.mainContainer, fragment, fragment::class.java.canonicalName)
                    .commitAllowingStateLoss()
        }
    }
}