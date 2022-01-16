const hex = (number) => {
    let quotient = number;
    let reminder = [];
    let codes = ['0','1','2','3','4','5','6','7','8','9','a','b','c','d','e','f'];

    while (quotient >= 16){
        reminder.push(quotient % 16);
        quotient = Math.floor(quotient / 16);
    }

    quotient = codes[quotient];

    while (reminder.length > 0) {
        quotient = quotient + codes[reminder.pop()];
    }

    return quotient;
}

console.log(hex(1000))