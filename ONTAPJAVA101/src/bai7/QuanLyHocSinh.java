package bai7;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;

public class QuanLyHocSinh {
    private final List<HocSinh> ds101 = new ArrayList<>();

    public void them101(HocSinh hs101) { ds101.add(hs101); }

    public long demTuoiBang101(int tuoi101) {
        return ds101.stream().filter(h -> h.getTuoi101() == tuoi101).count();
    }

    public List<HocSinh> locTuoiVaQue101(int tuoi101, String que101) {
        String q101 = que101.toLowerCase(Locale.ROOT).trim();
        return ds101.stream()
                .filter(h -> h.getTuoi101() == tuoi101 &&
                             h.getQueQuan101().toLowerCase(Locale.ROOT).contains(q101))
                .collect(Collectors.toList());
    }

    public List<HocSinh> tatCa101(){ return new ArrayList<>(ds101); }
}
