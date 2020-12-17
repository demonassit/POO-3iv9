/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemploventanita;

/**
 *
 * @author demon
 */
import javax.swing.*;

public class Ejemploventanita {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //para poder usar swing es necesario primero un frame
        JFrame ventana = new JFrame("Hola mundo");
        //tenemos que decirle el tamaño en pixeles
        ventana.setSize(500, 150);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        
        //toda ventana debe de tener un panel
        JPanel panel = new JPanel();
        //en ese panel se agregan los componentes
        ventana.add(panel);
        //vamos a crear un metodo para agregar componentes a ese panel
        placeComponents(panel);
        
        //es hacer visible la ventana
        ventana.setVisible(true);
    }

    private static void placeComponents(JPanel panel) {
        //panel debe de iniciarlizar su layout
        
        panel.setLayout(null);
        
        //etiqueta
        JLabel userlabel = new JLabel("Usuario");
        //para inicializar los elementos de un componente
        //se utiliza el metodo setBounds el cual
        //pasa 4 parametros
        //2 para las coordenadas dentro de la ventana
        //2 para el tamaño
        userlabel.setBounds(10, 10, 80, 25);
        //agregamos el componente
        panel.add(userlabel);
        
        //campo de texto
        JTextField userText = new JTextField(20);
        userText.setBounds(100, 10, 160, 25);
        panel.add(userText);
        
        //etiqueta
        JLabel userpassword = new JLabel("Password");
        //para inicializar los elementos de un componente
        //se utiliza el metodo setBounds el cual
        //pasa 4 parametros
        //2 para las coordenadas dentro de la ventana
        //2 para el tamaño
        userpassword.setBounds(10, 40, 80, 25);
        //agregamos el componente
        panel.add(userpassword);
        
        //campo de texto
        JTextField passText = new JTextField(20);
        passText.setBounds(100, 40, 160, 25);
        panel.add(passText);
        
        //buton
        
        JButton loginbutton = new JButton("Inicia sesion");
        loginbutton.setBounds(10, 80, 80, 25);
        panel.add(loginbutton);
        
        JButton registrobutton = new JButton("Registrate");
        registrobutton.setBounds(180, 80, 80, 25);
        panel.add(registrobutton);
    }
}
