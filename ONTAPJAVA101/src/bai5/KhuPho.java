package bai5;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;

public class KhuPho {
    private final List<HoGiaDinh> dsHo101 = new ArrayList<>();

    public void themHo101(HoGiaDinh ho101) { dsHo101.add(ho101); }

    public List<HoGiaDinh> timHoTheoSoNha101(String soNha101) {
        String key101 = soNha101.toLowerCase(Locale.ROOT).trim();
        return dsHo101.stream()
                .filter(h -> h.getSoNha101().toLowerCase(Locale.ROOT).contains(key101))
                .collect(Collectors.toList());
    }

    public List<Nguoi> timNguoiTheoCMND101(String cmnd101) {
        List<Nguoi> kq101 = new ArrayList<>();
        for (HoGiaDinh ho101 : dsHo101)
            for (Nguoi n101 : ho101.getThanhVien101())
                if (n101.getSoCMND101().equalsIgnoreCase(cmnd101)) kq101.add(n101);
        return kq101;
    }

    public List<HoGiaDinh> hoCoNguoiTuoiTu101(int tuoiMin101) {
        return dsHo101.stream()
                .filter(h -> h.getThanhVien101().stream().anyMatch(n -> n.getTuoi101() >= tuoiMin101))
                .collect(Collectors.toList());
    }

    public void hienThi101() {
        if (dsHo101.isEmpty()) { System.out.println("Khong co ho nao."); return; }
        dsHo101.forEach(System.out::println);
    }
}
