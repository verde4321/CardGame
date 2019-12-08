package com.tinf18b2.cardgame.controller

import android.annotation.SuppressLint
import android.view.MotionEvent
import android.view.View
import android.view.ViewGroup
import android.widget.RelativeLayout
import androidx.core.view.marginLeft
import androidx.core.view.marginTop
import com.tinf18b2.cardgame.model.cards.skat.SkatCard
import com.tinf18b2.cardgame.model.cards.skat.SkatStack
import com.tinf18b2.cardgame.model.display.ControllerBase
import com.tinf18b2.cardgame.model.logic.GameModel
import com.tinf18b2.cardgame.view.activity.NewGameActivity
import com.tinf18b2.cardgame.view.drawers.SkatCardDrawer
import com.tinf18b2.cardgame.view.drawers.SkatStackDrawer
import com.tinf18b2.cardgame.view.game.DrawableView

class TestController : ControllerBase() {

    lateinit var stackView: DrawableView<SkatStack>
    lateinit var stack: SkatStack

    override fun changeActivity(old: NewGameActivity?, new: NewGameActivity?) {
        if (new != null) {
            stackView = DrawableView(new.applicationContext)
            new.layout.addView(stackView)
            stack = SkatStack()
            stackView.initialize(stack, SkatStackDrawer)

            for (card in SkatCard.values()) {
                val view = DrawableView<SkatCard>(new.applicationContext)
                new.layout.addView(view)
                view.initialize(card, SkatCardDrawer)
            }
        }
    }

    private val draggedCards: MutableMap<DrawableView<*>, Snap> = HashMap()
    override fun onTouch(view: DrawableView<*>, event: MotionEvent): Boolean {
        if (view.objct is SkatCard) {
            val snap = draggedCards.computeIfAbsent(view) { Snap() }
            val isUp = event.action and MotionEvent.ACTION_MASK == MotionEvent.ACTION_UP
            if (isUp) {
                draggedCards.remove(view)
            }
            if (isUp &&
                view.marginLeft < stackView.marginLeft + stackView.width &&
                view.marginLeft + view.width > stackView.marginLeft &&
                view.marginTop < stackView.marginTop + stackView.height &&
                view.marginTop + view.height > stackView.marginTop
            ) {
                stack.addCard(view.objct as SkatCard)
                stackView.invalidate()
                view.remove()
            } else {
                snap.onTouch(view, event)
            }
        }
        return true
    }

    override fun getLayoutParams(view: DrawableView<*>): ViewGroup.MarginLayoutParams {
        return when (view.objct) {
            is SkatCard -> {
                createParams(140, 210, 100 + 30 * (view.objct as SkatCard).ordinal, 700)
            }
            is SkatStack -> {
                createParams(140, 210, 500, 100)
            }
            else -> {
                super.getLayoutParams(view)
            }
        }
    }

    override fun stopGame() {

    }


    inner class Snap : View.OnTouchListener {
        private var _xDelta = 0
        private var _yDelta = 0
        private var left = 0
        private var top = 0

        @SuppressLint("ClickableViewAccessibility")
        override fun onTouch(view: View, event: MotionEvent): Boolean {
            val rawX: Int = event.rawX.toInt()
            val rawY: Int = event.rawY.toInt()

            when (event.action and MotionEvent.ACTION_MASK) {
                MotionEvent.ACTION_DOWN -> {
                    // _xDelta and _yDelta record how far inside the view we have touched. These
                    // values are used to compute new margins when the view is moved.
                    _xDelta = rawX - view.left
                    _yDelta = rawY - view.top
                    left = view.marginLeft
                    top = view.marginTop
                }
                MotionEvent.ACTION_MOVE -> {
                    val lp: RelativeLayout.LayoutParams = view.layoutParams as RelativeLayout.LayoutParams
                    val padding = 50
                    lp.leftMargin =
                        (rawX - _xDelta).coerceIn(padding, GameModel.activity!!.layout.width - view.width - padding)
                    lp.topMargin =
                        (rawY - _yDelta).coerceIn(padding, GameModel.activity!!.layout.height - view.height - padding)
                    view.layoutParams = lp
                }
                MotionEvent.ACTION_UP -> {
                    val lp: RelativeLayout.LayoutParams = view.layoutParams as RelativeLayout.LayoutParams
                    lp.leftMargin = left
                    lp.topMargin = top
                    view.layoutParams = lp
                }
            }
            return true
        }
    }
}
