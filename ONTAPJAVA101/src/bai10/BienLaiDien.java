package bai10;

public class BienLaiDien {
    private KhachHangDien kh101;
    private int chiSoCu101;
    private int chiSoMoi101;
    private double donGia101;

    public BienLaiDien(KhachHangDien kh101, int chiSoCu101, int chiSoMoi101, double donGia101) {
        this.kh101 = kh101;
        this.chiSoCu101 = chiSoCu101;
        this.chiSoMoi101 = chiSoMoi101;
        this.donGia101 = donGia101;
    }

    public KhachHangDien getKh101() { return kh101; }
    public int getChiSoCu101() { return chiSoCu101; }
    public int getChiSoMoi101() { return chiSoMoi101; }
    public void setChiSoMoi101(int chiSoMoi101) { this.chiSoMoi101 = chiSoMoi101; }

    public int soDienTieuThu101() {
        return Math.max(0, chiSoMoi101 - chiSoCu101);
    }

    public double soTien101() {
        return soDienTieuThu101() * donGia101;
    }

    @Override
    public String toString() {
        return kh101 + " | " + chiSoCu101 + " -> " + chiSoMoi101 +
               " | kWh=" + soDienTieuThu101() + " | tien=" + soTien101();
    }
}
