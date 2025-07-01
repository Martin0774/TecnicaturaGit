var nombre = "Martín";
var apellido = "Platero";
var nombreCompleto = nombre+" "+apellido; //Primera concatenacion
console.log(nombreCompleto);
var nombreCompleto2 = "Martín"+" "+"Platero"; // Segunda concatenacion
console.log(nombreCompleto2);
var juntos = nombre + 219; //Lee de izq a der siguiendo la cadena lee el numero como str
console.log(juntos);
juntos = nombre + 78 + 17; // Aqui se puede diferenciar a través de los paréntesis
console.log(juntos);
juntos = 78 + 17 + nombre;
console.log(juntos);

nombre += apellido; // Tercera concatenacion usando el operador simplificado
console.log(nombre);

//Hoy ya no se usa var, se utiliza let y const
let nombre2 = "pedro";
console.log(nombre2);

const apellido2 = "lepes";
//apellido2 = "peres"; una constante no puede ser modificada
console.log(apellido2)