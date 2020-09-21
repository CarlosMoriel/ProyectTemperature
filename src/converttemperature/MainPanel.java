/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package converttemperature;

import java.awt.Color;

/**
 *
 * @author Carlos Moriel Enriquez
 */
public class MainPanel extends javax.swing.JFrame {

    /**
     * Creates new form MainPanel
     */
    public MainPanel() {
        initComponents();
        
        this.labelImage4.setVisible(false);
        this.labelImage1.setVisible(false);
        this.labelImage2.setVisible(false);
        this.labelImage3.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        principalPanel = new javax.swing.JPanel();
        colorPanel = new javax.swing.JPanel();
        labelFahrenheit = new javax.swing.JLabel();
        labelCentigrade = new javax.swing.JLabel();
        sliderTemperature = new javax.swing.JSlider();
        labelValueFahrenheit = new javax.swing.JLabel();
        labelValueCentigrate = new javax.swing.JLabel();
        labelImage4 = new javax.swing.JLabel();
        labelImage1 = new javax.swing.JLabel();
        labelImage2 = new javax.swing.JLabel();
        labelImage3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(902, 600));

        principalPanel.setBackground(new java.awt.Color(153, 255, 204));
        principalPanel.setMinimumSize(new java.awt.Dimension(900, 520));
        principalPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        colorPanel.setBackground(new java.awt.Color(153, 255, 204));

        javax.swing.GroupLayout colorPanelLayout = new javax.swing.GroupLayout(colorPanel);
        colorPanel.setLayout(colorPanelLayout);
        colorPanelLayout.setHorizontalGroup(
            colorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 900, Short.MAX_VALUE)
        );
        colorPanelLayout.setVerticalGroup(
            colorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        principalPanel.add(colorPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, 900, 50));

        labelFahrenheit.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        labelFahrenheit.setText("Fahrenheit");
        principalPanel.add(labelFahrenheit, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 60, 150, 40));

        labelCentigrade.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        labelCentigrade.setText("Centigrade");
        principalPanel.add(labelCentigrade, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 50, 180, 40));

        sliderTemperature.setMaximum(40);
        sliderTemperature.setMinimum(-20);
        sliderTemperature.setToolTipText("");
        sliderTemperature.setValue(10);
        sliderTemperature.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                sliderTemperatureStateChanged(evt);
            }
        });
        principalPanel.add(sliderTemperature, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 130, 750, -1));

        labelValueFahrenheit.setFont(new java.awt.Font("Times New Roman", 2, 24)); // NOI18N
        labelValueFahrenheit.setText("-");
        principalPanel.add(labelValueFahrenheit, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 170, 100, 50));

        labelValueCentigrate.setFont(new java.awt.Font("Times New Roman", 2, 24)); // NOI18N
        labelValueCentigrate.setText("-");
        principalPanel.add(labelValueCentigrate, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 170, 100, 50));

        labelImage4.setBackground(new java.awt.Color(153, 255, 204));
        labelImage4.setIcon(new javax.swing.ImageIcon("C:\\Users\\Carlollos Pc\\Documents\\Tec semestre agosto diciembre 2020\\Topicos de programacion\\dom.png")); // NOI18N
        labelImage4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Spring", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 14))); // NOI18N
        labelImage4.setOpaque(true);
        principalPanel.add(labelImage4, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 330, 160, 180));

        labelImage1.setBackground(new java.awt.Color(153, 255, 204));
        labelImage1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Carlollos Pc\\Documents\\Tec semestre agosto diciembre 2020\\Topicos de programacion\\copo-de-nieve.png")); // NOI18N
        labelImage1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Winter", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 12))); // NOI18N
        labelImage1.setOpaque(true);
        principalPanel.add(labelImage1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 330, 160, 180));

        labelImage2.setBackground(new java.awt.Color(153, 255, 204));
        labelImage2.setIcon(new javax.swing.ImageIcon("C:\\Users\\Carlollos Pc\\Documents\\Tec semestre agosto diciembre 2020\\Topicos de programacion\\las-hojas-de.png")); // NOI18N
        labelImage2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Fall", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 14))); // NOI18N
        labelImage2.setOpaque(true);
        principalPanel.add(labelImage2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 330, 160, 180));

        labelImage3.setBackground(new java.awt.Color(153, 255, 204));
        labelImage3.setIcon(new javax.swing.ImageIcon("C:\\Users\\Carlollos Pc\\Documents\\Tec semestre agosto diciembre 2020\\Topicos de programacion\\floral.png")); // NOI18N
        labelImage3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Spring", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 14))); // NOI18N
        labelImage3.setOpaque(true);
        principalPanel.add(labelImage3, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 330, 160, 180));

        getContentPane().add(principalPanel, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void sliderTemperatureStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_sliderTemperatureStateChanged
         
        int sliderValue = this.sliderTemperature.getValue();
        int Valuefahrenheit = sliderValue * 9/5 + 32;
        this.labelValueCentigrate.setText(Integer.toString(sliderValue));
        this.labelValueFahrenheit.setText(Integer.toString(Valuefahrenheit));
        
        int red = 127 + sliderValue*3; //Valor de calor
        int blue = 127  - sliderValue*3; //Valor del frio 
        
        this.colorPanel.setBackground(new Color(red , 0 ,blue));
        
        if(sliderValue <= -10){
            this.labelImage1.setVisible(true);
            this.labelImage2.setVisible(false);
            this.labelImage3.setVisible(false);
            this.labelImage4.setVisible(false);
        }
        if(sliderValue <= 20 && sliderValue >= -9){
            this.labelImage1.setVisible(false);
            this.labelImage2.setVisible(true);
            this.labelImage3.setVisible(false);
            this.labelImage4.setVisible(false);
        }
        if(sliderValue >= 21 && sliderValue <= 29){
           this.labelImage1.setVisible(false);
            this.labelImage2.setVisible(false);
            this.labelImage3.setVisible(true);
            this.labelImage4.setVisible(false);
        }
        if(sliderValue >= 30){
            this.labelImage1.setVisible(false);
            this.labelImage2.setVisible(false);
            this.labelImage3.setVisible(false);
            this.labelImage4.setVisible(true);
        }
        
    }//GEN-LAST:event_sliderTemperatureStateChanged

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainPanel().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel colorPanel;
    private javax.swing.JLabel labelCentigrade;
    private javax.swing.JLabel labelFahrenheit;
    private javax.swing.JLabel labelImage1;
    private javax.swing.JLabel labelImage2;
    private javax.swing.JLabel labelImage3;
    private javax.swing.JLabel labelImage4;
    private javax.swing.JLabel labelValueCentigrate;
    private javax.swing.JLabel labelValueFahrenheit;
    private javax.swing.JPanel principalPanel;
    private javax.swing.JSlider sliderTemperature;
    // End of variables declaration//GEN-END:variables

    private String toString(int value) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
