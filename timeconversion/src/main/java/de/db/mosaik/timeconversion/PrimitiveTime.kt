package de.db.mosaik.timeconversion

data class PrimitiveTime (val hour: Int, val minute: Int = 0) {

    override fun toString(): String {
        return "${twoDigits(hour)}:${twoDigits(minute)}"
    }

    private fun twoDigits(value: Int): String {
        return value.toString().padStart(2, '0')
    }
}