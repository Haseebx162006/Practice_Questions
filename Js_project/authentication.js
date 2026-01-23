const express= require('express')
const cors= require('cors')
const jwt= require('jsonwebtoken')
const bcrypt=require('bcrypt')
const PORT=5000


const app= express()
const path = require('path'); 

app.use(express.static(path.join(__dirname, 'public')));
app.use(express.json())
app.use(cors())

const JWT_sec='jwtsec123'
const users=[]

app.get('/',function(req,res){
    res.send("Welcome to Login Page Sir")
})

app.post('/signup',async (req,res) => {
    const {name, email , password}= req.body
    if(!email || !password){
        return res.status(400).json({error:"O Bhai Both fields are required"})
    }
    const isUserExist= users.find((user)=>user.email === email)

    if(isUserExist){
        return res.status(400).json({error:"user Already Exists Bhai"})
    }

    const hash_password= await bcrypt.hash(password,10);

    users.push(
        {
            name,
            email,
            password:hash_password
        }
    )


    res.status(200).json({message:"Signup Ok ha boss"})
})


app.post('/login',async(req,res)=>{
    const {email, password}= req.body
    if(!password || ! email){
        return res.status(400).json({msg:"Bhai sare fields done kar ke send kar na andha ha?"})
    }
    const user= users.find((user)=>user.email===email)

    if(!user){
        return res.status(400).json({error:"Bhai Pehle ja ke Signup kar or account bna yaha kya kar  aya ha"})
    }
    const compare_psd=await bcrypt.compare(password,user.password)

    if(!compare_psd){
        return res.status(400).json({error:"Password dont match. hack to nae kar raha???"})
    }
    const token= jwt.sign(
        {
        email:user.email
    },
    JWT_sec,
    {expiresIn:"1h"}
)
res.status(200).json({message:"Login hogya bhaiyaa", token})
}
)

app.listen(PORT)