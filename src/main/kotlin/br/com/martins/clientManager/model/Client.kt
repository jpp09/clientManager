package br.com.martins.clientManager.model

class Client(val name:String, val mail:String, val cpf:String) {

    //TODO - Create function for scheduling on calender to store

    override fun toString():String{
        return "Cliente: ${this.name}"
    }
}