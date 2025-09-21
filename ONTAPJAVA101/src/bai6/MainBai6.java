package bai6;

import java.util.List;

public class MainBai6 {
    public static void main(String[] args) {
        QuanLyKhachSan ql101 = new QuanLyKhachSan();

        KhachHang a101 = new KhachHang("Nguyen Van A101", 30, "012345678");
        KhachHang b101 = new KhachHang("Tran Thi B101", 26, "022345678");

        ql101.them101(new ThuePhong(a101, new Phong(LoaiPhong101.A), 3));
        ql101.them101(new ThuePhong(b101, new Phong(LoaiPhong101.C), 5));
        ql101.them101(new ThuePhong(a101, new Phong(LoaiPhong101.B), 2));

        System.out.println("== Danh sach thue phong ==");
        ql101.hienThi101();

        System.out.println("\n== Tim theo CMND chua '012' ==");
        List<ThuePhong> kq101 = ql101.timTheoCMND101("012");
        kq101.forEach(System.out::println);

        System.out.println("\n== Tong tien cua CMND 012345678 ==");
        System.out.println(ql101.tinhTienTheoCMND101("012345678"));

        System.out.println("\n== Xoa theo CMND 022345678 ==");
        System.out.println("Xoa? " + ql101.xoaTheoCMND101("022345678"));
        ql101.hienThi101();
    }
}
