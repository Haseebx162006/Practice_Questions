const express=require('express')

const app=express()
app.use(function(err,req,res,next){
    console.error(err.stack)
    res.status(500).send("Something broke")
})
app.get('/',function(req,res){
    res.send("You are doing great just believe on yourself")
})
app.get('/profile',function(req,res,next){
    return next(new Error("Something went wrong"))
})
app.listen(3000)