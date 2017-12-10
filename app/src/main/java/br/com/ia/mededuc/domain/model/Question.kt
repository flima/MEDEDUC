package br.com.ia.mededuc.domain.model

import java.io.Serializable

/**
 * Created by fernandodelima on 26/11/17.
 */
data class Question(val type: Type, val level: Int, val text: String?, val image: String?, val audio: String?, val options: Array<String>,
                    val rightOption: Int, val textWrongOption: String?, val imageWrongOption: String?, val audioWrongOption: String?) : Serializable {

    enum class Type {
        TEXT, AUDIO
    }

}