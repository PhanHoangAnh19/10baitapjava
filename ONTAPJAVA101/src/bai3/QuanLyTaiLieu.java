package bai3;

import java.util.*;
import java.util.stream.Collectors;

public class QuanLyTaiLieu {
    private final List<TaiLieu> ds101 = new ArrayList<>();

    public void them101(TaiLieu tl101) { ds101.add(tl101); }

    // Xoá theo mã
    public boolean xoaTheoMa101(String ma101) {
        return ds101.removeIf(tl -> tl.maTaiLieu101.equalsIgnoreCase(ma101));
    }

    // Tìm theo loại
    public List<TaiLieu> timTheoLoai101(Class<?> loai101) {
        return ds101.stream()
                .filter(loai101::isInstance)
                .collect(Collectors.toList());
    }

    // Tìm theo NXB (chứa chuỗi)
    public List<TaiLieu> timTheoNXB101(String nxb101) {
        String key101 = nxb101.toLowerCase(Locale.ROOT).trim();
        return ds101.stream()
                .filter(tl -> tl.nhaXuatBan101.toLowerCase(Locale.ROOT).contains(key101))
                .collect(Collectors.toList());
    }

    public void hienThi101() {
        if (ds101.isEmpty()) {
            System.out.println("Danh sach tai lieu rong.");
            return;
        }
        ds101.forEach(System.out::println);
    }
}
