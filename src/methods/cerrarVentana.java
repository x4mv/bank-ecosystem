/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package methods;

import java.awt.Toolkit;
import java.awt.Window;
import java.awt.event.WindowEvent;

/**
 *
 * @author x4mv
 */
public class cerrarVentana  {
    
    public static void cerrar(Window ventana){
    
        WindowEvent fn_cerrarVentana = new WindowEvent(ventana, WindowEvent.WINDOW_CLOSING);
        Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(fn_cerrarVentana);
    }
    
    
}
