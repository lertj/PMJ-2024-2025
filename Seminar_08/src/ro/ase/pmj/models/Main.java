package ro.ase.pmj.models;

import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static Integer tripleNumber(int x){
        return x*3;
    }

    public static void main(String[] args) {
        List<Integer> listInt = new ArrayList<>();
        listInt.add(0);
        listInt.add(2);
        listInt.add(2);
        listInt.add(3);
//        List<Integer> listInt = Arrays.asList(2,2,3,4);
        System.out.println("Initial:");
        System.out.println(listInt);

        for(int i=0; i<listInt.size();i++){
            int count=0;
            for(int j=0;j<listInt.size();j++){
                if(listInt.get(j) == listInt.get(i)){
                    count++;
                }
            }

            if(count>1){
                listInt.remove(i);
            }
        }
        System.out.println("Distinct:");
        System.out.println(listInt);

        List<Integer> listInt2 = new ArrayList<>();
        listInt2.add(0);
        listInt2.add(2);
        listInt2.add(2);
        listInt2.add(3);
        listInt2.add(1);
        List<Integer> listDoubled = listInt2.stream().map(x -> x*2).toList();
        System.out.println(listDoubled);

        System.out.println(listInt2.stream().distinct().sorted().toList());

        Set<Integer> setInt = listInt2.stream().filter(x -> x%2==0).collect(Collectors.toSet());
        System.out.println(setInt);


        List<Animal> animals = new ArrayList<>();
        animals.add(new Animal("Rex", 5));
        animals.add(new Animal("Azorel", 2));
        animals.add(new Animal("Labus", 1));
        System.out.println(animals.stream().sorted( (x,y) -> {
            if(x.age> y.age) return 1;
            else if (x.age < y.age) return -1;
            else return 0;
        }).collect(Collectors.toList()));

        System.out.println(listInt2.stream().map(Main::tripleNumber).toList());

        listInt2.stream().forEach(System.out::println);

    }
}
