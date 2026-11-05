package com.showdeluces.app

import android.app.Activity
import android.os.Bundle
import android.widget.TextView

class MainActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val pantalla = TextView(this).apply {
            text = "SHOW DE LUCES\n\nAplicación iniciada correctamente"
            textSize = 24f
            setTextColor(android.graphics.Color.WHITE)
            setBackgroundColor(android.graphics.Color.BLACK)
            gravity = android.view.Gravity.CENTER
        }

        setContentView(pantalla)
    }
}
