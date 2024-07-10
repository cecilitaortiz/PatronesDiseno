
package Adapter;

public class TelegramAdapter implements NotificationService{
    private TelegramNotificationService adaptee; 
    
    public TelegramAdapter(TelegramNotificationService TGNService){
        this.adaptee = TGNService;
    }

    @Override
    public void enviarNotificacion() {
        adaptee.enviarNotificacion("", "");
    }
}
