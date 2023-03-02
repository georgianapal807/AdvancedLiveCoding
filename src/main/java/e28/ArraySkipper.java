package e28;

import lombok.AllArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
public class ArraySkipper<E> extends ArrayList<E> {

    private List<E> elements;

    public List<E> getEveryNthElement(int startIndex, int skip) {
        List<E> lista = new ArrayList<>();
        for (int i = startIndex; i < elements.size(); i = i + skip + 1) {
            lista.add(elements.get(i));
        }
        return lista;
    }

    public int partOf(int parity) {
        return elements.stream()
                .filter(element -> (int) element % 2 == parity).toList()
                .size() * 100 / elements.size();
    }
}

