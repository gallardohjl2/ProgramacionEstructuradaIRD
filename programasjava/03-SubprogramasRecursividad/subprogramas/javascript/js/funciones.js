// Funciones Tradicionales

function saludar() {
  console.log("Hola JavaScript");
}

function saludar2(nombre) {
  console.log("Hola Mundo", nombre);
}

function sumar(numero1, numero2) {
  return numero1 + numero2;
}

saludar();
saludar2("Luis");
let suma = sumar(5, 6);

console.log("La suma es: " + suma);

// Funciones Anomimas

const saludar3 = function () {
  console.log("Hola desde Anonima");
};

const saludar4 = function (nombre) {
  console.log("Hola " + nombre);
};

const sumar2 = function (numero1, numero2) {
  return numero1 + numero2;
};

saludar3();
saludar4("Roberta");
console.log(sumar2(6, 8));

// Funciones de Flecha (Lambdas)
const saludar5 = () => {
  console.log("Hola Mundo");
};

const saludar6 = (nombre) => console.log("Hola " + nombre);

const sumar3 = (n1, n2) => {
  return n1 + n2;
};

const sumar4 = (n1, n2) => n1 + n2;
