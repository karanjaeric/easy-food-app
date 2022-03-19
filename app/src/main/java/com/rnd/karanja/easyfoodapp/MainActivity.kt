package com.rnd.karanja.easyfoodapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.Navigation
import androidx.navigation.ui.NavigationUI
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //inflate bottom navigation
        val bottomNavigation=findViewById<BottomNavigationView>(R.id.bottom_navigation)
        //inflate navigation controller
        val navigationController= Navigation.findNavController(this,R.id.nav_host_fragment_container);
        //setup navigation controller with bottom navigation
        NavigationUI.setupWithNavController(bottomNavigation,navigationController);

    }
}