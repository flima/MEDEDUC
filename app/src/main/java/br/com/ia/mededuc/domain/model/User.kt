package br.com.ia.mededuc.domain.model

/**
 * Created by fernandodelima on 26/11/17.
 */
data class User(var level: Level = Level.LEVELING, var isReinforcement: Boolean = false) {

    enum class Level(val valueLevel: Int) {
        LEVELING(0), ONE(1), TWO(2), THREE(3), FOUR(4), FIVE(5), FINISH(6)
    }

    fun goToNextLevel() {
        val nextLevel = level.valueLevel + 1;
        if (Level.values().size > nextLevel) {
            this.level = Level.values()[nextLevel]
        }
    }

    fun putInReinforcement() {
        this.isReinforcement = true
    }

}
