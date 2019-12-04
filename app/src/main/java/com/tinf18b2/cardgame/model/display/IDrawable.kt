package com.tinf18b2.cardgame.model.display

import androidx.annotation.DrawableRes

interface IDrawable {

    // ResourceID of the Image to use
    @get:DrawableRes
    val resourceID: Int;

    // Position of the Drawable on Screen
    // TODO
//    var positionX: Int;
//    var positionY: Int;

}
