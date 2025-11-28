import java.util.ArrayList;
import java.util.List;

/**
 * Registro genérico de datos (nombre + cifra)
 * --------------------------------------------
 * Se desea implementar un sistema que permita asociar un nombre (por ejemplo, de una persona o producto)con una cifra numérica (por ejemplo, unidades vendidas, puntuación, ingresos...).
 *
 * Para ello se debe:
 * 1. Crear una clase Pair<T, U> que almacene dos valores relacionados: uno de tipo T (nombre), otro de tipo U (cifra).
 * 2. Crear una clase PairRegistry<T, U> que contenga una lista de objetos Pair<T, U> y permita las siguientes operaciones:
 *
 * - void addPair(T first, U second)
 *     → Añade una nueva pareja (nombre + cifra) al registro.
 *
 * - void printAll()
 *     → Muestra todas las parejas almacenadas en formato: nombre - cifra.
 *
 * - U getValueByKey(T key)
 *     → Devuelve la cifra asociada al nombre dado. Si no existe, devuelve null.
 *
 * - U sumValues()
 *     → Devuelve la suma total de todas las cifras. Solo funciona si U es Integer.
 *
 * EJEMPLO:
 * --------
 * PairRegistry<String, Integer> sales = new PairRegistry<>();
 * sales.addPair("Shirt", 20);
 * sales.addPair("Trousers", 15);
 * sales.addPair("Shoes", 30);
 *
 * sales.printAll();
 * System.out.println("Total sold: " + sales.sumValues());
 * System.out.println("Shirt sales: " + sales.getValueByKey("Shirt"));
 *
 * // Salida esperada:
 * // Shirt - 20
 * // Trousers - 15
 * // Shoes - 30
 * // Total sold: 65
 * // Shirt sales: 20
 *
 * ---
 *
 * Registre genèric de dades (nom + xifra)
 * ---------------------------------------
 * Es vol implementar un sistema que permeti associar un nom (per exemple, d’una persona o producte) amb una xifra numèrica (per exemple, unitats venudes, puntuació, ingressos...).
 *
 * Per això cal:
 * 1. Crear una classe Pair<T, U> que emmagatzemi dos valors relacionats: un de tipus T (nom), i un altre de tipus U (xifra).
 * 2. Crear una classe PairRegistry<T, U> que contingui una llista d’objectes Pair<T, U> i permeti les operacions següents:
 *
 * - void addPair(T first, U second)
 *     → Afegeix una nova parella (nom + xifra) al registre.
 *
 * - void printAll()
 *     → Mostra totes les parelles emmagatzemades en format: nom - xifra.
 *
 * - U getValueByKey(T key)
 *     → Retorna la xifra associada al nom indicat. Si no existeix, retorna null.
 *
 * - U sumValues()
 *     → Retorna la suma total de totes les xifres. Només funciona si U és Integer.
 *
 * EXEMPLE:
 * --------
 * PairRegistry<String, Integer> sales = new PairRegistry<>();
 * sales.addPair("Shirt", 20);
 * sales.addPair("Trousers", 15);
 * sales.addPair("Shoes", 30);
 *
 * sales.printAll();
 * System.out.println("Total sold: " + sales.sumValues());
 * System.out.println("Shirt sales: " + sales.getValueByKey("Shirt"));
 *
 * // Sortida esperada:
 * // Shirt - 20
 * // Trousers - 15
 * // Shoes - 30
 * // Total sold: 65
 * // Shirt sales: 20
 */

public class PairRegistry<T, U> 
{

    // TODO: create a list to store Pair<T, U> objects
    private List<Pair<T, U>> pairs;

    public PairRegistry() {
        // TODO: initialize the list
        pairs = new ArrayList<>();

    }

    // TODO: add a new Pair<T, U> to the list
    public void addPair(T first, U second) 
    {
        pairs.add(new Pair<>(first, second));

    }

    // TODO: print all pairs in the format: name - value
    public void printAll() 
    {
        for (Pair<T, U> pair : pairs) 
            {
            System.out.println(pair.first + " - " + pair.second);
            }   
        
    }

    // TODO: find the value associated with the given key
    public U getValueByKey(T key) 
    {
        for (Pair<T, U> pair : pairs) 
            {
            if ((pair.first == null && key == null) || (pair.first != null && pair.first.equals(key))) 
                {
                return pair.second;
                }
        
             
            }
        return null;
    }

    // TODO: return the total sum if U is Integer, otherwise return null
    public U sumValues() 
    {
        if (pairs.isEmpty() || !(pairs.get(0).second instanceof Integer)) 
            {
            return null;
            }

        Integer sum = 0;
        for (Pair<T, U> pair : pairs) 
            {
            sum += (Integer) pair.second;
            }
        return (U) sum;
    }   
       
      
    

    // -------------------------------------------------------------
    // Manual test using IDE
    // -------------------------------------------------------------
    
    public static void main(String[] args) {
        PairRegistry<String, Integer> sales = new PairRegistry<>();
        sales.addPair("Shirt", 20);
        sales.addPair("Trousers", 15);
        sales.addPair("Shoes", 30);
        sales.printAll();
        System.out.println("Total sold: " + sales.sumValues());
        System.out.println("Shirt sales: " + sales.getValueByKey("Shirt"));
    }
    
    // Torna a comentar aquest main quan vulguis executar els tests amb maven test
    // Vuelve a comentar este main cuando quieras ejecutar los tests con:
    // mvn test
    // -------------------------------------------------------------
}