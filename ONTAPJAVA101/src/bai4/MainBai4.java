package bai4;

import java.util.List;

public class MainBai4 {
    public static void main(String[] args) {
        TuyenSinh ql101 = new TuyenSinh();

        ql101.them101(new ThiSinhKhoiA("A001", "Nguyen Van A101", "Ha Noi", 1, 8.0, 7.5, 7.0));
        ql101.them101(new ThiSinhKhoiB("B002", "Tran Thi B101", "Da Nang", 0, 6.5, 7.0, 7.5));
        ql101.them101(new ThiSinhKhoiC("C003", "Le Van C101", "TPHCM", 2, 7.0, 6.0, 7.0));

        System.out.println("== Danh sach thi sinh ==");
        ql101.hienThi101();

        double diemChuan101 = 20.0;
        System.out.println("\n== Danh sach TRUNG TUYEN (>= " + diemChuan101 + ") ==");
        List<ThiSinh> dau101 = ql101.locDauTheoDiemChuan101(diemChuan101);
        dau101.forEach(System.out::println);

        System.out.println("\n== Tim theo SBD chua 'B00' ==");
        ql101.timTheoSBD101("B00").forEach(System.out::println);
    }
}
