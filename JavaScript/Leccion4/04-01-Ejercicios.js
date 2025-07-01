//Ejercicio 1: Calcular estacion del año
let mes = 4;
let estacion;
if(mes == 1 || mes == 2 || mes == 12){
    estacion = "Verano";
}
else if(mes == 3 || mes == 4 || mes == 5){
    estacion = "Otoño";
}
else if(mes == 6 || mes == 7 || mes == 8){
    estacion = "Invierno";
}
else if(mes == 9 || mes == 10 || mes == 11){
    estacion = "Primavera";
}
else{
    estacion = "Valor incorrecto";
}
console.log("El valor corresponde a la estacion de: "+estacion);

//Ejercicio 2: Hora del dia
/*
de 6 a 11 nos saluda: Good morning
de 12 a 16 nos saluda: Good afternoon
de 17 a 19 nos saluda: Good evening
de 20 a 23 nos saluda: Good nigth
trabajaremos con 24 horas
*/
let horaDia = 7;
let mensaje;
if(horaDia >= 6 && horaDia <= 11){
    mensaje ="Good morning";
}
else if(horaDia >= 12 && horaDia <= 16){
    mensaje ="Good afternoon";
}
else if(horaDia >= 17 && horaDia <= 19){
    mensaje ="Good evening";
}
else if(horaDia >= 20 && horaDia <= 23){
    mensaje ="Good night";
}
else{
    mensaje = "Valor incorrecto";
}

console.log(mensaje);
//Estructura switch(la sintaxis es igual a Java)
switch(mes){ //No solo se pueden utilizar numero, tambien cadenas
    case 1: case 2: case 12:
        estacion = "Verano";
        break;
    case 3: case 4: case 5:
        estacion = "Otoño";
        break;
    case 6: case 7: case 8:
        estacion = "Invierno";
        break;
    case 9: case 10: case 11:
        estacion = "Primavera";
        break;
    default:
        estacion = "Valor incorrecto";
}
console.log("Bienvenido a la estacion de: "+estacion)
//Ampliando el uso de var, let y const
/*
con var puedes reasignar en cualquier momento
esto forma parte del ambito global
un error es que se sobreescriba
*/ 

var nombre = "Ariel";
nombre = "Osvaldo";
console.log(nombre)

function saludar(){
    var nombre = "Natalia";
    console.log(nombre);
}
console.log(nombre); //Aqui no lee el dato de en la funcion


if(true){
    var edad = 34;
    console.log(edad);
}
console.log(edad);//En la funcion funciono correctamente, en la estructura if fallo

/*
let: esta puede ser reasignada en cualquier momento
la diferencia es que su ambito es de bloque,
solo disponible dentro de un bloque de llaves
o dentro de una funcion
*/

function saludar2(){
    let nombre2 = "Ariel";
    console.log(nombre2);
}
console.log(nombre2);

if(true){
    let edad2 = 33;
    console.log(edad2);
}
console.log(edad2)

/*
const se utiliza para valores constantes que no pueden ser reasignados
*/

const fechaNacimiento = 2006;
console.log(fechaNacimiento);
//fechaNacimiento = 2003;
//console.log (fechaNacimiento); //solo se ejecutaq el console anterior

//Evitar repetir tu codigo
let days = 1;
switch (days) {
    case 1:
        console.log("hoy es Lunes"+days);
        break;
    case 2:
        console.log("hoy es Martes"+days);
        break;
    case 3:
        console.log("hoy es Miercoles"+days);
        break;
    case 4:
        console.log("hoy es Jueves"+days);
        break;
    case 5:
        console.log("hoy es Viernes"+days);
        break;
    case 6:
        console.log("hoy es Sabado"+days);
        break;
    case 7:
        console.log("hoy es Domingo"+days);
        break;
    default:
        console.log("Error en el ingreso del dia de la semana");
        break;
}
//Esta es la opcion mejorada
let days2 = ["Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado", "Domingo"];
function getDay(n){
    if(n < 1 || n > 7){
        throw new Error("out of range");
    }
    return days[n-1];
}
console.log(getDay(5));

//Hacer un ejercicio similar al que esta hecho, pero ahora con los
//meses del año, debes hacerlo con la estructura switch y luego con
//la funcion en la opcion mejorada

switch (mes) {
    case 1:
        console.log("Este es el mes de Enero")
        break;
    case 2:
        console.log("Este es el mes de Febrero")
        break;
    case 3:
        console.log("Este es el mes de Marzo")
        break;
    case 4:
        console.log("Este es el mes de Abril")
        break;
    case 5:
        console.log("Este es el mes de Mayo")
        break;
    case 6:
        console.log("Este es el mes de Junio")
        break;
    case 7:
        console.log("Este es el mes de Julio")
        break;
    case 8:
        console.log("Este es el mes de Agosto")
        break;
    case 9:
        console.log("Este es el mes de Septiembre")
        break;
    case 10:
        console.log("Este es el mes de Octubre")
        break;
    case 11:
        console.log("Este es el mes de Noviembre")
        break;
    case 12:
        console.log("Este es el mes de Diciembre")
        break;
    default:
        console.log("Este numero no corresponde a un mes")
        break;
}

let mes2 = ["Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"]
function obtMes(n) {
    if(n < 1 || n > 12){
        throw new Error("Este numero no corresponde a un mes");
    }
    return mes2[n-1];
}