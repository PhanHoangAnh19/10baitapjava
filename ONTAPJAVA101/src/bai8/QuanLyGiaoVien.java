package bai8;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;

public class QuanLyGiaoVien {
    private final List<GiaoVien> ds101 = new ArrayList<>();

    public void them101(GiaoVien gv101){ ds101.add(gv101); }

    public boolean xoaTheoMa101(String ma101){
        return ds101.removeIf(gv -> gv.getMaGV101().equalsIgnoreCase(ma101));
    }

    public List<GiaoVien> timTheoTen101(String ten101){
        String key101 = ten101.toLowerCase(Locale.ROOT).trim();
        return ds101.stream()
                .filter(gv -> gv.getHoTen101().toLowerCase(Locale.ROOT).contains(key101))
                .collect(Collectors.toList());
    }

    public List<GiaoVien> sapXepTheoThucLinhGiam101(){
        return ds101.stream()
                .sorted(Comparator.comparingDouble(GiaoVien::thucLinh101).reversed())
                .collect(Collectors.toList());
    }

    public List<GiaoVien> tatCa101(){ return new ArrayList<>(ds101); }
}
