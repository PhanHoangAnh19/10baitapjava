package bai4;

public class ThiSinhKhoiB extends ThiSinh {
    private double toan101, hoa101, sinh101;

    public ThiSinhKhoiB(String sbd101, String hoTen101, String diaChi101, int ut101,
                        double toan101, double hoa101, double sinh101) {
        super(sbd101, hoTen101, diaChi101, ut101);
        this.toan101 = toan101;
        this.hoa101 = hoa101;
        this.sinh101 = sinh101;
    }

    @Override
    public double tongDiem101() {
        return toan101 + hoa101 + sinh101 + mucUuTien101;
    }

    @Override
    public String toString() {
        return "[Khoi B] " + super.toString() +
               " (Toan=" + toan101 + ", Hoa=" + hoa101 + ", Sinh=" + sinh101 + ")";
    }
}
