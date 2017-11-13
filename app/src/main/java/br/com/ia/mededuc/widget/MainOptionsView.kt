package br.com.ia.mededuc.widget

import android.content.Context
import android.content.Intent
import android.support.v4.content.ContextCompat.startActivity
import android.util.AttributeSet
import android.widget.FrameLayout
import br.com.ia.mededuc.R
import br.com.ia.mededuc.activity.HomeActivity
import br.com.ia.mededuc.activity.QuizActivity
import org.jetbrains.anko.startActivity
import kotlinx.android.synthetic.main.view_main_options.view.*

/**
 * Created by fernandodelima on 26/10/17.
 */
class MainOptionsView @JvmOverloads
        constructor(context: Context, attrs: AttributeSet? = null, defStyle: Int = 0) :
        FrameLayout(context, attrs, defStyle) {

    init {
        inflate(context, R.layout.view_main_options, this)
        initView();
    }

    private fun initView() {
        main_options_view_btn_leveling.setOnClickListener {
            context.startActivity(Intent(context, QuizActivity::class.java))
        }
    }

}