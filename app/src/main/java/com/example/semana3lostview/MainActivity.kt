package com.example.semana3lostview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ArrayAdapter
import android.widget.ListAdapter
import android.widget.ListView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    var arrSO = arrayOf(
        "Android","iphone","Windows Phone", "Blackberry","Firefox OS","Amazon World", "Nokia"
    )
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val lsvSistemasOperativos: ListView = findViewById<View>(R.id.LsvSO)as ListView

        val adaptador:Any? =
                ArrayAdapter<Any?>(this,android.R.layout.simple_list_item_1,arrSO)
        lsvSistemasOperativos.adapter = adaptador as ListAdapter?

        lsvSistemasOperativos.setOnItemClickListener{ parent, view,position,id->
            println("Aqui mostrare un mensaje al usuario")
            Toast.makeText(
                applicationContext,
                "La Posición seleccionada es: $position",
                Toast.LENGTH_SHORT
            ).show()

        }

    }
}