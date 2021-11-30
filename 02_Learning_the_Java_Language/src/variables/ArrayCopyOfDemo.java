package variables;

public class ArrayCopyOfDemo {
    public static void main(String[] args) {
        String[] copyFrom = {
            "Affogato", "Americano", "Cappuccino", "Corretto", "Cortado",   
            "Doppio", "Espresso", "Frappucino", "Freddo", "Lungo", "Macchiato",      
            "Marocchino", "Ristretto" };
        
        // copyOfRange
        String[] copyTo = java.util.Arrays.copyOfRange(copyFrom, 2, 9);        
        for (String coffee : copyTo) {
            System.out.print(coffee + " ");           
        }
        System.out.print("\n");

        // binarySearch
        int index = java.util.Arrays.binarySearch(copyFrom, "Macchiato");
        System.out.print(index + "\n");
        
        // equals
        
        // fill
        
        // sort / parallelSort
        
        // stream
        java.util.Arrays.stream(copyTo).map(coffee -> coffee + " ").forEach(System.out::print);
        System.out.print("\n");
        
        // toString
        System.out.println(java.util.Arrays.toString(copyTo));
        System.out.print("\n");
    }
}
