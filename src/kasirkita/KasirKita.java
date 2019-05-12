/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kasirkita;

import java.awt.Color;
import java.text.NumberFormat;
import javax.swing.JOptionPane;
import javax.swing.table.*;
import java.io.File;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author hanif
 */
public class KasirKita extends javax.swing.JFrame {

    /**
     * Creates new form KasirKita
     */
    DefaultTableModel TabelKasir;
    String[] data;
    NumberFormat formatKurensi;
    File simpanan;
    File file;
    BufferedWriter bw;
    BufferedReader br;
    Date waktu;
    SimpleDateFormat formatTanggal;

    public KasirKita() {
        initComponents();
        data = new String[4];
        simpanan = new File("src/Data");
        waktu = new Date();
        formatTanggal = new SimpleDateFormat("dd-MM-yyyy HH-mm-ss");
        formatKurensi = NumberFormat.getCurrencyInstance(getLocale());
        TabelKasir = (DefaultTableModel) jTable1.getModel();
        setLocationRelativeTo(this);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        Tambah = new javax.swing.JButton();
        Load = new javax.swing.JButton();
        Delete = new javax.swing.JButton();
        HitungBelanja = new javax.swing.JButton();
        LabelNamaBarang = new javax.swing.JLabel();
        LabelJumlah = new javax.swing.JLabel();
        LabelHarga = new javax.swing.JLabel();
        TFHarga = new javax.swing.JTextField();
        TFNamaBarang = new javax.swing.JTextField();
        TfJumlah = new javax.swing.JTextField();
        TotalBelanja = new javax.swing.JLabel();
        HasilTB = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        Zeus = new javax.swing.JLabel();
        Techies = new javax.swing.JLabel();
        PA = new javax.swing.JLabel();
        MK = new javax.swing.JLabel();
        CM = new javax.swing.JLabel();
        TB = new javax.swing.JLabel();
        Lina = new javax.swing.JLabel();
        Pudge = new javax.swing.JLabel();
        SF = new javax.swing.JLabel();
        LC = new javax.swing.JLabel();
        Jugger = new javax.swing.JLabel();
        IO = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1230, 650));
        setSize(new java.awt.Dimension(1215, 619));
        getContentPane().setLayout(null);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "No", "Nama Barang", "Harga Barang", "Qty"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setPreferredWidth(30);
            jTable1.getColumnModel().getColumn(0).setMaxWidth(30);
            jTable1.getColumnModel().getColumn(1).setPreferredWidth(100);
            jTable1.getColumnModel().getColumn(1).setMaxWidth(200);
            jTable1.getColumnModel().getColumn(3).setPreferredWidth(60);
            jTable1.getColumnModel().getColumn(3).setMaxWidth(60);
        }

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(846, 216, 359, 350);

        Tambah.setText("Tambah");
        Tambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TambahActionPerformed(evt);
            }
        });
        getContentPane().add(Tambah);
        Tambah.setBounds(1122, 186, 71, 23);

        Load.setText("Load");
        Load.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoadActionPerformed(evt);
            }
        });
        getContentPane().add(Load);
        Load.setBounds(992, 186, 55, 23);

        Delete.setText("Delete");
        Delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteActionPerformed(evt);
            }
        });
        getContentPane().add(Delete);
        Delete.setBounds(1053, 186, 63, 23);

        HitungBelanja.setText("Hitung Belanja");
        HitungBelanja.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        HitungBelanja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HitungBelanjaActionPerformed(evt);
            }
        });
        getContentPane().add(HitungBelanja);
        HitungBelanja.setBounds(1104, 572, 101, 36);

        LabelNamaBarang.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        LabelNamaBarang.setText("Nama Barang");
        getContentPane().add(LabelNamaBarang);
        LabelNamaBarang.setBounds(842, 11, 80, 35);

        LabelJumlah.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        LabelJumlah.setText("Qty");
        getContentPane().add(LabelJumlah);
        LabelJumlah.setBounds(842, 103, 80, 35);

        LabelHarga.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        LabelHarga.setText("Harga Barang");
        getContentPane().add(LabelHarga);
        LabelHarga.setBounds(842, 57, 80, 35);

        TFHarga.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TFHargaKeyTyped(evt);
            }
        });
        getContentPane().add(TFHarga);
        TFHarga.setBounds(932, 62, 273, 27);

        TFNamaBarang.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TFNamaBarangKeyTyped(evt);
            }
        });
        getContentPane().add(TFNamaBarang);
        TFNamaBarang.setBounds(932, 19, 273, 27);

        TfJumlah.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TfJumlahKeyTyped(evt);
            }
        });
        getContentPane().add(TfJumlah);
        TfJumlah.setBounds(932, 107, 273, 28);

        TotalBelanja.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        TotalBelanja.setText("Total Belanja");
        getContentPane().add(TotalBelanja);
        TotalBelanja.setBounds(846, 572, 78, 36);

        HasilTB.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        HasilTB.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        getContentPane().add(HasilTB);
        HasilTB.setBounds(934, 572, 120, 36);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        getContentPane().add(jComboBox1);
        jComboBox1.setBounds(846, 187, 136, 20);

        Zeus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/200px-Cosmetic_icon_Tempest_Helm_of_the_Thundergod.png"))); // NOI18N
        Zeus.setOpaque(true);
        Zeus.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ZeusMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ZeusMouseExited(evt);
            }
        });
        getContentPane().add(Zeus);
        Zeus.setBounds(10, 11, 200, 146);

        Techies.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/200px-Cosmetic_icon_Swine_of_the_Sunken_Galley.png"))); // NOI18N
        Techies.setMaximumSize(new java.awt.Dimension(200, 133));
        Techies.setMinimumSize(new java.awt.Dimension(200, 133));
        Techies.setOpaque(true);
        Techies.setPreferredSize(new java.awt.Dimension(200, 133));
        Techies.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                TechiesMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                TechiesMouseExited(evt);
            }
        });
        getContentPane().add(Techies);
        Techies.setBounds(216, 11, 200, 146);

        PA.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/200px-Cosmetic_icon_Manifold_Paradox.png"))); // NOI18N
        PA.setOpaque(true);
        PA.setPreferredSize(new java.awt.Dimension(200, 133));
        PA.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                PAMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                PAMouseExited(evt);
            }
        });
        getContentPane().add(PA);
        PA.setBounds(422, 11, 200, 146);

        MK.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/200px-Cosmetic_icon_Great_Sage's_Reckoning.png"))); // NOI18N
        MK.setOpaque(true);
        MK.setPreferredSize(new java.awt.Dimension(200, 133));
        MK.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                MKMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                MKMouseExited(evt);
            }
        });
        getContentPane().add(MK);
        MK.setBounds(632, 11, 200, 146);

        CM.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/200px-Cosmetic_icon_Frost_Avalanche.png"))); // NOI18N
        CM.setOpaque(true);
        CM.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                CMMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                CMMouseExited(evt);
            }
        });
        getContentPane().add(CM);
        CM.setBounds(10, 175, 200, 145);

        TB.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/200px-Cosmetic_icon_Fractal_Horns_of_Inner_Abysm.png"))); // NOI18N
        TB.setOpaque(true);
        TB.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                TBMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                TBMouseExited(evt);
            }
        });
        getContentPane().add(TB);
        TB.setBounds(216, 175, 200, 145);

        Lina.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/200px-Cosmetic_icon_Fiery_Soul_of_the_Slayer.png"))); // NOI18N
        Lina.setOpaque(true);
        Lina.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                LinaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                LinaMouseExited(evt);
            }
        });
        getContentPane().add(Lina);
        Lina.setBounds(426, 175, 200, 145);

        Pudge.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/200px-Cosmetic_icon_Feast_of_Abscession.png"))); // NOI18N
        Pudge.setOpaque(true);
        Pudge.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                PudgeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                PudgeMouseExited(evt);
            }
        });
        getContentPane().add(Pudge);
        Pudge.setBounds(632, 175, 200, 145);

        SF.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/200px-Cosmetic_icon_Demon_Eater.png"))); // NOI18N
        SF.setOpaque(true);
        getContentPane().add(SF);
        SF.setBounds(10, 338, 200, 144);

        LC.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/200px-Cosmetic_icon_Blades_of_Voth_Domosh.png"))); // NOI18N
        LC.setOpaque(true);
        getContentPane().add(LC);
        LC.setBounds(216, 338, 200, 144);

        Jugger.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/200px-Cosmetic_icon_Bladeform_Legacy.png"))); // NOI18N
        Jugger.setOpaque(true);
        getContentPane().add(Jugger);
        Jugger.setBounds(422, 338, 200, 144);

        IO.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/200px-Cosmetic_icon_Benevolent_Companion.png"))); // NOI18N
        IO.setOpaque(true);
        getContentPane().add(IO);
        IO.setBounds(632, 338, 204, 144);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TambahActionPerformed
        if (TFNamaBarang.getText().trim().isEmpty() || TFHarga.getText().trim().isEmpty() || TfJumlah.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Harap masukkan data dengan lengkap");
        } else {
            data[0] = Integer.toString(TabelKasir.getRowCount() + 1);
            data[1] = TFNamaBarang.getText();
            data[2] = formatKurensi.format(Double.parseDouble(TFHarga.getText()));
            data[3] = TfJumlah.getText();
            boolean belumAda = true;
            for (int i = 0; i < TabelKasir.getRowCount(); i++) {
                if (data[1].equals(TabelKasir.getValueAt(i, 1))) {
                    belumAda = false;
                    break;
                }
            }
            if (belumAda) {
                TabelKasir.addRow(data);
                TFNamaBarang.setText("");
                TFHarga.setText("");
                TfJumlah.setText("");
            } else {
                JOptionPane.showMessageDialog(null, "Data sudah ada !!!");
            }
        }
    }//GEN-LAST:event_TambahActionPerformed

    private void TFNamaBarangKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TFNamaBarangKeyTyped
        if (!Character.isDigit(evt.getKeyChar())) {

        } else {
            evt.consume();
        }
    }//GEN-LAST:event_TFNamaBarangKeyTyped

    private void TFHargaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TFHargaKeyTyped
        if (!Character.isDigit(evt.getKeyChar())) {
            evt.consume();
        }
    }//GEN-LAST:event_TFHargaKeyTyped

    private void TfJumlahKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TfJumlahKeyTyped
        if (!Character.isDigit(evt.getKeyChar())) {
            evt.consume();
        }
    }//GEN-LAST:event_TfJumlahKeyTyped

    private void HitungBelanjaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HitungBelanjaActionPerformed
        Double total = 0.0;
        for (int i = 0; i < TabelKasir.getRowCount(); i++) {
            String harga = (String) TabelKasir.getValueAt(i, 2);
            Double temp = Double.parseDouble((String) TabelKasir.getValueAt(i, 3)) * Double.parseDouble(harga.replaceAll("[^0-9.]", ""));
            total += temp;
        }
        HasilTB.setText(formatKurensi.format(total));
        file = new File("src/Data/" + formatTanggal.format(waktu) + ".txt");
        try {
            bw = new BufferedWriter(new FileWriter(file));
            for (int i = 0; i < jTable1.getColumnCount(); i++) {
                if (i > 0) {
                    bw.write(",");
                }
                bw.write(jTable1.getColumnName(i));
            }
            bw.newLine();
            for (int i = 0; i < TabelKasir.getRowCount(); i++) {
                for (int j = 0; j < TabelKasir.getColumnCount(); j++) {
                    if (j > 0) {
                        bw.write("/");
                    }
                    bw.write((String) TabelKasir.getValueAt(i, j));
                }
                bw.newLine();
            }
            bw.write("Total Belanja : " + HasilTB.getText());
            bw.close();
        } catch (Exception e) {
        }
    }//GEN-LAST:event_HitungBelanjaActionPerformed

    private void DeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteActionPerformed
        TabelKasir.removeRow(jTable1.getSelectedRow());
        for (int i = jTable1.getSelectedRowCount(); i < TabelKasir.getRowCount(); i++) {
            TabelKasir.setValueAt(i + 1, i, 0);
        }
    }//GEN-LAST:event_DeleteActionPerformed

    private void LoadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoadActionPerformed
        file = new File("src/Data/wkwk");
        try {
            Object[] dataBaris = br.lines().toArray();
            String barisPertama = br.readLine();
            //pisah teks pada barisPertama dengan tanda koma(,)
            //kemudian masukkan ke array
            String[] namaKolom = barisPertama.split(",");
            //ambil model dan atur nama kolom tabel
            TabelKasir.setColumnIdentifiers(namaKolom);
            //ambil baris selanjutnya secara keseluruhan
            //dan masukkan ke array
            for (int i = 0; i < dataBaris.length; i++) {
                //ambil tiap baris dari dataBaris
                String baris = dataBaris[i].toString();
                //pisah baris dengan tanda / dan masukkan array
                String[] datatxt = baris.split("/");
                //data masukan ke tabel
                TabelKasir.addRow(datatxt);
            }
            br.close();
        } catch (Exception e) {
        }
    }//GEN-LAST:event_LoadActionPerformed

    private void ZeusMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ZeusMouseEntered
        Zeus.setBackground(Color.RED);
        TFNamaBarang.setText("Tempest Helm of the Thundergod");
    }//GEN-LAST:event_ZeusMouseEntered

    private void ZeusMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ZeusMouseExited
        TFNamaBarang.setText("");
        Zeus.setBackground(getBackground());
    }//GEN-LAST:event_ZeusMouseExited

    private void TechiesMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TechiesMouseEntered
        Techies.setBackground(Color.RED);
        TFNamaBarang.setText("Swine of the Sunken Galley");
    }//GEN-LAST:event_TechiesMouseEntered

    private void TechiesMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TechiesMouseExited
        Techies.setBackground(getBackground());
        TFNamaBarang.setText("");
    }//GEN-LAST:event_TechiesMouseExited

    private void PAMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PAMouseEntered
        PA.setBackground(Color.RED);
        TFNamaBarang.setText("Manifold Paradox");
    }//GEN-LAST:event_PAMouseEntered

    private void PAMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PAMouseExited
        PA.setBackground(getBackground());
        TFNamaBarang.setText("");
    }//GEN-LAST:event_PAMouseExited

    private void MKMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MKMouseEntered
        MK.setBackground(Color.RED);
        TFNamaBarang.setText("Great Sage's Reckoning");
    }//GEN-LAST:event_MKMouseEntered

    private void MKMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MKMouseExited
        MK.setBackground(getBackground());
        TFNamaBarang.setText("");
    }//GEN-LAST:event_MKMouseExited

    private void CMMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CMMouseEntered
        CM.setBackground(Color.RED);
        TFNamaBarang.setText("Frost Avalanche");
    }//GEN-LAST:event_CMMouseEntered

    private void CMMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CMMouseExited
        TFNamaBarang.setText("");
        CM.setBackground(getBackground());
    }//GEN-LAST:event_CMMouseExited

    private void TBMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TBMouseEntered
        TB.setBackground(Color.RED);
        TFNamaBarang.setText("Fractal Horns of Inner Abysm");
    }//GEN-LAST:event_TBMouseEntered

    private void TBMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TBMouseExited
        TB.setBackground(getBackground());
        TFNamaBarang.setText("");
    }//GEN-LAST:event_TBMouseExited

    private void LinaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LinaMouseEntered
        Lina.setBackground(Color.RED);
        TFNamaBarang.setText("Fiery Soul of the Slayer");
    }//GEN-LAST:event_LinaMouseEntered

    private void LinaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LinaMouseExited
        Lina.setBackground(getBackground());
        TFNamaBarang.setText("");
    }//GEN-LAST:event_LinaMouseExited

    private void PudgeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PudgeMouseEntered
        Pudge.setBackground(Color.RED);
        TFNamaBarang.setText("Feast of Abscession");
    }//GEN-LAST:event_PudgeMouseEntered

    private void PudgeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PudgeMouseExited
        Pudge.setBackground(getBackground());
        TFNamaBarang.setText("");
    }//GEN-LAST:event_PudgeMouseExited

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
            java.util.logging.Logger.getLogger(KasirKita.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(KasirKita.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(KasirKita.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(KasirKita.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new KasirKita().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel CM;
    private javax.swing.JButton Delete;
    private javax.swing.JLabel HasilTB;
    private javax.swing.JButton HitungBelanja;
    private javax.swing.JLabel IO;
    private javax.swing.JLabel Jugger;
    private javax.swing.JLabel LC;
    private javax.swing.JLabel LabelHarga;
    private javax.swing.JLabel LabelJumlah;
    private javax.swing.JLabel LabelNamaBarang;
    private javax.swing.JLabel Lina;
    private javax.swing.JButton Load;
    private javax.swing.JLabel MK;
    private javax.swing.JLabel PA;
    private javax.swing.JLabel Pudge;
    private javax.swing.JLabel SF;
    private javax.swing.JLabel TB;
    private javax.swing.JTextField TFHarga;
    private javax.swing.JTextField TFNamaBarang;
    private javax.swing.JButton Tambah;
    private javax.swing.JLabel Techies;
    private javax.swing.JTextField TfJumlah;
    private javax.swing.JLabel TotalBelanja;
    private javax.swing.JLabel Zeus;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
