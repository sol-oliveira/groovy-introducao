/*Exemplo de código para adicionar ou remover elementos de um map.*/

println "\n\n adicionar e remover elementos de um Map "
def map = [:]
map["nome"] = "daniel"
map["sobrenome"] = "tavares"
map["email"] = "jdanieltrs1@gmail.com"
map["endereco"] = "Rua do Construtor José Sabino"  
map["endereco"] = null  
println map

/* método each */
println "\n\n metodo each "
map["nome"] = "daniel"
map["sobrenome"] = "tavares"
map["email"] = "jdanieltrs1@gmail.com"
map["endereco"] = "Rua do Construtor José Sabino"
  
map.each{ entrada ->
println "${entrada.key} - ${entrada.value}"
}

