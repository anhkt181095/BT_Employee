import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NhanVien {
    private String maNhanVien, hoTen, soDienThoai, mail;
    private int tuoi;
    protected int luong;

    Scanner scanner = new Scanner(System.in);

    public NhanVien() {

        super();
    }

    public NhanVien(String maNhanVien, String hoTen, String soDienThoai, String mail, int tuoi,
                  int luong) {
        super();
        this.maNhanVien = maNhanVien;
        this.hoTen = hoTen;
        this.soDienThoai = soDienThoai;
        this.mail = mail;
        this.tuoi = tuoi;
        this.luong = luong;
    }
    public String getMaNhanVien() {

        return this.maNhanVien;
    }

    public void setMaNhanVien(String maNhanVien) {

        this.maNhanVien = maNhanVien;
    }

    public String getHoTen() {

        return hoTen;
    }

    public void setHoTen(String hoTen) {

        this.hoTen = hoTen;
    }

    public String getSoDienThoai()
    {
        return soDienThoai;
    }

    public void setSoDienThoai(String soDienThoai) {
        this.soDienThoai = soDienThoai;
    }

    public String getMail() {

        return mail;
    }

    public void setMail(String mail) {

        this.mail = mail;
    }

    public int getTuoi() {

        return tuoi;
    }

    public void setTuoi(int tuoi) {

        this.tuoi = tuoi;
    }

    public int getLuong() {

        return luong;
    }

    public void setLuong(int luong) {

        this.luong = luong;
    }


    public void nhap() {
        System.out.print("Nhập mã nhân viên: \n");
        maNhanVien = scanner.nextLine();

        System.out.print("Nhập họ và tên nhân viên: \n");
        hoTen = scanner.nextLine();

        System.out.print("Nhập số điện thoại: \n");
        soDienThoai = scanner.nextLine();

        System.out.print("Nhập mail: \n");
       mail = scanner.nextLine();

        System.out.print("Nhập tuổi: \n");
        tuoi = scanner.nextInt();
    }
    public int tinhLuong() {
        return 0;
    }

    @Override
    public String toString() {
        return "NhanVien{" +
                "maNhanVien='" + maNhanVien + '\'' +
                ", hoTen='" + hoTen + '\'' +
                ", soDienThoai='" + soDienThoai + '\'' +
                ", mail='" + mail + '\'' +
                ", tuoi=" + tuoi +
                ", luong=" + luong +
                '}';
    }
}
