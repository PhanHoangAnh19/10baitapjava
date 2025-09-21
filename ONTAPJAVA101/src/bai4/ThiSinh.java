package bai4;

public abstract class ThiSinh {
    protected String soBaoDanh101;
    protected String hoTen101;
    protected String diaChi101;
    protected int mucUuTien101; 

    public ThiSinh(String soBaoDanh101, String hoTen101, String diaChi101, int mucUuTien101) {
        this.soBaoDanh101 = soBaoDanh101;
        this.hoTen101 = hoTen101;
        this.diaChi101 = diaChi101;
        this.mucUuTien101 = mucUuTien101;
    }

    /** Tổng điểm (3 môn) + điểm ưu tiên */
    public abstract double tongDiem101();

    public String getSoBaoDanh101() { return soBaoDanh101; }

    @Override
    public String toString() {
        return "SBD=" + soBaoDanh101 + ", HoTen=" + hoTen101 + ", DiaChi=" + diaChi101 +
               ", UT=" + mucUuTien101 + ", Tong=" + String.format("%.2f", tongDiem101());
    }
}
