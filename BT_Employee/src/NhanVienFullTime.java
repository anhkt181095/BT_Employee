public class NhanVienFullTime extends NhanVien {
    private int tienPhat;
    private int tienThuong;
    private int luongCung;
    public NhanVienFullTime() {
        super();
    }

    public int getTienPhat() {
        return tienPhat;
    }

    public void setTienPhat(int tienPhat) {
        this.tienPhat = tienPhat;
    }

    public int getTienThuong() {
        return tienThuong;
    }

    public void setTienThuong(int tienThuong) {
        this.tienThuong = tienThuong;
    }

    public int getLuongCung() {
        return luongCung;
    }

    public void setLuongCung(int luongCung) {
        this.luongCung = luongCung;
    }

    @Override
    public void nhap() {
        super.nhap();
        System.out.println("Nhập số tiền phạt:");
        tienPhat = scanner.nextInt();
        System.out.println("Nhập số tiền thưởng");
        tienThuong = scanner.nextInt();
        System.out.println("Nhập lương cứng:");
        luongCung = scanner.nextInt();
    }

    @Override
    public int tinhLuong() {
        this.luong = luongCung + (this.tienThuong - this.tienPhat);
        return this.luong;
    }

    @Override
    public String toString() {
        return "Là Nhân Viên Full Time {" +
                "maNhanVien='" + this.getMaNhanVien() + '\'' +
                ", hoTen='" + this.getHoTen() + '\'' +
                ", soDienThoai='" + this.getSoDienThoai() + '\'' +
                ", mail='" + this.getMail() + '\'' +
                ", tuoi=" + this.getTuoi() +
                ", luong=" + this.tinhLuong() + "}";
    }
}
