var currentNumberWrapper = document.getElementById('currentNumber');
var currentNumber = 0;
var cor = document.getElementById("currentNumber");

function increment(){
    currentNumber += 1;
    currentNumberWrapper.innerHTML = currentNumber;
    if (currentNumber >= 0){
        cor.style.color='green';
    }
}

function decrement(){
    currentNumber -= 1;
    currentNumberWrapper.innerHTML = currentNumber;
    if (currentNumber < 0){
        cor.style.color='#900';
    }
}

