package bai3;

public class Sach extends TaiLieu {
    private String tenTacGia101;
    private int soTrang101;

    public Sach(String maTaiLieu101, String nhaXuatBan101, int soBanPhatHanh101,
                String tenTacGia101, int soTrang101) {
        super(maTaiLieu101, nhaXuatBan101, soBanPhatHanh101);
        this.tenTacGia101 = tenTacGia101;
        this.soTrang101 = soTrang101;
    }

    @Override
    public String toString() {
        return "Sach{" + super.toString() +
               ", tacGia=" + tenTacGia101 +
               ", soTrang=" + soTrang101 + "}";
    }
}
