package bai1;

public class MainBai1 {
    public static void main(String[] args) {
        PhanSo sp1_101 = new PhanSo(1, 2);
        PhanSo sp2_101 = new PhanSo(3, 4);

        System.out.println("Phân số 1: " + sp1_101);
        System.out.println("Phân số 2: " + sp2_101);

        PhanSo spTong_101 = sp1_101.cong101(sp2_101);
        System.out.println("Tổng: " + spTong_101);

        PhanSo spHieu_101 = sp1_101.tru101(sp2_101);
        System.out.println("Hiệu: " + spHieu_101);

        PhanSo spTich_101 = sp1_101.nhan101(sp2_101);
        System.out.println("Tích: " + spTich_101);

        PhanSo spThuong_101 = sp1_101.chia101(sp2_101);
        System.out.println("Thương: " + spThuong_101);

        System.out.println("sp1_101 có tối giản không? " + sp1_101.laToiGian101());
    }
}
