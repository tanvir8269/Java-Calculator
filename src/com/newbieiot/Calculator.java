/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.newbieiot;

import java.text.DecimalFormat;

/**
 *
 * @author tanvir
 */
public class Calculator extends javax.swing.JFrame {
    private double num;
    private char sign;

    public void setNum(double num) {
        this.num = num;
    }

    public void setSign(char sign) {
        this.sign = sign;
    }

    public double getNum() {
        return num;
    }

    public char getSign() {
        return sign;
    }
    
    /**
     * Creates new form Calculator
     */
    public Calculator() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtDisplay = new javax.swing.JTextField();
        btnDivide = new javax.swing.JButton();
        btnEqualsTo = new javax.swing.JButton();
        btnZero = new javax.swing.JButton();
        btnPlusMinus = new javax.swing.JButton();
        btnAddition = new javax.swing.JButton();
        btnThree = new javax.swing.JButton();
        btnTwo = new javax.swing.JButton();
        btnOne = new javax.swing.JButton();
        btnSeven = new javax.swing.JButton();
        btnEight = new javax.swing.JButton();
        btnNine = new javax.swing.JButton();
        btnMultiplication = new javax.swing.JButton();
        btnSubstraction = new javax.swing.JButton();
        btnSix = new javax.swing.JButton();
        btnFour = new javax.swing.JButton();
        btnFive = new javax.swing.JButton();
        btnClearEntry = new javax.swing.JButton();
        btnClearGlobal = new javax.swing.JButton();
        btnDecimal = new javax.swing.JButton();
        btnBackSpace = new javax.swing.JButton();
        btnPercent = new javax.swing.JButton();
        btnPowOf = new javax.swing.JButton();
        btnInversePow = new javax.swing.JButton();
        btnSqRoot = new javax.swing.JButton();
        lblData = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Calculator");
        setResizable(false);

        txtDisplay.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        txtDisplay.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtDisplay.setText("0");

        btnDivide.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        btnDivide.setText("÷");
        btnDivide.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDivideActionPerformed(evt);
            }
        });

        btnEqualsTo.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        btnEqualsTo.setText("=");

        btnZero.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        btnZero.setText("0");
        btnZero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnZeroActionPerformed(evt);
            }
        });

        btnPlusMinus.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        btnPlusMinus.setText("±");

        btnAddition.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        btnAddition.setText("+");
        btnAddition.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdditionActionPerformed(evt);
            }
        });

        btnThree.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        btnThree.setText("3");
        btnThree.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThreeActionPerformed(evt);
            }
        });

        btnTwo.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        btnTwo.setText("2");
        btnTwo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTwoActionPerformed(evt);
            }
        });

        btnOne.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        btnOne.setText("1");
        btnOne.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOneActionPerformed(evt);
            }
        });

        btnSeven.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        btnSeven.setText("7");
        btnSeven.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSevenActionPerformed(evt);
            }
        });

        btnEight.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        btnEight.setText("8");
        btnEight.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEightActionPerformed(evt);
            }
        });

        btnNine.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        btnNine.setText("9");
        btnNine.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNineActionPerformed(evt);
            }
        });

        btnMultiplication.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        btnMultiplication.setText("*");
        btnMultiplication.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMultiplicationActionPerformed(evt);
            }
        });

        btnSubstraction.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        btnSubstraction.setText("-");
        btnSubstraction.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubstractionActionPerformed(evt);
            }
        });

        btnSix.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        btnSix.setText("6");
        btnSix.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSixActionPerformed(evt);
            }
        });

        btnFour.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        btnFour.setText("4");
        btnFour.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFourActionPerformed(evt);
            }
        });

        btnFive.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        btnFive.setText("5");
        btnFive.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFiveActionPerformed(evt);
            }
        });

        btnClearEntry.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        btnClearEntry.setText("CE");
        btnClearEntry.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearEntryActionPerformed(evt);
            }
        });

        btnClearGlobal.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        btnClearGlobal.setText("C");
        btnClearGlobal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearGlobalActionPerformed(evt);
            }
        });

        btnDecimal.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        btnDecimal.setText(".");
        btnDecimal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDecimalActionPerformed(evt);
            }
        });

        btnBackSpace.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        btnBackSpace.setText("←");
        btnBackSpace.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackSpaceActionPerformed(evt);
            }
        });

        btnPercent.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        btnPercent.setText("%");

        btnPowOf.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        btnPowOf.setText("^");

        btnInversePow.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        btnInversePow.setText("1/x");

        btnSqRoot.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        btnSqRoot.setText("√");

        lblData.setForeground(new java.awt.Color(255, 102, 0));
        lblData.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnFour, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnFive, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSix, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSubstraction, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnPlusMinus, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnZero, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnDecimal, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnEqualsTo, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnOne, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnTwo, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnThree, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnAddition, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(btnClearEntry, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnSeven, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(btnEight, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(btnNine, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(btnMultiplication, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(btnBackSpace, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(btnClearGlobal, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(btnDivide, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addComponent(txtDisplay, javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(btnPercent, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btnSqRoot, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btnPowOf, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btnInversePow, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(lblData, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(16, 16, 16))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(lblData, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnPercent, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPowOf, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSqRoot, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnInversePow, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnClearEntry, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnClearGlobal, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBackSpace, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDivide, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnMultiplication, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnNine, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEight, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSeven, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSix, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnFive, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnFour, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSubstraction, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnOne, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAddition, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnThree, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnTwo, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnPlusMinus, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnZero, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDecimal, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEqualsTo, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnFiveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFiveActionPerformed
        // TODO add your handling code here:
        if(txtDisplay.getText().equals("0")){
            txtDisplay.setText("5");
        }else{
            txtDisplay.setText(txtDisplay.getText() + "5");
        }
    }//GEN-LAST:event_btnFiveActionPerformed

    private void btnOneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOneActionPerformed
        if(txtDisplay.getText().equals("0")){
            txtDisplay.setText("1");
        }else{
            txtDisplay.setText(txtDisplay.getText() + "1");
        }
    }//GEN-LAST:event_btnOneActionPerformed

    private void btnTwoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTwoActionPerformed
        // TODO add your handling code here:
        if(txtDisplay.getText().equals("0")){
            txtDisplay.setText("2");
        }else{
            txtDisplay.setText(txtDisplay.getText() + "2");
        }
    }//GEN-LAST:event_btnTwoActionPerformed

    private void btnThreeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThreeActionPerformed
        // TODO add your handling code here:
        if(txtDisplay.getText().equals("0")){
            txtDisplay.setText("3");
        }else{
            txtDisplay.setText(txtDisplay.getText() + "3");
        }
    }//GEN-LAST:event_btnThreeActionPerformed

    private void btnFourActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFourActionPerformed
        // TODO add your handling code here:
        if(txtDisplay.getText().equals("0")){
            txtDisplay.setText("4");
        }else{
            txtDisplay.setText(txtDisplay.getText() + "4");
        }
    }//GEN-LAST:event_btnFourActionPerformed

    private void btnSixActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSixActionPerformed
        // TODO add your handling code here:
        if(txtDisplay.getText().equals("0")){
            txtDisplay.setText("6");
        }else{
            txtDisplay.setText(txtDisplay.getText() + "6");
        }
    }//GEN-LAST:event_btnSixActionPerformed

    private void btnSevenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSevenActionPerformed
        // TODO add your handling code here:
        if(txtDisplay.getText().equals("0")){
            txtDisplay.setText("7");
        }else{
            txtDisplay.setText(txtDisplay.getText() + "7");
        }
    }//GEN-LAST:event_btnSevenActionPerformed

    private void btnEightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEightActionPerformed
        // TODO add your handling code here:
        if(txtDisplay.getText().equals("0")){
            txtDisplay.setText("8");
        }else{
            txtDisplay.setText(txtDisplay.getText() + "8");
        }
    }//GEN-LAST:event_btnEightActionPerformed

    private void btnNineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNineActionPerformed
        // TODO add your handling code here:
        if(txtDisplay.getText().equals("0")){
            txtDisplay.setText("9");
        }else{
            txtDisplay.setText(txtDisplay.getText() + "9");
        }
    }//GEN-LAST:event_btnNineActionPerformed

    private void btnZeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnZeroActionPerformed
        // TODO add your handling code here:
        if(txtDisplay.getText().equals("0")){
            txtDisplay.setText("0");
        }else{
            txtDisplay.setText(txtDisplay.getText() + "0");
        }
    }//GEN-LAST:event_btnZeroActionPerformed

    private void btnDecimalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDecimalActionPerformed
        // TODO add your handling code here:
        if(txtDisplay.getText().equals("0")){
            txtDisplay.setText("0.");
        }else{
            txtDisplay.setText(txtDisplay.getText() + ".");
        }
    }//GEN-LAST:event_btnDecimalActionPerformed

    private void btnClearEntryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearEntryActionPerformed
        // TODO add your handling code here:
        txtDisplay.setText("0");
    }//GEN-LAST:event_btnClearEntryActionPerformed

    private void btnBackSpaceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackSpaceActionPerformed
        // TODO add your handling code here:
        if((txtDisplay.getText().length()>0)&&(!txtDisplay.getText().equals("0"))){
           StringBuilder s = new StringBuilder(txtDisplay.getText());
           int num = txtDisplay.getText().length();
           txtDisplay.setText(s.deleteCharAt(num-1).toString());
           if(txtDisplay.getText().isEmpty()){
               txtDisplay.setText("0");
           }
        }
    }//GEN-LAST:event_btnBackSpaceActionPerformed

    private void btnClearGlobalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearGlobalActionPerformed
        // TODO add your handling code here:
        txtDisplay.setText("0");
        lblData.setText("");
    }//GEN-LAST:event_btnClearGlobalActionPerformed
    
    private void btnAdditionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdditionActionPerformed
        // TODO add your handling code here:
        if(lblData.getText().isEmpty()){
            lblData.setText(txtDisplay.getText() + "+");
            this.setNum(Double.parseDouble(txtDisplay.getText()));
            this.setSign('+');
            txtDisplay.setText("0");
        }else{
            if(!txtDisplay.getText().equals("0")){
                double result = calculate(Double.parseDouble(txtDisplay.getText()));
                lblData.setText(Double.toString(result) + "+");
                this.setNum(result);
                this.setSign('+');
                txtDisplay.setText("0");
            }else{
                lblData.setText(lblData.getText().substring(0, lblData.getText().length()-1)+ "+");
                this.setSign('+');
            }
        }
    }//GEN-LAST:event_btnAdditionActionPerformed

    private void btnSubstractionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubstractionActionPerformed
        // TODO add your handling code here:
        if(lblData.getText().isEmpty()){
            lblData.setText(txtDisplay.getText() + "-");
            this.setNum(Double.parseDouble(txtDisplay.getText()));
            this.setSign('-');
            txtDisplay.setText("0");
        }else{
            if(!txtDisplay.getText().equals("0")){
                double result = calculate(Double.parseDouble(txtDisplay.getText()));
                lblData.setText(Double.toString(result) + "-");
                this.setNum(result);
                this.setSign('-');
                txtDisplay.setText("0");
            }else{
                lblData.setText(lblData.getText().substring(0, lblData.getText().length()-1)+ "-");
                this.setSign('-');
            }
        }
    }//GEN-LAST:event_btnSubstractionActionPerformed

    private void btnMultiplicationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMultiplicationActionPerformed
        // TODO add your handling code here:
        if(lblData.getText().isEmpty()){
            lblData.setText(txtDisplay.getText() + "*");
            this.setNum(Double.parseDouble(txtDisplay.getText()));
            this.setSign('*');
            txtDisplay.setText("0");
        }else{
            if(!txtDisplay.getText().equals("0")){
                double result = calculate(Double.parseDouble(txtDisplay.getText()));
                lblData.setText(Double.toString(result) + "*");
                this.setNum(result);
                this.setSign('*');
                txtDisplay.setText("0");
            }else{
                lblData.setText(lblData.getText().substring(0, lblData.getText().length()-1)+ "*");
                this.setSign('*');
            }
        }
    }//GEN-LAST:event_btnMultiplicationActionPerformed

    private void btnDivideActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDivideActionPerformed
        // TODO add your handling code here:
        if(lblData.getText().isEmpty()){
            lblData.setText(txtDisplay.getText() + "/");
            this.setNum(Double.parseDouble(txtDisplay.getText()));
            this.setSign('/');
            txtDisplay.setText("0");
        }else{
            if(!txtDisplay.getText().equals("0")){
                double result = calculate(Double.parseDouble(txtDisplay.getText()));
                lblData.setText(Double.toString(result) + "/");
                this.setNum(result);
                this.setSign('/');
                txtDisplay.setText("0");
            }else{
                lblData.setText(lblData.getText().substring(0, lblData.getText().length()-1)+ "/");
                this.setSign('/');
            }
        }
    }//GEN-LAST:event_btnDivideActionPerformed
    public double calculate(double d){
        double answer;
        switch(this.getSign()){
            case '+':
                answer = this.getNum() + d;
                break;
            case '-':
                answer = this.getNum() - d;
                break;
            case '*':
                answer = this.getNum() * d;
                break;
            case '/':
                answer = this.getNum() / d;
                break;
            default:
                answer = 0;
                break;
        }
//        answer *= 10000;
//        answer = Math.round(answer);
//        answer = answer/10000;
        return answer;
    }
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
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Calculator().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddition;
    private javax.swing.JButton btnBackSpace;
    private javax.swing.JButton btnClearEntry;
    private javax.swing.JButton btnClearGlobal;
    private javax.swing.JButton btnDecimal;
    private javax.swing.JButton btnDivide;
    private javax.swing.JButton btnEight;
    private javax.swing.JButton btnEqualsTo;
    private javax.swing.JButton btnFive;
    private javax.swing.JButton btnFour;
    private javax.swing.JButton btnInversePow;
    private javax.swing.JButton btnMultiplication;
    private javax.swing.JButton btnNine;
    private javax.swing.JButton btnOne;
    private javax.swing.JButton btnPercent;
    private javax.swing.JButton btnPlusMinus;
    private javax.swing.JButton btnPowOf;
    private javax.swing.JButton btnSeven;
    private javax.swing.JButton btnSix;
    private javax.swing.JButton btnSqRoot;
    private javax.swing.JButton btnSubstraction;
    private javax.swing.JButton btnThree;
    private javax.swing.JButton btnTwo;
    private javax.swing.JButton btnZero;
    private javax.swing.JLabel lblData;
    private javax.swing.JTextField txtDisplay;
    // End of variables declaration//GEN-END:variables
}
