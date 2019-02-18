/*operações com listas*/


/*metodo all*/
nomes1 = ['souza','silva','carlos','joao']
println nomes1.size() //4
nomes2 = ['camilo','machado','mateus','paulo']
nomes1.addAll(nomes2)
println nomes1.size() //8

println ""
precos1 = [10, 20, 30.0, 40]
println "Elemento da posição 0: ${precos1[0]}"
println "Elemento da posição 3: ${precos1.get(3)}"

println ""
lista = [1,2,3,4,5,6,7,8,9]
for(int i = 0; i < lista.size();i++){
    print  lista.get(i)+ " \n"
}
println ""
for (item in lista){
    println "" + (lista)
}

println "\n\n Acessando itens de uma lista por um range."
/*Acessando itens de uma lista por um range.*/
clientes = ['joao', 'silva', 'oliveira', 'neto', 'pereira', 'manoel']
intervalo = 2..5
println clientes[intervalo]

println "\n\n remoção de itens com ragen's"
/*remoção de itens com ragen's*/
clientes = ['joao', 'silva', 'oliveira', 'neto', 'pereira', 'manoel', 'carlos']
clientes[0..2] = []  
println clientes


/* adicionar e remover itens de listas.*/
println "\n\n adicionar e remover itens de listas. "
clientes = []
clientes += 'jose'
clientes += ['elton', 'maria', 'lucena']
clientes << 'carvalho'
clientes -= 'jose'
println clientes