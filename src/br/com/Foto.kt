package br.com

class Foto(override var nome: String):Imprimivel {

    override var tipoDeDocumento: String = "Foto"

    override fun imprimir() {
      println("Eu $nome sou uma selfie do tipo: $tipoDeDocumento")
    }

}