// Tipos de datos en JavaScrip
/*
La sintaxis en lo que es comentarios
es muy similar a la de Java
realmente diriamos que es identica
*/
var nombre = "Martín";
console.log(typeof nombre);

var nombre = 7;
console.log(typeof nombre);

var nombre = 12.8;
console.log(typeof nombre);

var numero = 3000;
console.log(numero);
var objeto = {
    nombre : "Martín",
    apellido : "Platero",
    telefono : "2604631752"
}
console.log(typeof objeto);

//Tipo de dato Boolean
var bandera = true;
console.log(bandera);

//Tipo de dato funcion
function miFuncion (){}
console.log(typeof miFuncion);

//Tipo de dato symbol
var simbolo = Symbol("mi simbolo");
console.log(typeof simbolo);

//Tipo de dato clase
class persona {
    constructor(nombre, apellido){
        this.nombre = nombre
        this.apellido = apellido
    }
}

console.log(typeof persona)

var x;
console.log(typeof x);

x = undefined;
console.log(typeof x);

//null: significa ausencia de valor
var y = null; //null no es un tipo de dato, pero su origen es de tipo object
console.log(typeof y);

var autos = ["Citroen","Audi","BMW","Ford"];
console.log(autos);
console.log(typeof autos);

var z = "";
console.log(typeof z)