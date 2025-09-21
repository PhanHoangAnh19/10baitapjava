package bai6;

public class KhachHang {
    private String hoTen101;
    private int tuoi101;
    private String soCMND101;

    public KhachHang(String hoTen101, int tuoi101, String soCMND101) {
        this.hoTen101 = hoTen101;
        this.tuoi101 = tuoi101;
        this.soCMND101 = soCMND101;
    }

    public String getSoCMND101() { return soCMND101; }

    @Override
    public String toString() {
        return hoTen101 + " | " + tuoi101 + " | CMND:" + soCMND101;
    }
}
