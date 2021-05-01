import java.math.BigDecimal;
import java.util.*;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.function.BiConsumer;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        Notebook notebook1 = new Notebook("Samsung",8,500,15.6,"Intel",30000,"Black","Windows",false);
        Notebook notebook2 = new Notebook("Asus",16,1000,15.6,"Intel",40000,"Black","Windows",false);
        Notebook notebook3 = new Notebook("Acer",16,1000,17.3,"AMD",50000,"Silver","Linux",true);
        Notebook notebook4 = new Notebook("HP",4,1000,17.3,"Intel",20000,"White","Windows",true);
        Notebook notebook5 = new Notebook("Toshiba",32,2000,15.6,"AMD",60000,"Blue","Linux",false);

        List<Notebook> list = new ArrayList<>();

        list.add(notebook1);
        list.add(notebook2);
        list.add(notebook3);
        list.add(notebook4);
        list.add(notebook5);

        // filter(), map()
        list.stream().filter(x -> x.getOS().equals("Linux"))
                .map(Notebook::getProducer)
                .forEach(System.out::println);

        System.out.println();

        //flatMap(), anyMatch()
        boolean isSamsung = list.stream().flatMap(x -> list.stream())
                .anyMatch(x -> x.getProducer().equals("Samsung"));

        System.out.println("isSamsung: " + isSamsung);
        System.out.println();

        //noneMatch(), allMatch()
        boolean isSony = list.stream().flatMap(x -> list.stream())
                .noneMatch(x -> x.getProducer().equals("Sony"));
        System.out.println("isSony:" + isSony);

        System.out.println();

        isSony = list.stream().flatMap(x -> list.stream())
                .allMatch(x -> x.getProducer().equals("Sony"));
        System.out.println("isSony:" + isSony);

        System.out.println();

        //findFirst(), findAny()
        Optional first = list.stream()
                .filter(x -> x.getProcessor().equals("AMD"))
                .map(Notebook::getProducer)
                .findFirst();

        System.out.println("findFirst: " + first);
        System.out.println();

        first = list.stream()
                .filter(x -> x.getProcessor().equals("Intel"))
                .map(Notebook::getProducer).findAny();
        System.out.println("findAny:" + first);
        System.out.println();

        // min(), max()
        Optional minPrice = list.stream()
                .min(Comparator.comparing(Notebook::getPrice));

        System.out.println("minPrice: " + minPrice);
        System.out.println();

        Optional maxPrice = list.stream()
                .max(Comparator.comparing(Notebook::getPrice));

        System.out.println("maxPrice: " + maxPrice);
        System.out.println();

        // reduce()
        double totalPrice = list.stream()
                .map(Notebook::getPrice)
                .reduce((double) 0, Double::sum);
        System.out.println("totalPrice: " + totalPrice);
        System.out.println();

        // collect()

        LinkedList<Notebook> filteredNotebooks = list.stream()
                .filter(s -> s.getOS().equals("Windows"))
                .collect(Collectors.toCollection(LinkedList::new));
        System.out.println("filteredNotebooks:" + filteredNotebooks);
        System.out.println();

    }
}
