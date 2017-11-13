package br.com.ia.mededuc.widget

import android.content.Context
import android.util.AttributeSet
import android.widget.FrameLayout
import android.widget.LinearLayout
import br.com.ia.mededuc.R

/**
 * Created by fernandodelima on 13/11/17.
 */
class QuestionView @JvmOverloads constructor(context: Context, attrs: AttributeSet? = null, defStyle: Int = 0) :
        LinearLayout(context, attrs, defStyle) {

    init {
        FrameLayout.inflate(context, R.layout.view_question, this)
    }

}