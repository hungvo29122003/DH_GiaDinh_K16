// thấy dc form thông qua id
const formDK = document.getElementById('registrationForm');
console.log(formDK);
// gắn tai nghe
formDK.addEventListener('submit', (event)=>{
    event.preventDefault();
    // làm
    // lấy được dữ liệu trên thẻ input, thấy dc
    const name = document.getElementById('name').value;
    const email = document.getElementById('email').value;
    // thực hiện phương thức gửi
    // sendDL(name, email).then(resolve=>{
    //     message.textContent = resolve;
    //     message.style.color='blue';
    // }).catch(err=>{
    //     message.textContent= err;
    //     message.style.color='red';
    // })
    const test = async(name, email)=>{
        try {
            const cv = await sendDL(name, email);
            message.textContent= resolve;
            message.style.color= 'blue';
        } catch(error) { 
            message.textContent = error;
            message.style.color='red';
        }
    }
    test(name, email);
})
const sendDL=(name, email)=>{
    return new Promise((resolve, rejected)=>{
     setTimeout(()=>{
         const so=Math.random()> 0.5;
         if(so){
            resolve(`Gửi thành công ${name} - ${email}`);
        } else{
            rejected(`Gửi thất bại ${name} - ${email}`);
        }
       }, 2000);
     })
 }