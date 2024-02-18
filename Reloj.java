import java.util.Calendar;
import java.text.SimpleDateFormat;

public class Reloj {
    Calendar calendar = Calendar.getInstance();

    public void mostrarHora() {
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm");
        String horaActual = sdf.format(calendar.getTime());
        System.out.println("Hora actual: " + horaActual);
    }
}
