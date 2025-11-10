// Ejemplo mas simple de Arbol Binario en Java
class Nodo {
    int valor;
    Nodo izquierdo;
    Nodo derecho;

    Nodo(int valor) {
        this.valor = valor;
        izquierdo = null;
        derecho = null;
    }
}

class ArbolBinario {
    Nodo raiz;

    // Insertar un nuevo nodo en el arbol
    void insertar(int valor) {
        raiz = insertarRecursivo(raiz, valor);
    }

    Nodo insertarRecursivo(Nodo actual, int valor) {
        if (actual == null) {
            return new Nodo(valor);
        }

        if (valor < actual.valor) {
            actual.izquierdo = insertarRecursivo(actual.izquierdo, valor);
        } else if (valor > actual.valor) {
            actual.derecho = insertarRecursivo(actual.derecho, valor);
        }

        return actual;
    }

    // Recorrido Inorden (izquierda, raiz, derecha)
    void inorden(Nodo nodo) {
        if (nodo != null) {
            inorden(nodo.izquierdo);
            System.out.print(nodo.valor + " ");
            inorden(nodo.derecho);
        }
    }
}

public class ArbolDemo {
    public static void main(String[] args) {
        ArbolBinario arbol = new ArbolBinario();

        // Insertamos algunos valores
        arbol.insertar(5);
        arbol.insertar(3);
        arbol.insertar(7);
        arbol.insertar(2);
        arbol.insertar(4);

        System.out.print("Recorrido Inorden del arbol: ");
        arbol.inorden(arbol.raiz);
    }
}