/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package perpus.model;

import java.util.List;

/**
 *
 * @author DELL
 */
public interface BukuDao {
    Buku save(Buku buku);
    Buku update(int index, Buku buku);
    void delete(int index);
    Buku getBuku(int index);
    Buku Denda(int hasil);
    List<Buku> getAllBuku();

    public void Denda();
}
