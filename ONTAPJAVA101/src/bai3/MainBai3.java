package bai3;

import java.time.LocalDate;
import java.util.List;

public class MainBai3 {
    public static void main(String[] args) {
        QuanLyTaiLieu ql101 = new QuanLyTaiLieu();

        // Thêm mẫu
        ql101.them101(new Sach("S001", "Kim Dong", 500, "To Hoai", 220));
        ql101.them101(new TapChi("TC01", "Tuoi Tre", 300, 15, 9));
        ql101.them101(new Bao("B01", "Lao Dong", 1000, LocalDate.of(2025, 9, 20)));

        System.out.println("== Tat ca tai lieu ==");
        ql101.hienThi101();

        System.out.println("\n== Tim theo loai: Sach ==");
        List<TaiLieu> sach101 = ql101.timTheoLoai101(Sach.class);
        sach101.forEach(System.out::println);

        System.out.println("\n== Tim theo NXB chua 'dong' ==");
        ql101.timTheoNXB101("dong").forEach(System.out::println);

        System.out.println("\n== Xoa theo ma 'TC01' ==");
        System.out.println("Xoa thanh cong? " + ql101.xoaTheoMa101("TC01"));
        ql101.hienThi101();
    }
}
