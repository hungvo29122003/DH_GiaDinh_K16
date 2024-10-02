document.addEventListener('DOMContentLoaded', () => {
    const tasks = [
        { nameTask: 'Bài tập ES6', complete: false },
        { nameTask: 'Bài tập Vuejs', complete: false },
        { nameTask: 'Bài tập Nodejs', complete: false },
        { nameTask: 'Bài tập PHP', complete: false }
    ]
    const task_list = document.getElementById('task-list'); // ul
    const taskInput = document.getElementById('task-input');
    const btn_Add = document.getElementById('add-btn');
    const renderTask = (t = tasks) => {
        task_list.innerHTML = "";
        tasks.forEach(task => {
            const { nameTask, complete } = task
            const li = document.createElement('li');
            const btn_Complete = document.createElement('button');
            const btn_Delete = document.createElement('button');
            const nameTaskSpan = document.createElement('span');
            nameTaskSpan.setAttribute('class', "task-name");
            btn_Complete.setAttribute('class', "complete-btn");
            btn_Delete.setAttribute('class', "delete-btn");
            nameTaskSpan.textContent = nameTask;
            btn_Complete.textContent = 'Hoàn thành';
            btn_Delete.textContent = 'Xoá';
            li.appendChild(nameTaskSpan);
            li.appendChild(btn_Complete);
            li.appendChild(btn_Delete);
            task_list.appendChild(li);
            if (task.complete) {
                nameTaskSpan.setAttribute('class', "task-name completed");
            } else {
                nameTaskSpan.setAttribute('class', "task-name");
            }
            btn_Complete.addEventListener('click', () => {
                task.complete = !task.complete;
                renderTask(tasks);
            })
            btn_Delete.addEventListener('click', () => {
                const index = t.indexOf(task);
                if (index > -1) {
                    tasks.splice(index, 1);
                    renderTask(tasks);
                }
            })
        });
        btn_Add.addEventListener('click', () => {
            if (taskInput.value) {
                tasks.push({ nameTask: taskInput.value, complete: false });
                taskInput.value = "";
                renderTask(tasks);
            }
        })
    }
    renderTask(tasks);
})