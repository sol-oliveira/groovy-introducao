/*range bloco condicional*/

def definirIdade(idade){
   switch(idade){
        case 0..10:
            println("Voc� tem entre 0 e 10 anos.")
            break
        case 11..17:
            println("Voc� tem entre 11 e 17 anos.")
            break
        case idade >= 18:
            println("Voc� tem 18 anos ou mais.");
            break
    }   
}