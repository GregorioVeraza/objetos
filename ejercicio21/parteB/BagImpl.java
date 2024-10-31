package unlp.oo1.bag;

import java.util.AbstractCollection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class BagImpl<T> extends AbstractCollection<T> implements Bag<T> {

    Map<T, Integer> elements;

    public BagImpl() {
    	this.elements = new HashMap<T, Integer>();
        // TODO Completar con la instanciación adecuada
        // this.elements = ....
    }

    @Override
    public boolean add(T element) {
        // TODO Completar con la implementación correspondiente
    	if (elements.containsKey(element)) {
    		int valor = this.elements.get(element);
    		valor++;
    		this.elements.replace(element, valor);
    	} else {
    		this.elements.put(element, 1);
    	}
        return true;
    }

    @Override
    public int occurrencesOf(T element) {
    	
        // TODO Completar con la implementación correspondiente
        return this.elements.get(element);
    }

    @Override
    public void removeOccurrence(T element) {
    	if (this.elements.containsKey(element)) {
    		int value = this.elements.get(element);
    		this.elements.replace(element, value, value--);
    	}
        // TODO Completar con la implementación correspondiente
    }

    @Override
    public void removeAll(T element) {
    	this.elements.remove(element);
        // TODO Completar con la implementación correspondiente
    }

    @Override
    public int size() {
        // TODO Completar con la implementación correspondiente
       return this.elements.size();
    }

    @Override
    public Iterator<T> iterator() {
        return new Iterator<T>() {
            private Iterator<Map.Entry<T, Integer>> entryIterator = elements.entrySet().iterator();
            private Map.Entry<T, Integer> currentEntry;
            private int remainingCount;

            @Override
            public boolean hasNext() {
                return remainingCount > 0 || entryIterator.hasNext();
            }

            @Override
            public T next() {
                if (remainingCount == 0) {
                    currentEntry = entryIterator.next();
                    remainingCount = currentEntry.getValue();
                }
                remainingCount--;
                return currentEntry.getKey();
            }

            @Override
            public void remove() {
                removeOccurrence(currentEntry.getKey());
            }
        };
    }
}
