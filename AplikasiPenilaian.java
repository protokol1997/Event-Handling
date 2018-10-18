package latihansatu;

/*
Nama : Muhammad Amin
NPM : 16630742
Tugas : Halaman 22 tugas 2.2
 */

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import javax.swing.*;
import java.awt.event.*;
class AplikasiPenilaian extends JFrame
{
JLabel lblhobi=new JLabel("Hobi");
JCheckBox baca=new JCheckBox("Membaca");
JCheckBox mancing=new JCheckBox("Memancing");
JCheckBox jalan=new JCheckBox("Jalan-Jalan");
    
JButton cetak2=new JButton("Cetak");
JTextArea hasil2=new JTextArea();
    
JTextField data1=new JTextField(6);
JTextField data2=new JTextField(6);
JButton operasi=new JButton("+");
JTextField hasil=new JTextField(6);
JButton exit=new JButton("EXIT");
    
JMenuBar mb=new JMenuBar();
JMenu file=new JMenu("File");
JMenu help=new JMenu("Help");
JMenuItem open=new JMenuItem("Open");
JMenuItem close=new JMenuItem("Close");
JMenuItem quit=new JMenuItem("Quit");
JMenuItem about=new JMenuItem("About");
    
String[] header={"Senin","Selasa","Rabu"};
String[][] data =
{{"100","300","150"},{"500","600","450"},{"290","690","360"}};
JTable tabel1=new JTable(data,header);

JCheckBox cek1=new JCheckBox("Pilihan 1");
JCheckBox cek2=new JCheckBox("Pilihan 2");
JCheckBox cek3=new JCheckBox("Pilihan 3");
JLabel label=new JLabel("Nama");
JTextArea area1=new JTextArea(3,20);
 JLabel lblnim=new JLabel("NIM");
 JTextField txnim=new JTextField(20);
 JButton tblcari=new JButton("Cari");
 JLabel lblnama=new JLabel("Nama");
 JTextField txnama= new JTextField(20);
 JLabel lblkelas=new JLabel("Kelas");
 JRadioButton pria=new JRadioButton("A");
 JRadioButton wanita=new JRadioButton("B");
 JRadioButton kelasC=new JRadioButton("C");
 ButtonGroup grupkelas=new ButtonGroup();
 JLabel lblkelompok=new JLabel("Kelompok");
 String[] jeniskelompok={"1","2","3","4","5","6","7"};
 JComboBox cbkelompok=new JComboBox(jeniskelompok);
 JLabel lblnilai=new JLabel("Nilai");
 JLabel lbltugas1=new JLabel("Tugas 1");
 JTextField txtugas1= new JTextField(20);
 JLabel lbltugas2=new JLabel("Tugas 2");
 JTextField txtugas2= new JTextField(20);
 JLabel lbltugas3=new JLabel("Tugas 3");
 JTextField txtugas3= new JTextField(20);
 JLabel lbltugas4=new JLabel("Tugas 4");
 JTextField txtugas4= new JTextField(20);
 JLabel lbltugas5=new JLabel("Tugas 5");
 JTextField txtugas5= new JTextField(20);
 JButton tblsave=new JButton("Save");
 JLabel lbluts=new JLabel("UTS");
 JTextField txuts= new JTextField(20);
 JButton tblupdate=new JButton("Update");
 JLabel lbluas=new JLabel("UAS");
 JTextField txuas= new JTextField(20);
 JButton tblexit=new JButton("EXIT");
 
 AplikasiPenilaian()
 {
setTitle("Lembar Penilaian");
setLocation(300,100);
setSize(500,600);
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
setVisible(true);
 }
 void komponenVisual()
 {
    getContentPane().add(lblhobi);
    lblhobi.setBounds(10,80,70,20);
    getContentPane().add(baca);
    baca.setBounds(105,80,100,20);
    getContentPane().add(mancing);
    mancing.setBounds(105,103,100,20);
    getContentPane().add(jalan);
    jalan.setBounds(105,126,100,20);
     
     getContentPane().setLayout(null);
     getContentPane().add(lblnim);
     lblnim.setBounds(10,10,70,20);
     getContentPane().add(txnim);
     txnim.setBounds(75,10,100,20);
     getContentPane().add(tblcari);
     tblcari.setBounds(180,10,95,20);
     getContentPane().add(lblnama);
     lblnama.setBounds(10,30,70,20);
     getContentPane().add(txnama);
     txnama.setBounds(75,30,200,20);
     getContentPane().add(lblkelas);
     lblkelas.setBounds(10,50,100,20);
     getContentPane().add(pria);
     pria.setBounds(75,50,50,20);
     getContentPane().add(wanita);
     wanita.setBounds(125,50,50,20);
     getContentPane().add(kelasC);
     kelasC.setBounds(175,50,50,20);
     grupkelas.add(pria);
     grupkelas.add(wanita);
     grupkelas.add(kelasC);
     getContentPane().add(lblkelompok);
     lblkelompok.setBounds(10,70,100,20);
     getContentPane().add(cbkelompok);
     cbkelompok.setBounds(75,70,100,20);
     getContentPane().add(lblnilai);
     lblnilai.setBounds(10,100,100,20);
     getContentPane().add(lbltugas1);
     lbltugas1.setBounds(10,125,100,20);
     txtugas1.setText("0");
     getContentPane().add(txtugas1);
     txtugas1.setBounds(75,125,100,20);
     getContentPane().add(lbltugas2);
     lbltugas2.setBounds(10,145,100,20);
     txtugas2.setText("0");
     getContentPane().add(txtugas2);
     txtugas2.setBounds(75,145,100,20);
     getContentPane().add(lbltugas3);
     lbltugas3.setBounds(10,165,100,20);
     getContentPane().add(txtugas3);
     txtugas3.setBounds(75,165,100,20);
     txtugas3.setText("0");
     
     getContentPane().add(lbltugas4);
     lbltugas4.setBounds(10,185,100,20);
     getContentPane().add(txtugas4);
     txtugas4.setBounds(75,185,100,20);
     txtugas4.setText("0");
     
     getContentPane().add(lbltugas5);
     lbltugas5.setBounds(10,205,100,20);
     getContentPane().add(txtugas5);
     txtugas5.setBounds(75,205,100,20);
     txtugas5.setText("0");
     
     getContentPane().add(tblsave);
     tblsave.setBounds(180,205,95,20);
     getContentPane().add(lbluts);
     lbluts.setBounds(10,225,100,20);
     
     getContentPane().add(txuts);
     txuts.setBounds(75,225,100,20);
     txuts.setText("0");
     
     getContentPane().add(tblupdate);
     tblupdate.setBounds(180,225,95,20);
     getContentPane().add(lbluas);
     lbluas.setBounds(10,245,100,20);
     
     getContentPane().add(txuas);
     txuas.setBounds(75,245,100,20);
     txuas.setText("0");
     
     getContentPane().add(tblexit);
     tblexit.setBounds(180,245,95,20);
     getContentPane().add(label);
     label.setBounds(180,245,95,20);

    getContentPane().add(area1);
    getContentPane().add(cek1);
    getContentPane().add(cek2);
    getContentPane().add(cek3);
    getContentPane().setLayout(new FlowLayout());
    
    getContentPane().add(tabel1);
     
    JScrollPane scrollPane = new JScrollPane(tabel1);
    getContentPane().add(scrollPane, BorderLayout.CENTER); 
    
    setJMenuBar(mb);
    mb.add(file);
    mb.add(help);
    file.add(open);
    file.add(close);
    close.setEnabled(false);
    file.add(quit);
    help.add(about);
    
    getContentPane().add(cetak2);
    cetak2.setBounds(10,80,270,20);
    getContentPane().add(hasil2);
    hasil2.setBounds(10,105,270,300);
    
    
     
    setVisible(true);
 }
 
 void AksiReaksi()
{
cetak2.addActionListener(new ActionListener()
{
public void actionPerformed(ActionEvent e)
{
hasil2.append(txnama.getText()+"\n");
hasil2.append(txnim.getText()+"\n");
if(pria.isSelected()==true)
    {
hasil2.append(pria.getText()+"\n");
}
else
{
    String jeniskelompok = (String)
    cbkelompok.getSelectedItem();
    hasil2.append(jeniskelompok+"\n");
}
{
hasil2.append(wanita.getText()+"\n");
}
{if(baca.isSelected()==true)
{
hasil2.append(baca.getText()+"\n");
}
if(mancing.isSelected()==true)
{
hasil2.append(mancing.getText()+"\n");
}
if(jalan.isSelected()==true)
{
hasil2.append(jalan.getText()+"\n");
}
}
}
});
}
 
public static void main(String args[])
{
AplikasiPenilaian ap = new AplikasiPenilaian();
ap.komponenVisual();
ap.AksiReaksi();
}

}


