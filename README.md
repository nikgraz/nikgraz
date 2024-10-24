<!DOCTYPE html>
<html lang="it">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="styles.css">
    <title>Calcolatore della Legge di Ohm</title>
</head>
<body>
    <div class="container">
        <h1>Calcolatore della Legge di Ohm</h1>

        <div class="summary">
            <h2>Riassunto sulla Legge di Ohm</h2>
            <p><strong>Tensione (V):</strong> La tensione è la differenza di potenziale elettrico tra due punti ed è misurata in volt (V).</p>
            <p><strong>Corrente (I):</strong> L'intensità di corrente è il flusso di cariche elettriche attraverso un conduttore, misurata in ampere (A).</p>
            <p><strong>Resistenza (R):</strong> La resistenza è la capacità di un materiale di opporsi al passaggio della corrente elettrica, misurata in ohm (Ω).</p>
        </div>

        <label for="voltage">Tensione (V):</label>
        <input type="number" id="voltage" placeholder="Inserisci la tensione">

        <label for="current">Corrente (I):</label>
        <input type="number" id="current" placeholder="Inserisci la corrente">

        <label for="resistance">Resistenza (R):</label>
        <input type="number" id="resistance" placeholder="Inserisci la resistenza">

        <button id="calculate">Calcola</button>
        <div id="result"></div>
    </div>

    <script src="script.js"></script>
</body>
</html>
document.getElementById('calculate').addEventListener('click', function() {
    const voltage = parseFloat(document.getElementById('voltage').value);
    const current = parseFloat(document.getElementById('current').value);
    const resistance = parseFloat(document.getElementById('resistance').value);
    let result = '';

    if (!isNaN(voltage) && !isNaN(current) && !isNaN(resistance)) {
        result = "Inserisci solo due valori per calcolare il terzo.";
    } else if (!isNaN(voltage) && !isNaN(current)) {
        const resistanceCalculated = voltage / current;
        result = `Resistenza (R): ${resistanceCalculated.toFixed(2)} Ω`;
    } else if (!isNaN(voltage) && !isNaN(resistance)) {
        const currentCalculated = voltage / resistance;
        result = `Corrente (I): ${currentCalculated.toFixed(2)} A`;
    } else if (!isNaN(current) && !isNaN(resistance)) {
        const voltageCalculated = current * resistance;
        result = `Tensione (V): ${voltageCalculated.toFixed(2)} V`;
    } else {
        result = "Per favore, inserisci due valori.";
    }

    document.getElementById('result').innerText = result;
});
.summary {
    background: #e9ecef;
    padding: 15px;
    border-radius: 5px;
    margin-bottom: 20px;
}
