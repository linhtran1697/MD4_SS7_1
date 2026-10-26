# StudentDTO Validation

Bài tập Java: tạo `StudentDTO` với Jakarta Bean Validation.

## Yêu cầu

- Java 17 trở lên
- Maven 3.9 trở lên

## Cấu trúc

```text
student-dto-validation/
├── pom.xml
├── src/
│   ├── main/java/dto/StudentDTO.java
│   └── test/java/dto/StudentDTOTest.java
├── .gitignore
└── README.md
```

## Nội dung

- `fullName`: `@NotBlank`, `@Size(min = 5, max = 100)`
- `major`: `@NotBlank`
- Các annotation được import từ `jakarta.validation.constraints`.
- Constructor không tham số, constructor đủ tham số, getter và setter.

## Mở bằng IntelliJ IDEA

Chọn **File → Open** → thư mục `student-dto-validation` → chọn mở dự án Maven từ `pom.xml`. Đợi Maven tải dependencies.

## Biên dịch và kiểm thử

```bash
mvn clean test
```

Chỉ biên dịch:

```bash
mvn clean compile
```

> Đây là bài tập DTO, không có REST API hoặc `main()` để chạy server. Không cần Postman.

## Đẩy lên GitHub

Tạo repository trống `student-dto-validation` trên GitHub rồi tại thư mục dự án chạy:

```bash
git init
git add .
git commit -m "Add StudentDTO validation"
git branch -M main
git remote add origin https://github.com/USERNAME/student-dto-validation.git
git push -u origin main
```

Thay `USERNAME` bằng tài khoản GitHub của bạn.
