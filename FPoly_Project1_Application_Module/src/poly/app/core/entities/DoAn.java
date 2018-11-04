package poly.app.core.entities;
// Generated Nov 3, 2018 9:52:40 PM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * DoAn generated by hbm2java
 */
public class DoAn  implements java.io.Serializable {


     private String id;
     private LoaiDoAn loaiDoAn;
     private String ten;
     private Set<DoAnChiTiet> doAnChiTiets = new HashSet<DoAnChiTiet>(0);

    public DoAn() {
    }

	
    public DoAn(String id, LoaiDoAn loaiDoAn, String ten) {
        this.id = id;
        this.loaiDoAn = loaiDoAn;
        this.ten = ten;
    }
    public DoAn(String id, LoaiDoAn loaiDoAn, String ten, Set<DoAnChiTiet> doAnChiTiets) {
       this.id = id;
       this.loaiDoAn = loaiDoAn;
       this.ten = ten;
       this.doAnChiTiets = doAnChiTiets;
    }
   
    public String getId() {
        return this.id;
    }
    
    public void setId(String id) {
        this.id = id;
    }
    public LoaiDoAn getLoaiDoAn() {
        return this.loaiDoAn;
    }
    
    public void setLoaiDoAn(LoaiDoAn loaiDoAn) {
        this.loaiDoAn = loaiDoAn;
    }
    public String getTen() {
        return this.ten;
    }
    
    public void setTen(String ten) {
        this.ten = ten;
    }
    public Set<DoAnChiTiet> getDoAnChiTiets() {
        return this.doAnChiTiets;
    }
    
    public void setDoAnChiTiets(Set<DoAnChiTiet> doAnChiTiets) {
        this.doAnChiTiets = doAnChiTiets;
    }




}


