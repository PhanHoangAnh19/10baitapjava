package bai9;

import java.time.LocalDate;

public class TheMuon {
    private String maThe101;
    private SinhVienTV sv101;
    private String maSach101;
    private LocalDate ngayMuon101;
    private LocalDate hanTra101;

    public TheMuon(String maThe101, SinhVienTV sv101, String maSach101,
                   LocalDate ngayMuon101, LocalDate hanTra101) {
        this.maThe101 = maThe101;
        this.sv101 = sv101;
        this.maSach101 = maSach101;
        this.ngayMuon101 = ngayMuon101;
        this.hanTra101 = hanTra101;
    }

    public SinhVienTV getSv101() { return sv101; }
    public String getMaSach101() { return maSach101; }
    public LocalDate getHanTra101() { return hanTra101; }

    @Override
    public String toString() {
        return maThe101 + " | " + sv101 + " | " + maSach101 +
               " | " + ngayMuon101 + " -> " + hanTra101;
    }
}
