package bai4;

import java.util.*;
import java.util.stream.Collectors;

public class TuyenSinh {
    private final List<ThiSinh> ds101 = new ArrayList<>();

    public void them101(ThiSinh ts101) { ds101.add(ts101); }

    public List<ThiSinh> timTheoSBD101(String sbd101) {
        String key101 = sbd101.trim().toLowerCase(Locale.ROOT);
        return ds101.stream()
                .filter(ts -> ts.soBaoDanh101.toLowerCase(Locale.ROOT).contains(key101))
                .collect(Collectors.toList());
    }

    public List<ThiSinh> locDauTheoDiemChuan101(double diemChuan101) {
        return ds101.stream()
                .filter(ts -> ts.tongDiem101() >= diemChuan101)
                .collect(Collectors.toList());
    }

    public void hienThi101() {
        if (ds101.isEmpty()) {
            System.out.println("Danh sach thi sinh rong.");
            return;
        }
        ds101.forEach(System.out::println);
    }
}
