// tạo đối tượng vue
const app=Vue.createApp({
    // thộc tính
    data(){
        return{
            image:'1.jpg',
            ten:"An",
            tuoi:20,
            rawHTML:'<span style="color:blue">Đây là màu xanh nước biển</span>',
            count: 20,
            ok: true,
            name: "",
        }
    },
    // phương thức 
    methods:{
        dosomething() {
            alert("Làm tất cả mọi thứ");
          },
      
          alertHello() {
            alert("Xin chào");
          },
      
          alertWelcome() {
            alert("Welcome");
          },
      
          ptphim() {
            alert("Đây là enter");
          },
    }
}).mount("#app")