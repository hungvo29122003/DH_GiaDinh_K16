<template>
  <div v-if="cart.length > 0" class="modal-content">
    <table style="width: 100%" class="text-center table">
      <tr>
        <th>HÌNH</th>
        <th>SẢN PHẨM</th>
        <th>Đơn giá</th>
        <th>Số lượng</th>
        <th>Tiền</th>
        <th></th>
      </tr>
      <!-- dùng v-for thể hiện giỏ hàng -->
      <tr v-for="item in cart" :key="item.id">
        <td><img src="item.image" style="height: 100px; width: 100px" /></td>
        <td class="align-middle">{{ item.name }}</td>
        <td class="align-middle">{{ item.price }}</td>
        <td class="align-middle">
          <button @click="decreaseQuantity(item)">-</button>
          {{ item.quantity }}
          <button @click="increaseQuantity(item)">+</button>
        </td>
        <td class="align-middle">{{ item.price * item.quantity }}</td>
        <td class="align-middle">
          <button class="btn btn-danger" @click="removeCart(item)">
            Remove 1
          </button>
        </td>
      </tr>
      <tr>
        <th>
          <button @click="thanhToan">Thanh toán</button>
        </th>
        <th></th>
        <th>Tổng tiền</th>
        <th>{{ tongSoLuong }}</th>
        <th>{{ tongTien }}</th>
        <th>
          <button class="btn btn-danger" @click="xoaHet()">Xóa hết : !</button>
        </th>
      </tr>
    </table>
  </div>
  <p v-else>Chưa có hàng</p>
</template>
  
  <script>
import items from "@/data/items";
import cart from "../data/cart";
export default {
  data() {
    return {
      cart: cart,
    };
  },
  computed: {
    tongTien() {
      return this.cart.reduce(
        (total, item) => total + item.price * item.quantity,
        0
      );
    },
    tongSoLuong() {
      return this.cart.reduce((total, item) => total + item.quantity, 0);
    },
  },
  methods: {
    removeCart(i) {
      if (i.quantity > 1) {
        i.quantity--;
      } else {
        this.cart = this.cart.filter((item) => item.id != i.id);
      }
    },
    xoaHet() {
      this.cart = [];
    },
    decreaseQuantity(item){
      if(item.quantity > 1){
        item.quantity--;
      } else{
        this.removeCart(item)
      }
    },
    increaseQuantity(item){
      // if(item.quantity < i.quality){
      //   item.quantity++;
      // }
      // // Tìm sản phẩm có ID tương ứng trong danh sách items
      const i = items.find(i=> i.id == item.id)
      // Kiểm tra nếu sản phẩm tìm thấy và số lượng hiện tại ít hơn chất lượng tối đa
      if(item.quantity < i.quality){
        item.quantity++
      }
    },
    // thanhToan(item){
      
    // }
  }
};
</script>
  
  <style>
</style>