package br.com.ia.mededuc

import android.app.Application
import io.paperdb.Paper

/**
 * Created by fernandodelima on 09/12/17.
 */
class MededucApplication : Application() {

    override fun onCreate() {
        super.onCreate()
        Paper.init(this)
    }

}