import { createWebHistory, createRouter } from "vue-router";
import Home from '@/components/ComHome.vue'
import ThucDon from '@/components/ComThucDon.vue'
import GioiThieu from '@/components/ComGioiThieu.vue'
import LienHe from '@/components/ComLienHe.vue'
//tạo ra mảng chứa những đường link 
const routes=[
    //chứa đối tượng
    // trang chủ là trang load lên đầu tiên path:"/"
    {
        path:'/',
        name:'Home',
        component:Home
    },
    //những trang ko phải trang củ thì /+ten
    {
        path:'/thucdon',
        name: 'ThucDon',
        component: ThucDon
    },
    {
        path:'/gioithieu',
        name: 'GioiThieu',
        component: GioiThieu
    },
    {
        path:'/lienhe',
        name:'LienHe',
        component: LienHe
    }
]
//tạo đối tượng 
const router=createRouter({
    history:createWebHistory(),
    routes
})
export default router