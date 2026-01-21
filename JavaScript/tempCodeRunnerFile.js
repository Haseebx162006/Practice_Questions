fs.copyFile("First_Exercise.txt","./copy/copy.txt",function(err){
    if(err){
        console.error("Error in copying the file")
    }
    else{
        console.log("Done ha Bhai sab")
    }
})