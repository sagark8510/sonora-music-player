package com.sonora.musicplayer

import android.app.Activity
import android.os.Bundle
import android.graphics.Color
import android.view.Gravity
import android.view.ViewGroup
import android.widget.LinearLayout
import android.widget.TextView

class MainActivity : Activity() {

private val backgroundColor = Color.rgb(15, 17, 25)
private val accentColor = Color.rgb(133, 105, 255)
private val textColor = Color.WHITE

override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)

    val root = LinearLayout(this).apply {
        orientation = LinearLayout.VERTICAL
        setPadding(24, 32, 24, 24)
        setBackgroundColor(backgroundColor)
    }

    val title = TextView(this).apply {
        text = "SONORA"
        textSize = 30f
        setTextColor(textColor)
        gravity = Gravity.CENTER_VERTICAL
    }

    val subtitle = TextView(this).apply {
        text = "YOUR MUSIC, YOUR WORLD"
        textSize = 12f
        setTextColor(accentColor)
        setPadding(0, 8, 0, 32)
    }

    val heading = TextView(this).apply {
        text = "Your Library"
        textSize = 22f
        setTextColor(textColor)
    }

    val emptyMessage = TextView(this).apply {
        text = "Your music collection starts here.\n\nImport your audio files to begin listening offline."
        textSize = 15f
        setTextColor(Color.LTGRAY)
        gravity = Gravity.CENTER
        setPadding(16, 48, 16, 48)
    }

    val player = TextView(this).apply {
        text = "♫     Nothing playing yet"
        textSize = 16f
        setTextColor(textColor)
        gravity = Gravity.CENTER
        setPadding(16, 20, 16, 20)
        setBackgroundColor(Color.rgb(32, 34, 47))
    }

    root.addView(title)
    root.addView(subtitle)
    root.addView(heading)
    root.addView(
        emptyMessage,
        LinearLayout.LayoutParams(
            ViewGroup.LayoutParams.MATCH_PARENT,
            0,
            1f
        )
    )
    root.addView(player)

    setContentView(root)
}

}
