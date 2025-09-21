package bai4;

public class ThiSinhKhoiC extends ThiSinh {
    private double van101, su101, dia101;

    public ThiSinhKhoiC(String sbd101, String hoTen101, String diaChi101, int ut101,
                        double van101, double su101, double dia101) {
        super(sbd101, hoTen101, diaChi101, ut101);
        this.van101 = van101;
        this.su101 = su101;
        this.dia101 = dia101;
    }

    @Override
    public double tongDiem101() {
        return van101 + su101 + dia101 + mucUuTien101;
    }

    @Override
    public String toString() {
        return "[Khoi C] " + super.toString() +
               " (Van=" + van101 + ", Su=" + su101 + ", Dia=" + dia101 + ")";
    }
}
