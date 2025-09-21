package bai10;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;

public class QuanLyBienLai {
    private final List<BienLaiDien> ds101 = new ArrayList<>();

    public void them101(BienLaiDien bl101){ ds101.add(bl101); }

    public List<BienLaiDien> timTheoMaCongTo101(String maCT101){
        String key101 = maCT101.toLowerCase(Locale.ROOT).trim();
        return ds101.stream()
                .filter(b -> b.getKh101().getMaCongTo101().toLowerCase(Locale.ROOT).contains(key101))
                .collect(Collectors.toList());
    }

    public boolean capNhatChiSoMoiTheoMaCT101(String maCT101, int chiSoMoi101){
        boolean ok101 = false;
        for (BienLaiDien b101 : ds101) {
            if (b101.getKh101().getMaCongTo101().equalsIgnoreCase(maCT101)) {
                b101.setChiSoMoi101(chiSoMoi101);
                ok101 = true;
            }
        }
        return ok101;
    }

    public double tongTienTheoMaCT101(String maCT101){
        return ds101.stream()
                .filter(b -> b.getKh101().getMaCongTo101().equalsIgnoreCase(maCT101))
                .mapToDouble(BienLaiDien::soTien101)
                .sum();
    }

    public List<BienLaiDien> tatCa101(){ return new ArrayList<>(ds101); }
}
