package bai5;

public class Nguoi {
    private String hoTen101;
    private int tuoi101;
    private String ngheNghiep101;
    private String soCMND101;

    public Nguoi(String hoTen101, int tuoi101, String ngheNghiep101, String soCMND101) {
        this.hoTen101 = hoTen101;
        this.tuoi101 = tuoi101;
        this.ngheNghiep101 = ngheNghiep101;
        this.soCMND101 = soCMND101;
    }

    public int getTuoi101() { return tuoi101; }
    public String getSoCMND101() { return soCMND101; }

    @Override
    public String toString() {
        return hoTen101 + " | " + tuoi101 + " | " + ngheNghiep101 + " | CMND:" + soCMND101;
    }
}
