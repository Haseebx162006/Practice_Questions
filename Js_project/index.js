const express= require('express')
const app= express()
app.use(express.json())
app.use(express.urlencoded({extended:true}))

app.get("/",function(req,res,next){
    res.send("Hello Bhai Server chal raha ha")
})

app.listen(3000)