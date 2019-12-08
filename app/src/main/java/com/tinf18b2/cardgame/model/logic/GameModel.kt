package com.tinf18b2.cardgame.model.logic

import com.tinf18b2.cardgame.model.display.ControllerBase
import com.tinf18b2.cardgame.view.activity.NewGameActivity

object GameModel {

    var activity: NewGameActivity? = null
        private set
    var controller: ControllerBase? = null
        private set

    fun changeActiveActivity(active: NewGameActivity?) {
        val old = activity
        activity = active
        controller?.changeActivity(old, active)
    }

    /** caller needs to ensure a new NewGameActivity is opened after this call */
    fun changeController(new: ControllerBase) {
        controller?.stopGame()
        activity?.close()
        activity = null
        controller = new
    }
}
