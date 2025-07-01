let parImpar = 10;
if (parImpar % 2 == 0){
    console.log("Este numero es PAR")
}
else{
    console.log("Este numero es IMPAR")
}

//ejercicio mayor de edad

let edad = 20, mayor = 18;
if (edad > mayor){
    console.log("Es una persona adulta")
}
else{
    console.log("Es una persona menor de edad")
}
//Ejercicio: Dentro de un rango
let dentroRango = 10;
let valMin = 0, valMax = 10;
if(dentroRango >= valMin && dentroRango <= valMax){
    console.log("Esta dentro del rango establecido")
}
else{
    console.log("Esta fuera del rango establecido")
}

//Ejercicio: Si el padre puede asistir al juego de su hijo
let vacaciones = false, diaDescanso = false;
if(vacaciones || diaDescanso){
    console.log("El padre puede asistir al juego de su hijo")
}
else{
    console.log("El padre no puede asistir al juego de su hijo")
}

//Operador ternario
let resultado2 = 3 > 2 ? "Verdadero" : "Falso";
console.log(resultado2)
let numero = 9;
resultado2 = numero % 2 == 0 ? "Es un numero PAR" : "Es un numero IMPAR";
console.log(resultado2)

//Convertit String a Number
let miNumero = "21"; //Es una cadena
console.log(typeof miNumero)
let edad2 = Number (miNumero); //Esta es una función
console.log(typeof edad2);
if(isNaN(edad2)){
    console.log("Esta variable no contiene solo numeros")
}
else{
    if(edad2>= 18){
    console.log("puede votar");
    }
    else{
    console.log ("Muy joven para votar");
    }
}

//Operador ternario
let resultado3 = edad3 >= 18 ? "Puede votar" : "Muy joven para votar";
console.log(resultado3);