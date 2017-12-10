package br.com.ia.mededuc.domain.model

import java.io.Serializable

/**
 * Created by fernandodelima on 26/11/17.
 */
data class Quiz(val totalNumberQuestionsToShow: Int, val levelInfo: Array<LevelInfo>, val questions: Array<Question>) : Serializable