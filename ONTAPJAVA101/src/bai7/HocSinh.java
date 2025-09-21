package bai7;

public class HocSinh {
    private String hoTen101;
    private int tuoi101;
    private String queQuan101;
    private String lop101;

    public HocSinh(String hoTen101, int tuoi101, String queQuan101, String lop101) {
        this.hoTen101 = hoTen101;
        this.tuoi101 = tuoi101;
        this.queQuan101 = queQuan101;
        this.lop101 = lop101;
    }

    public int getTuoi101() { return tuoi101; }
    public String getQueQuan101() { return queQuan101; }

    @Override
    public String toString() {
        return hoTen101 + " | " + tuoi101 + " | " + queQuan101 + " | " + lop101;
    }
}
