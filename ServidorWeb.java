import java.io.* ;
import java.net.* ;
import java.util.* ;

public final class ServidorWeb
{
        public static void main(String argv[]) throws Exception
        {
            int puerto = 8888;
            // Estableciendo el socket de escucha.
            ServerSocket socketdeEscucha = new ServerSocket(8888); 

        // Procesando las solicitudes HTTP en un ciclo infinito.
        while (true) {
               // Escuhando las solicitudes de conexión TCP.
               Socket socketdeConexion = socketdeEscucha.accept(); 
               System.out.println("Conexión aceptada");

                SolicitudHttp solicitud = new SolicitudHttp(socketdeConexion);
               
               // Crea un nuevo hilo para procesar la solicitud.
                Thread hilo = new Thread(solicitud);

                // Inicia el hilo.
                hilo.start();

       
               
         }
        }
}

