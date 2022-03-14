package com.livreiro.conceitos

class Pessoa(var nome: String, var idade: Int) {

    override fun toString(): String {
        return "Classe: Pessoa.nome: ${nome} e idade: ${idade}";
    }

}

fun main() {
    var pessoa = Pessoa("Lemoel", 42);
    println(pessoa);
}