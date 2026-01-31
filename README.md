## Phân biệt Functional Programming với OOP và Imperative Programming

### 1. Imperative Programming
👉 Tư duy của phong cách code này là làm từng bước từ trên xuống dưới, đây là 
cách code phổ biến của hầu hết tất cả những người mới học code

### 2. OOP (Object Oriented Programming)
👉 Tư duy của phong cách này là mô hình hóa thế giới thành các class trong đó có các đối tượng, thuộc tính,
 hành vi

 ### 3. Funtional Programming (FP)
 👉 Tư duy là tạo một chương trình bằng cách ghép các hàm toán học, tưởng tượng giống như một dây chuyển sản xuất

 Hình dung cho đơn giản thì FP là cách mà ta mô tả mối quan hệ giữa input và output: a → doubled → sum 

 🔑 3 ý cốt lõi của Funtional Programming: 

 :one: Pure function (hàm thuần)
 
 ✅ Cùng input luôn cho ra cùng output

 ✅ Không làm thay đổi gì bên ngoài

 :two: Immutability (dữ liệu không bị sửa)

 Vấn đề quan trọng trong FP chính là việc tạo dữ liệu mới thay vì sửa dữ liệu cũ

 :three: Hàm là dữ liệu

 Hàm có thể được truyền vào như biến

 ```
int apply(int x, int (*f)(int)) {
    return f(x);
}
```
### Vậy FP khác với Imperative ở điểm nào?

Sự khác biệt nằm ở cấu trúc và cách mà nó xử lý trạng thái

🎯 Bài toán: cộng tổng số từ 1 → n

```
int sumToN(int n) {
    int sum = 0;
    for (int i = 1; i <= n; i++) {
        sum += i;
    }
    return sum;
}
```
👉 Đây là cách tư duy theo kiểu Imperative vì ta mô tả quá trình

```
int sumToN(int n) {
    return n * (n + 1) / 2;
}
```
👉 FP sẽ mô tả quan hệ toán học: n → kết quả; không có trạng thái thay đổi
