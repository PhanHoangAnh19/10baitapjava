package bai6;

public class Phong {
    private LoaiPhong101 loai101;

    public Phong(LoaiPhong101 loai101) { this.loai101 = loai101; }
    public double getGia101(){ return loai101.gia101; }
    public LoaiPhong101 getLoai101(){ return loai101; }

    @Override
    public String toString() { return "Phong " + loai101 + " (gia " + loai101.gia101 + ")"; }
}
