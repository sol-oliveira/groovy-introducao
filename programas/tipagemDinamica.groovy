/* tipagem din�mica,

  vari�veis explicitamente tipadas, o compilador n�o necessitar� executar procedimentos
  para definir o tipo da vari�vel, logo essa estrat�gia de c�digo � ligeiramente mais r�pida.

Outro ponto a destacar � que, uma vez definidos, os tipos n�o podem ser alterados, 
  
  Integer idade = 10
  Double valor = 1.0d
  String nome = �Jos� Camilo�
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
            println("A vari�vel foi avaliada como Inteiro")
            break
        case BigDecimal:
            println("A vari�vel foi avaiada como BigDecimal")
            break
        case Double:
            println("A vari�vel foi avaliada como Double")
            break
        case String:
            println("A vari�vel foi avaliada como String")
            break
        case Long:
            println("A vari�vel foi avaliada como Long")
            break        
        case BigInteger:
            println("A vari�vel foi avaliada como BigInteger")
            break
 }
}
