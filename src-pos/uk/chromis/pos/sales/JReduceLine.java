//    Chromis POS  - The New Face of Open Source POS
//    Copyright (c) 2015 
//    http://www.chromis.co.uk
//
//    This file is part of Chromis POS
//
//     Chromis POS is free software: you can redistribute it and/or modify
//    it under the terms of the GNU General Public License as published by
//    the Free Software Foundation, either version 3 of the License, or
//    (at your option) any later version.
//
//    Chromis POS is distributed in the hope that it will be useful,
//    but WITHOUT ANY WARRANTY; without even the implied warranty of
//    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
//    GNU General Public License for more details.
//
//    You should have received a copy of the GNU General Public License
//    along with Chromis POS.  If not, see <http://www.gnu.org/licenses/>.

package uk.chromis.pos.sales;

import java.awt.Component;
import uk.chromis.format.Formats;
import uk.chromis.pos.forms.AppLocal;

public class JReduceLine extends javax.swing.JDialog {

    private Double m_dStartPrice = 0.0;
    private Double m_dEndPrice = 0.0;
    
    /** Creates new form DiscountLine */
    public JReduceLine(java.awt.Frame parent, boolean modal, Double startPrice ) {
        super(parent, modal);
        init ( startPrice );
    }

    /** Creates new form DiscountLine */
    public JReduceLine(java.awt.Dialog parent, boolean modal, Double startPrice ) {
        super(parent, modal);
        init ( startPrice );
    }
        
    public Double getNewPrice() {
        return m_dEndPrice;
    }
    
    public Double getReduction() {
        return m_dStartPrice - m_dEndPrice;
    }
    
    public boolean hasPriceChanged() {
        return m_dEndPrice != m_dStartPrice;
    }
    
    private void init( Double startPrice ) {

        m_dStartPrice = startPrice;
        m_dEndPrice = startPrice;
        initComponents();
        
        jLabelSellPrice.setText(Formats.CURRENCY.formatValue(m_dStartPrice));
        m_jDiscountAmount.addEditorKeys(m_jKeys);
        m_jDiscountAmount.activate();
        m_jDiscountAmount.requestFocus();
    }
    
    /**
     *
     * @return
     */
    @Override
    public String getTitle() {
        return AppLocal.getIntString("Menu.ReduceLine");
    }

    /** This method is called from within the constructor to
     * initialise the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        m_jKeys = new uk.chromis.editor.JEditorKeys();
        jPanel3 = new javax.swing.JPanel();
        jButtonPercentOff = new javax.swing.JButton();
        jButtonReduceBy = new javax.swing.JButton();
        jButtonSellPrice = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        m_jDiscountAmount = new uk.chromis.editor.JEditorDouble();
        jButtonCancel = new javax.swing.JButton();
        jLabelSellPrice = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setMaximumSize(null);
        setMinimumSize(new java.awt.Dimension(500, 475));
        setModal(true);
        setPreferredSize(new java.awt.Dimension(500, 475));

        jButtonPercentOff.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        java.util.ResourceBundle bundle = java.util.ResourceBundle.getBundle("pos_messages"); // NOI18N
        jButtonPercentOff.setText(bundle.getString("button.discount.percentoff")); // NOI18N
        jButtonPercentOff.setMaximumSize(null);
        jButtonPercentOff.setMinimumSize(null);
        jButtonPercentOff.setPreferredSize(null);
        jButtonPercentOff.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPercentOffActionPerformed(evt);
            }
        });

        jButtonReduceBy.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jButtonReduceBy.setText(bundle.getString("button.discount.reduceby")); // NOI18N
        jButtonReduceBy.setMaximumSize(null);
        jButtonReduceBy.setMinimumSize(null);
        jButtonReduceBy.setPreferredSize(null);
        jButtonReduceBy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonReduceByActionPerformed(evt);
            }
        });

        jButtonSellPrice.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jButtonSellPrice.setText(bundle.getString("button.discount.sellprice")); // NOI18N
        jButtonSellPrice.setMaximumSize(null);
        jButtonSellPrice.setMinimumSize(null);
        jButtonSellPrice.setOpaque(false);
        jButtonSellPrice.setPreferredSize(null);
        jButtonSellPrice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSellPriceActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButtonPercentOff, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButtonReduceBy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButtonSellPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonReduceBy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonPercentOff, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonSellPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        jPanel4.setMaximumSize(new java.awt.Dimension(32767, 25));
        jPanel4.setName(""); // NOI18N

        jLabel2.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel2.setText(bundle.getString("message.linediscount")); // NOI18N
        jLabel2.setAlignmentY(0.0F);
        jLabel2.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jLabel2.setInheritsPopupMenu(false);
        jLabel2.setMaximumSize(new java.awt.Dimension(150, 22));
        jLabel2.setMinimumSize(new java.awt.Dimension(150, 22));
        jLabel2.setOpaque(true);
        jLabel2.setPreferredSize(new java.awt.Dimension(150, 22));
        jLabel2.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        m_jDiscountAmount.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        m_jDiscountAmount.setMaximumSize(new java.awt.Dimension(150, 32));
        m_jDiscountAmount.setMinimumSize(new java.awt.Dimension(150, 32));
        m_jDiscountAmount.setPreferredSize(new java.awt.Dimension(150, 32));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(m_jDiscountAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(m_jDiscountAmount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jButtonCancel.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jButtonCancel.setText(bundle.getString("Button.Cancel")); // NOI18N
        jButtonCancel.setMaximumSize(new java.awt.Dimension(120, 45));
        jButtonCancel.setMinimumSize(new java.awt.Dimension(120, 45));
        jButtonCancel.setPreferredSize(new java.awt.Dimension(120, 45));
        jButtonCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelActionPerformed(evt);
            }
        });

        jLabelSellPrice.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabelSellPrice.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabelSellPrice.setText("{Price}");
        jLabelSellPrice.setAlignmentY(0.0F);
        jLabelSellPrice.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jLabelSellPrice.setInheritsPopupMenu(false);
        jLabelSellPrice.setMaximumSize(new java.awt.Dimension(200, 22));
        jLabelSellPrice.setMinimumSize(new java.awt.Dimension(200, 22));
        jLabelSellPrice.setOpaque(true);
        jLabelSellPrice.setPreferredSize(new java.awt.Dimension(200, 22));
        jLabelSellPrice.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        jLabel3.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel3.setText(bundle.getString("label.prodpriceselltax")); // NOI18N
        jLabel3.setToolTipText("");
        jLabel3.setAlignmentY(0.0F);
        jLabel3.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jLabel3.setInheritsPopupMenu(false);
        jLabel3.setMaximumSize(new java.awt.Dimension(200, 22));
        jLabel3.setMinimumSize(new java.awt.Dimension(200, 22));
        jLabel3.setOpaque(true);
        jLabel3.setPreferredSize(new java.awt.Dimension(200, 22));
        jLabel3.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabelSellPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(m_jKeys, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(20, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButtonCancel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(178, 178, 178))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(m_jKeys, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(8, 8, 8)
                        .addComponent(jLabelSellPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addComponent(jButtonCancel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        setSize(new java.awt.Dimension(516, 489));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonPercentOffActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPercentOffActionPerformed
        Double amount = m_jDiscountAmount.getDoubleValue();
        if( amount > 0) {
            m_dEndPrice = m_dStartPrice - ( m_dStartPrice * (amount/100));
        }
        dispose();
    }//GEN-LAST:event_jButtonPercentOffActionPerformed

    private void jButtonReduceByActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonReduceByActionPerformed
        Double amount = m_jDiscountAmount.getDoubleValue();
        if( amount > 0) {
            m_dEndPrice = m_dStartPrice - amount;
            if( m_dEndPrice < 0.0 )
                m_dEndPrice = 0.0;
        }
        dispose();

    }//GEN-LAST:event_jButtonReduceByActionPerformed

    private void jButtonSellPriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSellPriceActionPerformed
        Double amount = m_jDiscountAmount.getDoubleValue();
        if( amount > 0) {
            m_dEndPrice =  amount;
        }
        dispose();
    }//GEN-LAST:event_jButtonSellPriceActionPerformed

    private void jButtonCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelActionPerformed
        dispose();
    }//GEN-LAST:event_jButtonCancelActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCancel;
    private javax.swing.JButton jButtonPercentOff;
    private javax.swing.JButton jButtonReduceBy;
    private javax.swing.JButton jButtonSellPrice;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabelSellPrice;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private uk.chromis.editor.JEditorDouble m_jDiscountAmount;
    private uk.chromis.editor.JEditorKeys m_jKeys;
    // End of variables declaration//GEN-END:variables

}

