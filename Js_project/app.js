apis=[
     { method: "GET", path: "/users", status: 200 },
     { method: "GET", path: "/users", status: 200 },
     { method: "GET", path: "/users", status: 200 },
     { method: "POST", path: "/signup", status: 400 },
   ]

let post=0
let get=0;
for(const request of apis){
    if(request.method=="POST"){
        post++;
    }
    else if (request.method=="GET"){
        get++;
    }
}
console.log(post)
console.log(get)