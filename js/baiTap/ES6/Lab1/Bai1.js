/**
 * muốn yêu cầu ai đó hoặc muốn lấy giá trị của thành phần 
 */
document.getElementById('registrationForm').addEventListener('submit',function(event){
    event.preventDefault(); // ngăn chuyển trang khi người dùng nhắn submit
    // tuy xuất thấy dc thẻ input pass
    const pass=document.getElementById('password').value;
    const confirmPass=document.getElementById('confirmPassword').value;
    const mes=document.getElementById('message');
    if(pass!==confirmPass)
    {
        mes.textContent="Đăng kí thất bại"
        mes.style.color="red"
    } else{
        mes.textContent="Đăng kí thành công"
        mes.style.color="blue"
    }
})
