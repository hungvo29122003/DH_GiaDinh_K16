/*
DOMContentLoader : được dùng khi load lên cùng html
ko cần hình load lên trc , css load lên trc 
loader: khi html , hình , css load lên rồi mới được load
*/
document.addEventListener('DOMContentLoaded', ()=>{
    // khai báo object
    let object={
        name:'Nguyễn Văn A',
        age:18,
        email:'a@gmail.com'
    }
    const ten=document.querySelector('.name');
    const tuoi=document.querySelector('.age');
    const emails=document.querySelector('.email');
    // đổ dữ liệu vào
    let{name, age, email}=object
    ten.textContent=name;
    tuoi.textContent=age;
    emails.textContent=email
})