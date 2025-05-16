package br.com.martins.clientManager.model

import java.time.LocalDateTime

class Store(val name: String,val mail:String, val cnpj:String, val openHour:LocalDateTime, val closeHour:LocalDateTime){

    //TODO create function for verify scheduling of the client

    override fun toString():String{
        return "Loja: ${this.name}"
    }
}
