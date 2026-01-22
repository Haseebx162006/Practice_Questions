// const { use } = require("react")

// function validator(body){
//     const {username, age , email}= body

//     if(!username || typeof username !="string"){
//         return{isValid: false ,error:"Error in username"}
//     }
//     if(username.trim().length<3){
//         return{isValid: false, error:"Error in usernmae"}
//     }
//     if(!email || typeof email !="string"){
//         return {isValid: false , error:"Error in email"}
//     }
//     if(!email.includes("@")){
//         return {isValid :false , error:"Error in email"}
//     }
//     if(age==undefined || typeof age!="number"){
//         return{isValid:false, error:"error in number"}
//     }
//     if(age<18){
//         return {isValid:false, error :"error in number"}
//     }
// }


// function isEmailtaken(users, email){
//     for(const user of users){
//         if(user.email==email){
//             return true
//         }
//     }
//     return false
// }
// const users = [
//     { id: 1, name: "Ali" },
//     { id: 2, name: "Haseeb" }
// ];
// function getuserId(id){
//     return new Promise((reject,resolve)=>{
//         setTimeout(()=>{
//             const user = users.find((user)=> user.id==id)

//             if(user){
//                 resolve(user)
//             }
//             else{
//                 reject("User not found ")
//             }
//         },2000)
//     })
// }

function delay(ms){
    return new Promise((resolve,react)=>{
        console.log("Start")
        setTimeout(() => {
            console.log("I will come after 2 seconds")
        }, ms);
        console.log("End")
    })
}

async function exe(ms){
    try {
        const msg= await delay(ms)
        console.log(msg)
    }catch(err){
        console.log(err)
    }
}

exe(5000)