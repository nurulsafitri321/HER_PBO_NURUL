/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package her_a.model;

/**
 *
 * @author DELL
 */
public class Service {
    private String kode_trans;
    private String tgl_trans;
    private String pelanggan;
    private int jenis_service;
    private double biaya;
    private double diskon;
    private double total;

    public Service(String kode_trans, String tgl_trans, String pelanggan) {
        this.kode_trans = kode_trans;
        this.tgl_trans = tgl_trans;
        this.pelanggan = pelanggan;
    }

    public Service() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getKode_trans() {
        return kode_trans;
    }

    public void setKode_trans(String kode_trans) {
        this.kode_trans = kode_trans;
    }

    public String getTgl_trans() {
        return tgl_trans;
    }

    public void setTgl_trans(String tgl_trans) {
        this.tgl_trans = tgl_trans;
    }

    public String getPelanggan() {
        return pelanggan;
    }

    public void setPelanggan(String pelanggan) {
        this.pelanggan = pelanggan;
    }

    public int getJenis_service(int Jenis_service) {
        return jenis_service;
    }

    public void setJenis_service(int Jenis_service) {
        this.jenis_service = jenis_service;
    }

    public double getBiaya() {
        return biaya;
    }

    public void setBiaya(double biaya) {
        this.biaya = biaya;
    }

    public double getDiskon() {
        return diskon;
    }

    public void setDiskon(double diskon) {
        this.diskon = diskon;
    }

    public double getTotal() {
        total = biaya - diskon;
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }    

    public Object getJenis_service() {
        int Jenis_service = 0;
        if (Jenis_service == 1){
            biaya = 50000;
        }
        else if (Jenis_service == 2){
            biaya = 60000;
        } //To change body of generated methods, choose Tools | Templates.
        return Jenis_service;
    }
}

