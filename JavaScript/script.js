const fs = require('node:fs');
fs.writeFile("hey.txt","My name is Haseeb Ahmad",function(err){
    if(err){
        console.error(err);
    }
    else{
        console.log("Done ha Bhai")
    }
})