fun main(args: Array<String>) {
    println("Bytebank, bem vindo!")
    val titular:String = "Gabriel"
    val numeroConta:Int = 1212
    var saldo = 0.0
    saldo = 100.0
    saldo += 300
    saldo -=300

    val contaAlex = Conta()
    contaAlex.titular = "Gabriel"
    contaAlex.numero = 23453

    deposito(contaAlex, 40.0)

    println(contaAlex.saldo)



}

class Conta(){
    var titular=""
    var numero = 0
    var saldo = 0.0
}

fun deposito(conta: Conta , valor:Double){
    conta.saldo += valor
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