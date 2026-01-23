const express= require("express")

const app= express()

app.use(express.json())
app.use(express.urlencoded({extended:true}))

const userModel=  require('./usermodel')

app.post("/create", async(req,res)=>{
    userModel.create(
        {
            name:"Haseeb",
            username:"haseebx16",
            email:"haseeahmad",
            password:"Hello_Haseeb"
        }
    )
})