function coinFlip(n){
  var flips = [];
    count=0;
  for ( var i = 0; i < n; i++ ){
    if ( Math.random() > .5 ){
      flips[i] = "Heads";
        count=count+1;
    } else {
      flips[i] = "Tails";  
    }
  }
  return count/n;
};