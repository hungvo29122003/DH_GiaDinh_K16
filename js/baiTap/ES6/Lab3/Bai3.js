// document.addEventListener('DOMContentLoaded', () => {
//     let tasks = [
//         { name: "Học JavaScript", complete: false },
//         { name: "Làm bài tập về nhà", complete: true }
//     ];

//     let todoForm = document.getElementById('todoForm');
//     let taskInput = document.getElementById('task');
//     let messageElement = document.getElementById('message');
//     let ul = document.getElementById('todoList');

//     const setMessage = (msg, status = -1) => {
//         messageElement.textContent = msg;
//         if (status == -1) {
//             messageElement.style.color = 'black';
//         } else if (status == 1) {
//             messageElement.style.color = 'green';
//         } else if (status == 0) {
//             messageElement.style.color = 'red';
//         };
//     };

//     const addTaskPromise = () => {
//         return new Promise((resolve, reject) => {
//             setTimeout(() => {
//                 let name = taskInput.value;
//                 let complete = false;
//                 tasks = [...tasks, { name, complete }];

//                 resolve(`Thêm công việc "${name}" thành công!`);
//             }, 2000);
//         });
//     };

//     const setTaskCompletePromise = (index) => {
//         return new Promise((resolve, reject) => {
//             setTimeout(() => {
//                 let {name} = tasks[index];
//                 tasks[index].complete = true;
//                 resolve(`Công việc "${name}" đã hoàn thành!`);
//             }, 2000);
//         });
//     };

//     const delTaskPromise = (index) => {
//         return new Promise((resolve, reject) => {
//             setTimeout(() => {
//                 let {name} = tasks[index];
//                 tasks = tasks.filter((_, i) => i !== index);
//                 resolve(`Xóa công việc "${name}" thành công!`);
//             }, 2000);
//         });
//     };

//     const renderUsers = () => {
//         ul.innerHTML = '';
//         tasks.forEach((task, index) => {
//             let li = document.createElement('li');
//             li.setAttribute('class', 'todo-item');
            
//             let {name, complete} = task;

//             let taskNameElement = document.createElement('span');
//             taskNameElement.appendChild(document.createTextNode(name));

//             if (complete) {
//                 taskNameElement.setAttribute('class', 'todo-item completed');
//             }

//             let completeBtn = document.createElement('button');
//             let delBtn = document.createElement('button');

//             completeBtn.appendChild(document.createTextNode('Hoàn thành'));
//             delBtn.appendChild(document.createTextNode('Xóa'));

//             completeBtn.addEventListener('click', (e) => {
//                 e.preventDefault();
//                 setMessage("Đang gửi yêu cầu hoàn thành...");
//                 setTaskCompletePromise(index).then((resolve) => {
//                     setMessage(resolve, 1);
//                     renderUsers();
//                 }).catch((reject) => {
//                     setMessage(reject, 0);
//                 });
//             });
            
//             delBtn.addEventListener('click', (e) => {
//                 e.preventDefault();
//                 setMessage("Đang gửi yêu cầu xóa...");
//                 delTaskPromise(index).then((resolve) => {
//                     setMessage(resolve, 1);
//                     renderUsers();
//                 }).catch((reject) => {
//                     setMessage(reject, 0);
//                 });
//             });

//             li.appendChild(taskNameElement);
//             li.appendChild(completeBtn);
//             li.appendChild(delBtn);

//             ul.appendChild(li);
//         });
//     };

//     todoForm.addEventListener('submit', (e) => {
//         e.preventDefault();
//         setMessage("Đang thêm công việc...");
//         addTaskPromise().then((resolve) => {
//             setMessage(resolve, 1);
//             renderUsers();
//         }).catch((reject) => {
//             setMessage(reject, 0);
//         });
//     });

//     renderUsers();
// });
// thấy được from 
// thấy được form
const formthem=document.getElementById('todoForm');
const taskinput=document.getElementById('task');
let tasks=[];
// gán tai nghe
formthem.addEventListener('submit',(e)=>{
    e.preventDefault();
    // lấy giá trị taskinput
    const taskname=taskinput.value.trim();// loại bỏ khoảng trắng vô nghĩa
    // thực hiện phương thức đem giá vào trong mảng
    themtask(taskname);
    taskinput.value='';
})

// thực hiện phương thức bất đồng bộ
const addTask=(taskname)=>{
    return new Promise((resole,reject)=>{
        // nếu taskname có giá trị
        if(taskname)
        {
            // tạo ra 1 đối tượng có 2 thuộc tính name, completed
            const newtask={name:taskname,completed:false};
            // đem đối tượng vào tasks
            tasks=[...tasks,newtask];
            resole(tasks);
        }
        else
        {
            reject("Ko thêm được");
        }
    })
}// end

const message=document.getElementById('message');
// phương thức thực thi promise thêm
const themtask=async(taskname)=>{
    try {
        const newtask=await addTask(taskname);
        tasks=newtask;
        renderTask();
    } catch (error) {
        message.textContent=error;
        message.style.color='red';
    }
}


// phương thức render
const todoList=document.getElementById('todoList');
const renderTask=()=>{
    todoList.innerHTML="";
    tasks.forEach((gt,vitri)=>{
        // tạo li
        const li=document.createElement('li');
        // trong li có span
        const span=document.createElement('span');
        // trong span có class
        span.classList.add('todo-item');
        const {name,completed}=gt;
        if(completed){
            span.classList.add('completed');
        }
        //nội dung
        span.textContent=name;
        // span thuộc về con của li
        li.appendChild(span);
        // tạo nút hoàn thành
        const completeBtn=document.createElement('button');
        // class cho hoàn thành
        completeBtn.classList.add('complete-btn');
        // thêm nội dung cho nút
        completeBtn.textContent="Hoàn Thành";
        // sự kiện
        completeBtn.onclick=()=>{
            htcongviec(vitri);
        }
        // nút thuộc về li
        li.appendChild(completeBtn);
        // tạo nút xóa
        const deleteBtn=document.createElement('button');
        // class cho hoàn thành
        deleteBtn.classList.add('delete-btn');
        // thêm nội dung cho nút
        deleteBtn.textContent="Xóa";
        deleteBtn.onclick=()=>{
            xoaCV(vitri);
        }
        // nút thuộc về li
        li.appendChild(deleteBtn);
        // đem li vào ul
        todoList.appendChild(li);
    })
}
// end

const completeCV=(index)=>{
    return new Promise((resole)=>{
        const newtasks=tasks.map((p,i)=>i===index?{...p,completed:!p.completed}:p);
        resole(newtasks);
    })
}

// goi pt
const htcongviec=async(index)=>{
    try {
        const cvmoi=await completeCV(index);
        tasks=cvmoi;
        renderTask();
    } catch (error) {
        message.textContent=error;
        message.style.color='red';
    }
}
// cv xoá
const deleteCV = (index) =>{
    return new Promise((resole)=>{
        const newtasks = tasks.filter((_, i)=>i!== index);
        resole(newtasks);
    })
}
// gọi phương thức
const xoaCV = async(index)=>{
    try{
        const newtask = await deleteCV(index);
        tasks = newtask;
        renderTask();
    } catch(error){
        message.textContent=error;
        message.style.color='red';
    }
}