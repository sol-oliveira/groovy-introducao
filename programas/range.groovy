/range /

println("  INTERVALO1")
intervalo1 = 1..15
for(int i = 0; i < intervalo1.size(); i++){
   print("${intervalo1[i]} ")
}
println(" \n INTERVALO2")
intervalo2 = 15..<30
for(item in intervalo2){
    print("${item} ")
} 
 
println(" \n ALFABETO")  
alfabeto = 'a'..'z'  
alfabeto.each{letra -> print("${letra} ")}

/range de datas /
data1 = new Date().parse("dd/MM/yyyy", "01/01/2016")
data2 = new Date().parse("dd/MM/yyyy", "10/01/2016")  
intervalo = data1..data2  
intervalo.each{data -> println(data.format('dd/MM/yyyy'))}