fun main(args: Array<String>) {
    println("Bytebank, bem vindo!")
    val titular:String = "Gabriel"
    val numeroConta:Int = 1212
    var saldo = 0.0
    saldo = 100.0
    saldo += 300
    saldo -=300

    val contaGabriel = Conta()
    contaGabriel.titular = "Gabriel"
    contaGabriel.numero = 23453
    contaGabriel.deposito( 40.0)
    contaGabriel.saque(50.0)
    println(contaGabriel.saldo)

    val contaFran = Conta()
    contaFran.titular = "Fran"
    contaFran.numero = 34432
    contaFran.deposito(22.0)
    println(contaFran.saldo)

    println("Transferencia Fran - Alex")
    if (contaFran.tranferencia(10.0, contaGabriel)){
        println("Tranferencia com sucesso")
    } else {
        println("Falha na transferencia")
    }

    println(contaFran.saldo)
    println(contaGabriel.saldo)
}

class Conta(){
    var titular=""
    var numero = 0
    var saldo = 0.0
    fun deposito(valor:Double){
        this.saldo += valor
    }
    fun saque(valor: Double){
        if (saldo >= valor){
            saldo -= valor
        } else {
            println("Operação Negada: Saldo Insuficiente")
        }
    }

    fun tranferencia(valor:Double, contaDestino: Conta): Boolean{
        if (saldo >= valor){
            saldo -= valor
            contaDestino.saldo += valor
            return true
        }
        return false
    }
}

fun testaCopiasEReferencias(){
//    val contaGabriel = Conta()
//    contaGabriel.titular = "Gabriel"
//    contaGabriel.numero = 2434
//    contaGabriel.saldo = 22
}
fun testaLacos(saldo:Double){
    if (saldo > 0.0){
        println("Conta positiva! ")
    } else if(saldo == 0.0){
        println("Conta é neutra!")
    } else {
        println("Conta é negativa!")
    }
}

fun testaCondicoes(saldo:Double){
    when {
        saldo > 0.0 -> println("Saldo positivo!")
        saldo == 0.0 -> println("Sem saldo!")
        saldo < 0.0 -> println("Saldo negativo!")

    }
}