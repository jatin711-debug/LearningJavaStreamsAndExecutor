import java.util.List;
import java.util.function.Predicate;


class Streams{
    public static void main(String[] args){
        //var obj = Stream.of(List.of(1,2,3),List.of(4,5,6));
        //obj.flatMap(o->o.stream()).forEach(a->System.out.println(a));


        Predicate<Movies> predicate = m -> m.getId() > 1;
        var movies = List.of(new Movies("Hello",1)
                                ,new Movies("Ji",2)
                                ,new Movies("Bolo",4));
        //movies.stream().filter(predicate).forEach(a-> System.out.println(a.getId()));

        //movies.stream().limit(2).forEach(a-> System.out.println(a.getId()));

        //movies.stream().skip(1).forEach(a-> System.out.println(a.getId()));

        //movies.stream().takeWhile(m -> m.getId() < 4 ).forEach(a-> System.out.println(a.getName()));

        //movies.stream().dropWhile(m -> m.getId() < 4 ).forEach(a-> System.out.println(a.getName()));
    }
}