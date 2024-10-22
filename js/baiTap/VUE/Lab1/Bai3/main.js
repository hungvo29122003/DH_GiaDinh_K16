
const app=Vue.createApp({
    data(){
        return{
             newtask:'',
             tasks:[],
        }
    },
    methods:{
        themCV(){
            // kiem tra xem newTask phai có giá trị
            if(this.newtask !== ""){
                // gán lại cho mảng
                this.tasks = [...this.tasks, this.newtask];
            }
            this.newtask = "";
        },
        Delete(index){
            this.tasks.splice(index, 1);
        }
    }
}).mount("#app")