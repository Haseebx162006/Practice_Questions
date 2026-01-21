
//  File reading and writing exercise

// fs.writeFile("hey.txt","My name is Haseeb Ahmad",function(err){
//     if(err){
//         console.error(err);
//     }
//     else{
//         console.log("Done ha Bhai")
//     }
// })
// fs.appendFile("hey.txt"," am a backend developer focusing on node js and fast api", function(err){
//     if(err){
//         console.error(err)
//     }
//     else{
//         console.log("Done ha bhai saab")
//     }
// })
// fs.rename("hey.txt","First_Exercise.txt",function(err){
//     if(err){
//         console.error("Nae ho sakta bhai saab")
//     }
//     else{
//         console.log("Done ha Bhai sab")
//     }
// })
const fs = require('node:fs');
// fs.copyFile("First_Exercise.txt","./copy/copy.txt",function(err){
//     if(err){
//         console.error("Error in copying the file")
//     }
//     else{
//         console.log("Done ha Bhai sab")
//     }
// })

// fs.unlink("./copy/copy.txt",function(err){
//     if(err){
//         console.error(err.message)
//     }
//     else{
//         console.log("Done ha")
//     }
// })


fs.readFile("First_Exercise.txt",function(err,data){
    if(err){
        console.error(err.message)
    }
    else{
        console.log(data.toString())
    }
})


const http= require('http')
const server= http.createServer(function(req, res){
    res.end("Hello you get experince in Node js")
})

server.listen(3000)