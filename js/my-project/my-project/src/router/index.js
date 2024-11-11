import { createWebHistory,createRouter } from "vue-router";
import Home from '@/components/ComHome.vue'
import ThucDon from '@/components/ComThucDon.vue'
import GioiThieu from '@/components/ComGioiTh.vue'
import LienHe from '@/components/ComLienHe.vue'
import TinTuc from '@/components/ComTinTuc.vue'
import ProductDetail from '@/components/ComProductDetail.vue'
import cart from '@/components/ComCart.vue'
import register from '@/components/ComRegister.vue'
import login from '@/components/ComLogin.vue'
// tạo mảng chứa những đường link
const routes=[
    // đối tượng trang chủ
    {
        path:"/",
        name:"Home",
        component:Home
    },
    // đường link ko phải là trang chủ path:"/ten"
    {
        path:"/thucdon",
        name:"ThucDon",
        component:ThucDon
    },
    {
        path:"/gioithieu",
        name:"GioiThieu",
        component:GioiThieu
    },
    {
        path:"/lienhe",
        name:"LienHe",
        component:LienHe
    },
    {
        path:"/tintuc",
        name:"TinTuc",
        component:TinTuc
    },
    {
        path:"/product/:id",
        name:"ProdctDetail",
        component:ProductDetail
    },
    {
        path:"/cart",
        name:"GioHang",
        component:cart
    },
    {
        path:"/register",
        name:"Register",
        component:register
    },
    {
        path:"/login",
        name:"Login",
        component:login
    },
]
// tạo đối tượng router
const router=createRouter({
    history:createWebHistory(),
    routes
})
export default router