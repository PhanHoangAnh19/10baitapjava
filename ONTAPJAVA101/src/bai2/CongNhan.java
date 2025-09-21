package bai2;

public class CongNhan extends CanBo {
    private int bac101;

    public CongNhan(String hoTen101, int tuoi101, String gioiTinh101, String diaChi101, int bac101) {
        super(hoTen101, tuoi101, gioiTinh101, diaChi101);
        this.bac101 = bac101;
    }

    @Override
    public String toString() {
        return "CongNhan -> " + super.toString() + " | bac=" + bac101;
    }
}
