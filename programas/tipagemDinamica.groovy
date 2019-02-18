/* tipagem dinâmica,

  variáveis explicitamente tipadas, o compilador não necessitará executar procedimentos
  para definir o tipo da variável, logo essa estratégia de código é ligeiramente mais rápida.

Outro ponto a destacar é que, uma vez definidos, os tipos não podem ser alterados, 
  
  Integer idade = 10
  Double valor = 1.0d
  String nome = “José Camilo”
}*/
                
idade = 20
avaliarTipo(idade)
string = "Hello!"
avaliarTipo(string)
populacao = 100000000L
avaliarTipo(populacao)
orcamento = 200.00d
avaliarTipo(orcamento)
preco = 200.00
avaliarTipo(preco)


def avaliarTipo(variavel){
    switch(variavel.getClass()){
        case Integer:
            println("A variável foi avaliada como Inteiro")
            break
        case BigDecimal:
            println("A variável foi avaiada como BigDecimal")
            break
        case Double:
            println("A variável foi avaliada como Double")
            break
        case String:
            println("A variável foi avaliada como String")
            break
        case Long:
            println("A variável foi avaliada como Long")
            break        
        case BigInteger:
            println("A variável foi avaliada como BigInteger")
            break
 }
}
