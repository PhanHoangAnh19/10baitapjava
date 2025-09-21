package bai3;

public abstract class TaiLieu {
    protected String maTaiLieu101;
    protected String nhaXuatBan101;
    protected int soBanPhatHanh101;

    public TaiLieu(String maTaiLieu101, String nhaXuatBan101, int soBanPhatHanh101) {
        this.maTaiLieu101 = maTaiLieu101;
        this.nhaXuatBan101 = nhaXuatBan101;
        this.soBanPhatHanh101 = soBanPhatHanh101;
    }

    public String getMaTaiLieu101() { return maTaiLieu101; }
    public String getNhaXuatBan101() { return nhaXuatBan101; }
    public int getSoBanPhatHanh101() { return soBanPhatHanh101; }

    @Override
    public String toString() {
        return "ma=" + maTaiLieu101 +
               ", nxb=" + nhaXuatBan101 +
               ", soBan=" + soBanPhatHanh101;
    }
}
