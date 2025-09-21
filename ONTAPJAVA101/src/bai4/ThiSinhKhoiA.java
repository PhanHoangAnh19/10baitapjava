package bai4;

public class ThiSinhKhoiA extends ThiSinh {
    private double toan101, ly101, hoa101;

    public ThiSinhKhoiA(String sbd101, String hoTen101, String diaChi101, int ut101,
                        double toan101, double ly101, double hoa101) {
        super(sbd101, hoTen101, diaChi101, ut101);
        this.toan101 = toan101;
        this.ly101 = ly101;
        this.hoa101 = hoa101;
    }

    @Override
    public double tongDiem101() {
        return toan101 + ly101 + hoa101 + mucUuTien101;
    }

    @Override
    public String toString() {
        return "[Khoi A] " + super.toString() +
               " (Toan=" + toan101 + ", Ly=" + ly101 + ", Hoa=" + hoa101 + ")";
    }
}
