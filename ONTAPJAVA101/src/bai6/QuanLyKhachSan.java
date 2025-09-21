package bai6;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;

public class QuanLyKhachSan {
    private final List<ThuePhong> ds101 = new ArrayList<>();

    public void them101(ThuePhong tp101){ ds101.add(tp101); }

    public boolean xoaTheoCMND101(String cmnd101){
        return ds101.removeIf(tp -> tp.getKh101().getSoCMND101().equalsIgnoreCase(cmnd101));
    }

    public List<ThuePhong> timTheoCMND101(String cmnd101){
        String key101 = cmnd101.toLowerCase(Locale.ROOT).trim();
        return ds101.stream()
                .filter(tp -> tp.getKh101().getSoCMND101().toLowerCase(Locale.ROOT).contains(key101))
                .collect(Collectors.toList());
    }

    public double tinhTienTheoCMND101(String cmnd101){
        return ds101.stream()
                .filter(tp -> tp.getKh101().getSoCMND101().equalsIgnoreCase(cmnd101))
                .mapToDouble(ThuePhong::tinhTien101)
                .sum();
    }

    public void hienThi101(){
        if (ds101.isEmpty()){ System.out.println("Danh sach trong."); return; }
        ds101.forEach(System.out::println);
    }
}
