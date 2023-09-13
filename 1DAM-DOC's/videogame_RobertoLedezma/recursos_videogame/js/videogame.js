// Número total de objetivos en el juego
const NUMOBJETIVOS = 48;

// Clases e IDs de los diferentes elementos HTML
const CLASEACIERTO = 'hit';
const CLASEFALLO = 'miss';
const CLASEVACIO = 'empty';
const CLASEOBJETIVO = 'target';
const IDPUNTUACION = 'score';
const IDNOMBRE = 'name';
const IDOBJETIVO = 'target';
const IDFORMULARIO = 'controlPanel';

// Valores por defecto para el estado del juego
const OBJETIVOSPORMINUTODEF = 60;
const NUMOBJETIVOCORRECTODEF = 0;
const PUNTOSDEF = 0;
const PUNTOSACIERTODEF = 5;
const PUNTOSFALLODEF = 5;
const OBJETIVOACERTADODEF = true;
const NOMBREJUGADORDEF = '';



// Objeto global que contiene el estado del juego
let juego = {
	objetivosPorMinuto: OBJETIVOSPORMINUTODEF, // La cantidad de objetivos que se le presentan al jugador
	numObjetivoCorrecto: NUMOBJETIVOCORRECTODEF, // El número del objetivo que el jugador debe pinchar
	puntos: PUNTOSDEF, // La cantidad total de puntos
	puntosAcierto: PUNTOSACIERTODEF, // Los puntos que se suman por cada objetivo acertado
	puntosFallo: PUNTOSFALLODEF, // Los puntos que se restan por cada objetivo acertado
	objetivoPuntuado: OBJETIVOACERTADODEF, // Marca un objetivo como puntuado, para sumar la puntuación una única vez
	nombreJugador: NOMBREJUGADORDEF // Nombre del jugador

};

/**
 * Summary. Inicializa el juego.
 *
 * Description. Inicializa la puntuación, el objetivo siguiente, y el marcador de control, que previene
 * que un mismo objetivo se puntúe varias veces.
 */
function prepararJuego() {
	juego.numObjetivoCorrecto = NUMOBJETIVOCORRECTODEF;
	juego.puntos = PUNTOSDEF;
	juego.objetivoPuntuado = OBJETIVOACERTADODEF;
}

/**
 * Summary. Inicializa el tablero.
 *
 * Description. Elimina todos los marcadores de acierto y fallo de la pantalla, muestra el nuevo objetivo,
 * y permite que este sea puntuado.
 *
 * @param {Number}	numObjetivoAnterior	El número del objetivo marcado como válido la ronda anterior
 * @param {Number}	numObjetivoNuevo	El número del objetivo a marcar como válido
 */
function prepararTablero(numObjetivoAnterior, numObjetivoNuevo) {
	let id;
	let idObjetivoAnterior = construirIdObjetivo(numObjetivoAnterior);
	let idObjetivoNuevo = construirIdObjetivo(numObjetivoNuevo);

	// Eliminamos los posibles marcadores de fallo y acierto en todo el tablero
	for(let numId = 0; numId <  NUMOBJETIVOS; numId++) {
		id = construirIdObjetivo(numId);
		document.getElementById(id).classList.remove(CLASEACIERTO);
		document.getElementById(id).classList.remove(CLASEFALLO);
	}

	// Registramos y mostramos la nueva casilla como el objetivo actual
	juego.numObjetivoCorrecto = numObjetivoNuevo;

	// Permitimos que el usuario puntúe el nuevo objetivo
	juego.objetivoPuntuado = false;

	// Mostramos el nuevo objetivo, reemplazando el anterior
	document.getElementById(idObjetivoAnterior).classList.remove(CLASEOBJETIVO);
	document.getElementById(idObjetivoNuevo).classList.add(CLASEOBJETIVO);

}

/**
 * Summary. Construye la ID HTML de una casilla objetivo a partir de una ID numérica.
 *
 * Description. Concatena el identificador almacenado en la constante IDOBJETIVO con el número
 * recibido como parámetro. Por ejemplo, si IDOBJETIVO contiene 'target', y le pasamos un 4
 * como parámetro, devolverá 'target4'.
 *
 * @param {Number}	idNum	Un identificador numérico.
 *
 * @return {String} La ID del elemento HTML objetivo
 */
function construirIdObjetivo(idNum) {
	// Si estamos trabajando con cadenas de caracteres, el operador + concatena
	return IDOBJETIVO + String(idNum);
}

/**
 * Summary. Registra un acierto en la casilla indicada.
 *
 * Description. Suma los puntos, marca el objetivo como puntuado, y marca la casilla como acertada.
 *
 * @param {Number}	numId	La ID numérica de la casilla acertada.
 */

function objetivoAcertado(numId) {
	let id = construirIdObjetivo(numId);

	// Marcamos el objetivo como puntuado, y sumamos puntos
	juego.objetivoPuntuado = true;
	juego.puntos = juego.puntos + juego.puntosAcierto;

	console.log('Objetivo ' + id + ' acertado');

	// Mostramos la casilla como acertada
	document.getElementById(id).classList.add(CLASEACIERTO);
	document.getElementById(id).classList.remove(CLASEFALLO);

	//==============incrementamos la dificultad.================
	juego.objetivosPorMinuto = juego.objetivosPorMinuto + 1;

}

    

/**
 * Summary. Registra un fallo en la casilla indicada.
 *
 * Description. Resta los puntos, hasta un mínimo de cero, y muestra un fallo en la casilla indicada.
 *
 * @param {Number}	numId	La ID numérica de la casilla fallida.
 */
function objetivoFallido(numId) {
	let id = construirIdObjetivo(numId);

	// Con Math.abs() nos aseguramos que restamos puntos, evitando posibles problemas con dobles negativos
	// Con Math.max() nos aseguramos que el total de puntos nunca es inferior a cero
	juego.puntos = Math.max(juego.puntos - Math.abs(juego.puntosFallo), 0);

	console.log('Objetivo ' + id + ' fallido');

	// Mostramos la casilla como fallida
	document.getElementById(id).classList.add(CLASEFALLO);
	document.getElementById(id).classList.remove(CLASEACIERTO);
}

/**
 * Summary. Registra una repetición.
 *
 * Description. En las repeticiones no hacemos nada.
 *
 */
function objetivoRepetido(numId) {
	let id = construirIdObjetivo(numId);

	console.log('Objetivo ' + id + ' repetido');
}

/**
 * Summary. Selecciona y muestra un nuevo objetivo.
 *
 * Description. Aleatoriamente genera y registra un nuevo objetivo, y limpia la pantalla de aciertos y fallos.
 * También calcula el tiempo entre objetivos y, justo antes de finalizar, agenda la generación de un nuevo
 * objetivo en función del número de objetivos por minuto.
 *
 */
//===== Se crea una variable para verificar si el usuario ha acertado o no, si no ha acertado se le resta puntos.======
let verificador = 0;
function nuevoObjetivo() {
	let numObjetivoNuevo = 1;
	let tiempoEspera; // El tiempo que tiene el usuario para acertar, en milisegundos
	//=====El verificador comprueba si el usuario ha acertado, si no ha acertado o esta incativo, se le resta un punto.=====
	if(verificador != 0 && verificador == juego.puntos)
	//==== Con esta instruccion hacemos que los fallos no pasen de 0 a -1 ====
		if(juego.puntos - juego.puntosFallo < 0)
			verificador = 0;
		else
			juego.puntos -= juego.puntosFallo;

	document.getElementById(IDPUNTUACION).innerHTML = String(juego.puntos);
	verificador = juego.puntos;

	// Generamos un nuevo objetivo, asegurándonos que no se repite con el anterior
	while ((numObjetivoNuevo < 0) || (numObjetivoNuevo === juego.numObjetivoCorrecto)){
		// Obtenemos un número aleatorio entre 0 y 0.9999 (aprox), lo multiplicamos por el número
		// de objetivos, y redondeamos hacia abajo.
		// Así obtenemos un número entre 0 y NUMOBJETIVOS-1
		numObjetivoNuevo = Math.floor(Math.random() * NUMOBJETIVOS );
	}

	// Dividimos 60 segundos (1 segundo son 1000 milisegundos) entre el número de objetivos por minuto
	// P.ej.: Si tuviésemos 30 objetivos por minuto, habría que esperar 2000 milisegundos entre objetivos
	tiempoEspera = Math.floor((60 * 1000) / juego.objetivosPorMinuto);

	// Reseteamos el tablero, marcando las casillas como vacías, y el nuevo objetivo como no pulsado
	prepararTablero(juego.numObjetivoCorrecto, numObjetivoNuevo);

	console.log('El objetivo pasa a ser ' + String(numObjetivoNuevo));
	console.log('Nuevo objetivo en ' + String(tiempoEspera) + 'ms');

	// Esperamos los milisegundos establacidos y, pasado el tiempo, seleccionamos
	// un nuevo objetivo
	setTimeout(function(){nuevoObjetivo()}, tiempoEspera);
}

/**
 * Summary. Inicializa el juego.
 *
 * Description. Inicializa la puntuación, e inicia la selección de objetivos.
 *
 */
function inicializar() {
	prepararJuego(); // Inicializamos el estado del juego a la posición de inicio
	console.log('Juego inicializado');
	nuevoObjetivo(); // Comenzamos a jugar
}


/**
 * Summary. Registra una pulsación en una casilla.
 *
 * Description. Compara la casilla pulsada con el objetivo, registrándolo como acierto si coinciden
 * y es el primer acierto, y como fallo si no coinciden.
 *
 * @param {Number} numObjetivoPulsado La ID numérica del objetivo pulsado.
 */
//===== Se crea una contador para verificar si el usuario ha acertado 5 veces seguidas, si es asi se le suman 5 puntos.======
 let contadorDeAcietos = 0;
function pulsado(numObjetivoPulsado) {
	let acierto;
	
	acierto = numObjetivoPulsado === juego.numObjetivoCorrecto;
	
	// Si es la primera vez que acierta un objetivo, registramos el acierto
	if (!juego.objetivoPuntuado && acierto ) {
		contadorDeAcietos++;
		if(contadorDeAcietos == 5){
			juego.puntos += juego.puntosAcierto;
			contadorDeAcietos = 0;
		}
		objetivoAcertado(numObjetivoPulsado);
	// Si es un fallo, registramos el fallo
	} else if (!acierto) {
		contadorDeAcietos = 0;
		objetivoFallido(numObjetivoPulsado);
	// Si no, es un acierto repetido
	} else {
		objetivoRepetido(numObjetivoPulsado);
	}

	// Actualizamos el marcador con la puntuación
	document.getElementById(IDPUNTUACION).innerHTML = String(juego.puntos);

	return acierto;
}
//===== Se crea una variable para finalizar el juego =====
function finalizarJuego() {
	alert("¡Juego finalizado!");
	if(juego.puntos > 0)
		alert("¡Felicidades, has ganado!");
  }
  // Crear objeto de sonido
var audio = new Audio('ruta/al/archivo/de/sonido.mp3');

// Agregar evento de clic al cuadro
document.getElementById('miCuadro').addEventListener('click', function() {
  // Reproducir sonido al hacer clic en el cuadro
  audio.play();
});
