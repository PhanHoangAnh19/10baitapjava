package bai3;

import java.time.LocalDate;

public class Bao extends TaiLieu {
    private LocalDate ngayPhatHanh101;

    public Bao(String maTaiLieu101, String nhaXuatBan101, int soBanPhatHanh101,
               LocalDate ngayPhatHanh101) {
        super(maTaiLieu101, nhaXuatBan101, soBanPhatHanh101);
        this.ngayPhatHanh101 = ngayPhatHanh101;
    }

    @Override
    public String toString() {
        return "Bao{" + super.toString() +
               ", ngayPH=" + ngayPhatHanh101 + "}";
    }
}
