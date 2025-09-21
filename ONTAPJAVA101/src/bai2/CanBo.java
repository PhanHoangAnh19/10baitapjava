package bai2;

public class CanBo {
    protected String hoTen101;
    protected int tuoi101;
    protected String gioiTinh101;
    protected String diaChi101;

    public CanBo(String hoTen101, int tuoi101, String gioiTinh101, String diaChi101) {
        this.hoTen101 = hoTen101;
        this.tuoi101 = tuoi101;
        this.gioiTinh101 = gioiTinh101;
        this.diaChi101 = diaChi101;
    }

    @Override
    public String toString() {
        return hoTen101 + " | " + tuoi101 + " | " + gioiTinh101 + " | " + diaChi101;
    }
}
