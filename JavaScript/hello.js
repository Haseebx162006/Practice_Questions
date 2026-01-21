const numbers = [1, 2, 3, 4, 5, 6];
let sum=0;
for(const num of numbers){
    if(num%2===0){
        sum+=num
    }
}
console.log(sum)


let s="hello"
let new_string=""
for(let i =s.length-1; i>=0 ; i--){
    new_string+=s[i]
}
console.log(new_string)



const arr = [
  [1, 5, 3],
  [7, 2, 4],
  [0, 9, 8]
];

let largest=0
for(const num of arr){
    for(const greatest of num){
        if(greatest>largest){
            largest=greatest
        }
    }
}
console.log(largest)


function run(){
    console.log("Going to runnnnnnnnn")
    return function fn(){
        console.log("Hello")
    }
}

function sayhi(){
    return console.log("Am fine")
}
run()()

function outer(){
    return function(){
        console.log("Hello")
    }
}
