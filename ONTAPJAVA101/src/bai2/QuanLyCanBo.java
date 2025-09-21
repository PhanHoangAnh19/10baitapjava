package bai2;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class QuanLyCanBo {
    private final List<CanBo> ds101 = new ArrayList<>();

    public void them101(CanBo cb101) {
        ds101.add(cb101);
    }

    public List<CanBo> timTheoTen101(String ten101) {
        String key101 = ten101.toLowerCase(Locale.ROOT).trim();
        List<CanBo> kq101 = new ArrayList<>();
        for (CanBo cb101 : ds101) {
            if (cb101.hoTen101.toLowerCase(Locale.ROOT).contains(key101)) {
                kq101.add(cb101);
            }
        }
        return kq101;
    }

    public void hienThi101() {
        if (ds101.isEmpty()) {
            System.out.println("Danh sach rong.");
            return;
        }
        for (CanBo cb101 : ds101) {
            System.out.println(cb101);
        }
    }
}
