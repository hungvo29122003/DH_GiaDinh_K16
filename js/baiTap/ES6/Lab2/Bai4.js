// document.addEventListener('DOMContentLoaded', () => {
//     let products = [
//         { name: "Nước Ép Cam", price: 30000 },
//         { name: "Trà Sữa", price: 40000 },
//         { name: "Cà Phê Đen", price: 20000 },
//         { name: "Sinh Tố Bơ", price: 50000 }
//     ];
//     let carts = [];

//     let productList = document.getElementById('product-list');
//     let cartList = document.getElementById('cart-list');
//     let totalPrice = document.getElementById('total-price');

//     const renderCart = () => {
//         cartList.innerHTML = '';
//         carts.forEach((cart, index) => {
//             let { name, price, quantity } = cart;
//             let li = document.createElement('li');
//             let nameElement = document.createElement('span');
//             let priceElement = document.createElement('span');
//             let quantityElement = document.createElement('span');
//             let delBtn = document.createElement('button');

//             li.setAttribute('class', 'cart-item');
//             delBtn.setAttribute('class', 'remove-btn');
//             delBtn.appendChild(document.createTextNode("Xóa"));
//             delBtn.addEventListener('click', (e) => {
//                 e.preventDefault();
//                 carts = carts.filter((_, i) => {
//                     return i !== index;
//                 })
//                 renderCart();
//             });

//             nameElement.appendChild(document.createTextNode(name));
//             priceElement.appendChild(document.createTextNode(price + " VND"));
//             quantityElement.appendChild(document.createTextNode("Số lượng: " + quantity));

//             li.appendChild(nameElement);
//             li.appendChild(priceElement);
//             li.appendChild(quantityElement);
//             li.appendChild(delBtn);

//             cartList.appendChild(li);
//         });

//         totalPrice.textContent = carts.reduce((total, cart) => total + (+cart.price * +cart.quantity), 0);
//     };

//     const renderProduct = () => {
//         productList.innerHTML = '';
//         products.forEach((product, index) => {
//             let {name, price} = product;

//             let li = document.createElement('li');
//             let nameElement = document.createElement('span');
//             let priceElement = document.createElement('span');
//             let addBtn = document.createElement('button');

//             li.setAttribute('class', 'product');

//             nameElement.appendChild(document.createTextNode(name));
//             priceElement.appendChild(document.createTextNode(price + " VND"));

//             addBtn.appendChild(document.createTextNode("Thêm"));
//             addBtn.addEventListener('click', (e) => {
//                 e.preventDefault();

//                 let { name, price } = products[index];

//                 let cartIndex = carts.findIndex(cart => cart.name === name);

//                 if (cartIndex == -1) {
//                     carts = [...carts, { name, price, quantity: 1 }];
//                 } else {
//                     carts[cartIndex].quantity++;
//                 }

//                 renderCart();
//             });

//             li.appendChild(nameElement);
//             li.appendChild(priceElement);
//             li.appendChild(addBtn);

//             productList.appendChild(li);
//         });
//     }

//     renderProduct();
// });
const products = [
    { id: 1, name: "Nước Ép Cam", price: 30000 },
    { id: 2, name: "Trà Sữa", price: 40000 },
    { id: 3, name: "Cà Phê Đen", price: 20000 },
    { id: 4, name: "Sinh Tố Bơ", price: 50000 }
];
let cart = [];
const productList = document.getElementById('product-list')
// load tất cả lên 
const renderProduct = () => {
    products.forEach((gt, vitri) => {
        // tại div
        const div = document.createElement('div');
        // tạo class cho div
        div.classList.add('product');
        // tạo nột dung 
        const { id, name, price } = gt;
        div.innerHTML = `<span>${name}</span>
                        <span>${price}</span>
                        <button onclick="addToCart(${id})">thêm</button>`
        // div con gắn vào div cha
        productList.appendChild(div);
    })
}
renderProduct();
// thêm vào trong giỏ hàng
const addToCart = (id) => {
    // từ id tìm ra được thông tin của sản phẩm
    const infosp = products.find((p) => p.id === id);
    // tìm xem trong giỏ hàng có sản phẩm đó chưa
    const infospcart = cart.find((t) => t.id === id);
    // nếu trong giỏ hàng có rồi thì tăng số lượng lên 
    if (infospcart) {
        infospcart.quantity += 1;
    }
    else {
        // trong giỏ hàng ko có hàng đó
        const spmoi = { ...infosp, quantity: 1 };
        cart = [...cart, spmoi];
    }
    renderCart();
}
// viết hàm renderCart
const cartlist = document.getElementById('cart-list');
const renderCart = () => {
    cartlist.innerHTML = '';
    cart.forEach(item => {
        const div = document.createElement('div');
        div.classList.add('cart-item');
        const { id, name, price, quantity } = item;
        div.innerHTML = `
            <span>${name}</span>
            <span>${price} VND</span>
            <span>Số lượng: ${quantity}</span>
            <button class="remove-btn" onclick="removeFromCart(${id})">Xóa</button>
        `;
        cartlist.appendChild(div);
    });
    // tính tổng hàng trong giỏ hàng
    const totalprice = document.getElementById('total-price');
    const tong = cart.reduce((total, item) => total + item.price * item.quantity, 0);
    totalprice.textContent = tong;

};
const removeFromCart = (id) => {
    cart = cart.filter(p=>p.id!==id);
    renderCart();
}