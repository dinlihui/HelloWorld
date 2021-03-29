package ding.demo01;

/**
 * @ClassName DrawJFrame
 * @Description TODO
 * @Author Mister-Lu
 * @Date 2021/3/23
 **/


public class DrawJFrame extends javax.swing.JFrame {




 public DrawJFrame() {
 initComponents();

 this.setTitle("多线程窗体");
 this.setLocationRelativeTo(null);
 }




// <editor-fold defaultstate="collapsed" desc="Generated Code">                          
         private void initComponents() {


leftHand = new ding.demo01.LeftHand();
 RightHand = new ding.demo01.RightHand();


 setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);


 leftHand.setBorder(javax.swing.BorderFactory.createTitledBorder("左手"));


 javax.swing.GroupLayout leftHandLayout = new javax.swing.GroupLayout(leftHand);
 leftHand.setLayout(leftHandLayout);
 leftHandLayout.setHorizontalGroup(
                 leftHandLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                 .addGap(0, 188, Short.MAX_VALUE)
 );
 leftHandLayout.setVerticalGroup(
                leftHandLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                 .addGap(0, 276, Short.MAX_VALUE)
 );


 RightHand.setBorder(javax.swing.BorderFactory.createTitledBorder("右手"));


 javax.swing.GroupLayout RightHandLayout = new javax.swing.GroupLayout(RightHand);
 RightHand.setLayout(RightHandLayout);
 RightHandLayout.setHorizontalGroup(
                 RightHandLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                 .addGap(0, 203, Short.MAX_VALUE)
 );
 RightHandLayout.setVerticalGroup(
                 RightHandLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                 .addGap(0, 0, Short.MAX_VALUE)
 );


 javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
 getContentPane().setLayout(layout);
 layout.setHorizontalGroup(
                 layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                 .addGroup(layout.createSequentialGroup()
                 .addComponent(leftHand, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
 .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
 .addComponent(RightHand, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
 );
 layout.setVerticalGroup(
                 layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                 .addComponent(leftHand, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
 .addComponent(RightHand, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
 );


pack();
 }// </editor-fold>                        




public static void main(String args[]) {

 try {
 for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
 if ("Nimbus".equals(info.getName())) {
 javax.swing.UIManager.setLookAndFeel(info.getClassName());
 break;
 }
 }
 } catch (ClassNotFoundException ex) {
 java.util.logging.Logger.getLogger(DrawJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
 } catch (InstantiationException ex) {
 java.util.logging.Logger.getLogger(DrawJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
 } catch (IllegalAccessException ex) {
 java.util.logging.Logger.getLogger(DrawJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
 } catch (javax.swing.UnsupportedLookAndFeelException ex) {
 java.util.logging.Logger.getLogger(DrawJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
 }



 /* Create and display the form */
java.awt.EventQueue.invokeLater(new Runnable() {
public void run() {
 new DrawJFrame().setVisible(true);
 }
});
 }


 // Variables declaration - do not modify                     
         private javax.swing.JPanel RightHand;
 private javax.swing.JPanel leftHand;
 // End of variables declaration                   
}