document.addEventListener('DOMContentLoaded', ()=>{
    // load lên cùng lúc với dữ liệu
    const products=[
        {name: 'Táo', price : 200000},
        {name: 'Cam', price : 100000},
        {name: 'Bưởi', price: 150000},
        {name: 'Đào', price: 50000 },
        {name: 'Mận', price: 250000}
    ]
    // thấy ul mới gắn dc li 
    const productList = document.getElementById('product-list'); // ul
    const filterInput = document.getElementById('filter-price'); // thấy được thẻ input
    const btnSort = document.getElementById('sort-btn');
    // render lên cho người dùng thấy
    const renderProduct=(productArray)=>{
        productList.innerHTML=""; // làm mới ul lại 
        // duyệt qua mảng để lấy lấy 5 đối tượng, mỗi đối tượng nằm trong thẻ li
        // cú pháp : mảng.forEach(ham)
        productArray.forEach((a)=>{
            const li = document.createElement('li');
            // trỏ {name: 'Táo', price : 200000},
            const {name, price} = a;
            li.innerHTML=`<span class="product-name">${name}</span><span>${price}</span>`;
            productList.appendChild(li);
        })
    }
    // phương thức filter
    const filterProfucts=()=>{
        // lấy dc giá trị trên thẻ input
        const filterPrice = parseFloat(filterInput.value); // lấy dc giá tiền trên thẻ input
        //isNaN("hhhhhh") => true,T, isNaN(2) => false
        // mảng filter(hàm) => kq trả về là mảng
        const filterProductList = isNaN(filterPrice)?products:products.filter((a)=>a.price<=filterPrice);
        return filterProductList;
    }
    filterInput.addEventListener('input', ()=>{
        renderProduct(filterProfucts());
    })
    let isAcending= true;
    // phương thức sắp xếp sort
    const sortList =(productArray)=>{
        // cú pháp : mảng.sort(ham(2 tham so này là 2 object))=> mảng
       return productArray.sort((a,b)=>isAcending?a.price-b.price:b.price-a.price);
    }
    // gọi hàm sortList khi người dùng nhấn vào nút sắp xếp, ai lắng nghe => nút lắng nghe
    btnSort.addEventListener('click', ()=>{
        isAcending = !isAcending;
        console.log(isAcending);
        renderProduct(sortList(filterProfucts()));
        btnSort.textContent= isAcending? "sắp xếp giảm dần" : "sắp xếp tăng dần ";
    })

    // lời gọi hàm
    renderProduct(products)
})