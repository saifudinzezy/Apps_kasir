package aksi;

public interface AllAksi {
    
    final String SIMPAN = "Data berhasil disimpan ";
    final String HAPUS = "Data berhasil dihapus ";
    
    public void clearForm();
    public void disableForm();
    public void enableForm();
    public void showDataTabel();
    public void aksiSimpan();
    public void aksiHapus();
    public void formTengah();
}
