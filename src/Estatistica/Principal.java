/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Estatistica;

import com.sun.org.apache.bcel.internal.generic.GOTO;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javax.swing.JOptionPane;
import java.math.*;
import java.util.Objects;
import javafx.print.Collation;


/**
 *
 * @author 0040481621021
 */
public class Principal extends javax.swing.JFrame {
    
    
    String vazio = "0";
    
    /**
     * Creates new form Principal
     */
    public Principal() {
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

        jLabel8 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        entradaDeVariaveis = new javax.swing.JTextField();
        botaoCalcular = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        resMediana = new javax.swing.JLabel();
        resModa = new javax.swing.JLabel();
        resMedia = new javax.swing.JLabel();
        resAmplitude = new javax.swing.JLabel();
        resDesvioPadrao = new javax.swing.JLabel();
        resVariancia = new javax.swing.JLabel();
        resCoeficienteDeVariacao = new javax.swing.JLabel();
        botaoLimpar = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        quantidadeDadosInserido = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();

        jLabel8.setText("Moda:");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Estatística");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setLocation(new java.awt.Point(500, 200));
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Lucida Fax", 1, 18)); // NOI18N
        jLabel1.setText("Cálculo das medidas de Posição e Dispersão");

        jLabel2.setText("Insira os dados abaixo:");

        entradaDeVariaveis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                entradaDeVariaveisActionPerformed(evt);
            }
        });

        botaoCalcular.setText("Calcular");
        botaoCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoCalcularActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setText("1- Medidas de Dispersão");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setText("2- Medidas de dispersão");

        jLabel5.setText("Média: ");

        jLabel6.setText("Mediana:");

        jLabel7.setText("Moda:");

        jLabel9.setText("Amplitude:");

        jLabel10.setText("Desvio Padrão:");

        jLabel11.setText("Variância: ");

        jLabel12.setText("Coeficiente de Variação: ");

        resMediana.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        resMediana.setText("0");
        resMediana.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        resModa.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        resModa.setText("0");
        resModa.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        resMedia.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        resMedia.setText("0");
        resMedia.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        resAmplitude.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        resAmplitude.setText("0");
        resAmplitude.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        resDesvioPadrao.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        resDesvioPadrao.setText("0");
        resDesvioPadrao.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        resVariancia.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        resVariancia.setText("0");
        resVariancia.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        resCoeficienteDeVariacao.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        resCoeficienteDeVariacao.setText("0");
        resCoeficienteDeVariacao.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        botaoLimpar.setText("Limpar");
        botaoLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoLimparActionPerformed(evt);
            }
        });

        jLabel13.setText("Quantidade de Numeros: ");

        quantidadeDadosInserido.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        quantidadeDadosInserido.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        quantidadeDadosInserido.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 102, 0));
        jLabel14.setText("INFO");
        jLabel14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel14MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(botaoCalcular)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(botaoLimpar))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel6)
                                            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING))
                                        .addGap(26, 26, 26)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(resModa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(resMediana, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(resMedia, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel13)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(quantidadeDadosInserido, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel12)
                                            .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.TRAILING))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(resVariancia, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(resAmplitude, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(resDesvioPadrao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(resCoeficienteDeVariacao, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(entradaDeVariaveis)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel2)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel14))
                                .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel14))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(entradaDeVariaveis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(quantidadeDadosInserido, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(botaoCalcular)
                        .addComponent(botaoLimpar)
                        .addComponent(jLabel13)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(resVariancia)
                            .addComponent(jLabel11))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(resAmplitude)
                            .addComponent(jLabel9))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(resDesvioPadrao)
                            .addComponent(jLabel10))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(resCoeficienteDeVariacao)
                            .addComponent(jLabel12)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(resMedia)
                            .addComponent(jLabel5))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(resMediana)
                            .addComponent(jLabel6))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(resModa)
                            .addComponent(jLabel7))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        botaoCalcular.getAccessibleContext().setAccessibleName("");

        pack();
    }// </editor-fold>//GEN-END:initComponents
    //Metodo Limpar 
    void limpar(){
        resMedia.setText(vazio);
        resMediana.setText(vazio);
        resMediana.setText(vazio);
        resModa.setText(vazio);
        resAmplitude.setText(vazio);
        resVariancia.setText(vazio);
        resDesvioPadrao.setText(vazio);
        resCoeficienteDeVariacao.setText(vazio);
        quantidadeDadosInserido.setText(vazio);
    }
    
    //Função Média
    double calcularMedia(List<Double> valores){
        double media = 0.0;
        for (int i = 0; i < valores.size(); i++) {
            media += valores.get(i);
        }
        return media / (double)valores.size();
    }
    
    //Funcao Mediana
    double calcularMediana(List<Double> valores){
        double mediana;
        int numero1, numero2;
        
        if(valores.size()%2 == 0){
            numero2 =  valores.size()/2;
            numero1 = numero2 - 1;
            mediana = (valores.get(numero1) + valores.get(numero2))/2;
        }
        else {
            mediana = valores.get(valores.size()/2);
        }
        return mediana;
    }
    
    //Moda
    String calcularModa(List<Double> valores){
        double moda=0;
        
        List<Double> valoresTemp = new ArrayList<>();
        valoresTemp.addAll(valores);
        Collections.sort(valoresTemp);
        valoresTemp.add(0.0);
                
        List<Double> numeroDigitado = new ArrayList<>();
        List<Integer> numeroRepetido = new ArrayList<>();
        
        int limite = valoresTemp.size(), contador = 1;
        
        //Colocando os calores de numero e suas repetições
        for(int i=0, j=1; i < limite-1; i++, j++){
                            
                double num1 = valoresTemp.get(i);
                double num2 = valoresTemp.get(j);
                                
                if(num1 == num2){
                    contador ++;
                }
                else{
                    numeroDigitado.add(num1);
                    numeroRepetido.add(contador);
                    contador = 1;
                }     
        }
        
        numeroRepetido.add(0);
        numeroDigitado.add(0.0);
        
        //Verificando qual se repete mais  
        int indice=0;
        int maior;
        maior = Collections.max(numeroRepetido);
        
        for (int i=0; i<numeroRepetido.size(); i++){
            int numeroTemp = numeroRepetido.get(i);
            if(numeroTemp != maior){
                indice ++;
            }
            else{
                break;
            }
        }
        
        if(indice > 1){
            moda = numeroDigitado.get(indice);
            return String.valueOf(moda);
        }
        else{
            return "Amodal";
        }
        
       
    } 
    
    //Amplitude
    double calcularAmplitude(List<Double> valores){
        double amplitude=0, primeiro, ultimo;
        int n;
        
        primeiro = valores.get(0);
        n = valores.size();
        ultimo = valores.get(n-1);
        return amplitude = ultimo - primeiro;

    }
    
    //Variancia
    double calcularVarianciaAmostral(List<Double> valores){
        double varianciaAmostral, soma=0, somaAoQuadrado=0;
            for(int i=0; i<valores.size(); i++){
                soma = soma + valores.get(i);
                somaAoQuadrado = somaAoQuadrado + ( valores.get(i) * valores.get(i) );
            }
        varianciaAmostral = (somaAoQuadrado - ((soma*soma)/valores.size())) / (valores.size() - 1);
        
        return varianciaAmostral;
    }
    //Desvio Padrao
    double calcularDesvioPadrao(List<Double> valores){
        double desvioPadrao = Math.sqrt(calcularVarianciaAmostral(valores));
        return desvioPadrao;
    }
    
    //Coeficiente de Variação
    double calcularCoeficienteDeVariacao(List<Double> valores){
        double coeficienteDeVariacao= ((calcularDesvioPadrao(valores) / calcularMedia(valores))*100);
        return coeficienteDeVariacao;
        
    }
    
    
    
    private void botaoCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoCalcularActionPerformed
        
        limpar();
        String entrada = entradaDeVariaveis.getText();
        String[] entradas = entrada.split(" ");
        List<Double> valores = new ArrayList<>();
        
        for (String strValor : entradas) {
            try {
                strValor = strValor.replaceAll(",", ".");
                Double valor = Double.parseDouble(strValor);
                valores.add(valor);
            }catch (NumberFormatException nfe){
                System.out.println("Error: " + nfe.getMessage());
            }
        }
        
        Collections.sort(valores);
        
        
        
        double media = Helper.round(calcularMedia(valores), 2);
        double mediana = Helper.round(calcularMediana(valores),2);
        String moda = calcularModa(valores);
        double amplitude = Helper.round(calcularAmplitude(valores),2);
        double variancia = Helper.round(calcularVarianciaAmostral(valores), 2);
        double desvioPadrao = Helper.round(calcularDesvioPadrao(valores), 2);
        double coeficienteDeVariacao = Helper.round(calcularCoeficienteDeVariacao(valores), 2);
        
                    
        quantidadeDadosInserido.setText(String.valueOf(valores.size()));
        resMedia.setText(String.valueOf(media));
        resMediana.setText(String.valueOf(mediana));
        resModa.setText(moda);
        resAmplitude.setText(String.valueOf(amplitude));
        resVariancia.setText(String.valueOf(variancia));
        resDesvioPadrao.setText(String.valueOf(desvioPadrao));
        resCoeficienteDeVariacao.setText(String.valueOf(coeficienteDeVariacao) + " %");
                        
    }//GEN-LAST:event_botaoCalcularActionPerformed

    private void botaoLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoLimparActionPerformed
        //Limpar 
        entradaDeVariaveis.setText(" ");
        limpar();
        
        
    }//GEN-LAST:event_botaoLimparActionPerformed

    private void entradaDeVariaveisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_entradaDeVariaveisActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_entradaDeVariaveisActionPerformed

    private void jLabel14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel14MouseClicked
        
        JOptionPane.showMessageDialog(null, "Estatistica Aplicada - Prof.ª Paula da Fonte Sanches\n"
                + "FATEC - AMERICANA 2017\n\n"
                + "Grupo:\n"
                + "André Nicoletti RA: 0040481621021 \n"
                + "Cristian Roberto Jr. RA:004048162211 \n" 
                + "Matheus Rodrigues RA: 004048162241\n"
                + "Maini Militao RA: 0040481622027\n");
        
    }//GEN-LAST:event_jLabel14MouseClicked

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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoCalcular;
    private javax.swing.JButton botaoLimpar;
    private javax.swing.JTextField entradaDeVariaveis;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel quantidadeDadosInserido;
    private javax.swing.JLabel resAmplitude;
    private javax.swing.JLabel resCoeficienteDeVariacao;
    private javax.swing.JLabel resDesvioPadrao;
    private javax.swing.JLabel resMedia;
    private javax.swing.JLabel resMediana;
    private javax.swing.JLabel resModa;
    private javax.swing.JLabel resVariancia;
    // End of variables declaration//GEN-END:variables
}