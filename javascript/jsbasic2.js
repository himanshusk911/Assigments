var number = parseInt();

 var sum = 0;
// looping from i = 1 to number
// in each iteration, i is increased by 1
for (var i = 1; i <= number; i++) {
    if(i%3==0 && i%5==0){
    sum += i;
    }
    
}

console.log(sum);