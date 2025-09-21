package bai9;

import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;

public class QuanLyTheMuon {
    private final List<TheMuon> ds101 = new ArrayList<>();

    public void them101(TheMuon tm101){ ds101.add(tm101); }

    public boolean xoaTheoMaThe101(String maThe101){
        return ds101.removeIf(t -> t.toString().startsWith(maThe101 + " "));
    }

    public List<TheMuon> timTheoMSSV101(String mssv101){
        String key101 = mssv101.toLowerCase(Locale.ROOT).trim();
        return ds101.stream()
                .filter(t -> t.getSv101().getMssv101().toLowerCase(Locale.ROOT).contains(key101))
                .collect(Collectors.toList());
    }

    public List<TheMuon> timTheoMaSach101(String maSach101){
        String key101 = maSach101.toLowerCase(Locale.ROOT).trim();
        return ds101.stream()
                .filter(t -> t.getMaSach101().toLowerCase(Locale.ROOT).contains(key101))
                .collect(Collectors.toList());
    }

    public List<TheMuon> quaHanTinhDen101(LocalDate ngay101){
        return ds101.stream()
                .filter(t -> t.getHanTra101().isBefore(ngay101))
                .collect(Collectors.toList());
    }

    public List<TheMuon> tatCa101(){ return new ArrayList<>(ds101); }
}
