package br.com

fun main() {

    var documento1= Documento("Doc")
    var foto = Foto("Jpeg")
    var contrato = Contrato("Aluguel")
    var impressora= Impressora()
    impressora.adicionarLista(documento1)
    impressora.adicionarLista(foto)
    impressora.adicionarLista(contrato)

    impressora.imprimirLista()

}