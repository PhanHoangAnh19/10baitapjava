package bai9;

public class SinhVienTV {
    private String hoTen101;
    private String mssv101;
    private String lop101;

    public SinhVienTV(String hoTen101, String mssv101, String lop101) {
        this.hoTen101 = hoTen101;
        this.mssv101 = mssv101;
        this.lop101 = lop101;
    }

    public String getMssv101() { return mssv101; }

    @Override
    public String toString() {
        return hoTen101 + " | " + mssv101 + " | " + lop101;
    }
}
