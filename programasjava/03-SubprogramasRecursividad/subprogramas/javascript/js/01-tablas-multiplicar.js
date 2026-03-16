console.log("Tabla de Multiplar");

const solicitarNumero = () => {
  return prompt("Introduce un valor para la tabla");
};

const validarEntero = ( ) => {
  let sentinel = true;
  let valor;
  let numero;

  do {

    valor = solicitarNumero();
    numero = Number(valor);

    if (!isNaN(numero) && Number.isInteger(numero) && numero > 0) {
      sentinel = false;
    } else {
      alert("No es un entero valido. Intenta de nuevo");
    }
  } while (sentinel);

  return numero;
};

const numero = validarEntero();

