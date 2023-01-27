/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package perpus.controller;

import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import perpus.model.*;
import perpus.view.*;

/**
 *
 * @author DELL
 */
public class BukuController {
    private final FormBuku formBuku;
    private Buku buku;
    private final BukuDao bukuDao; 
    
    
    public BukuController(FormBuku formBuku){
        this.formBuku= formBuku;
        bukuDao = new BukuDaoImpl(); //berfungsi untuk menyimpan ke dao karna arrayny berada pada dao, jika ini tidak ada maka berhenti smpai model saja
    }
    
    public void bersihForm(){
        formBuku.getTxtKodebuku().setText("");
        formBuku.getTxtJudul().setText("");
        formBuku.getTxtPengarang().setText("");
        formBuku.getTxtPenerbit().setText("");
        formBuku.getTxtPengembalian().setText("");
        formBuku.getTxtDenda().setText("");
    }
    
    public void saveBuku(){
        buku = new Buku();
        buku.setKodebuku(formBuku.getTxtKodebuku().getText());
        buku.setJudul(formBuku.getTxtJudul().getText());
        buku.setPengarang(formBuku.getTxtPengarang().getText());
        buku.setPenerbit(formBuku.getTxtPenerbit().getText());
        buku.setPengembalian(formBuku.getTxtPengembalian().getText());
        buku.setDenda(formBuku.getTxtDenda().getText());
        bukuDao.save(buku);
        JOptionPane.showMessageDialog(formBuku, "Insert OK");
    }
    
    public void tampil(){
        DefaultTableModel tabelModel = (DefaultTableModel) formBuku.getTblBuku().getModel();
        tabelModel.setRowCount(0);
        List<Buku> list = bukuDao.getAllBuku();
        for (Buku buku: list){
            Object[] row = {
                buku.getKodebuku(),
                buku.getJudul(),
                buku.getPengarang(),
                buku.getPenerbit(),
                buku.getPengembalian(),
                buku.getDenda()
            };
            tabelModel.addRow(row);
        }
    }
    
    public void updateBuku(){
        int index = formBuku.getTblBuku().getSelectedRow();
        buku.setKodebuku(formBuku.getTxtKodebuku().getText());
        buku.setJudul(formBuku.getTxtJudul().getText());
        buku.setPengarang(formBuku.getTxtPengarang().getText());
        buku.setPenerbit(formBuku.getTxtPenerbit().getText());
        buku.setPengembalian(formBuku.getTxtPengembalian().getText());
        
        bukuDao.update(index, buku);
        JOptionPane.showMessageDialog(formBuku, "Update Ok");
    }
    
    public void deleteBuku(){
        int index = formBuku.getTblBuku().getSelectedRow();
        bukuDao.delete(index);
        JOptionPane.showMessageDialog(formBuku, "Delete Ok");
    }
    
    public void getBuku(){
        int index = formBuku.getTblBuku().getSelectedRow();
        buku= bukuDao.getBuku(index);
        if(buku!= null){
            formBuku.getTxtKodebuku().setText(buku.getKodebuku());
            formBuku.getTxtJudul().setText(buku.getJudul());
            formBuku.getTxtPengarang().setText(buku.getPengarang());
            formBuku.getTxtPenerbit().setText(buku.getPenerbit());
            formBuku.getTxtPengembalian().setText(buku.getPengembalian());
            formBuku.getTxtDenda().setText(buku.getDenda());
        }
    }
    
    public int dendaBuku(int Pengembalian, int Denda, int hasil){
      
       // buku.setPengembalian(formBuku.getTxtPengembalian().getText());
       // Buku s = new Buku();
            if(formBuku.equals(7)){
                hasil = 0;
                formBuku.getTxtDenda().setText(String.valueOf(hasil));
            }else{
                hasil = 5000;
                formBuku.getTxtDenda().setText(String.valueOf(hasil));
                
            }
        
            return hasil;
    }

   


}
