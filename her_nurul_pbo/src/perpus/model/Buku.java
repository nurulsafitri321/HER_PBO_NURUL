/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package perpus.model;

/**
 *
 * @author DELL
 */
public class Buku {
    private String kodebuku;
    private String judul;
    private String pengarang;
    private String penerbit;
    private String pengembalian;
    private String denda;

    public Buku(String kodebuku, String judul, String pengarang, String penerbit, String pengembalian, String denda) {
        this.kodebuku = kodebuku;
        this.judul = judul;
        this.pengarang = pengarang;
        this.penerbit = penerbit;
        this.pengembalian = pengembalian;
        this.denda = denda;
    }

    public Buku() {
       
    }
    
    public String getKodebuku() {
        return kodebuku;
    }

    public String getJudul() {
        return judul;
    }

    public String getPengarang() {
        return pengarang;
    }

    public String getPenerbit() {
        return penerbit;
    }

    public String getPengembalian() {
        return pengembalian;
    }

    public String getDenda() {
        return denda;
       
    }
    
    public void setKodebuku(String kodebuku) {
        this.kodebuku = kodebuku;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public void setPengarang(String pengarang) {
        this.pengarang = pengarang;
    }

    public void setPenerbit(String penerbit) {
        this.penerbit = penerbit;
    }

    public void setPengembalian(String pengembalian) {
        this.pengembalian = pengembalian;
    }

    public void setDenda(String text) {
       
    }
    
    
    

   
    
    
}
