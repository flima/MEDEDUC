package br.com.ia.mededuc.domain.model

import java.io.Serializable

/**
 * Created by fernandodelima on 27/11/17.
 */
data class Answer(val optionSelected: Int, val question: Question) : Serializable {

    fun isRight(): Boolean {
        return optionSelected == question.rightOption
    }

}