package br.com.ia.mededuc.extensions

import android.app.Activity
import android.support.annotation.IdRes
import android.view.View

/**
 * Created by fernandodelima on 26/10/17.
 */
fun <T : View> View.bind(@IdRes idRes: Int): Lazy<T> {
    return unsafeLazy { findViewById<T>(idRes) }
}

private fun <T> unsafeLazy(initializer: () -> T) = lazy(LazyThreadSafetyMode.NONE, initializer)