package bai2;

import java.util.List;

public class MainBai2 {
    public static void main(String[] args) {
        QuanLyCanBo ql101 = new QuanLyCanBo();

        // Thêm mẫu
        ql101.them101(new CongNhan("Nguyen Van A101", 30, "Nam", "Ha Noi", 3));
        ql101.them101(new KySu("Tran Thi B101", 28, "Nu", "TPHCM", "Cong nghe thong tin"));
        ql101.them101(new NhanVien("Le Van C101", 25, "Nam", "Da Nang", "Van thu"));

        System.out.println("== Danh sach can bo ==");
        ql101.hienThi101();

        System.out.println("\n== Tim theo ten 'B101' ==");
        List<CanBo> kq101 = ql101.timTheoTen101("B101");
        for (CanBo cb101 : kq101) {
            System.out.println(cb101);
        }
    }
}
