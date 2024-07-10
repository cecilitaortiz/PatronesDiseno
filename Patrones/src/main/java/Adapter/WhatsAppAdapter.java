/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Adapter;

/**
 *
 * @author CltControl
 */
public class WhatsAppAdapter implements NotificationService{
    private WhatsAppNotificationService adaptee; 

    public WhatsAppAdapter(WhatsAppNotificationService WSNService){
        this.adaptee = WSNService;
    }

    @Override
    public void enviarNotificacion() {
        adaptee.enviarNotificacion(0, "");

    }
}
