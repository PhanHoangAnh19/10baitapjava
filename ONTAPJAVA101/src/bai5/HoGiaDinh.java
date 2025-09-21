package bai5;

import java.util.ArrayList;
import java.util.List;

public class HoGiaDinh {
    private String soNha101;
    private int soThanhVien101;
    private final List<Nguoi> thanhVien101 = new ArrayList<>();

    public HoGiaDinh(String soNha101) {
        this.soNha101 = soNha101;
    }

    public void themThanhVien101(Nguoi n101) {
        thanhVien101.add(n101);
        soThanhVien101 = thanhVien101.size();
    }

    public String getSoNha101() { return soNha101; }
    public List<Nguoi> getThanhVien101() { return thanhVien101; }

    @Override
    public String toString() {
        StringBuilder sb101 = new StringBuilder("So nha: " + soNha101 + " | So tv: " + soThanhVien101);
        for (Nguoi n101 : thanhVien101) sb101.append("\n  - ").append(n101);
        return sb101.toString();
    }
}
