package br.com.ia.mededuc.utils

import android.content.Context
import android.util.DisplayMetrics


/**
 * Created by fernandodelima on 10/12/17.
 */
class UnitUtils {

    companion object {
        fun convertDpToPx(context: Context, dp: Int): Int {
            val displayMetrics = context.resources.displayMetrics
            return Math.round((dp * (displayMetrics.densityDpi / DisplayMetrics.DENSITY_DEFAULT)).toFloat())
        }

        fun convertPxToDp(context: Context, px: Int): Int {
            val displayMetrics = context.resources.displayMetrics
            return Math.round((px / (displayMetrics.densityDpi / DisplayMetrics.DENSITY_DEFAULT)).toFloat())
        }
    }

}