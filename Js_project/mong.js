const express= require("express")

const app= express()

app.use(express.json())
app.use(express.urlencoded({extended:true}))

const userModel=  require('./usermodel')


app.get("/create", async(req,res)=>{
    let created_user=await userModel.create(
        {
            name:"Haseeb Muzaffar",
            username:"haseebx16612",
            email:"haseeahmad",
            password:"Hello_Haseeb"
        }
    )
    res.send(created_user)
})

app.get("/update",async function(req,res) {

    let updated_user= await userModel.findOneAndUpdate({name:"Haseeb"},{name:"Haseeb Ahmad"},{new:true})
    res.send(updated_user)
    
})

app.get("/read", async(req,res)=>{
    let users= await userModel.find();
    res.send(users)
})
app.listen(3000)