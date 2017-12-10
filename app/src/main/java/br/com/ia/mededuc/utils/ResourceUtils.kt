package br.com.ia.mededuc.utils

import android.util.Log
import br.com.ia.mededuc.R

/**
 * Created by fernandodelima on 26/11/17.
 */
object ResourceUtils {

    fun getResourceDrawableIdByName(resourceName: String): Int {
        try {
            val res = R.drawable::class.java
            return res.getField(resourceName).getInt(null)
        } catch (e: Exception) {
            Log.e("MyTag", "Failure to get drawable id.", e)
            return 0
        }

    }

}