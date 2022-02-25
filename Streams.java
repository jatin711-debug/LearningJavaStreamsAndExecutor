import java.util.List;
import java.util.stream.Collectors;


class Streams{
    public static void main(String[] args){
        //var obj = Stream.of(List.of(1,2,3),List.of(4,5,6));

        //obj.flatMap(o->o.stream()).forEach(a->System.out.println(a));


        //Predicate<Movies> predicate = m -> m.getId() > 1;
        var movies = List.of(new Movies("Hello",10)
                                ,new Movies("Ji",20)
                                ,new Movies("Bolo",40));
        //movies.stream().filter(predicate).forEach(a-> System.out.println(a.getId()));

        //movies.stream().limit(2).forEach(a-> System.out.println(a.getId()));

        //movies.stream().skip(1).forEach(a-> System.out.println(a.getId()));

        //movies.stream().takeWhile(m -> m.getId() < 4 ).forEach(a-> System.out.println(a.getName()));

        //movies.stream().dropWhile(m -> m.getId() < 4 ).forEach(a-> System.out.println(a.getName()));

        //movies.stream().sorted(Comparator.comparing(Movies::getName).reversed()).forEach(m -> System.out.println(m.getName()));

        // movies.stream()
        //     .map(Movies::getId)
        //         .distinct()
        //             .forEach(System.out::println);

        
    //    var res =  movies.stream()
    //         .noneMatch(m -> m.getId() == 1 ); // allMatch() anyMatch() count() findFirst()->get() findAny()->get()
    //         //max(<Comparator>) min(Campatator.comparing(Movies::getId))
    //     System.out.println(res);


    // Integer sum= movies.stream()
    //     .map(Movies::getId)
    //         .reduce(0,Integer::sum);
    //     System.out.println(sum);

    // var newMovies = movies.stream()
    //     .filter(m -> m.getId() > 10)
    //     .collect(Collectors.toList()); //toSet() toMap()

        // var newMovies = movies.stream()
        // .filter(m -> m.getId() > 10)
        // .collect(Collectors.toMap(Movies::getId,Movies::getName)); //toSet()

        // var newMovies = movies.stream()
        // .filter(m -> m.getId() > 10)
        // .collect(Collectors.summarizingInt(Movies::getId));

        var newMovies = movies.stream()
        .filter(m -> m.getId() > 10)
        .map(Movies::getName)
        .collect(Collectors.joining("-"));
        System.out.println(newMovies);
    }
}