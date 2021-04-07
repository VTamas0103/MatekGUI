package matekfeladatokgui;

import java.util.ArrayList;
import java.util.Random;

public class Felulet extends javax.swing.JFrame {

    int eredmeny;
    Random rnd = new Random();
    int szam1 = 0;
    int szam2 = 0;
    boolean megvan;

    ArrayList<String> lista = new ArrayList<>();

    public Felulet() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bgMuveletek = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        lbMuvelet = new javax.swing.JLabel();
        tfMuvelet = new javax.swing.JTextField();
        tfEredmeny = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        btKesz = new javax.swing.JToggleButton();
        lbProbálkozások = new javax.swing.JLabel();
        tfProbalkozasok = new javax.swing.JTextField();
        lbHibak = new javax.swing.JLabel();
        tfHibak = new javax.swing.JTextField();
        lbKerdesek = new javax.swing.JLabel();
        tfKerdesek = new javax.swing.JTextField();
        btUjrakezd = new javax.swing.JToggleButton();
        tfMegoldasKiir = new javax.swing.JTextField();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        rbmiOsszeadas = new javax.swing.JRadioButtonMenuItem();
        rbmiKivonas = new javax.swing.JRadioButtonMenuItem();
        rbmiSzorzas = new javax.swing.JRadioButtonMenuItem();
        rbmiOsztas = new javax.swing.JRadioButtonMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lbMuvelet.setText("Művelet");

        tfMuvelet.setEditable(false);

        tfEredmeny.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfEredmenyActionPerformed(evt);
            }
        });

        jLabel1.setText("Eredmény");

        btKesz.setText("Kész");
        btKesz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btKeszActionPerformed(evt);
            }
        });

        lbProbálkozások.setText("Probálkozások:");

        tfProbalkozasok.setEditable(false);

        lbHibak.setText("Hibak:");

        tfHibak.setEditable(false);

        lbKerdesek.setText("Kérdések:");

        tfKerdesek.setEditable(false);

        btUjrakezd.setText("Újrakezd");

        tfMegoldasKiir.setEditable(false);
        tfMegoldasKiir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfMegoldasKiirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(105, 105, 105)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tfMuvelet, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lbMuvelet))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tfEredmeny, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel1))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                                .addComponent(btKesz, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(249, 249, 249)
                                .addComponent(tfMegoldasKiir)))
                        .addGap(20, 20, 20))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lbKerdesek)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfKerdesek, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbProbálkozások)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfProbalkozasok, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbHibak)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfHibak, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btUjrakezd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btKesz, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbMuvelet)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tfMuvelet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfEredmeny, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addComponent(tfMegoldasKiir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btUjrakezd)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lbHibak)
                        .addComponent(tfHibak, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lbProbálkozások)
                        .addComponent(tfProbalkozasok, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lbKerdesek)
                        .addComponent(tfKerdesek, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );

        jMenu1.setText("Műveletek");

        bgMuveletek.add(rbmiOsszeadas);
        rbmiOsszeadas.setSelected(true);
        rbmiOsszeadas.setText("Összeadás");
        rbmiOsszeadas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbmiOsszeadasActionPerformed(evt);
            }
        });
        jMenu1.add(rbmiOsszeadas);

        bgMuveletek.add(rbmiKivonas);
        rbmiKivonas.setText("Kivonás");
        rbmiKivonas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbmiKivonasActionPerformed(evt);
            }
        });
        jMenu1.add(rbmiKivonas);

        bgMuveletek.add(rbmiSzorzas);
        rbmiSzorzas.setText("Szorzás");
        rbmiSzorzas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbmiSzorzasActionPerformed(evt);
            }
        });
        jMenu1.add(rbmiSzorzas);

        bgMuveletek.add(rbmiOsztas);
        rbmiOsztas.setText("Osztás");
        rbmiOsztas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbmiOsztasActionPerformed(evt);
            }
        });
        jMenu1.add(rbmiOsztas);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btKeszActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btKeszActionPerformed
        if (tfEredmeny.getText().equals(eredmeny+"")) {
            tfMegoldasKiir.setText("Jó a megoldás");
        } else {
            tfMegoldasKiir.setText("Rossz a megoldás");
        }

    }//GEN-LAST:event_btKeszActionPerformed

    private void tfMegoldasKiirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfMegoldasKiirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfMegoldasKiirActionPerformed

    private void rbmiOsszeadasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbmiOsszeadasActionPerformed
        Osszeadas();
    }//GEN-LAST:event_rbmiOsszeadasActionPerformed

    private void rbmiOsztasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbmiOsztasActionPerformed
        osztas();
    }//GEN-LAST:event_rbmiOsztasActionPerformed

    private void tfEredmenyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfEredmenyActionPerformed

    }//GEN-LAST:event_tfEredmenyActionPerformed

    private void rbmiSzorzasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbmiSzorzasActionPerformed
        szorzas();
    }//GEN-LAST:event_rbmiSzorzasActionPerformed

    private void rbmiKivonasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbmiKivonasActionPerformed
        kivonas();
    }//GEN-LAST:event_rbmiKivonasActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Felulet().setVisible(true);
            }

        });

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup bgMuveletek;
    private javax.swing.JToggleButton btKesz;
    private javax.swing.JToggleButton btUjrakezd;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbHibak;
    private javax.swing.JLabel lbKerdesek;
    private javax.swing.JLabel lbMuvelet;
    private javax.swing.JLabel lbProbálkozások;
    private javax.swing.JRadioButtonMenuItem rbmiKivonas;
    private javax.swing.JRadioButtonMenuItem rbmiOsszeadas;
    private javax.swing.JRadioButtonMenuItem rbmiOsztas;
    private javax.swing.JRadioButtonMenuItem rbmiSzorzas;
    private javax.swing.JTextField tfEredmeny;
    private javax.swing.JTextField tfHibak;
    private javax.swing.JTextField tfKerdesek;
    private javax.swing.JTextField tfMegoldasKiir;
    private javax.swing.JTextField tfMuvelet;
    private javax.swing.JTextField tfProbalkozasok;
    // End of variables declaration//GEN-END:variables

    private void osztas() {
        megvan = true;
        while (megvan) {
            szam1 = rnd.nextInt(100) + 0;
            szam2 = rnd.nextInt(10) + 1;
            if (szam1 % szam2 == 0) {
                tfMuvelet.setText(szam1 + "/" + szam2 + "=");
                megvan = false;
            }
        }
        eredmeny = szam1 / szam2;

    }

    private void Osszeadas() {
        megvan = true;
        while (megvan) {
            szam1 = rnd.nextInt(50) + 0;
            szam2 = rnd.nextInt(50) + 0;
            if (szam1 + szam2 <= 100) {
                tfMuvelet.setText(szam1 + "+" + szam2 + "=");
                megvan = false;
            }
        }
        eredmeny = szam1 + szam2;

    }

    private void szorzas() {
        megvan = true;
        while (megvan) {
            szam1 = rnd.nextInt(10) + 0;
            szam2 = rnd.nextInt(10) + 0;
            if (szam1 + szam2 <= 100) {
                tfMuvelet.setText(szam1 + "*" + szam2 + "=");
                megvan = false;
            }
        }
        eredmeny = szam1 * szam2;
    }

    private void kivonas() {
        megvan = true;
        while (megvan) {
            szam1 = rnd.nextInt(100) + 0;
            szam2 = rnd.nextInt(100) + 0;
            if (szam1 - szam2 > 0) {
                tfMuvelet.setText(szam1 + "-" + szam2 + "=");
                megvan = false;
            }
        }
        eredmeny = szam1 - szam2;
    }

}
