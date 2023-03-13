package com.wpigg.whichpictureisgone

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    val shufflePctHide = listOf<Int>(4,1,2,3)
    val btnHide = mutableListOf<ImageView>()
  //  val btnChoose = mutableListOf<ImageView>()
    var pictHide = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buttonStartPictHide = findViewById<Button>(R.id.buttonStartPictHide)
        val textViewWhatNeedToDo = findViewById<TextView>(R.id.textViewWhatNeedToDo)
        val textPig = findViewById<TextView>(R.id.textView6)
        val textBird = findViewById<TextView>(R.id.textView5)
        val textHedgehog = findViewById<TextView>(R.id.textView9)
        val textFish = findViewById<TextView>(R.id.textView4)

        btnHide.add(findViewById<ImageView>(R.id.imageViewWhichHide1))
        btnHide.add(findViewById<ImageView>(R.id.imageViewWhichHide2))
        btnHide.add(findViewById<ImageView>(R.id.imageViewWhichHide3))
        btnHide.add(findViewById<ImageView>(R.id.imageViewWhichHide4))
/*
        btnChoose.add(findViewById<ImageView>(R.id.imageViewWhichChoose1))
        btnChoose.add(findViewById<ImageView>(R.id.imageViewWhichChoose2))
        btnChoose.add(findViewById<ImageView>(R.id.imageViewWhichChoose3))
        btnChoose.add(findViewById<ImageView>(R.id.imageViewWhichChoose4))
*/
        btnHide[0].setImageResource(R.drawable.for_pictures_in_memory_4)
        btnHide[1].setImageResource(R.drawable.for_pictures_in_memory_1)
        btnHide[2].setImageResource(R.drawable.for_pictures_in_memory_2)
        btnHide[3].setImageResource(R.drawable.for_pictures_in_memory_3)

    /*    btnChoose[0].setImageResource(R.drawable.for_pictures_in_memory_1)
        btnChoose[1].setImageResource(R.drawable.for_pictures_in_memory_2)
        btnChoose[2].setImageResource(R.drawable.for_pictures_in_memory_3)
        btnChoose[3].setImageResource(R.drawable.for_pictures_in_memory_4)
*/


        buttonStartPictHide.setOnClickListener {
            var numPictHide = (0..3).random()
            btnHide[numPictHide].setImageResource(R.drawable.ic_launcher_foreground)
            pictHide = shufflePctHide[numPictHide]
        }
        textPig.setOnClickListener {
            if (pictHide == 1) textViewWhatNeedToDo.text = "You have a good memory!"
            pictHide = 0
        }
        textBird.setOnClickListener {
            if (pictHide == 2) textViewWhatNeedToDo.text = "You have a good memory!"
            pictHide = 0
        }
        textHedgehog.setOnClickListener {
            if (pictHide == 3) textViewWhatNeedToDo.text = "You have a good memory!"
            pictHide = 0
        }
        textFish.setOnClickListener {
            if (pictHide == 4) textViewWhatNeedToDo.text = "You have a good memory!"
            pictHide = 0
        }


    }

}