function calcolaTensione() {
    var vin = parseFloat(document.getElementById("vin").value);
    var r1 = parseFloat(document.getElementById("r1").value);
    var r2 = parseFloat(document.getElementById("r2").value);

    if (isNaN(vin) || isNaN(r1) || isNaN(r2) || r1 <= 0 || r2 <= 0 || vin <= 0) {
        document.getElementById("output").innerHTML = "Per favore, inserisci valori validi per tutti i campi.";
        return;
    }

    var vout = vin * (r2 / (r1 + r2));
    document.getElementById("output").innerHTML = "La tensione di uscita (V<sub>out</sub>) è: " + vout.toFixed(2) + " V";
}
