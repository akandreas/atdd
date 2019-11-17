package de.db.mosaik.timeconversion

import io.cucumber.java.de.Angenommen
import io.cucumber.java.de.Dann
import io.cucumber.java.de.Wenn
import org.junit.Assert.assertEquals

/**
 * The TimeConversionServiceStepDefinitions provides
 */
@Suppress("unused")
class TimeConversionServiceStepDefinitions {

    private var zeitInDeutschland: String? = null
    private var zeitInEngland: PrimitiveTime? = null

    @Angenommen("es ist {} Uhr in Deutschland")
    fun esIstHHmmUhrInDeutschland(zeit: String) {
        zeitInDeutschland = zeit
    }

    @Wenn("der Zugbegleiter nach der Uhrzeit in England gefragt wird")
    fun zubWirdNachderUhrzeitInEnglandGefragt() {
        val germanTime = parsePrimitiveTime(zeitInDeutschland)
        zeitInEngland = TimeConversionService().convertToEnglishTime(germanTime)
    }

    @Dann("ist es {} Uhr in England")
    fun dannIstEsHHmmInEngland(zeit: String) {
        assertEquals(parsePrimitiveTime(zeit), zeitInEngland)
    }

    private fun parsePrimitiveTime(zeit: String?): PrimitiveTime {
        val hoursMinutes = zeit?.split(":")
        val hours = hoursMinutes?.get(0)?.toInt()
        val minutes = hoursMinutes?.get(1)?.toInt()
        return PrimitiveTime(hours ?: 0, minutes ?: 0)
    }
}
