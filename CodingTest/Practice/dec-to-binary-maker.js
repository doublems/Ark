const bi = (number) => {
    let quotient = number;
    let reminder = [];

    while (quotient >= 2){
        reminder.push(quotient % 2);
        quotient = Math.floor(quotient / 2);
    }
    quotient = quotient + '';

    while (reminder.length > 0) {
        quotient = quotient + reminder.pop();
    }

    return quotient;
}

console.log(bi(5))