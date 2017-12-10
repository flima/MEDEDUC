package br.com.ia.mededuc.domain.model

/**
 * Created by fernandodelima on 27/11/17.
 */
data class LevelInfo(val level: Int, val numberOfQuestionsToShow: Int, val minimumCorrectAnswers: Int,
                     val startPosition: Int, val endPosition: Int, val equipment: String)