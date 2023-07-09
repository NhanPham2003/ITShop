package domainmodels;
// Generated Nov 19, 2022 2:49:48 PM by Hibernate Tools 4.3.1


import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * KhachHang generated by hbm2java
 */
@Entity
@Table(name="KhachHang"
    ,schema="dbo"
    ,catalog="ProjectOne"
)
public class KhachHang  implements java.io.Serializable {


     private String id;
     private LoaiKh loaiKh;
     private String ten;
     private Date ngaySinh;
     private String sdt;
     private String diaChi;
     private String email;
     private int tinhTrang;
     private Set<HoaDon> hoaDons = new HashSet<HoaDon>(0);
     private Set<PhieuBaoHanh> phieuBaoHanhs = new HashSet<PhieuBaoHanh>(0);

    public KhachHang() {
    }

	
    public KhachHang(String id) {
        this.id = id;
    }
    public KhachHang(String id, LoaiKh loaiKh, String ten, Date ngaySinh, String sdt, String diaChi, String email, int tinhTrang, Set<HoaDon> hoaDons, Set<PhieuBaoHanh> phieuBaoHanhs) {
       this.id = id;
       this.loaiKh = loaiKh;
       this.ten = ten;
       this.ngaySinh = ngaySinh;
       this.sdt = sdt;
       this.diaChi = diaChi;
       this.email = email;
       this.tinhTrang = tinhTrang;
       this.hoaDons = hoaDons;
       this.phieuBaoHanhs = phieuBaoHanhs;
    }

    public KhachHang(String id, LoaiKh loaiKh, String ten, Date ngaySinh, String sdt, String diaChi, String email, int tinhTrang) {
        this.id = id;
        this.loaiKh = loaiKh;
        this.ten = ten;
        this.ngaySinh = ngaySinh;
        this.sdt = sdt;
        this.diaChi = diaChi;
        this.email = email;
        this.tinhTrang = tinhTrang;
    }
   
     @Id 

    
    @Column(name="Id", unique=true, nullable=false, length=10)
    public String getId() {
        return this.id;
    }
    
    public void setId(String id) {
        this.id = id;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="idloaiKH")
    public LoaiKh getLoaiKh() {
        return this.loaiKh;
    }
    
    public void setLoaiKh(LoaiKh loaiKh) {
        this.loaiKh = loaiKh;
    }

    
    @Column(name="Ten")
    public String getTen() {
        return this.ten;
    }
    
    public void setTen(String ten) {
        this.ten = ten;
    }

    @Temporal(TemporalType.DATE)
    @Column(name="NgaySinh", length=10)
    public Date getNgaySinh() {
        return this.ngaySinh;
    }
    
    public void setNgaySinh(Date ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    
    @Column(name="Sdt", length=30)
    public String getSdt() {
        return this.sdt;
    }
    
    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    
    @Column(name="DiaChi")
    public String getDiaChi() {
        return this.diaChi;
    }
    
    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    
    @Column(name="Email")
    public String getEmail() {
        return this.email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }

    
    @Column(name="TinhTrang")
    public int getTinhTrang() {
        return this.tinhTrang;
    }
    
    public void setTinhTrang(int tinhTrang) {
        this.tinhTrang = tinhTrang;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="khachHang")
    public Set<HoaDon> getHoaDons() {
        return this.hoaDons;
    }
    
    public void setHoaDons(Set<HoaDon> hoaDons) {
        this.hoaDons = hoaDons;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="khachHang")
    public Set<PhieuBaoHanh> getPhieuBaoHanhs() {
        return this.phieuBaoHanhs;
    }
    
    public void setPhieuBaoHanhs(Set<PhieuBaoHanh> phieuBaoHanhs) {
        this.phieuBaoHanhs = phieuBaoHanhs;
    }

    @Override
    public String toString() {
        return ten +'-'+ sdt;
    }
   
    public String getTTKhachHang(){
         return "KhachHang{" + "id=" + id + ", loaiKh=" + loaiKh + ", ten=" + ten + ", ngaySinh=" + ngaySinh + ", sdt=" + sdt + ", diaChi=" + diaChi + ", email=" + email + ", tinhTrang=" + tinhTrang + '}';
    }
    
    


}

