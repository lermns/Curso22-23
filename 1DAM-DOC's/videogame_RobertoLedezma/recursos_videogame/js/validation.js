function validar() {
	const nombre = document.getElementById('nameForm').value;
	if (/^[a-zA-Z][a-zA-Z0-9]*$/.test(nombre)) {
		juego.nombreJugador = nombre;
		document.getElementById('name').textContent = nombre;
	}else{
		document.getElementById('nameError').textContent = 'El nombre solo puede contener letras y números';
		return false;
	}
	document.getElementById('nameError').textContent = '';


	//Los puntos por acierto son un entero positivo.
	let puntos = document.getElementById('pointsPerHitForm').value;
	if (/^[0-9]+$/.test(puntos)) {
		puntos=parseInt(puntos);
		if((puntos > 0)){
			juego.puntosAcierto = puntos;
			//document.getElementById('hit').textContent = juego.puntosAcierto;
		}else{
			document.getElementById('pointsPerHitError').textContent = 'Los puntos por acierto deben ser un entero positivo';
			return false;
		}
	}else{
		document.getElementById('pointsPerHitError').textContent = 'Los puntos por fallo deben ser un entero positivo';
		return false;
	}
	document.getElementById('pointsPerHitError').textContent = '';

	//===== con esta expresión regular se comprueba que el valor introducido sea un entero positivo =====
	let fallo = document.getElementById('pointsPerMissForm').value;
	if (/^[0-9]+$/.test(fallo)) {
		fallo = parseInt(fallo);
		juego.puntosFallo = fallo;
		if((fallo >= 0 && fallo <= puntos)){
			juego.puntosFallo = fallo;
		}else{
			document.getElementById('pointsPerMissError').textContent = 'Los puntos por fallo deben ser un entero positivo';
			return false;
		}
	}else{
		document.getElementById('pointsPerMissError').textContent = 'Los puntos por fallo deben ser un entero positivo';
		return false;
	}
	document.getElementById('pointsPerMissError').textContent = '';


	//====== desde aqui se invoca al inicializador del juego. =====
	inicializar();
	
}





