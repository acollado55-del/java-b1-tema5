
import java.util.ArrayList;
import java.util.List;

/**
 * Registro de eventos en una plataforma digital
 * ---------------------------------------------
 * Una empresa tecnológica desea construir un sistema interno de registro de eventos
 * que le permita monitorizar el comportamiento de su plataforma online.
 *
 * La plataforma debe registrar distintos tipos de eventos:
 * - Cuando un usuario se conecta o desconecta.
 * - Cuando se realiza una operación bancaria.
 * - Cuando ocurre un error del sistema.
 *
 * Se proporciona una clase genérica llamada EventLogger<T>, que puede ser instanciada
 * para registrar eventos de cualquier tipo. Sin embargo, cada instancia almacenará únicamente
 * eventos de un tipo específico.
 * Por ejemplo, una instancia de EventLogger<UserLogin> almacenará exclusivamente objetos de tipo
 * UserLogin, mientras que una instancia de EventLogger<SystemError> contendrá solo eventos del tipo SystemError.
 * Esto permite reutilizar la misma estructura de registro (EventLogger) para distintos tipos de eventos,
 * sin mezclar tipos dentro de una misma instancia. Esta clase debe permitir:
 *
 * - Registrar un evento.
 * - Obtener el último evento registrado.
 * - Listar todos los eventos almacenados.
 *
 * Clases de eventos ya disponibles como clases internas:
 * - UserLogin: contiene nombre de usuario y hora (String).
 * - BankTransaction: contiene tipo (String: ingreso o retiro) y cantidad (double).
 * - SystemError: contiene mensaje de error (String) y código (int).
 *
 * MÉTODOS A IMPLEMENTAR:
 * ----------------------
 * - void logEvent(T event)
 *   Añade un nuevo evento a la lista.
 *
 * - T getLastEvent()
 *   Devuelve el último evento añadido. Si no hay eventos, devuelve null.
 *
 * - List<T> getAllEvents()
 *   Devuelve una lista con todos los eventos registrados, en orden de inserción.
 *
 * EJEMPLO:
 * --------
 * EventLogger<UserLogin> loginLogger = new EventLogger<>();
 * loginLogger.logEvent(new UserLogin("maria", "08:00"));
 *
 * EventLogger<BankTransaction> txLogger = new EventLogger<>();
 * txLogger.logEvent(new BankTransaction("deposit", 150.0));
 *
 * EventLogger<SystemError> errorLogger = new EventLogger<>();
 * errorLogger.logEvent(new SystemError("Timeout", 504));
 *
 * // Expected output:
 * // UserLogin{username='maria', time='08:00'}
 * // BankTransaction{type='deposit', amount=150.0}
 * // SystemError{message='Timeout', code=504}
 *
 * Registre d'esdeveniments en una plataforma digital
 * --------------------------------------------------
 * Una empresa tecnològica vol construir un sistema intern de registre d'esdeveniments
 * que permeti monitoritzar el comportament de la seva plataforma en línia.
 *
 * La plataforma ha de registrar diferents tipus d'esdeveniments:
 * - Quan un usuari es connecta o desconnecta.
 * - Quan es realitza una operació bancària.
 * - Quan ocorre un error del sistema.
 *
 * Es proporciona una classe genèrica anomenada EventLogger<T>, que pot ser instanciada 
 * per registrar esdeveniments de qualsevol tipus. Tot i això, cada instància emmagatzemarà únicament 
 * esdeveniments d'un tipus específic. 
 * Per exemple, una instància d'EventLogger<UserLogin> emmagatzemarà exclusivament objectes de tipus 
 * UserLogin, mentre que una instància de EventLogger<SystemError> contindrà només esdeveniments del tipus SystemError. 
 * Això permet reutilitzar la mateixa estructura de registre (EventLogger) per a diferents tipus d'esdeveniments, 
 * sense barrejar tipus dins d'una mateixa instància. Aquesta classe ha de permetre:
 *
 * - Registrar un esdeveniment.
 * - Obtenir l'últim esdeveniment registrat.
 * - Llistar tots els esdeveniments emmagatzemats.
 *
 * Classes d'esdeveniment ja definides com a classes internes:
 * - UserLogin: conté nom d'usuari i hora (String).
 * - BankTransaction: conté tipus (String: ingrés o reintegrament) i quantitat (double).
 * - SystemError: conté missatge d'error (String) i codi (int).
 *
 * MÈTODES A IMPLEMENTAR:
 * -----------------------
 * - void logEvent(T event)
 *   Afegeix un nou esdeveniment a la llista.
 *
 * - T getLastEvent()
 *   Retorna l'últim esdeveniment afegit. Si la llista està buida, retorna null.
 *
 * - List<T> getAllEvents()
 *   Retorna una llista amb tots els esdeveniments registrats, en ordre d'inserció.
 *
 * EXEMPLE:
 * --------
 * EventLogger<UserLogin> loginLogger = new EventLogger<>();
 * loginLogger.logEvent(new UserLogin("maria", "08:00"));
 *
 * EventLogger<BankTransaction> txLogger = new EventLogger<>();
 * txLogger.logEvent(new BankTransaction("deposit", 150.0));
 *
 * EventLogger<SystemError> errorLogger = new EventLogger<>();
 * errorLogger.logEvent(new SystemError("Timeout", 504));
 *
 * // Sortida esperada:
 * // UserLogin{username='maria', time='08:00'}
 * // BankTransaction{type='deposit', amount=150.0}
 * // SystemError{message='Timeout', code=504}
 */

public class EventLogger<T> {

    // TODO: Declare a list to store events
     private List<T> events;

    // TODO: Initialize the list in the constructor
    public EventLogger() {
        this.events = new ArrayList<>();
    }

    // TODO: Add a new event to the list
    public void logEvent(T event) {
        // ...
        events.add(event);
    }

    // TODO: Return the last event or null if empty
    public T getLastEvent() {
        // ...
        if (events.isEmpty()) {
            return null;
        }
        return events.get(events.size() - 1);

        }

    // TODO: Return all events in order of insertion
    public List<T> getAllEvents() {
        // ...
       return new ArrayList<>(events); 

    }

	// Pre-defined classes
	
	public static class UserLogin {
        private String username;
        private String time;

        public UserLogin(String username, String time) {
            this.username = username;
            this.time = time;
        }

        @Override
        public String toString() {
            return "UserLogin{" + "username='" + username + "', time='" + time + "'}";
        }
    }

    
	public static class BankTransaction {
        private String type;
        private double amount;

        public BankTransaction(String type, double amount) {
            this.type = type;
            this.amount = amount;
        }

        @Override
        public String toString() {
            return "BankTransaction{" + "type='" + type + "', amount=" + amount + "}";
        }
    }

    public static class SystemError {
        private String message;
        private int code;

        public SystemError(String message, int code) {
            this.message = message;
            this.code = code;
        }

        @Override
        public String toString() {
            return "SystemError{" + "message='" + message + "', code=" + code + "}";
        }
    }
	 // -------------------------------------------------------------
    // Manual test using IDE
    // -------------------------------------------------------------
    
	public static void main(String[] args) {
		// Logging a user login event
		EventLogger<UserLogin> loginLogger = new EventLogger<>();
		loginLogger.logEvent(new UserLogin("maria", "08:00"));
		System.out.println(loginLogger.getLastEvent());

		// Logging a bank transaction
		EventLogger<BankTransaction> txLogger = new EventLogger<>();
		txLogger.logEvent(new BankTransaction("deposit", 150.0));
		System.out.println(txLogger.getLastEvent());

		// Logging a system error
		EventLogger<SystemError> errorLogger = new EventLogger<>();
		errorLogger.logEvent(new SystemError("Timeout", 504));
		System.out.println(errorLogger.getLastEvent());
	}
	 
	// Torna a comentar aquest main quan vulguis executar els tests amb maven test
    // Vuelve a comentar este main cuando quieras ejecutar los tests con:
    // mvn test
	// -------------------------------------------------------------
}