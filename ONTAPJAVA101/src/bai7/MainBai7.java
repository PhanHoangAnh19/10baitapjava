package bai7;

import java.util.List;

public class MainBai7 {
    public static void main(String[] args) {
        QuanLyHocSinh ql101 = new QuanLyHocSinh();

        ql101.them101(new HocSinh("Nguyen Van A101", 20, "Ha Noi", "12A1"));
        ql101.them101(new HocSinh("Tran Thi B101", 23, "Da Nang", "12A3"));
        ql101.them101(new HocSinh("Le Van C101", 20, "TPHCM", "12A1"));
        ql101.them101(new HocSinh("Pham D101", 23, "Da Nang", "12A2"));
        ql101.them101(new HocSinh("Do E101", 22, "Hai Phong", "12A4"));

        System.out.println("== Danh sach hoc sinh ==");
        ql101.tatCa101().forEach(System.out::println);

        System.out.println("\n== So hoc sinh tuoi 20 ==");
        System.out.println(ql101.demTuoiBang101(20));

        System.out.println("\n== Hoc sinh tuoi 23 que chua 'Da Nang' ==");
        List<HocSinh> kq101 = ql101.locTuoiVaQue101(23, "Da Nang");
        kq101.forEach(System.out::println);
    }
}
