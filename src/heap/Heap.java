package heap;

import java.util.ArrayList;

public class Heap {
    private ArrayList<Integer> heap = new ArrayList<>();


    public void push(Integer element) {
        int son=heap.size();
        int parent = ((son-1)/2);

        heap.add(element);

        while (son>0 && heap.get(parent)<element) {
            System.out.println("Son = " + son + " parent = " + parent + " son.value = " + heap.get(son) + " parent.value " + heap.get(parent));

            Integer parentValue = heap.get(parent);
            heap.set(parent, element); // add our element as a parent
            heap.set(son, parentValue);
            son = parent;
            parent = ((son-1)/2);

            System.out.println("Son = " + son + " parent = " + parent + " son.value = " + heap.get(son) + " parent.value " + heap.get(parent));
            heap.toString();
        }
        System.out.println("- - - - ");
    }

    public void pop() {
        int son=1;
        int parent = 0;
        Integer parentValue = heap.get(heap.size()-1);
        Integer temp;

        heap.set(0, parentValue);
        heap.remove(heap.size()-1);

        while (son < heap.size()) {
            if ( ( son+1 <  heap.size() ) && ( heap.get(son+1) > heap.get(son)) ) {
                son++;
            }
            if (heap.get(parent) >= heap.get(son)) return;

            temp = heap.get(parent);
            heap.set(parent, heap.get(son)); // add our element as a parent
            heap.set(son, temp);
            parent = son;
            son = 2* parent +1;
            }
    }




/*

    //T[] - kopiec z usuniętym szczytem
    pop() :
    v=T[n], parent=0, son=1
            while ( son < n ) : // kopcujemy , aż dojdziemy do
    liścia
if (son+1<size andT[son+1]>T[son]): son++ //jeśli prawy syn istnieje i ma
    większą wartość zastępujemy nim lewego if (v ≥ T[son]): break //jeśli warunek kopca
    spełniony , przerywamy
    T[ parent ] = T[ son ] //przepisujemy ojca son = parent //i przesuwamy się niżej parent = 2*parent+1
    T[i] = v

*/




    @Override
    public String toString() {
        String result = "";
        for (int i=0; i<heap.size(); i++) {
            result = result + heap.get(i) + " ";
        }
        return result;
    }
}


/*

i - son
j - parent

    //T[] - kopiec
    puch(v) : son = n
        parent = (son−1)/2
        while (son>0 and T[ parent]<v) : // kopcujemy, aż dojdziemy do korzenia lub warunek kopca będzie
        spełniony
        T[ i ] = T[ j ] // przesuwamy rodzica
        son = parent // przenosimy się na pozycję ojca
        parent = (son−1)/2 // i obliczamy nowego ojca T[i] = v

*/

