package bai8;

public class GiaoVien {
    private String maGV101;
    private String hoTen101;
    private double luongCung101;
    private double thuong101;
    private double phat101;

    public GiaoVien(String maGV101, String hoTen101, double luongCung101, double thuong101, double phat101) {
        this.maGV101 = maGV101;
        this.hoTen101 = hoTen101;
        this.luongCung101 = luongCung101;
        this.thuong101 = thuong101;
        this.phat101 = phat101;
    }

    public String getMaGV101() { return maGV101; }
    public String getHoTen101() { return hoTen101; }
    public double getLuongCung101() { return luongCung101; }
    public double getThuong101() { return thuong101; }
    public double getPhat101() { return phat101; }

    public double thucLinh101() {
        return luongCung101 + thuong101 - phat101;
    }

    @Override
    public String toString() {
        return maGV101 + " | " + hoTen101 + " | thucLinh=" + thucLinh101();
    }
}
