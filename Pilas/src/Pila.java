public class Pila {
    private Nodo tope = null;
    private int longitud = 0;

    public class Nodo {
        public String isbn; // Cambio de tipo de dato de int a String
        public String autor;
        public String titulo;
        public Nodo next = null;

        // Constructor de nodo, cada parámetro se separa por coma.
        public Nodo(String isbn, String autor, String titulo) { // Cambio de tipo de dato de int a String
            this.isbn = isbn;
            this.autor = autor;
            this.titulo = titulo;
        }
    }

    public boolean isEmptyStack() {
        return tope == null;
    }

    public int length() {
        return longitud;
    }

    public void apilar(String isbn, String autor, String titulo) { // Cambio de tipo de dato de int a String
        Nodo nodoPush = new Nodo(isbn, autor, titulo);
        nodoPush.next = tope;
        tope = nodoPush;
        longitud++; // Cada vez que se agrega un elemento se incrementa la longitud.
    }

    public void desapilar() {
        if (tope != null) {
            Nodo nodoPop = tope;
            tope = tope.next;
            nodoPop = null;
        }
        longitud--; // Cada vez que se elimina un elemento se decrementa la longitud.
    }

    public void obtenerTope() {
        if (!isEmptyStack()) {
            Nodo nodoCima = tope;
            System.out.println("El libro actual es: (" + nodoCima.isbn + ", " + nodoCima.autor + ", " + nodoCima.titulo + ")");
        } else {
            System.out.println("No hay libros en la pila.");
        }
    }

    // Realizar un método destructor que elimine todos los elementos de una pila
    public void destructor() {
        tope = null;
        longitud = 0;
    }

    // Realizar un método desapilar, en el cual se desapilen un número N de elementos de una pila.
    // En caso de destruir todos los libros, añadir un texto que diga "Ya no hay más libros".
    public void desapilar(int cantidad) { // Corregido "N" a "cantidad"
        if (longitud <= cantidad) {
            destructor(); // Si la cantidad a desapilar es mayor o igual que la longitud, destruye todos los libros.
            System.out.println("Ya no hay más libros.");
        } else {
            for (int i = 0; i < cantidad; i++) {
                desapilar();
            }
        }
    }
}
