/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Kesehatan;

/**
 *
 * @author User
 */
public class Anggota extends javax.swing.JFrame {
    
    // VARIABEL 
    
    public static String username = "";
    public Anggota() {
        initComponents();
        Pusername.setText(username);
        getProfil();
    }

    public void getProfil(){
        try {
            String sql = "SELECT * FROM tb_user where username='"+Anggota.username+"'";
            java.sql.Connection conn = config.configDB();
            java.sql.Statement st = conn.createStatement();
            java.sql.ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                Piduser.setText(rs.getString(1));
                Pusername.setText(rs.getString(2));
                Ppassword.setText(rs.getString(3));
                Pnama.setText(rs.getString(4));
            }
            
        } catch (Exception e) {
        }
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        PESAN_TIKET = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        Lidpesan = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        Ldurasi = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        Ltanggal = new javax.swing.JTextField();
        JADWAL = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        Lidpesan1 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        Ldurasi1 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        Ltanggal1 = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        Ltanggal2 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_lapangan = new javax.swing.JTable();
        btn_update = new javax.swing.JButton();
        btn_edit = new javax.swing.JButton();
        btn_simpan = new javax.swing.JButton();
        btn_hapus = new javax.swing.JButton();
        LAPORAN = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbl_laporan = new javax.swing.JTable();
        hapus = new javax.swing.JButton();
        update = new javax.swing.JButton();
        PROFIL = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        Piduser = new javax.swing.JTextField();
        Pusername = new javax.swing.JTextField();
        Pnama = new javax.swing.JTextField();
        Ppassword = new javax.swing.JPasswordField();
        jMenuBar1 = new javax.swing.JMenuBar();
        menuprofil = new javax.swing.JMenu();
        menulapangan = new javax.swing.JMenu();
        menujadwal = new javax.swing.JMenu();
        menulaporan = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.setLayout(new java.awt.CardLayout());

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setText("ID PESAN");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setText("DURASI JAM");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setText("TANGGAL");

        javax.swing.GroupLayout PESAN_TIKETLayout = new javax.swing.GroupLayout(PESAN_TIKET);
        PESAN_TIKET.setLayout(PESAN_TIKETLayout);
        PESAN_TIKETLayout.setHorizontalGroup(
            PESAN_TIKETLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PESAN_TIKETLayout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addGroup(PESAN_TIKETLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8))
                .addGap(87, 87, 87)
                .addGroup(PESAN_TIKETLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Ltanggal, javax.swing.GroupLayout.PREFERRED_SIZE, 438, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Ldurasi, javax.swing.GroupLayout.PREFERRED_SIZE, 438, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Lidpesan, javax.swing.GroupLayout.PREFERRED_SIZE, 438, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(108, Short.MAX_VALUE))
        );
        PESAN_TIKETLayout.setVerticalGroup(
            PESAN_TIKETLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PESAN_TIKETLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(PESAN_TIKETLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(Lidpesan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(PESAN_TIKETLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(Ldurasi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(PESAN_TIKETLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(Ltanggal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(272, Short.MAX_VALUE))
        );

        jPanel1.add(PESAN_TIKET, "card3");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel9.setText("ID JADWAL");

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel10.setText("NAMA LAPANGAN");

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel11.setText("ALAMAT LAPANGAN");

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel12.setText("HARGA");

        tbl_lapangan.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "ID PESAN", "DURASI", "TANGGAL", "NAMA LAPANGAN", "ALAMAT", "HARGA"
            }
        ));
        jScrollPane1.setViewportView(tbl_lapangan);
        if (tbl_lapangan.getColumnModel().getColumnCount() > 0) {
            tbl_lapangan.getColumnModel().getColumn(0).setMinWidth(200);
            tbl_lapangan.getColumnModel().getColumn(1).setMinWidth(200);
            tbl_lapangan.getColumnModel().getColumn(2).setMinWidth(200);
            tbl_lapangan.getColumnModel().getColumn(3).setMinWidth(200);
            tbl_lapangan.getColumnModel().getColumn(4).setMinWidth(200);
            tbl_lapangan.getColumnModel().getColumn(5).setMinWidth(200);
        }

        btn_update.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_update.setText("UPDATE");

        btn_edit.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_edit.setText("EDIT");

        btn_simpan.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_simpan.setText("SIMPAN");

        btn_hapus.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_hapus.setText("HAPUS");

        javax.swing.GroupLayout JADWALLayout = new javax.swing.GroupLayout(JADWAL);
        JADWAL.setLayout(JADWALLayout);
        JADWALLayout.setHorizontalGroup(
            JADWALLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JADWALLayout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addGroup(JADWALLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10)
                    .addComponent(jLabel11)
                    .addComponent(jLabel12))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(JADWALLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Ltanggal2, javax.swing.GroupLayout.PREFERRED_SIZE, 438, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Ltanggal1, javax.swing.GroupLayout.PREFERRED_SIZE, 438, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Ldurasi1, javax.swing.GroupLayout.PREFERRED_SIZE, 438, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Lidpesan1, javax.swing.GroupLayout.PREFERRED_SIZE, 438, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(103, 103, 103))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JADWALLayout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addGroup(JADWALLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(JADWALLayout.createSequentialGroup()
                        .addComponent(btn_update)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_edit)
                        .addGap(142, 142, 142)
                        .addComponent(btn_simpan)
                        .addGap(108, 108, 108)
                        .addComponent(btn_hapus))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 732, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21))
        );
        JADWALLayout.setVerticalGroup(
            JADWALLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JADWALLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(JADWALLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(Lidpesan1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(JADWALLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(Ldurasi1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(JADWALLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(Ltanggal1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(JADWALLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(Ltanggal2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                .addGroup(JADWALLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_update)
                    .addComponent(btn_edit)
                    .addComponent(btn_simpan)
                    .addComponent(btn_hapus))
                .addGap(19, 19, 19))
        );

        jPanel1.add(JADWAL, "card4");

        tbl_laporan.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(tbl_laporan);

        hapus.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        hapus.setText("HAPUS");

        update.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        update.setText("UPDATE");

        javax.swing.GroupLayout LAPORANLayout = new javax.swing.GroupLayout(LAPORAN);
        LAPORAN.setLayout(LAPORANLayout);
        LAPORANLayout.setHorizontalGroup(
            LAPORANLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, LAPORANLayout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addGroup(LAPORANLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(LAPORANLayout.createSequentialGroup()
                        .addComponent(update)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(hapus))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 733, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18))
        );
        LAPORANLayout.setVerticalGroup(
            LAPORANLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LAPORANLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 61, Short.MAX_VALUE)
                .addGroup(LAPORANLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(hapus)
                    .addComponent(update))
                .addGap(62, 62, 62))
        );

        jPanel1.add(LAPORAN, "card5");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("ID USER");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("USERNAME");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("PASSWORD");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("NAMA LENGKAP");

        Piduser.setEditable(false);

        javax.swing.GroupLayout PROFILLayout = new javax.swing.GroupLayout(PROFIL);
        PROFIL.setLayout(PROFILLayout);
        PROFILLayout.setHorizontalGroup(
            PROFILLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PROFILLayout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addGroup(PROFILLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addGap(60, 60, 60)
                .addGroup(PROFILLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Pnama, javax.swing.GroupLayout.DEFAULT_SIZE, 438, Short.MAX_VALUE)
                    .addComponent(Pusername, javax.swing.GroupLayout.DEFAULT_SIZE, 438, Short.MAX_VALUE)
                    .addComponent(Piduser)
                    .addComponent(Ppassword))
                .addContainerGap(108, Short.MAX_VALUE))
        );
        PROFILLayout.setVerticalGroup(
            PROFILLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PROFILLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(PROFILLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(Piduser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(PROFILLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(Pusername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(PROFILLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(Ppassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(PROFILLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(Pnama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(223, Short.MAX_VALUE))
        );

        jPanel1.add(PROFIL, "card2");

        jMenuBar1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        menuprofil.setText("PROFIL");
        menuprofil.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuprofilMouseClicked(evt);
            }
        });
        jMenuBar1.add(menuprofil);

        menulapangan.setText("PESAN LAPANGAN");
        menulapangan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menulapanganMouseClicked(evt);
            }
        });
        jMenuBar1.add(menulapangan);

        menujadwal.setText("JADWAL");
        menujadwal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menujadwalMouseClicked(evt);
            }
        });
        jMenuBar1.add(menujadwal);

        menulaporan.setText("LAPORAN");
        menulaporan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menulaporanMouseClicked(evt);
            }
        });
        jMenuBar1.add(menulaporan);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void menuprofilMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuprofilMouseClicked
        // TODO add your handling code here:
        PROFIL.setVisible(true);
        PESAN_TIKET.setVisible(false);
        JADWAL.setVisible(false);
        LAPORAN.setVisible(false);
    }//GEN-LAST:event_menuprofilMouseClicked

    private void menulapanganMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menulapanganMouseClicked
        // TODO add your handling code here:
        PROFIL.setVisible(false);
        PESAN_TIKET.setVisible(true);
        JADWAL.setVisible(false);
        LAPORAN.setVisible(false);
    }//GEN-LAST:event_menulapanganMouseClicked

    private void menujadwalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menujadwalMouseClicked
        // TODO add your handling code here:
        PROFIL.setVisible(false);
        PESAN_TIKET.setVisible(false);
        JADWAL.setVisible(true);
        LAPORAN.setVisible(false);
    }//GEN-LAST:event_menujadwalMouseClicked

    private void menulaporanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menulaporanMouseClicked
        // TODO add your handling code here:
        PROFIL.setVisible(false);
        PESAN_TIKET.setVisible(false);
        JADWAL.setVisible(false);
        LAPORAN.setVisible(true);
    }//GEN-LAST:event_menulaporanMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Anggota.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Anggota.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Anggota.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Anggota.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Anggota().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel JADWAL;
    private javax.swing.JPanel LAPORAN;
    private javax.swing.JTextField Ldurasi;
    private javax.swing.JTextField Ldurasi1;
    private javax.swing.JTextField Lidpesan;
    private javax.swing.JTextField Lidpesan1;
    private javax.swing.JTextField Ltanggal;
    private javax.swing.JTextField Ltanggal1;
    private javax.swing.JTextField Ltanggal2;
    private javax.swing.JPanel PESAN_TIKET;
    private javax.swing.JPanel PROFIL;
    private javax.swing.JTextField Piduser;
    private javax.swing.JTextField Pnama;
    private javax.swing.JPasswordField Ppassword;
    private javax.swing.JTextField Pusername;
    private javax.swing.JButton btn_edit;
    private javax.swing.JButton btn_hapus;
    private javax.swing.JButton btn_simpan;
    private javax.swing.JButton btn_update;
    private javax.swing.JButton hapus;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JMenu menujadwal;
    private javax.swing.JMenu menulapangan;
    private javax.swing.JMenu menulaporan;
    private javax.swing.JMenu menuprofil;
    private javax.swing.JTable tbl_lapangan;
    private javax.swing.JTable tbl_laporan;
    private javax.swing.JButton update;
    // End of variables declaration//GEN-END:variables
}
