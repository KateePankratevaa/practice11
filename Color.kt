enum class Colors(val hexCode: String)
{
    RED("#FF0000"),
    BLUE("#0000FF"),
    GREEN("#008000"),
    YELLOW("#FFFF00"),
    PURPLE("#6900C6"),
    ORANGE("FF6606");

    fun IsDarkOrLightColor(color: Colors): String
    {
        val calculation = (299 * color.red + 587 * color.green + 114 * color.blue) / 1000
        if(calculation < 128)
            return "Цвет $color темный"
        else{
            return "Цвет $color светлый"
        }
    }
    fun NameWithHexCode(color: Colors):String{
        return "$name ($hexCode)"
    }

    fun RandomColor(): Colors{
        return  values().random()
    }

    fun AllColors(): List<Colors>{
        return values().toList()
    }

    val red: Int get() = hexCode.substring(1, 3).toInt(16)
    val green: Int get() = hexCode.substring(3,5).toInt(16)
    val blue: Int get() = hexCode.substring(5,7).toInt(16)
}