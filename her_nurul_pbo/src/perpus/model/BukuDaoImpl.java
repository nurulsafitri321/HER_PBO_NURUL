/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package perpus.model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author DELL
 */
public class BukuDaoImpl implements BukuDao{
private final List<Buku> data = new ArrayList<>();
    @Override
    public Buku save(Buku buku) {
        data.add(buku);
        return buku;
    }

    @Override
    public Buku update(int index, Buku buku) {
        data.set(index, buku);
        return buku;
    }

    @Override
    public void delete(int index) {
        data.remove(index);
    }

    @Override
    public Buku getBuku(int index) {
        return data.get(index);
    }

    @Override
    public List<Buku> getAllBuku() {
        return data;
    }

    public Buku Denda(int hasil) {
        return data.get(hasil);
    }

    @Override
    public void Denda() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
