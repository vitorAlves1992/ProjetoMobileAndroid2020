package br.com

class Impressora() {
    var listaImprimivel = mutableListOf<Imprimivel>()

    fun adicionarLista(imprimivel: Imprimivel){

        listaImprimivel.add(imprimivel)
    }

    fun imprimirLista(){

        for(lista in listaImprimivel ) {
            println(lista.imprimir())
            }
        }

}