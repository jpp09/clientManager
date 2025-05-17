package model

class Client(val name:String, val phone:String, val cpf:String) {

    //TODO - Create function for scheduling on calender to store
    fun schelude(store:Store,schedule: Schedule):String{
        if(store.listSchelud.contains(schedule)){
            return "Horário indisponivel"
        }else{
            store.listClient.add(this)
            store.listSchelud.add(schedule)
            return "Agendamento realizado com sucesso"
        }
    }

    override fun toString():String{
        return "Cliente: ${this.name}"
    }
}