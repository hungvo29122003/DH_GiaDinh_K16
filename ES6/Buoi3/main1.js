// phương thức 1 mua cf
const muaCaPhe=()=>{
    return new Promise((resolve, rejected)=>{
        // tạo setTimeout
        setTimeout(()=>{
            // giả định cho một số ngẫu nhiên
            const so=Math.random();
            if(so>0.5){
                resolve("đã mua được cà phê");
            } else{
                rejected("Ko mua được")
            }
        }, 2000)
    })
}
const drinkCaPhe=()=>{
    return new Promise((resolve, rejected)=>{
        // tạo setTimeout
        setTimeout(()=>{
            // giả định cho một số ngẫu nhiên
            const so=Math.random();
            if(so>0.5){
                resolve("đã uống được cà phê");
                console.log("Đã uống được cà phê");
            } else{
                rejected("Ko uống được")
            }
        }, 1000)
    })
}

muaCaPhe().then(resolve=>{
    console.log(resolve);
}).then(()=>{
    // resolve= drinkCaPhe();
    // console.log(resolve);
    return drinkCaPhe();
}).catch((err)=>{
    console.log(err);
})
// cú pháp const tenham = async((tham số nếu có)=>{})
    const checkTuoi = async(age)=>{
        const cv = await checkAge(age);
        console.log(cv);
}

const cafe = async()=>{
    const cv2 = await drinkCaPhe();
    console.log(cv2);
    const cv1 = await muaCaPhe();
    console.log(cv1); 
}
// lời gọi hàm
cafe();