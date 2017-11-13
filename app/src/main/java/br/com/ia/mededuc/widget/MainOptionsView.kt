package br.com.ia.mededuc.widget

import android.content.Context
import android.util.AttributeSet
import android.view.View
import android.widget.FrameLayout
import br.com.ia.mededuc.R

/**
 * Created by fernandodelima on 26/10/17.
 */
class MainOptionsView @JvmOverloads
        constructor(context: Context, attrs: AttributeSet? = null, defStyle: Int = 0) :
        FrameLayout(context, attrs, defStyle) {

    init {
        inflate(context, R.layout.view_main_options, this)
    }

}