package bai3;

public class TapChi extends TaiLieu {
    private int soPhatHanh101;
    private int thangPhatHanh101;

    public TapChi(String maTaiLieu101, String nhaXuatBan101, int soBanPhatHanh101,
                  int soPhatHanh101, int thangPhatHanh101) {
        super(maTaiLieu101, nhaXuatBan101, soBanPhatHanh101);
        this.soPhatHanh101 = soPhatHanh101;
        this.thangPhatHanh101 = thangPhatHanh101;
    }

    @Override
    public String toString() {
        return "TapChi{" + super.toString() +
               ", soPH=" + soPhatHanh101 +
               ", thangPH=" + thangPhatHanh101 + "}";
    }
}
