package com.tinf18b2.cardgame.view.activity

import android.os.Build
import android.os.Bundle
import android.view.MotionEvent
import android.widget.ImageView
import android.widget.RelativeLayout
import androidx.annotation.RequiresApi
import androidx.appcompat.app.AppCompatActivity
import com.tinf18b2.cardgame.R
import com.tinf18b2.cardgame.model.cards.skat.SkatCard

@RequiresApi(Build.VERSION_CODES.LOLLIPOP)
class GameActivity : AppCompatActivity() {

    var lp =
        RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.WRAP_CONTENT, RelativeLayout.LayoutParams.WRAP_CONTENT)
    var images = ArrayList<ImageView>()
    var targetFrames = ArrayList<ImageView>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.test_game_ui)

        val handCardSpredingGrade = 120
        // Initialize a new ImageView widget
        // val images.get(0) = ImageView(applicationContext)

        var handCarts = ArrayList<SkatCard>()
        // Create layout parameters for ImageView

        handCarts.add(SkatCard.CLUBS_ACE)
        handCarts.add(SkatCard.SPADES_ACE)
        handCarts.add(SkatCard.HEARTS_ACE)
        handCarts.add(SkatCard.DIAMONDS_ACE)

        targetFrames(2)
        createHandcards(4, handCarts)
    }

    fun createHandcards(numberOfHandCards: Int, handCarts: ArrayList<SkatCard>) {
        var rl = findViewById<RelativeLayout>(R.id.rl)

        var targetFrames = ArrayList<ImageView>()

        for (i in 0 until numberOfHandCards) {
            images.add(ImageView(applicationContext))
            // Set an image for ImageView
            images[i].setImageDrawable(getDrawable(handCarts[i].resourceID))
            // Add layout parameters to ImageView
            images[i].layoutParams = this.lp
            // Apply the new height for ImageView programmatically
            images[i].layoutParams.height = 150
            // Apply the new width for ImageView programmatically
            images[i].layoutParams.width = 100

            images[i].layoutParams

            images[i].x = 500F + i * 110
            images[i].y = 800F

            images[i].setOnTouchListener { v, event ->
                var p = true
                if (event.action == MotionEvent.ACTION_MOVE) {

                    v.y = event.rawY - v.height / 2
                    v.x = event.rawX - v.width / 2

                    if (v.y > 900F) {
                        v.y = 900F
                    }
                    if (v.y < 0F) {
                        v.y = 0F
                    }
                    if (v.x < 0F) {
                        v.x = 0F
                    }
                    if (v.x > 1500) {
                        v.x = 1500F
                    }
                    for (z in 0 until targetFrames.size) {
                        if ((targetFrames[z].x == v.x) && (targetFrames[z].y == v.y)) {
                            p = false
                        }
                    }
                }
                return@setOnTouchListener p
            }
            // images.get(0).setRotation(450F)

            rl.addView(images[i])
        }
    }

    fun targetFrames(numberOfTargets: Int) {

        val rl = findViewById<RelativeLayout>(R.id.rl)
        for (i in 0 until numberOfTargets) {
            // Finally, add the ImageView to layout
            targetFrames.add(ImageView(applicationContext))
            // Set an image for ImageView
            targetFrames[i].setImageDrawable(getDrawable(R.drawable.target_frame))
            // Add layout parameters to ImageView
            targetFrames[i].layoutParams = lp
            // Apply the new height for ImageView programmatically
            targetFrames[i].layoutParams.height = 150
            // Apply the new width for ImageView programmatically
            targetFrames[i].layoutParams.width = 100

            targetFrames[i].layoutParams

            targetFrames[i].x = 1000F + 150 * i
            targetFrames[i].y = 100F


            rl.addView(targetFrames[i])
        }
    }
}
