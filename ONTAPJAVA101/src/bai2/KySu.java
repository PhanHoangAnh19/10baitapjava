package bai2;

public class KySu extends CanBo {
    private String nganhDaoTao101;

    public KySu(String hoTen101, int tuoi101, String gioiTinh101, String diaChi101, String nganhDaoTao101) {
        super(hoTen101, tuoi101, gioiTinh101, diaChi101); // sửa lỗi nhỏ: tuoii101 → tuoi101 nếu Eclipse báo lỗi
        this.nganhDaoTao101 = nganhDaoTao101;
    }

    @Override
    public String toString() {
        return "KySu -> " + super.toString() + " | nganh=" + nganhDaoTao101;
    }
}
