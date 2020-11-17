package br.com

class Documento(override var nome: String):Imprimivel {

    override val tipoDeDocumento: String="Documento"


    override fun imprimir() {
        println("Eu $nome sou um documento Word do tipo: $tipoDeDocumento ")
    }

}