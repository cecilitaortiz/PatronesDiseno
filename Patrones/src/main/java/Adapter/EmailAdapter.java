package Adapter;

public class EmailAdapter implements NotificationService{
    private EmailNotificationService adaptee; 
    
    public EmailAdapter(EmailNotificationService EMAILNService){
        this.adaptee = EMAILNService;
    }

    @Override
    public void enviarNotificacion() {
        adaptee.enviarNotificacion(correo, mensaje);
    }
    
    
}
