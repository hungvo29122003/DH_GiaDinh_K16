/**
 Promise: lời hứa là 1 đối tượng đại diện cho giá trị của một thao tác bất đồng bộ,
 có thể hoàn thành hiện tại, tương lai, hoặc tương lai không hoàn hứa
 3 trạng thái
 pending(chờ), trạng thái ban đầu chờ promise, thao tác bất đồng bộ nay đang diễn ra
 chưa hoàn thành
 fulfiffed(hoàn thành) : trạng thái đã hoàn thành, trả về 1 giá trị (số, chuỗi, mảng, object...)
 recjected(từ chối): trạng thái khi thao tác bất đồng bộ thất bại trả về lỗi
 sử dụng để gọi api đọc / ghi file, hoặc tương tác với cơ sở dữ liệu , để không làm chậm trễ
 */

//  const dt=new Promise((resolve,rejected)=>{các khối lệnh})
// thực hiện phương thức kiểm tra tuổi dưới dạng bất đồng bộ
const checkAge=(age)=>{
    return new Promise((resolve,rejected)=>{
        // tạo ra 1 server ảo bằng cách dùng setTimeout
        setTimeout(()=>{
            if(age >= 18){
                resolve("Bạn đủ tuổi thi bằng lái");
            } else{
                rejected("Bạn chưa đủ tuổi thi bằng lái");
            }
        }, 2000);
    })
}
// muốn sử dụng checkAge (Promise) dùng then
// cú pháp phương thức ().then(hàm(tham sô nếu có))
checkAge(18).then(resolve=>{
    console.log(resolve);
}).catch(err=>{
    console.log(err);
})
// cú pháp const tenham = async((tham số nếu có)=>{})
const checkTuoi = async(age)=>{
        const cv = await checkAge(age);
        console.log(cv);
}
// lời gọi hàm 
checkTuoi(18);