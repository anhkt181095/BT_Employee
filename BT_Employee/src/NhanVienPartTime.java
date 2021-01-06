public class NhanVienPartTime extends NhanVien {
    private int soGioLamViec;
    public NhanVienPartTime(){
        super();
    }
    public int getSoGioLamViec() {
        return soGioLamViec;
    }

    public void setSoGioLamViec(int soGioLamViec) {
        this.soGioLamViec = soGioLamViec;
    }

    @Override
    public void nhap() {
        super.nhap();
        System.out.println("Nhập số giờ làm việc:");
        soGioLamViec = scanner.nextInt();
    }

    @Override
    public int tinhLuong() {
        this.luong = soGioLamViec * 100000;
        return this.luong;
    }

    @Override
    public String toString() {
       return "Là Nhan Vien Part Time {" +
               "maNhanVien='" + this.getMaNhanVien() + '\'' +
               ", hoTen='" + this.getHoTen() + '\'' +
               ", soDienThoai='" + this.getSoDienThoai() + '\'' +
               ", mail='" + this.getMail() + '\'' +
               ", tuoi=" + this.getTuoi() +
               ", luong=" + this.tinhLuong() + "}";
    }
}
