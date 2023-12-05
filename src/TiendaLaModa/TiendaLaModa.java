/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package TiendaLaModa;
import javax.swing.JFrame;
import javax.swing.JButton; 
import java.awt.GridLayout;
import java.awt.event.*;
import java.awt.event.AWTEventListener;
import java.awt.*;




/*public class TiendaLaModa {
//Aqui se generan los frames que se desean
    JFrame frame1= new JFrame("Bienvenido a Tienda La Moda");
    JFrame frame2 = new JFrame ("Selecciona el modulo al que deseas ingresar");
    
    public void Bienvenida extends JFrame implements ActionListener() { 
        //Se generan los botones interactivos dentro de los frames
        JButton button = new JButton ("Has click aqui para elegir el modulo que deseas utilizar");
        button.setBounds(50.50.200.50);
        frame1.add(button);
        frame1.setSize(300, 200);
        frame1.setLayout(null);
        frame1.setVisible(true);
        
        //Cierra el frame1 
        frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        button.addActionListener(new ActionListener(){
        public void actionPerformed(Action event e){
            frame1.setVisible (false);
            frame2.setVisible(true);
        }
        
                });
                
    }
    //Aqui se instancian, significa llamar los objetos de una clase 
    public static void main(String args[]){
    TiendaLaModa TiendaLaModa= new TiendaLaModa();
    TiendaLaModa.Bienvenida();
    
    
    }
    
    }

    
*/


//Botones funcionales, hay que editar los nombes de los botones y agregar mas 

public class TiendaLaModa extends JFrame implements ActionListener{
    private JButton boton1,boton2,boton3;
    public TiendaLaModa() {
        setLayout(null);
        boton1=new JButton("1");
        boton1.setBounds(10,100,90,30);
        add(boton1);
        boton1.addActionListener(this);
        boton2=new JButton("2");
        boton2.setBounds(110,100,90,30);
        add(boton2);
        boton2.addActionListener(this);
        boton3=new JButton("3");
        boton3.setBounds(210,100,90,30);
        add(boton3);
        boton3.addActionListener(this);        	
    }
    
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==boton1) {
            setTitle("boton 1");
        }
        if (e.getSource()==boton2) {
            setTitle("boton 2");
        }
        if (e.getSource()==boton3) {
            setTitle("boton 3");
        }        
    }
    
    public static void main(String[] ar){
        TiendaLaModa formulario1=new TiendaLaModa();
        formulario1.setBounds(0,0,350,200);
        formulario1.setVisible(true);
        formulario1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

    
