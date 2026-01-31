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
 
Hàm thuần:

- Không sửa biến ngoài

- Không in ra

- Không đọc input

- Chỉ: input → output

 :two: Immutability (dữ liệu không bị sửa)

Dữ liệu:

- tạo xong là không sửa

- muốn thay đổi → tạo bản mới

👉 Tránh bug do “ai đó sửa dữ liệu của mình”

 :three: Higher-Order Functions → Functions as first-class values

Hàm có thể:

- truyền làm tham số

- trả về từ hàm khác

- gán vào biến

 ```
int apply(int x, int (*f)(int)) {
    return f(x);
}
```

:four: Recursion replaces loops

Trong FP “thuần”:

- không dùng `for`, `while`

- dùng đệ quy

👉 vì loop thường đi kèm biến thay đổi (mutable state)

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

#### 📌 Kết luận:

Imperative programming tập trung vào cách làm, dựa trên trạng thái và bộ nhớ dùng chung, nên gặp khó khăn khi song song hóa.

Functional programming là một dạng declarative programming, tập trung vào kết quả, dùng hàm thuần và dữ liệu bất biến, từ đó giảm bottleneck và hỗ trợ parallelism tốt hơn.
