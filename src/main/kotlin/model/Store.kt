package model

class Store(val name: String = "Nome do estabelecimento",val phone:String = "19999999999", val cnpj:String = "99999999999912", val operation: Open = Open()){

    //DB simulation
    val listService = mutableListOf<Service>()
    val listClient = mutableListOf<Client>()
    var listSchelud = mutableListOf<Schedule>()

    //TODO create function for verify scheduling of the client
    fun availableSchedule(){

    }

    override fun toString():String{
        return "Loja: ${this.name}"
    }
}
