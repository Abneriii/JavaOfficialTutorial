import java.util.List;

/**
 * Author:
 * Learning Materials：https://docs.oracle.com/javase/tutorial/collections/streams/QandE/questions.html
 * Created at:2022/6/18
 * Updated at:
 **/
public class Exercises {


    public static void main(String[] args) {



        /*Exercise1:hou answer*/
        List<Person> roster = Person.createRoster();
        roster.stream().filter(person ->
        {
            if (person.getGender() == Person.Sex.MALE) ;
            return true;
        })
                .forEach(person -> System.out.println(person.getName()));

        /*Exercise1:official answer*/
        roster
                .stream()
                .filter(e -> e.getGender() == Person.Sex.MALE)
                .forEach(e -> System.out.println(e.getName()));


    }


    /**
     *
     * Class Album doesn't need to be defined,you just need to modify the the code downside.
     *
     */

    List<Album> favs = new ArrayList<>();
    for(Album a :albums){
        boolean hasFavorite = false;
        for (Track t : a.tracks) {
            if (t.rating >= 4) {
                hasFavorite = true;
                break;
            }
        }
        if (hasFavorite)
            favs.add(a);
    }
    Collections.sort(favs,new Comparator<Album>(){
        public int compare (Album a1, Album a2){
        return a1.name.compareTo(a2.name);
    }
    });

    /**
     * the followings are written by hou
     *
     *
     * Exercise2:hou answer.  wrong!
     *
     * 1.albums has already become stream so you don't need to call stream again
     * 2.whats the difference between forEach() and filter()? when to use them?
     * 3.hou didn't think of  using sorted（）
     * 4.Comparator.comparing（）？
     *
     *
     * hou need to redo this exercise to check if wrong thought has been fixed.
     *
     *
     */

    albums.stream().forEach(album->album.tracks.stream().foreach(t->t.rating>=4)).sotred();


    /*Exercise2:official answer*/
    List<Album> sortedFavs =
            albums.stream()
                    .filter(a -> a.tracks.anyMatch(t -> (t.rating >= 4)))
                    .sorted(Comparator.comparing(a -> a.name))
                    .collect(Collectors.toList());


}
