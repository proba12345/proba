import java.io.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
 
 
public class Prodavnica extends JFrame{
 
        PrintWriter  outFile;
       JLabel Artikli, Kolicina, Cokolado, Jajca, Mleko, Kafe, Iznos, Vkupno, ZaVrakanje, menuvaj1, Vrakanje ;
       JTextField CokoladoTF, JajcaTF, MlekoTF, KafeTF, CokoladoT, mlekoT, jajcaT, KafeT, VkupnoT,ZaVrakanjeT,menuvajT;
       JButton presmetaj,izlez, pari, Pecati;
       double VkupnoTFT;
        String str;
        double CokoladoC,CokoladoTFT,JajcaC,JajcaTFT,milkC,MlekoTFT,KafeC,KafeTFT,tVkupnoTFT;
        double ch, ZaVrakanjeF;
 
    public Prodavnica(){
        setTitle("POS # 1:Mehmet Alce123456 ");
        setSize(600,500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
         
        Artikli= new JLabel("Artikli",SwingConstants.CENTER);
        Kolicina = new JLabel("KOLICINA",SwingConstants.CENTER);
        Iznos = new JLabel("Iznos",SwingConstants.CENTER);
        Cokolado = new JLabel("Cokolado--15den:",SwingConstants.LEFT);
         
        Jajca = new JLabel("Jajca--6.5den:",SwingConstants.LEFT);
         
        Mleko = new JLabel("Mleko--42den:",SwingConstants.LEFT);
     
        Kafe = new JLabel("Kafe--48den:",SwingConstants.LEFT);
         
        Vkupno = new JLabel("Iznos",SwingConstants.RIGHT);
        ZaVrakanje = new JLabel("Vkupdno Dadeno",SwingConstants.RIGHT);
        menuvaj1 = new JLabel("Menuvaj1",SwingConstants.RIGHT);
        Vrakanje = new JLabel("Za Vrakanje",SwingConstants.RIGHT);
     
     
        CokoladoTF = new JTextField(10);
        JajcaTF = new JTextField(10);
        MlekoTF = new JTextField(10);
        KafeTF = new JTextField(10);
        CokoladoT = new JTextField(10);
        jajcaT = new JTextField(10);
        mlekoT = new JTextField(10);
        KafeT = new JTextField(10);
        ZaVrakanjeT =  new JTextField(10);
        menuvajT =  new JTextField(10);
        VkupnoT= new JTextField(10);
         
        presmetaj = new JButton("Vkupno");
        izlez = new JButton("IZLEZ");
        pari = new JButton("Plati");
        Pecati = new JButton("Pecati");
         
        VkupnoT.setEditable(false);
        CokoladoT.setEditable(false);
        jajcaT.setEditable(false);
        mlekoT.setEditable(false);
        KafeT.setEditable(false);
        menuvajT.setEditable(false);
     
         
        
        batoni calc=new batoni();
        izlez h=new izlez();
        Menuvaj m = new Menuvaj();
        pecati p = new pecati();
        presmetaj.addActionListener(calc);
        izlez.addActionListener(h);
        pari.addActionListener(m);
        Pecati.addActionListener(p);
         
        Container panel = getContentPane();
        panel.setLayout(new GridLayout(9,3));
         
        panel.add(Artikli);
        panel.add(Kolicina);
        panel.add(Iznos);
         
        panel.add(Cokolado);
        panel.add(CokoladoTF);
        panel.add(CokoladoT);
         
        panel.add(Jajca);
        panel.add(JajcaTF);
        panel.add(jajcaT);
         
        panel.add(Mleko);
        panel.add(MlekoTF);
        panel.add(mlekoT);
         
        panel.add(Kafe);
        panel.add(KafeTF);
        panel.add(KafeT);
         
         
        panel.add(presmetaj);
        panel.add(Vkupno);
     
        panel.add(VkupnoT);
        panel.add(pari);
        panel.add(ZaVrakanje);
        panel.add(ZaVrakanjeT);
         
        panel.add(izlez);
        panel.add(Vrakanje);
        panel.add(menuvajT);
        panel.add(Pecati);
     
         
        setVisible(true);
    }
    class batoni implements ActionListener{
        public void actionPerformed(ActionEvent e){
             
            double CokoladoC,CokoladoTFT,JajcaC,JajcaTFT,MlekoC,MlekoTFT,KafeC,KafeTFT,VkupnoTFT;
            CokoladoC=Double.parseDouble(CokoladoTF.getText());
            JajcaC=Double.parseDouble(JajcaTF.getText());
            MlekoC=Double.parseDouble(MlekoTF.getText());
            KafeC=Double.parseDouble(KafeTF.getText());
             
            CokoladoTFT=((CokoladoC)*15);
            CokoladoT.setText(""+CokoladoTFT);
             
            JajcaTFT = JajcaC*6.50;
            jajcaT.setText(""+JajcaTFT);
             
            MlekoTFT = MlekoC*42;
            mlekoT.setText(""+MlekoTFT);
             
            KafeTFT = KafeC*48;
            KafeT.setText(""+KafeTFT);
             
            VkupnoTFT=(CokoladoTFT+JajcaTFT+MlekoTFT+KafeTFT);
            VkupnoT.setText(""+VkupnoTFT);
        }
         
         
    }
        class Menuvaj implements ActionListener {
            public void actionPerformed(ActionEvent e){
                double ch, ZaVrakanjeF;
                ch=Double.parseDouble(VkupnoT.getText());
                ZaVrakanjeF=Double.parseDouble(ZaVrakanjeT.getText());
                 
                menuvajT.setText(""+(ZaVrakanjeF-ch));
        }
    }
            class izlez implements ActionListener{
                public void actionPerformed(ActionEvent e){
                     
                 
                System.exit(0);
     
}
                }
            class pecati implements ActionListener{
                public void actionPerformed(ActionEvent e){
                      
                   
                    ch=Double.parseDouble(VkupnoT.getText());
                    ZaVrakanjeF=Double.parseDouble(ZaVrakanjeT.getText());
                     
                    CokoladoC=Double.parseDouble(CokoladoTF.getText());
                    JajcaC=Double.parseDouble(JajcaTF.getText());
                    milkC=Double.parseDouble(MlekoTF.getText());
                    KafeC=Double.parseDouble(KafeTF.getText());
                     
                    CokoladoTFT=((CokoladoC)*15);
                    JajcaTFT = JajcaC*6.50;
                    MlekoTFT = milkC*42;
                    KafeTFT = KafeC*48;
                    tVkupnoTFT=(CokoladoTFT+JajcaTFT+MlekoTFT+KafeTFT);
                     
        str=("Cokolado"+"      "+CokoladoC+"      "+CokoladoTFT+"Den"+"\n");
        str+=("Jajca"+"        "+JajcaC+"         "+JajcaTFT+"Den"+"\n");
        str+=("Mleko"+"        "+milkC+"          "+MlekoTFT+"Den"+"\n");
        str+=("Kafe"+"         "+KafeC+"          "+KafeTFT+"Den"+"\n");
        str+=("\n");
        str+=("Vkupno          "+""+"             "+tVkupnoTFT+"Den"+"\n");
        str+=("Dadeno          "+"                "+ZaVrakanjeF+"Den"+"\n");
        str+=("Za Vrakanje     "+"                "+(ZaVrakanjeF-ch)+"Den"+"\n");
        str+=("DDV 12%                            "+(tVkupnoTFT*0.12)+"\n");
 
     
         
        JOptionPane.showMessageDialog(null,str, "Promet",JOptionPane.PLAIN_MESSAGE);
}
}
            public static void main(String []args) throws FileNotFoundException{
                Prodavnica a = new Prodavnica();
                 
                 
    }
    }