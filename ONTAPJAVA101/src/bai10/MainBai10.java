package bai10;

public class MainBai10 {
    public static void main(String[] args) {
        QuanLyBienLai ql101 = new QuanLyBienLai();

        KhachHangDien khA101 = new KhachHangDien("Nguyen Van A101", "12/5", "CT001");
        KhachHangDien khB101 = new KhachHangDien("Tran Thi B101", "34/7", "CT002");

        ql101.them101(new BienLaiDien(khA101, 1234, 1350, 3000));
        ql101.them101(new BienLaiDien(khB101, 500, 660, 3000));

        System.out.println("== Danh sach bien lai ==");
        ql101.tatCa101().forEach(System.out::println);

        System.out.println("\n== Tim theo ma cong to 'CT00' ==");
        ql101.timTheoMaCongTo101("CT00").forEach(System.out::println);

        System.out.println("\n== Cap nhat chi so moi cho CT001 ==");
        System.out.println("Cap nhat? " + ql101.capNhatChiSoMoiTheoMaCT101("CT001", 1400));
        ql101.timTheoMaCongTo101("CT001").forEach(System.out::println);

        System.out.println("\n== Tong tien cua CT001 ==");
        System.out.println(ql101.tongTienTheoMaCT101("CT001"));
    }
}
