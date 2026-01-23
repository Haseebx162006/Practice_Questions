const express= require("express")

const app= express()

app.use(express.json())
app.use(express.urlencoded({extended:true}))

const userModel=  require('./usermodel')


app.get("/create", async(req,res)=>{
    let created_user=await userModel.create(
        {
            name:"Haseeb",
            username:"haseebx16",
            email:"haseeahmad",
            password:"Hello_Haseeb"
        }
    )
    res.send(created_user)
})

app.listen(3000)