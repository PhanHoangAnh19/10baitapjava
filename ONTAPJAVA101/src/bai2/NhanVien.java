package bai2;

public class NhanVien extends CanBo {
    private String congViec101;

    public NhanVien(String hoTen101, int tuoi101, String gioiTinh101, String diaChi101, String congViec101) {
        super(hoTen101, tuoi101, gioiTinh101, diaChi101);
        this.congViec101 = congViec101;
    }

    @Override
    public String toString() {
        return "NhanVien -> " + super.toString() + " | congViec=" + congViec101;
    }
}
