import java.util.ArrayList;
import java.util.List;

/**
 * Ejercicio 1: Clase genérica
 * ---------------------------
 * Implementa una clase genérica que pueda almacenar múltiples elementos y
 * ofrecer funcionalidades básicas como acceder al primero, al último y conocer el total de elementos.
 *
 * Mètodes:
 *   - void addElement(T element)
 *   - T getFirstElement()
 *   - T getLastElement()
 *   - int getTotalElements()
 *
 * Examples:
 * ----------
 * ClasseGenerica<String> texts = new ClasseGenerica<>();
 * texts.addElement("Hello");
 * texts.addElement("Goodbye");
 * texts.getFirstElement();  // returns "Hello"
 * texts.getLastElement();   // returns "Goodbye"
 * texts.getTotalElements(); // returns 2
 *
 * ClasseGenerica<Integer> numbers = new ClasseGenerica<>();
 * numbers.addElement(5);
 * numbers.addElement(10);
 * numbers.getFirstElement();  // returns 5
 * numbers.getLastElement();   // returns 10
 * numbers.getTotalElements(); // returns 2
 *
 *
 * Exercici 1: Classe genèrica
 * ---------------------------
 * Implementa una classe genèrica que pugui emmagatzemar múltiples elements i
 * oferir funcionalitats bàsiques com accedir al primer, l’últim i conèixer el total d'elements.
 *
 * Métodos:
 *   - void addElement(T element)
 *   - T getFirstElement()
 *   - T getLastElement()
 *   - int getTotalElements()
 *
 * Examples:
 * ---------
 * ClasseGenerica<String> texts = new ClasseGenerica<>();
 * texts.addElement("Hello");
 * texts.addElement("Goodbye");
 * texts.getFirstElement();  // returns "Hello"
 * texts.getLastElement();   // returns "Goodbye"
 * texts.getTotalElements(); // returns 2
 *
 * ClasseGenerica<Integer> numbers = new ClasseGenerica<>();
 * numbers.addElement(5);
 * numbers.addElement(10);
 * numbers.getFirstElement();  // returns 5
 * numbers.getLastElement();   // returns 10
 * numbers.getTotalElements(); // returns 2
 */
 
public class ClasseGenerica<T> {

    // TODO: Declare a list to store elements of type T
    private List<T> elements;


    // TODO: Initialize the list in the constructor
    public ClasseGenerica() {
         elements = new ArrayList<>();

         
    }

    // TODO: Add the given element to the list
    public void addElement(T element) {
        // ...
        elements.add(element);
    }

    // TODO: Return the first element in the list, or null if the list is empty
    public T getFirstElement() {
        
        // ...
        if (elements.isEmpty()) {
            return null;
        }
        return elements.get(0);
        
    }

    // TODO: Return the last element in the list, or null if the list is empty
    public T getLastElement() {
        // ...
        if (elements.isEmpty()) {
            return null;
        }
        return elements.get(elements.size() - 1);
        
    }

    // TODO: Return the number of elements in the list
    public int getTotalElements() {
        // ...
        return elements.size();
    
    }

    // -------------------------------------------------------------
    // Manual test using IDE
    // -------------------------------------------------------------
    
    public static void main(String[] args) {
        ClasseGenerica<String> texts = new ClasseGenerica<>();
        texts.addElement("Hello");
        texts.addElement("Goodbye");

        System.out.println(texts.getFirstElement());   // Hello
        System.out.println(texts.getLastElement());     // Goodbye
        System.out.println(texts.getTotalElements());  // 2

        ClasseGenerica<Integer> numbers = new ClasseGenerica<>();
        numbers.addElement(100);
        numbers.addElement(200);
        

        System.out.println(numbers.getFirstElement()); // 100
        System.out.println(numbers.getLastElement());   // 200
        System.out.println(numbers.getTotalElements()); // 2
    }
	
	// Torna a comentar aquest main quan vulguis executar els tests amb maven test
    // Vuelve a comentar este main cuando quieras ejecutar los tests con:
    // mvn test
	// -------------------------------------------------------------
}
