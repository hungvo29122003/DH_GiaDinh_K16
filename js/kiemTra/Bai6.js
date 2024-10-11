document.addEventListener('DOMContentLoaded', () => {
    const productTable = document.getElementById('productTable');
    const totalElement = document.getElementById('total');
    const priceFilter = document.getElementById('priceFilter');
    let products = [
        { name: 'iPhone 9', price: 700 },
        { name: 'Samsung', price: 400 },
        { name: 'Nokia', price: 100 },
        { name: 'Sony Xperia', price: 450 },
        { name: 'Motorola', price: 180 },
        { name: 'Oppo', price: 600 },
        { name: 'bPhone', price: 90 }
    ];

    const fetchProducts = () => {
        return new Promise((resolve) => {
            setTimeout(() => {
                resolve(products);
            }, 1000);
        });
    };

    const renderProducts = async (productsToRender = products) => {
        try {
            productTable.innerHTML = "";
            productsToRender.forEach(product => {
                let row = productTable.insertRow();
                let checkBoxCell = row.insertCell(0);
                let checkBox = document.createElement('input');
                checkBox.type = 'checkbox';
                checkBoxCell.appendChild(checkBox);

                let nameCell = row.insertCell(1);
                nameCell.textContent = product.name;

                let priceCell = row.insertCell(2);
                priceCell.textContent = product.price;

                let quantityCell = row.insertCell(3);
                let quantityInput = document.createElement('input');
                quantityInput.type = 'number';
                quantityInput.min = 0;
                quantityInput.value = 0;
                quantityInput.disabled = true; 
                quantityCell.appendChild(quantityInput);

                let totalCell = row.insertCell(4);
                totalCell.textContent = '0';

                checkBox.addEventListener('change', async () => {
                    if (checkBox.checked) {
                        quantityInput.disabled = false;
                        quantityInput.focus();
                    } else {
                        quantityInput.disabled = true;
                        quantityInput.value = 0;
                        totalCell.textContent = '0';
                        await updateTotal();
                    }
                });

                quantityInput.addEventListener('input', async () => {
                    await updateRowTotal(row, product.price);
                    await updateTotal();
                });
            });
            await updateTotal();
        } catch (error) {
            console.error('Error fetching products:', error);
            productTable.innerHTML = "<tr><td colspan='5'>Đã có lỗi xảy ra khi tải dữ liệu sản phẩm.</td></tr>";
        }
    };

    const filterProducts = () => {
        const priceFilterValue = priceFilter.value;
        let filteredProducts = [];
        if (priceFilterValue === 'under200') {
            filteredProducts = products.filter(product => product.price < 200);
        } else if (priceFilterValue === '200to500') {
            filteredProducts = products.filter(product => product.price >= 200 && product.price <= 500);
        } else if (priceFilterValue === 'above500') {
            filteredProducts = products.filter(product => product.price > 500);
        } else {
            filteredProducts = products;
        }
        renderProducts(filteredProducts);
    };

    const updateRowTotal = async (row, price) => {
        return new Promise(resolve => {
            setTimeout(() => {
                let quantityInput = row.cells[3].querySelector('input');
                let totalCell = row.cells[4];
                let quantity = parseInt(quantityInput.value) || 0;
                let totalPrice = quantity * price;
                totalCell.textContent = `${totalPrice}`;
                resolve();
            }, 1000);
        });
    };

    const updateTotal = async () => {
        return new Promise(resolve => {
            setTimeout(() => {
                let total = 0;
                for (let i = 0; i < productTable.rows.length; i++) {
                    let row = productTable.rows[i];
                    let rowTotalText = row.cells[4].textContent;
                    let rowTotal = parseInt(rowTotalText.replace(/\D/g, '')) || 0;
                    total += rowTotal;
                }
                totalElement.textContent = total;
                resolve();
            }, 1000);
        });
    };

    priceFilter.addEventListener('change', filterProducts);

    renderProducts();
});