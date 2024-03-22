package com.example.diadasemana

import java.util.*

class Caledario {
    private var data: Calendar = Calendar.getInstance()
    fun diaDaSemana(): String{
        val dias = arrayListOf("DOMINGO", "SEGUNDA", "TERÇA", "QUARTA", "QUINTA", "SEXTA", "SÁBADO");
        return dias[this.data.get(Calendar.DAY_OF_WEEK_IN_MONTH)]
    }
}
