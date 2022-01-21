const base62 = (number) => {
    let quotient = number;
    let reminder = [];
    let codes = [
        '0','1','2','3','4','5','6','7','8','9',
        'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z',
        'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z',
    ];

    while (quotient >= 62){
        reminder.push(quotient % 62);
        quotient = Math.floor(quotient / 62);
    }

    quotient = codes[quotient];

    while (reminder.length > 0) {
        quotient = quotient + codes[reminder.pop()];
    }

    return quotient;
}

console.log(base62(1000))