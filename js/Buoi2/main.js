// Arrow Function //
/**
 *
 */
const tinhTong = (a, b) => a + b;
console.log(tinhTong(2, 3));

/**
 *
 */
const tinhTong1 = (a, b) => {
  return a + b;
};
console.log(tinhTong1(2, 3));

/**
 * Trường hợp nếu hàm có 1 biến thì không cần ()
 */
const tinhTong2 = (a) => a * 3;
console.log(tinhTong2(2));

/**
 *
 */
const tinhTong3 = (value, limit) => {};

/**
 * Lưu ý hàm không có tham số thì bắt buộc phải có ()
 */
const tinhTong4 = () => {
  return "Hello";
};
console.log(tinhTong4())