package Task2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public class Test {
	public static void main(String[] args) {
		List<AnPham> ap = new ArrayList<>();
		
		List<ChuongSach> a = new ArrayList<>();
		a.add(new ChuongSach("May va gio", 140));
		a.add(new ChuongSach("The ky 21", 280));
		
		TapChi t1 = new TapChi("Muc tim", 30, 2014, "Lan Rua", 20, "Tuoi hoc tro");
		TapChi t2 = new TapChi("Muc tim", 35, 1979, "Lan Rua", 20, "Tuoi hoc tro");
		TapChi t3 = new TapChi("Muc tim", 30, 2016, "Lan Rua", 20, "Tuoi hoc tro");
		ap.add(t1);
		ap.add(t2);
		ap.add(t3);
		
		
		SachThamKhao s1 = new SachThamKhao("Tu hoc coding", 350, 2021, "Nguyen Thi B", 250, "giao duc", a);
		SachThamKhao s2 = new SachThamKhao("Da bong so 1", 120, 2019, "Phan Thi A", 65, "the thao", a);
		SachThamKhao s3 = new SachThamKhao("Nghe thuat cam hoa", 75, 2015, "Phan Thi A", 90, "nghe thuat", a);
		ap.add(s1);
		ap.add(s2);
		ap.add(s3);
		
// phuong thuc ktra loai cua an pham
		String loaiAnPham1 = s1.loaiAnPham();
		String loaiAnPham2 = t1.loaiAnPham();
		System.out.println("Loại ấn phẩm: " + loaiAnPham1);
		System.out.println("Loại ấn phẩm: " + loaiAnPham2);
		
// phuong thuc ktra an pham la tap chi va co tg xuat ban cach day 10 nam
		boolean b1 = t2.kiemTraXuatBanVaLaTapChi();
		boolean b2 = s3.kiemTraXuatBanVaLaTapChi();
		System.out.println("Là tạp chí và xuất bản cách 10 năm: " + b2);
		System.out.println("Là tạp chí và xuất bản cách 10 năm: " + b1);
		
// phuong thuc ktra 2 an pham co cung loai va cung tac gia khonh
		boolean cungLoaiVaTacGia = t1.kiemTraCungLoaiCungTacGia(t2);
		boolean cungLoaiVaTacGia2 = s1.kiemTraCungLoaiCungTacGia(s3);
		System.out.println("Ấn phẩm có cùng loại và tác giả: " + cungLoaiVaTacGia);
		System.out.println("Ấn phẩm có cùng loại và tác giả: " + cungLoaiVaTacGia2);
		
// phuong thuc tinh tong tien cua cac an pham trong nha sach
		DanhMucAnPham apham = new DanhMucAnPham(ap);
		int tongTien = apham.tinhTongTien();
		System.out.println("Tổng tiền các ấn phẩm trong nhà sách: "+ tongTien);
		
// phuong thuc tim quyen sach tham khao co chuong sach nhieu trang nhat
		SachThamKhao soTrangLonNhat = apham.getNhieuTrangNhat();
		System.out.println("Quyển sách tham khảo có chương sách nhiều trang nhất:" + soTrangLonNhat);
		
// phuong thuc tim trong danh sach an pham co chua tap chi nao co ten cho truoc hay khong
		boolean coTenChoTruoc = apham.coTapChi("Tuoi hoc tro");
		boolean coTenChoTruoc1 = apham.coTapChi("Da bong so 1");
		System.out.println("Ấn phẩm có chứa tạp chí có tên cho trước ko: "+ coTenChoTruoc);
		System.out.println("Ấn phẩm có chứa tạp chí có tên cho trước ko: "+ coTenChoTruoc1);

// phuong thuc lay ra danh sach cac tap chi dc xuat ban tu mot nam cho trc
		int namChoTruoc = 2014;
		List<AnPham> tapChi = apham.xuatBan1NamTrc(namChoTruoc);
		System.out.println("Danh sách tạp chí đc xuất bản từ năm cho trước: " + Arrays.toString(tapChi.toArray()));
		
// phuong thưc sap xep an pham tang dan theo tieu de và giam dan theo nam xuat ban
		Collections.sort(ap);
		System.out.println("Danh sách các ấn phẩm đã được sắp xếp: " + Arrays.toString(ap.toArray()));
		
// phuong thuc thong ke so luong an pham theo nam xuat ban
		System.out.println("Thống kê ấn phâm theo năm:");
		Map<Integer, Integer> thongKe = apham.anPhamTheoNam();
		
		
	}

}