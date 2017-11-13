package br.com.ia.mededuc.widget

import android.content.Context
import android.support.v4.content.ContextCompat
import android.util.AttributeSet
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.FrameLayout
import android.widget.LinearLayout
import br.com.ia.mededuc.R
import br.com.ia.mededuc.extensions.bind
import org.jetbrains.anko.dimen

/**
 * Created by fernandodelima on 26/10/17.
 */
class ScoreView @JvmOverloads
constructor(context: Context, attrs: AttributeSet? = null, defStyle: Int = 0) :
        FrameLayout(context, attrs, defStyle) {

    private val containerStatus: LinearLayout by bind(R.id.score_container_status)
    private val btnCurrentStatus: Button by bind(R.id.score_btn_current_level)

    init {
        inflate(context, R.layout.view_score, this)
        initScore()
    }

    private fun initScore() {
        containerStatus.removeAllViews()
        for (i in 1..10) {
            var height = context.dimen(R.dimen.score_height_status)
            var layout = LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, height)
            layout.bottomMargin = context.dimen(R.dimen.margin_micro)
            var status = View(context)
            status.layoutParams = layout
            status.setBackgroundResource(R.color.score_status_default)
            containerStatus.addView(status)
        }
    }

}