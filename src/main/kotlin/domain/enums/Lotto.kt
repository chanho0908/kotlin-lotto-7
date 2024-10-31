package domain.enums

enum class Lotto(private val value: String) {
    LOTTO_MIN("1"),
    LOTTO_MAX("45"),
    LOTTO_SIZE("6");

    fun value(): Int = value.toInt()
}