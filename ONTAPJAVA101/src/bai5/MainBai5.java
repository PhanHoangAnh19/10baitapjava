package bai5;

import java.util.List;

public class MainBai5 {
    public static void main(String[] args) {
        KhuPho kp101 = new KhuPho();

        HoGiaDinh hoA101 = new HoGiaDinh("12A");
        hoA101.themThanhVien101(new Nguoi("Nguyen Van A101", 45, "Cong nhan", "012345678"));
        hoA101.themThanhVien101(new Nguoi("Tran Thi B101", 42, "Noi tro", "012345679"));
        hoA101.themThanhVien101(new Nguoi("Nguyen C101", 18, "Hoc sinh", "012345680"));

        HoGiaDinh hoB101 = new HoGiaDinh("34B");
        hoB101.themThanhVien101(new Nguoi("Le Van D101", 70, "Nghi huu", "022345678"));
        hoB101.themThanhVien101(new Nguoi("Le Thi E101", 67, "Nghi huu", "022345679"));

        kp101.themHo101(hoA101);
        kp101.themHo101(hoB101);

        System.out.println("== Danh sach ho ==");
        kp101.hienThi101();

        System.out.println("\n== Tim ho so nha chua '12' ==");
        kp101.timHoTheoSoNha101("12").forEach(System.out::println);

        System.out.println("\n== Tim nguoi theo CMND '022345678' ==");
        kp101.timNguoiTheoCMND101("022345678").forEach(System.out::println);

        System.out.println("\n== Cac ho co nguoi tu 65 tuoi tro len ==");
        List<HoGiaDinh> kq101 = kp101.hoCoNguoiTuoiTu101(65);
        kq101.forEach(System.out::println);
    }
}
