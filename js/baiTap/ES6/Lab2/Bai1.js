// muốn gắn tai nghe cho đối tượng button thì phải thấy dc nó thong qua document
const btn =  document.getElementById('calculate-btn')
btn.addEventListener('click', ()=>{
    // nghe và làm
    // lấy giá trị của những thẻ input num1, num2
    const num1 = parseFloat(document.getElementById('num1').value);
    const num2 = parseFloat(document.getElementById('num2').value);
    const kq = document.getElementById('result');
    // pt tinh tong
    const sum=(a, b)=>a + b;
    kq.textContent=`Tổng là: ${sum(num1, num2)}`

})