package bai10;

public class KhachHangDien {
    private String hoTen101;
    private String soNha101;
    private String maCongTo101;

    public KhachHangDien(String hoTen101, String soNha101, String maCongTo101) {
        this.hoTen101 = hoTen101;
        this.soNha101 = soNha101;
        this.maCongTo101 = maCongTo101;
    }

    public String getMaCongTo101() { return maCongTo101; }

    @Override
    public String toString() {
        return hoTen101 + " | " + soNha101 + " | CT:" + maCongTo101;
    }
}
