package her_a.controller;

import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import her_a.model.*;
import her_a.view.*;

/**
 *
 * @author DELL
 */
public class ServiceController {
    private FormService formService;
    private Service service;
    private ServiceDao serviceDao; 
    
    
    public ServiceController(FormService formService){
        this.formService= formService;
        serviceDao = new ServiceDaoImpl(); //berfungsi untuk menyimpan ke dao karna arrayny berada pada dao, jika ini tidak ada maka berhenti smpai model saja
    }
    
    public void bersihForm(){
        formService.getTxtKode().setText("");
        formService.getTxtTgl().setText("");
        formService.getTxtPelanggan().setText("");
        formService.getTxtJenis().setText("");
    }
    
    public void saveService(){
        service = new Service();
        service.setKode_trans(formService.getTxtKode().getText());
        service.setTgl_trans(formService.getTxtTgl().getText());
        service.setPelanggan(formService.getTxtPelanggan().getText());
        service.setJenis_service(Integer.parseInt(formService.getTxtJenis().getText()));
        serviceDao.save(service);
        JOptionPane.showMessageDialog(formService, "Insert OK");
    }
    
    public void tampil(){
        DefaultTableModel tabelModel = (DefaultTableModel) formService.getTblService().getModel();
        tabelModel.setRowCount(0);
        List<Service> list = serviceDao.getAllService();
        for (Service service: list){
            Object[] row = {
                service.getKode_trans(),
                service.getTgl_trans(),
                service.getPelanggan(),
                service.getJenis_service(),
                service.getTotal()
            };
            tabelModel.addRow(row);
        }
    }
    
    public void updateService(){
        int index = formService.getTblService().getSelectedRow();
        service.setKode_trans(formService.getTxtKode().getText());
        service.setTgl_trans(formService.getTxtTgl().getText());
        service.setPelanggan(formService.getTxtPelanggan().getText());
        service.setJenis_service(Integer.parseInt(formService.getTxtJenis().getText()));
        serviceDao.update(index, service);
        JOptionPane.showMessageDialog(formService, "Update Ok");
    }
    
    public void deleteService(){
        int index = formService.getTblService().getSelectedRow();
        serviceDao.delete(index);
        JOptionPane.showMessageDialog(formService, "Delete Ok");
    }
    
    public void getService(){
        int index = formService.getTblService().getSelectedRow();
        service = serviceDao.getService(index);
        if(service!= null){
            formService.getTxtKode().setText(service.getKode_trans());
            formService.getTxtTgl().setText(service.getTgl_trans());
            formService.getTxtPelanggan().setText(service.getPelanggan());
            formService.getTxtJenis().setText((String) service.getJenis_service());
        }
    }
}
