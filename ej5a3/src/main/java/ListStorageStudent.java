import java.util.ArrayList;
import java.util.List;

/**
 * Sistema de almacenamiento de documentos para candidatos (RRHH)
 * --------------------------------------------------------------
 * Una empresa de recursos humanos desea crear un sistema para almacenar distintos tipos
 * de datos asociados a sus candidatos. El sistema debe usar una interfaz genérica llamada
 * Storable<T> que defina las operaciones básicas de almacenamiento.
 *
 * Los documentos a almacenar pueden ser:
 * - Currículums (CV): nombre del candidato, email, y contenido del currículum.
 * - Certificados (Certificate): nombre del curso, año y organismo emisor.
 *
 * Se debe implementar una clase ListStorage<T> que utilice una lista interna para
 * almacenar los objetos y que implemente la interfaz Storable<T>.
 *
 * MÉTODOS A IMPLEMENTAR EN LA INTERFAZ:
 * --------------------------------------
 * interface Storable<T> {
 *     void save(T item);              // Guarda un nuevo elemento
 *     T get(int index);               // Devuelve el elemento por su posición
 *     List<T> getAll();               // Devuelve todos los elementos
 *     int count();                    // Devuelve el número total de elementos almacenados
 *     void clear();                   // Elimina todos los elementos almacenados
 * }
 *
 * EJEMPLO:
 * --------
 * Entrada:
 *   save(new CV("Ana Pérez", "ana@example.com", "Computer engineer..."))
 *   save(new CV("Luis Gómez", "luis@example.com", "Backend developer..."))
 *   get(0)
 *   getAll()
 *   count()
 *   clear()
 *   count()
 *   save(new Certificate("Java Backend", 2022, "Oracle"))
 *   getAll()
 *
 * Salida:
 *   CV{name='Ana Pérez', email='ana@example.com', content='Computer engineer...'}
 *   CV{name='Ana Pérez', email='ana@example.com', content='Computer engineer...'}, CV{name='Luis Gómez', email='luis@example.com', content='Backend developer...'}
 *   Stored CVs: 2
 *   After clearing: 0
 *   Certificate{title='Java Backend', year=2022, issuer='Oracle'}
 *
 * ---
 *
 * Sistema d'emmagatzematge de documents per a candidats (RRHH)
 * ------------------------------------------------------------
 * Una empresa de recursos humans vol crear un sistema per emmagatzemar diferents tipus
 * de dades associades als seus candidats. El sistema ha d'utilitzar una interfície genèrica
 * anomenada Storable<T> que defineixi les operacions bàsiques d'emmagatzematge.
 *
 * Els documents a emmagatzemar poden ser:
 * - Currículums (CV): nom del candidat, correu electrònic i contingut.
 * - Certificats (Certificate): nom del curs, any i organisme emissor.
 *
 * Cal implementar una classe ListStorage<T> que faci servir una llista interna per
 * emmagatzemar els objectes i que implementi la interfície Storable<T>.
 *
 * MÈTODES A IMPLEMENTAR A LA INTERFÍCIE:
 * --------------------------------------
 * interface Storable<T> {
 *     void save(T item);              // Desa un nou element
 *     T get(int index);               // Retorna l'element per la seva posició
 *     List<T> getAll();               // Retorna tots els elements
 *     int count();                    // Retorna el nombre total d'elements
 *     void clear();                   // Elimina tots els elements emmagatzemats
 * }
 *
 * EXEMPLE:
 * --------
 * Entrada:
 *   save(new CV("Ana Pérez", "ana@example.com", "Computer engineer..."))
 *   save(new CV("Luis Gómez", "luis@example.com", "Backend developer..."))
 *   get(0)
 *   getAll()
 *   count()
 *   clear()
 *   count()
 *   save(new Certificate("Java Backend", 2022, "Oracle"))
 *   getAll()
 *
 * Sortida (en anglès):
 *   CV{name='Ana Pérez', email='ana@example.com', content='Computer engineer...'}
 *   CV{name='Ana Pérez', email='ana@example.com', content='Computer engineer...'}, CV{name='Luis Gómez', email='luis@example.com', content='Backend developer...'}
 *   Stored CVs: 2
 *   After clearing: 0
 *   Certificate{title='Java Backend', year=2022, issuer='Oracle'}
 */


public class ListStorageStudent<T> implements Storable<T> {

    private List<T> items;

    public ListStorageStudent() {
        // TODO: initialize internal list
        items = new ArrayList<>();
    
    }

    @Override
    public void save(T item) {
        // TODO: store item
        items.add(item);

    }

    @Override
    public T get(int index) {
        // TODO: return item by index
        return items.get(index);

        
    }

    @Override
    public List<T> getAll() {
        // TODO: return all items
        return new ArrayList<>(items);
        
    }

    @Override
    public int count() {
        // TODO: return number of items
        return items.size();
        
    }

    @Override
    public void clear() {
        // TODO: remove all stored items
        items.clear();
    }

    public static class CV {
        private String name;
        private String email;
        private String content;

        public CV(String name, String email, String content) {
            this.name = name;
            this.email = email;
            this.content = content;
        }

        public String getName() {
            return name;
        }

        public String getEmail() {
            return email;
        }

        public String getContent() {
            return content;
        }

        @Override
        public String toString() {
            return "CV{name='" + name + "', email='" + email + "', content='" + content + "'}";
        }
    }

    public static class Certificate {
        private String title;
        private int year;
        private String issuer;

        public Certificate(String title, int year, String issuer) {
            this.title = title;
            this.year = year;
            this.issuer = issuer;
        }

        public String getTitle() {
            return title;
        }

        public int getYear() {
            return year;
        }

        public String getIssuer() {
            return issuer;
        }

        @Override
        public String toString() {
            return "Certificate{title='" + title + "', year=" + year + ", issuer='" + issuer + "'}";
        }
    }

    // -------------------------------------------------------------
    // Manual test using IDE
    // -------------------------------------------------------------
   
    public static void main(String[] args) {
        Storable<CV> cvStorage = new ListStorageStudent<>();
        cvStorage.save(new CV("Ana Pérez", "ana@example.com", "Computer engineer..."));
        cvStorage.save(new CV("Luis Gómez", "luis@example.com", "Backend developer..."));

        System.out.println(cvStorage.get(0));
        System.out.println(cvStorage.getAll());
        System.out.println("Stored CVs: " + cvStorage.count());

        cvStorage.clear();
        System.out.println("After clearing: " + cvStorage.count());

        Storable<Certificate> certStorage = new ListStorageStudent<>();
        certStorage.save(new Certificate("Java Backend", 2022, "Oracle"));
        System.out.println(certStorage.getAll());
    }
  
	// Torna a comentar aquest main quan vulguis executar els tests amb maven test
    // Vuelve a comentar este main cuando quieras ejecutar los tests con:
    // mvn test
	// -------------------------------------------------------------
}

interface Storable<T> {
    void save(T item);
    T get(int index);
    List<T> getAll();
    int count();
    void clear();
}


