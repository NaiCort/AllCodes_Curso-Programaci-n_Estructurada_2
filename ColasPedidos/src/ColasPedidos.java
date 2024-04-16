public class ColasPedidos {

    private NodoPedido cabeza, cola; //Se está declarando dos variables

    public class NodoPedido{
        public int numeroPedido;
        public string nombreCliente;
        public NodoPedido next = null; //Apuntador

        //Metodo constructor de la clase NodoPedido
        public NodoPedido(int numPedido, string nombreCliente) {
            this.numeroPedido = numPedido;
            this.nombreCliente =nombreCliente;
        }
    }
    public void agregarCola(int pedido, string cliente) {
        NodoPedido nuevoPedido = new NodoPedido(pedido, cliente);
        if(cabeza == null && cola == null) {
            cabeza = nuevoPedido;
        } else{
            cola.next = nuevoPedido;
        }
        cola = nuevoPedido;
    }

    public void eliminar () {
        if(cabeza != null){
            NodoPedido eliminar = cabeza;
            cabeza = cabeza.next;
            eliminar.next = null;
            if(cabeza == null){
                cola = null;
            }
        }
    }

    public void obtener() {
        if(cabeza == null){
            System.out.println("No hay elementos");
        }else {
            NodoPedido primero = cabeza;
            //System.out.println("id: " + primero.numeroPedido + " cliente: " + primero.nombreCliente);
            System.out.println("Los datos del pedido son: {id:" + primero.numeroPedido + " cliente: " + primero.nombreCliente + "}");
        }
    }
    public void obtenerSiguiente(){
        if(cabeza == null){
            System.out.println("No hay elementos en la cola");
        }else {
            if(cabeza.next == null){
                System.out.println("La cola solo tiene un elemento");
            }else {
                NodoPedido pedidoNext = cabeza.next;
                System.out.println("Los datos del siguiente pedido son: " + "id: " + pedidoNext.numeroPedido)
            }
        }
    }
}