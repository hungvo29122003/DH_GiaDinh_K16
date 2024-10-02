// phải lấy dữ liệu về
const getDl = ()=>{
    return new Promise((resolve, rejected)=>{
        const user = [
            {name: 'Trần Ngọc Lan Anh', email: 'Anh@gmail.com'},
            {name: 'Trần Ngọc Lan Enh', email: 'Enh@gmail.com'},
            {name: 'Trần Ngọc Lan Chi', email: 'Chi@gmail.com'}
        ]
        resolve(user);
    })
} 
const formAddUser = document.getElementById('userForm');
formAddUser.addEventListener('')
const userList = document.getElementById('userList');
// cần phải render cho người dùng thấy
const renderUser = (user)=>{
    user.forEach((a= user)=>{
        const {name, email} = a;
        const li = document.createElement('li');
        li.classList.add('user-item');
        const btn = document.createElement('button');
        const nameUser = document.createElement('span');
        nameUser.textContent= name;
        const emailUser = document.createElement('span');
        emailUser.textContent = email;
        btn.textContent= 'Xoá'
        li.appendChild(nameUser);
        li.appendChild(emailUser);
        li.appendChild(btn);
        userList.appendChild(li);
    })
}
getDl().then(resolve=>{
    renderUser(resolve);
})
const addUser = async (nameUser, emailUser)=>{
    try{
        const result = await themUser(nameUser, emailUser);
        renderUser(user);
    } catch(error){

    }
}
const themUser = (nameUser, emailUser)=>{
    return new Promise((resolve, rejecq)=>{
        const newUser = {nameUser, emailUser};
        user = [...user, newUser];
        resolve(user);
    })
}