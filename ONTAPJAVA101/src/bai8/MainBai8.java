package bai8;

import java.util.List;

public class MainBai8 {
    public static void main(String[] args) {
        QuanLyGiaoVien ql101 = new QuanLyGiaoVien();

        ql101.them101(new GiaoVien("GV01", "Nguyen Van A101", 8000, 500, 100));
        ql101.them101(new GiaoVien("GV02", "Tran Thi B101", 9000, 300, 50));
        ql101.them101(new GiaoVien("GV03", "Le Van C101", 7500, 800, 0));

        System.out.println("== Danh sach ==");
        ql101.tatCa101().forEach(System.out::println);

        System.out.println("\n== Tim theo ten 'B101' ==");
        ql101.timTheoTen101("B101").forEach(System.out::println);

        System.out.println("\n== Sap xep thuc linh giam ==");
        List<GiaoVien> sx101 = ql101.sapXepTheoThucLinhGiam101();
        sx101.forEach(System.out::println);

        System.out.println("\n== Xoa GV02 ==");
        System.out.println("Xoa? " + ql101.xoaTheoMa101("GV02"));
        ql101.tatCa101().forEach(System.out::println);
    }
}
