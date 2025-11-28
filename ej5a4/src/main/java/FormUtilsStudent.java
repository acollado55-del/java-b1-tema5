import java.util.ArrayList;
import java.util.List;

/**
 * Procesamiento de respuestas en un sistema de formularios de usuario
 * --------------------------------------------------------------------
 * Una empresa tecnológica gestiona una plataforma online con múltiples formularios
 * (registro, encuestas, feedback, etc.). Para analizar las respuestas introducidas por
 * los usuarios, el equipo de desarrollo quiere crear una clase llamada FormUtils con
 * métodos genéricos reutilizables.
 *
 * Se deben implementar los siguientes métodos:
 *
 * 1. <T> boolean contains(T[] array, T value)
 *    Devuelve true si el valor está presente en el array.
 *
 * 2. <T> int countItems(T[] array)
 *    Devuelve el número total de elementos del array.
 *
 * 3. <T> boolean areEqual(T value1, T value2)
 *    Devuelve true si ambos valores son iguales (equals).
 *
 * 4. <T> int countOccurrences(T[] array, T value)
 *    Devuelve cuántas veces aparece un valor dentro del array.
 *
 * 5. <T> List<T> removeNulls(T[] array)
 *    Devuelve una nueva lista sin valores null del array original.
 *
 * EJEMPLO:
 * --------
 * String[] languages = {"Java", "Python", "C++"};
 * System.out.println(FormUtils.contains(languages, "Python"));           // true
 *
 * String[] ratings = {"good", "very good", "excellent"};
 * System.out.println(FormUtils.countItems(ratings));                     // 3
 *
 * System.out.println(FormUtils.areEqual("pass123", "pass123"));         // true
 *
 * String[] votes = {"yes", "no", "yes", "maybe", "yes"};
 * System.out.println(FormUtils.countOccurrences(votes, "yes"));         // 3
 *
 * String[] responses = {"ok", null, "ok", "skip", null};
 * System.out.println(FormUtils.removeNulls(responses));                 // [ok, ok, skip]
 *
 * ---------------------------------------------------------------
 * Processamentde respostes en un sistema de formularis d’usuari
 * ---------------------------------------------------------------
 * Una empresa tecnològica gestiona una plataforma en línia amb diversos formularis
 * (registre, enquestes, valoració, etc.). Per analitzar les respostes introduïdes pels
 * usuaris, l’equip de desenvolupament vol crear una classe anomenada FormUtils amb
 * mètodes genèrics reutilitzables.
 *
 * Cal implementar els següents mètodes:
 *
 * 1. <T> boolean contains(T[] array, T value)
 *    Retorna true si el valor està present dins de l’array.
 *
 * 2. <T> int countItems(T[] array)
 *    Retorna el nombre total d’elements de l’array.
 *
 * 3. <T> boolean areEqual(T value1, T value2)
 *    Retorna true si els dos valors són iguals (equals).
 *
 * 4. <T> int countOccurrences(T[] array, T value)
 *    Retorna quantes vegades apareix un valor dins de l’array.
 *
 * 5. <T> List<T> removeNulls(T[] array)
 *    Retorna una nova llista sense els valors null de l’array original.
 *
 * EXEMPLE:
 * --------
 * String[] languages = {"Java", "Python", "C++"};
 * System.out.println(FormUtils.contains(languages, "Python"));           // true
 *
 * String[] ratings = {"good", "very good", "excellent"};
 * System.out.println(FormUtils.countItems(ratings));                     // 3
 *
 * System.out.println(FormUtils.areEqual("pass123", "pass123"));         // true
 *
 * String[] votes = {"yes", "no", "yes", "maybe", "yes"};
 * System.out.println(FormUtils.countOccurrences(votes, "yes"));         // 3
 *
 * String[] responses = {"ok", null, "ok", "skip", null};
 * System.out.println(FormUtils.removeNulls(responses));                 // [ok, ok, skip]
 */

public class FormUtilsStudent {

    public static <T> boolean contains(T[] array, T value) 
    {
        // TODO: return true if value is in array
        for (T item : array) 
            {
            if (item == null && value == null) 
                {
                return true;
                }
            if (item != null && item.equals(value)) 
                {
                return true;
                }
            }
        return false;

        
    }

    public static <T> int countItems(T[] array) {
        // TODO: return the total number of items in array
        return array.length;
       
    }

    public static <T> boolean areEqual(T value1, T value2) 
    {
        // TODO: return true if value1 and value2 are equal
        if (value1 == null && value2 == null) 
            {
            return true;
            }
        if (value1 != null) 
            {
            return value1.equals(value2);   
    }
        return false;
    }

    public static <T> int countOccurrences(T[] array, T value) 
    {
        // TODO: return how many times value appears in array
        int count = 0;
        for (T item : array) 
            {
            if (item == null && value == null) 
                {
                count++;
                }
            else if (item != null && item.equals(value)) 
                {
                count++;
                }
            }

        return count;

    }

    public static <T> List<T> removeNulls(T[] array) 
    {
        // TODO: return a new list excluding all null values
        List<T> result = new ArrayList<>();
        for (T item : array) 
            {
            if (item != null) 
                {
                result.add(item);
                }
            }
        return result;
    }

    // -------------------------------------------------------------
    // Manual test using IDE
    // -------------------------------------------------------------
    
    public static void main(String[] args) {
        String[] languages = {"Java", "Python", "C++"};
        System.out.println(FormUtilsStudent.contains(languages, "Python")); // true

        String[] ratings = {"good", "very good", "excellent"};
        System.out.println(FormUtilsStudent.countItems(ratings));           // 3

        System.out.println(FormUtilsStudent.areEqual("pass123", "pass123")); // true

        String[] votes = {"yes", "no", "yes", "maybe", "yes"};
        System.out.println(FormUtilsStudent.countOccurrences(votes, "yes")); // 3

        String[] responses = {"ok", null, "ok", "skip", null};
        System.out.println(FormUtilsStudent.removeNulls(responses)); // [ok, ok, skip]
    }
	
	// Torna a comentar aquest main quan vulguis executar els tests amb maven test
    // Vuelve a comentar este main cuando quieras ejecutar los tests con:
    // mvn test
	// -------------------------------------------------------------
}
