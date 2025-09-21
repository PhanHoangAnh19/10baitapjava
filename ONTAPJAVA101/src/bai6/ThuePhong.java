package bai6;

public class ThuePhong {
    private KhachHang kh101;
    private Phong phong101;
    private int soNgayThue101;

    public ThuePhong(KhachHang kh101, Phong phong101, int soNgayThue101) {
        this.kh101 = kh101;
        this.phong101 = phong101;
        this.soNgayThue101 = soNgayThue101;
    }

    public KhachHang getKh101(){ return kh101; }
    public double tinhTien101(){ return phong101.getGia101() * soNgayThue101; }

    @Override
    public String toString() {
        return kh101 + " | " + phong101 + " | ngay=" + soNgayThue101 +
               " | tien=" + tinhTien101();
    }
}
