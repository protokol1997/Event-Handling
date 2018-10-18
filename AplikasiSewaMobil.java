package latihansatu;

/*
Nama : Muhammad Amin
NPM : 16630742
 */
import javax.swing.*;
import java.awt.event.*;

class AplikasiSewaMobil extends JFrame {

    JLabel lblid=new JLabel("ID Pelanggan");
 JTextField txid=new JTextField(100);
 JButton tblcari=new JButton("Cari");
 JLabel lblnama=new JLabel("Nama Pelanggan");
 JTextField txnama= new JTextField(20);
 JLabel lbldurasisewa=new JLabel("Durasi Sewa");
 JRadioButton Harian=new JRadioButton("Harian");
 JRadioButton Mingguan=new JRadioButton("Mingguan");
 JRadioButton Bulanan=new JRadioButton("Bulanan");
 JLabel lblhobi=new JLabel("Hobi");
 JCheckBox berenang=new JCheckBox("Renang");
 JCheckBox lari=new JCheckBox("Pelari");
 JCheckBox travel=new JCheckBox("Travel");
 ButtonGroup grupdurasisewa=new ButtonGroup();
 JLabel lbljenismobil=new JLabel("Jenis Mobil :");
 String[] jenismobil={"Avanza","Xenia","Jazz","Innova","Brio"};
 JComboBox cbjenismobil=new JComboBox(jenismobil);
 JLabel lblmerkmobil=new JLabel("Harga Sewa");
 JLabel lblavanza=new JLabel("Avanza");
 JTextField txavanza= new JTextField(20);
 JLabel lblxenia=new JLabel("Xenia");
 JTextField txxenia= new JTextField(20);
 JLabel lbljazz=new JLabel("Jazz");
 JTextField txjazz= new JTextField(20);
 JLabel lblinnova=new JLabel("Innova");
 JTextField txinnova= new JTextField(20);
 JLabel lblbrio=new JLabel("Brio");
 JTextField txbrio= new JTextField(20);
 JButton tblsave=new JButton("Save");
 JButton tblupdate=new JButton("Update");
 JButton tblexit=new JButton("EXIT");
 JButton cetak=new JButton("Cetak");
JTextArea hasil=new JTextArea();
 
 AplikasiSewaMobil()
 {
    setTitle("Daftar Sewa Mobil");
    setLocation(400,100);
    setSize(500,600);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setVisible(true);
 }
 void komponenVisual()
 {
     getContentPane().setLayout(null);
     getContentPane().add(lblid);
     lblid.setBounds(10,10,80,20);
     getContentPane().add(txid);
     txid.setBounds(130,10,100,20);
     getContentPane().add(tblcari);
     tblcari.setBounds(234,10,95,20);
     getContentPane().add(lblnama);
     lblnama.setBounds(10,30,100,20);
     getContentPane().add(txnama);
     txnama.setBounds(130,30,200,20);
     getContentPane().add(lbldurasisewa);
     lbldurasisewa.setBounds(10,50,100,20);
     getContentPane().add(Harian);
     Harian.setBounds(85,50,80,20);
     getContentPane().add(Mingguan);
     Mingguan.setBounds(160,50,80,20);
     getContentPane().add(Bulanan);
     Bulanan.setBounds(250,50,80,20);
     grupdurasisewa.add(Harian);
     grupdurasisewa.add(Mingguan);
     grupdurasisewa.add(Bulanan);
     getContentPane().add(lbljenismobil);
     lbljenismobil.setBounds(10,70,100,20);
     getContentPane().add(cbjenismobil);
     cbjenismobil.setBounds(85,70,100,20);
     getContentPane().add(lblmerkmobil);
     lblmerkmobil.setBounds(10,100,100,20);
     getContentPane().add(lblavanza);
     lblavanza.setBounds(10,125,100,20);
     txavanza.setText("0");
     getContentPane().add(txavanza);
     txavanza.setBounds(75,125,100,20);
     getContentPane().add(lblxenia);
     lblxenia.setBounds(10,145,100,20);
     txxenia.setText("0");
     getContentPane().add(txxenia);
     txxenia.setBounds(75,145,100,20);
     getContentPane().add(lbljazz);
     lbljazz.setBounds(10,165,100,20);
     getContentPane().add(txjazz);
     txjazz.setBounds(75,165,100,20);
     txjazz.setText("0");
     getContentPane().add(lblinnova);
     lblinnova.setBounds(10,185,100,20);
     getContentPane().add(txinnova);
     txinnova.setBounds(75,185,100,20);
     txinnova.setText("0");
     getContentPane().add(lblbrio);
     lblbrio.setBounds(10,205,100,20);
     getContentPane().add(txbrio);
     txbrio.setBounds(75,205,100,20);
     txbrio.setText("0");
     getContentPane().add(tblsave);
     tblsave.setBounds(180,150,95,20);
     getContentPane().add(tblupdate);
     tblupdate.setBounds(180,175,95,20);
     getContentPane().add(tblexit);
     tblexit.setBounds(180,200,95,20);
     
     getContentPane().add(cetak);
    cetak.setBounds(10,255,270,20);
    getContentPane().add(hasil);
    hasil.setBounds(10,275,270,150);
    getContentPane().add(lblhobi);
    lblhobi.setBounds(10,230,100,20);
    getContentPane().add(berenang);
    berenang.setBounds(80,230,100,20);
    getContentPane().add(lari);
    lari.setBounds(180,230,100,20);
    getContentPane().add(travel);
    travel.setBounds(280,230,100,20);
    
     setVisible(true);
 }
 void AksiReaksi()
{
cetak.addActionListener(new ActionListener()
{
public void actionPerformed(ActionEvent e)
{
hasil.append(txnama.getText()+"\n");
hasil.append(txid.getText()+"\n");
if(Harian.isSelected()==true)
    {
hasil.append(Harian.getText()+"\n");
}
else
{
String jenismobil = (String)
        cbjenismobil.getSelectedItem();
hasil.append(jenismobil+"\n");
}

{
hasil.append(Mingguan.getText()+"\n");
}
if(berenang.isSelected()==true)
{
hasil.append(berenang.getText()+"\n");
}
if(lari.isSelected()==true)
{
hasil.append(lari.getText()+"\n");
}
if(travel.isSelected()==true)
{
hasil.append(travel.getText()+"\n");
}
}
});
}
 
 public static void main(String args[])
 {
     AplikasiSewaMobil ASM = new AplikasiSewaMobil();
  ASM.komponenVisual();
  ASM.AksiReaksi();
 }
}
 
