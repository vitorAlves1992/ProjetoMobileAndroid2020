package br.com

class Contrato(override var nome: String):Imprimivel {

    override val tipoDeDocumento: String="Contrato"


    override fun imprimir() {

        println("Eu $nome Sou um contrato muito legal do tipo: $tipoDeDocumento")

            }


}