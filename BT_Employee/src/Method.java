import java.util.ArrayList;
import java.util.Scanner;

public class Method {
    Scanner sc = new Scanner(System.in);
    ArrayList<NhanVien> nhanViens = new ArrayList<>();
    NhanVienFullTime nhanVienFullTime = new NhanVienFullTime();
    NhanVienPartTime nhanVienPartTime = new NhanVienPartTime();

    public ArrayList<NhanVien> getNhanViens() {
        return nhanViens;
    }

    public void setNhanViens(ArrayList<NhanVien> nhanViens) {
        this.nhanViens = nhanViens;
    }

    public void add() {
        System.out.println("1: Thêm nhân viên Full Time");
        System.out.println("2: Thêm nhân viên Part Time");
        System.out.println("0: Trở lại");

        int n = Integer.parseInt(sc.nextLine());
        switch (n) {
            case 1:
                nhanVienFullTime.nhap();
                getNhanViens().add(nhanVienFullTime);
                System.out.println("Thêm Thành Công!");
                break;
            case 2:
                nhanVienPartTime.nhap();
                getNhanViens().add(nhanVienPartTime);
                System.out.println("Thêm Thành Công!");
                break;
        }
    }
    public void showNhanVienPartTime(){
        for (NhanVien nhanVien: nhanViens ){
            if (nhanVien instanceof NhanVienPartTime ){
                System.out.println(getNhanViens().toString());
            }else if (nhanVien instanceof NhanVienFullTime);
            System.out.println(getNhanViens().toString());
        }
    }

    public void menu() {
        int cases = 4;
        do {
            System.out.println("1: Thêm Nhân Viên");
            System.out.println("2: Hiển thị nhân viên Full Time");
            try {
                int n = Integer.parseInt(sc.nextLine());
                switch (n) {
                    case 1:
                        add();
                        break;
                    case 2:
                        showNhanVienPartTime();
                        break;
                }
            } catch (NullPointerException | NumberFormatException e) {
                System.out.println("mời chọn lại:");
            }

        }while (cases != 0) ;
    }
}
