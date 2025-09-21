package bai1;

public class PhanSo {
    private int tu101;
    private int mau101;

    public PhanSo() {
        this.tu101 = 0;
        this.mau101 = 1;
    }

    public PhanSo(int tu101, int mau101) {
        if (mau101 == 0) throw new IllegalArgumentException("Mẫu số không được 0");
        this.tu101 = tu101;
        this.mau101 = mau101;
        rutGon101();
    }

    public int getTu101() { return tu101; }
    public int getMau101() { return mau101; }

    private int uscln101(int a101, int b101) {
        if (b101 == 0) return Math.abs(a101);
        return uscln101(b101, a101 % b101);
    }

    public void rutGon101() {
        int g101 = uscln101(tu101, mau101);
        tu101 /= g101;
        mau101 /= g101;
        if (mau101 < 0) {
            tu101 = -tu101;
            mau101 = -mau101;
        }
    }

    public boolean laToiGian101() {
        return uscln101(tu101, mau101) == 1;
    }

    public PhanSo cong101(PhanSo p101) {
        return new PhanSo(this.tu101 * p101.mau101 + p101.tu101 * this.mau101,
                          this.mau101 * p101.mau101);
    }

    public PhanSo tru101(PhanSo p101) {
        return new PhanSo(this.tu101 * p101.mau101 - p101.tu101 * this.mau101,
                          this.mau101 * p101.mau101);
    }

    public PhanSo nhan101(PhanSo p101) {
        return new PhanSo(this.tu101 * p101.tu101, this.mau101 * p101.mau101);
    }

    public PhanSo chia101(PhanSo p101) {
        return new PhanSo(this.tu101 * p101.mau101, this.mau101 * p101.tu101);
    }

    @Override
    public String toString() {
        return tu101 + "/" + mau101;
    }
}

