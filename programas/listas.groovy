/*As listas do Groovy aproveitam os arrays do Java, bem como na API de collection, como as classes ArrayList e LinkedList*/



/*Instanciando e imprimindo o tipo de uma lista.*/
nomes = ["jose", "joao", "silva", "souza"]
println nomes.class

/*especificar o tipo de lista que se deseja criar no momento do processo de instância*/
lista = new LinkedList();
println lista.class

/*range*/
range = 1..10
List lista = range.toList()
println lista.size();


