package bai9;

import java.time.LocalDate;

public class MainBai9 {
    public static void main(String[] args) {
        QuanLyTheMuon ql101 = new QuanLyTheMuon();

        SinhVienTV svA101 = new SinhVienTV("Nguyen Van A101","SV01","12A1");
        SinhVienTV svB101 = new SinhVienTV("Tran Thi B101","SV02","12A2");

        ql101.them101(new TheMuon("TM01", svA101, "S001",
                LocalDate.of(2025,9,15), LocalDate.of(2025,9,25)));
        ql101.them101(new TheMuon("TM02", svB101, "S010",
                LocalDate.of(2025,9,10), LocalDate.of(2025,9,20)));
        ql101.them101(new TheMuon("TM03", svA101, "S100",
                LocalDate.of(2025,9,18), LocalDate.of(2025,9,28)));

        System.out.println("== Tat ca the muon ==");
        ql101.tatCa101().forEach(System.out::println);

        System.out.println("\n== Tim theo MSSV 'SV02' ==");
        ql101.timTheoMSSV101("SV02").forEach(System.out::println);

        System.out.println("\n== Tim theo ma sach chua 'S0' ==");
        ql101.timTheoMaSach101("S0").forEach(System.out::println);

        System.out.println("\n== Qua han tinh den 2025-09-22 ==");
        ql101.quaHanTinhDen101(LocalDate.of(2025,9,22)).forEach(System.out::println);
    }
}
