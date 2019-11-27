package cabisena;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class CabiSENA extends JFrame implements ActionListener{
    public CabiSENA(){
    super("CabiSENA");
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(430,430);
        setLocationRelativeTo(null);
        
        setLocale(null);
        Acceso();
        setVisible(true);
    }
    
        public void Acceso(){
        access = new JPanel();
        access.setLayout(null);
        access.setBounds(0,0,200,200);
        access.setBackground(new Color(255,255,255));
        
        Usuario = new JLabel("Usuario");
        Contra = new JLabel("Contraseña");
        LG = new JLabel();
        LG.setIcon(new javax.swing.ImageIcon(getClass().getResource("/LOGO.jpg")));
        
        
        usuario = new JTextField();
        contra = new JPasswordField();
        
        Ingresar = new JButton("Ingresar");
        
        LG.setBounds(0,0,430,115);
        Usuario.setBounds(100,130,100,30);
        Contra.setBounds(100,165,130,30);
        
        usuario.setBounds(200,130,100,30);
        contra.setBounds(200,165,100,30);
        
        Ingresar.setBounds(100,200,200,30);
        
        access.add(Usuario);
        access.add(LG);
        access.add(usuario);
        access.add(Contra);
        access.add(contra);
        access.add(Ingresar);
        Ingresar.addActionListener(this);
        add(access);
    }
    private JLabel Usuario;
    private JLabel Contra;
    private JTextField usuario;
    private JPasswordField contra;
    private JButton Olvidar;
    private JButton Ingresar;
    private JPanel access;
    private JLabel LG;
    
    private void Ingresar(){
        String n1,n2,n3="admin",n4="admin";;
        n1=usuario.getText();
        n2=contra.getText();
        if(n3.equals(n1) && n4.equals(n2) ){
            access.setVisible(false);
            Opciones();
        }else{
            JOptionPane.showMessageDialog(null,"Contraseña y/o Usuario Incorrectos","Mensaje",JOptionPane.ERROR_MESSAGE);
        }
    }
    
        public void Opciones(){
        Opcion = new JPanel();
        Opcion.setLayout(null);
        Opcion.setBounds(0,0,200,200);
        Opcion.setBackground(new Color(255, 0, 0));
        
        Menu = new JLabel("MENU");
        Calcular = new JButton("Calcular");
        Consultar = new JButton("Consultar");
        salir = new JButton("Salir");
        
        Menu.setBounds(170,40,150,30);
        Calcular.setBounds(120,70,150,30);
        Consultar.setBounds(120,105,150,30);
        salir.setBounds(120,150,150,30);
        
        Opcion.add(Menu);
        Opcion.add(Calcular);
        Opcion.add(Consultar);
        Opcion.add(salir);
        Calcular.addActionListener(this);
        Consultar.addActionListener(this);
        salir.addActionListener(this);
        add(Opcion);
    }
    private JLabel Menu;
    private JButton Calcular;
    private JButton Consultar;
    private JButton salir;
    private JPanel Opcion;
    
    public void Calculos(){
        Calla = new JPanel();
        Calla.setLayout(null);
        Calla.setBounds(0,0,200,200);
        Calla.setBackground(new Color(255, 0, 0));
        
        CM = new JLabel("Cantidad de Minutos");
        cm = new JTextField();
        TP = new JLabel("Tipo de llamada");
        tp = new JComboBox();
        tp.addItem("Movil");
        tp.addItem("Fijo");
        OP = new JLabel("Operador");
        op = new JComboBox();
        op.addItem("Claro");
        op.addItem("Movistar");
        op.addItem("Tigo");
        op.addItem("Local");
        op.addItem("Nacional");
        op.addItem("Internacional");
        NM = new JLabel("Digite su Nombre");
        nm = new JTextField();
        
        calculare = new JButton("Calcular");
        Atras = new JButton("Atras");
        
        CM.setBounds(150,20,150,25);
        cm.setBounds(120,50,150,25);
        TP.setBounds(150,80,150,25);
        tp.setBounds(120,110,150,25);
        OP.setBounds(150,140,150,25);
        op.setBounds(120,170,150,25);
        NM.setBounds(150,200,150,25);
        nm.setBounds(120,230,150,25);
        
        calculare.setBounds(120,260,150,25);
        Atras.setBounds(120,290,150,25);
        
        Calla.add(CM);
        Calla.add(cm);
        Calla.add(TP);
        Calla.add(tp);
        Calla.add(OP);
        Calla.add(op);
        Calla.add(NM);
        Calla.add(nm);
        Calla.add(calculare);
        Calla.add(Atras);
        calculare.addActionListener(this);
        Atras.addActionListener(this);
        add(Calla);
    }
    private JPanel Calla;
    private JTextField cm;
    private JTextField nm;
    private JButton calculare;
    private JButton Atras;
    private JComboBox tp;
    private JComboBox op;
    private JLabel CM;
    private JLabel TP;
    private JLabel OP;
    private JLabel NM;
    
    private void magia(){
        int tipo=tp.getSelectedIndex();
        int opera=op.getSelectedIndex();
        int cantidadm=Integer.parseInt(cm.getText());
        String nambre=nm.getText();
        int claro=200,movistar=200,tigo=150,localn=300,internacional=400;
        String movil="15%",fijo="12%";
        if(cantidadm>0 && cantidadm<=50){
            if(tipo==0){
                if(opera==0){
                    int tpllamada=claro*cantidadm;
                    Nombre="Sr(a). "+nambre;
                    Tiempo="Total de minutos: "+cantidadm;
                    Tipos="Tu dispositivo es un: Movil";
                    Operadoress="Tu marcaste a: Claro";
                    Descuentos="tu descuento es: 0";
                    TotalP="Total de llamada: "+tpllamada;
                    TotalaP="Total a pagar: "+tpllamada;
                    Porcentaje="Porcentaje Des: 0%";
                    Calla.setVisible(false);
                    permiso=1;
                    Consultas();
                }else if(opera==1){
                     int tpllamada=movistar*cantidadm;
                    Nombre="Sr(a). "+nambre;
                    Tiempo="Total de minutos: "+cantidadm;
                    Tipos="Tu dispositivo es un: Movil";
                    Operadoress="Tu marcaste a: Movistar";
                    Descuentos="tu descuento es: 0";
                    TotalP="Total de llamada: "+tpllamada;
                    TotalaP="Total a pagar: "+tpllamada;
                    Porcentaje="Porcentaje Des: 0%";
                    Calla.setVisible(false);
                    permiso=1;
                    Consultas();
                }else if(opera==2){
                     int tpllamada=tigo*cantidadm;
                    Nombre="Sr(a). "+nambre;
                    Tiempo="Total de minutos: "+cantidadm;
                    Tipos="Tu dispositivo es un: Movil";
                    Operadoress="Tu marcaste a: Tigo";
                    Descuentos="tu descuento es: 0";
                    TotalP="Total de llamada: "+tpllamada;
                    TotalaP="Total a pagar: "+tpllamada;
                    Porcentaje="Porcentaje Des: 0%";
                    Calla.setVisible(false);
                    permiso=1;
                    Consultas();
                }
            }else if(tipo==1){
                if(opera==3){
                    int tpllamada=localn*cantidadm;
                    Nombre="Sr(a). "+nambre;
                    Tiempo="Total de minutos: "+cantidadm;
                    Tipos="Tu dispositivo es un: Fijo";
                    Operadoress="Tu marcaste a: Fijo local";
                    Descuentos="tu descuento es: 0";
                    TotalP="Total de llamada: "+tpllamada;
                    TotalaP="Total a pagar: "+tpllamada;
                    Porcentaje="Porcentaje Des: 0%";
                    Calla.setVisible(false);
                    permiso=1;
                    Consultas();
                }else if(opera==4){
                    int tpllamada=localn*cantidadm;
                    Nombre="Sr(a). "+nambre;
                    Tiempo="Total de minutos: "+cantidadm;
                    Tipos="Tu dispositivo es un: Fijo";
                    Operadoress="Tu marcaste a: Fijo nacional";
                    Descuentos="tu descuento es: 0";
                    TotalP="Total de llamada: "+tpllamada;
                    TotalaP="Total a pagar: "+tpllamada;
                    Porcentaje="Porcentaje Des: 0%";
                    Calla.setVisible(false);
                    permiso=1;
                    Consultas(); 
                }else if(opera==5){
                    int tpllamada=internacional*cantidadm;
                    Nombre="Sr(a). "+nambre;
                    Tiempo="Total de minutos: "+cantidadm;
                    Tipos="Tu dispositivo es un: Fijo";
                    Operadoress="Tu marcaste a: Fijo internacional";
                    Descuentos="tu descuento es: 0";
                    TotalP="Total de llamada: "+tpllamada;
                    TotalaP="Total a pagar: "+tpllamada;
                    Porcentaje="Porcentaje Des: 0%";
                    Calla.setVisible(false);
                    permiso=1;
                    Consultas(); 
                }
        }
        }else if(cantidadm>50){
            if(tipo==0){
                if(opera==0){
                    int tpllamada=claro*cantidadm;
                    Double descuentito=tpllamada*0.15;
                    Double totallalid=tpllamada-descuentito;
                    Nombre="Sr(a). "+nambre;
                    Tiempo="Total de minutos: "+cantidadm;
                    Tipos="Tu dispositivo es un: Movil";
                    Operadoress="Tu marcaste a: Claro";
                    Descuentos="tu descuento es de: "+descuentito;
                    TotalP="Total de llamada: "+tpllamada;
                    TotalaP="Total a pagar: "+totallalid;
                    Porcentaje="Porcentaje Des: "+movil;
                    Calla.setVisible(false);
                    permiso=1;
                    Consultas();
                }else if(opera==1){
                   int tpllamada=movistar*cantidadm;
                    Double descuentito=tpllamada*0.15;
                    Double totallalid=tpllamada-descuentito;
                    Nombre="Sr(a). "+nambre;
                    Tiempo="Total de minutos: "+cantidadm;
                    Tipos="Tu dispositivo es un: Movil";
                    Operadoress="Tu marcaste a: Movistar";
                    Descuentos="tu descuento es de: "+descuentito;
                    TotalP="Total de llamada: "+tpllamada;
                    TotalaP="Total a pagar: "+totallalid;
                    Porcentaje="Porcentaje Des: "+movil;
                    Calla.setVisible(false);
                    permiso=1;
                    Consultas();
                }else if(opera==2){
                   int tpllamada=tigo*cantidadm;
                    Double descuentito=tpllamada*0.15;
                    Double totallalid=tpllamada-descuentito;
                    Nombre="Sr(a). "+nambre;
                    Tiempo="Total de minutos: "+cantidadm;
                    Tipos="Tu dispositivo es un: Movil";
                    Operadoress="Tu marcaste a: Tigo";
                    Descuentos="tu descuento es de: "+descuentito;
                    TotalP="Total de llamada: "+tpllamada;
                    TotalaP="Total a pagar: "+totallalid;
                    Porcentaje="Porcentaje Des: "+movil;
                    Calla.setVisible(false);
                    permiso=1;
                    Consultas();
                }
            }else if(tipo==1){
                if(opera==3){
                   int tpllamada=localn*cantidadm;
                    Double descuentito=tpllamada*0.12;
                    Double totallalid=tpllamada-descuentito;
                    Nombre="Sr(a). "+nambre;
                    Tiempo="Total de minutos: "+cantidadm;
                    Tipos="Tu dispositivo es un: Fijo";
                    Operadoress="Tu marcaste a: Fijo local";
                    Descuentos="tu descuento es de: "+descuentito;
                    TotalP="Total de llamada: "+tpllamada;
                    TotalaP="Total a pagar: "+totallalid;
                    Porcentaje="Porcentaje Des: "+fijo;
                    Calla.setVisible(false);
                    permiso=1;
                    Consultas();
                }else if(opera==4){
                    int tpllamada=localn*cantidadm;
                    Double descuentito=tpllamada*0.12;
                    Double totallalid=tpllamada-descuentito;
                    Nombre="Sr(a). "+nambre;
                    Tiempo="Total de minutos: "+cantidadm;
                    Tipos="Tu dispositivo es un: Fijo";
                    Operadoress="Tu marcaste a: Fijo nacional";
                    Descuentos="tu descuento es de: "+descuentito;
                    TotalP="Total de llamada: "+tpllamada;
                    TotalaP="Total a pagar: "+totallalid;
                    Porcentaje="Porcentaje Des: "+fijo;
                    Calla.setVisible(false);
                    permiso=1;
                    Consultas();
                }else if(opera==5){
                    int tpllamada=internacional*cantidadm;
                    Double descuentito=tpllamada*0.12;
                    Double totallalid=tpllamada-descuentito;
                    Nombre="Sr(a). "+nambre;
                    Tiempo="Total de minutos: "+cantidadm;
                    Tipos="Tu dispositivo es un: Fijo";
                    Operadoress="Tu marcaste a: Fijo internacional";
                    Descuentos="tu descuento es de: "+descuentito;
                    TotalP="Total de llamada: "+tpllamada;
                    TotalaP="Total a pagar: "+totallalid;
                    Porcentaje="Porcentaje Des: "+fijo;
                    Calla.setVisible(false);
                    permiso=1;
                    Consultas();
                }
        }
        }
    }
     String Nombre,Tiempo,Tipos,Operadoress,Descuentos,TotalP,TotalaP,Porcentaje;
    
  public void Consultas(){
        TipLla = new JPanel();
        TipLla.setLayout(null);
        TipLla.setBounds(0,0,200,200);
        TipLla.setBackground(new Color(255, 0, 0));
        
        NM1 = new JLabel(Nombre);
        TM = new JLabel(Tiempo);
        TP1 = new JLabel(Tipos);
        OP1 = new JLabel(Operadoress);
        DES = new JLabel(Descuentos);
        TvP = new JLabel(TotalP);
        TaP = new JLabel(TotalaP);
        PoRd = new JLabel(Porcentaje);
        
        Atras1 = new JButton("Atras");
        
        NM1.setBounds(90,20,250,25);
        TM.setBounds(90,50,250,25);
        TP1.setBounds(90,80,250,25);
        OP1.setBounds(90,110,250,25);
        PoRd.setBounds(90,140,250,25);
        DES.setBounds(90,170,250,25);
        TvP.setBounds(90,200,250,25);
        TaP.setBounds(90,230,250,25);
        
        
        Atras1.setBounds(90,260,200,20);
        
        TipLla.add(NM1);
        TipLla.add(TM);
        TipLla.add(TP1);
        TipLla.add(OP1);
        TipLla.add(DES);
        TipLla.add(TvP);
        TipLla.add(TaP);
        TipLla.add(PoRd);
        TipLla.add(Atras1);
        Atras1.addActionListener(this);
        add(TipLla);
    }
    private JPanel TipLla;
    private JLabel NM1;
    private JLabel TM;
    private JLabel TP1;
    private JLabel OP1;
    private JLabel DES;
    private JLabel TvP;
    private JLabel TaP;
    private JLabel PoRd;
    private JButton Atras1;
      
    int permiso=0;
    
    @Override 
        public void actionPerformed(ActionEvent e) {
           if(e.getSource()==Ingresar){
                Ingresar();
            }
            if(e.getSource()==salir){
                JOptionPane.showMessageDialog(null,"Hasta luego, Queridisimo cliente");                  
                Opcion.setVisible(false);
                System.exit(0);
            }
            if(e.getSource()==Calcular){
                Opcion.setVisible(false);
                Calculos();
            }
            if(e.getSource()==Atras){
               Calla.setVisible(false);
               Opciones();
            }
            if(e.getSource()==calculare){
               String name=nm.getText();
               int tipos=tp.getSelectedIndex();
                int operas=op.getSelectedIndex();
               int canme=Integer.parseInt(cm.getText());
               if(name.isEmpty()){
                   JOptionPane.showMessageDialog(null,"No has diligenciado tu nombre","Mensaje",JOptionPane.ERROR_MESSAGE);
                   
               }else if(canme<=0){
                   JOptionPane.showMessageDialog(null,"La cantidad debe ser mayor a 0","Mensaje",JOptionPane.ERROR_MESSAGE);                  
               }else{
                 if(tipos==0 && operas>2){
                    JOptionPane.showMessageDialog(null,"No se puede realizar esa accion","Mensaje",JOptionPane.ERROR_MESSAGE);
                }else if(tipos==1 && (operas<3 || operas>5)){
                    JOptionPane.showMessageDialog(null,"No se puede realizar esa accion","Mensaje",JOptionPane.ERROR_MESSAGE);
                }
                if(tipos==0 && (operas>=0 || operas<=2)){
                    Opcion.setVisible(false);
                    magia();  
                }else if(tipos==1 && (operas>=3 || operas<=5)){
                        Opcion.setVisible(false);
                        magia();  
                }
               }
               
            }
            if(e.getSource()==Consultar){
                
                
                if(permiso==0){
                     JOptionPane.showMessageDialog(null,"Todavia no has hecho ninguna llamada","Mensaje",JOptionPane.ERROR_MESSAGE);
                } 
                
            }
             if(e.getSource()==Atras1){
                TipLla.setVisible(false);
                Opciones();
            }
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
    public static void main(String[] args) {
        CabiSENA SENA = new CabiSENA();
    }
    }
