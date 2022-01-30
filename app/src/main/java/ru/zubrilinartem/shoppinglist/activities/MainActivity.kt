package ru.zubrilinartem.shoppinglist.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import ru.zubrilinartem.shoppinglist.R
import ru.zubrilinartem.shoppinglist.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setBottomNavListener()
    }

    private fun setBottomNavListener(){
         binding.bNav.setOnItemSelectedListener {
             when(it.itemId){
                 R.id.settings -> {
                     Log.d("myLog", "settings")
                 }
                 R.id.notes -> {
                      Log.d("myLog", "notes")
                 }
                 R.id.shop_list -> {
                     Log.d("myLog", "shop list")
                 }
                 R.id.new_item -> {
                     Log.d("myLog", "new item")
                 }
             }
             true
         }
    }
}