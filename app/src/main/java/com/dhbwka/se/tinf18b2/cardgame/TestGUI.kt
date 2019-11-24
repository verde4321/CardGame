package com.dhbwka.se.tinf18b2.cardgame

import android.os.Build
import android.os.Bundle
import android.widget.ImageView
import android.widget.RelativeLayout
import androidx.annotation.RequiresApi
import androidx.appcompat.app.AppCompatActivity




class TestGUI : AppCompatActivity() {

    @RequiresApi(Build.VERSION_CODES.LOLLIPOP)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.test_game_ui)

        val  rl =  findViewById<RelativeLayout>(R.id.rl)

        // Initialize a new ImageView widget
       // val images.get(0) = ImageView(applicationContext)
        var images = ArrayList<ImageView>()
        var handCarts = ArrayList<SkatDeck>()
        // Create layout parameters for ImageView
        val lp = RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.WRAP_CONTENT, RelativeLayout.LayoutParams.WRAP_CONTENT)


        fun crateHandcards (numberOfHandCards:Int, handCards:ArrayList<SkatDeck>){
            var i=0
            while (numberOfHandCards>i){
                images.add(ImageView(applicationContext))
                images[i].setImageDrawable(getDrawable(handCards[i].path))
                i+1
            }
        }




        // Set an image for ImageView
        images.get(0).setImageDrawable(getDrawable(R.drawable.ace_of_clubs))







        // Add layout parameters to ImageView
        images.get(0).setLayoutParams(lp)

        // Apply the new height for ImageView programmatically
        images.get(0).getLayoutParams().height = 150
        // Apply the new width for ImageView programmatically
        images.get(0).getLayoutParams().width = 100

        images.get(0).getLayoutParams()

        images.get(0).setX(600F)
        images.get(0).setY(800F)
        images.get(0).setRotation(450F)

        // Finally, add the ImageView to layout
        rl.addView(images.get(0))


    }

}
