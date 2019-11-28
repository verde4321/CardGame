package com.example.cardgame

import android.annotation.SuppressLint
import android.os.Build
import android.os.Bundle
import android.view.MotionEvent
import android.widget.ImageView
import android.widget.RelativeLayout
import androidx.annotation.RequiresApi
import androidx.appcompat.app.AppCompatActivity


class TestGUI : AppCompatActivity() {


    var lp = RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.WRAP_CONTENT, RelativeLayout.LayoutParams.WRAP_CONTENT)
    var images = ArrayList<ImageView>()
    var targetFrames = ArrayList<ImageView>()

    @RequiresApi(Build.VERSION_CODES.LOLLIPOP)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.test_game_ui)

        val handCardSpredingGrade = 120
        // Initialize a new ImageView widget
       // val images.get(0) = ImageView(applicationContext)

        var handCarts = ArrayList<skatCartd>()
        // Create layout parameters for ImageView

        handCarts.add(skatCartd.ACE_CLUB)
        handCarts.add(skatCartd.ACE_SPADE)
        handCarts.add(skatCartd.ACE_HEART)
        handCarts.add(skatCartd.ACE_DIAMONDS)

        targetFrames(2)
        createHandcards(4,handCarts)

        }

    @SuppressLint("ClickableViewAccessibility")
    @RequiresApi(Build.VERSION_CODES.LOLLIPOP)
    fun createHandcards (numberOfHandCards:Int, handCarts:ArrayList<skatCartd>){
        var rl =  findViewById<RelativeLayout>(R.id.rl)

        var targetFrames = ArrayList<ImageView>()


        for ( i in 0 until numberOfHandCards){
            images.add(ImageView(applicationContext))
            // Set an image for ImageView
            images.get(i).setImageDrawable(getDrawable(handCarts.get(i).path))
            // Add layout parameters to ImageView
            images.get(i).setLayoutParams(this.lp)
            // Apply the new height for ImageView programmatically
            images.get(i).getLayoutParams().height = 150
            // Apply the new width for ImageView programmatically
            images.get(i).getLayoutParams().width = 100

            images.get(i).getLayoutParams()

            images.get(i).setX(500F+i*110)
            images.get(i).setY(800F)

            images.get(i).setOnTouchListener { v, event ->
                var p=true
                if (event.action == MotionEvent.ACTION_MOVE) {

                    v.y = event.rawY - v.height/2
                    v.x = event.rawX - v.width/2

                    if (v.y>900F){v.y=900F}
                    if (v.y<0F){v.y=0F}
                    if (v.x<0F){v.x=0F}
                    if (v.x>1500){v.x=1500F}
                    for(z in 0 until targetFrames.size){
                        if ((targetFrames.get(z).x== v.x)&&(targetFrames.get(z).y==v.y)){
                           p=false
                        }
                    }
                }
                p
            }
            // images.get(0).setRotation(450F)

            rl.addView(images.get(i))
        }
    }

    @RequiresApi(Build.VERSION_CODES.LOLLIPOP)
    fun targetFrames(numberOfTargets:Int){

        val rl =  findViewById<RelativeLayout>(R.id.rl)
        for (i in 0 until numberOfTargets){
            // Finally, add the ImageView to layout
            targetFrames.add(ImageView(applicationContext))
            // Set an image for ImageView
            targetFrames.get(i).setImageDrawable(getDrawable(R.drawable.target_frame))
            // Add layout parameters to ImageView
            targetFrames.get(i).setLayoutParams(lp)
            // Apply the new height for ImageView programmatically
            targetFrames.get(i).getLayoutParams().height = 150
            // Apply the new width for ImageView programmatically
            targetFrames.get(i).getLayoutParams().width = 100

            targetFrames.get(i).getLayoutParams()

            targetFrames.get(i).setX(1000F+150*i)
            targetFrames.get(i).setY(100F)


            rl.addView(targetFrames.get(i))
        }

    }
}
