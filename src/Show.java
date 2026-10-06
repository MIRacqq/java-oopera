import java.util.ArrayList;

public class Show {
    protected String title;
    protected int duration;
    protected Director director;
    protected ArrayList<Actor> listOfActors;

    public Show(String title, int duration, Director director, ArrayList<Actor> listOfActors) {
        this.title = title;
        this.duration = duration;
        this.director = director;
        this.listOfActors = listOfActors;
    }

    public void printActors(){
        System.out.println("Актёры спектакля «" + title + "»:");
        for (Actor actor : listOfActors) {
            System.out.println(actor);
        }
    }

    public void addActor(Actor actor) {
        if (listOfActors.contains(actor)) {
            System.out.println("Актёр " + actor + " уже есть в спектакле «" + title + "»");
        } else {
            listOfActors.add(actor);
        }
    }

    public void replaceActor(Actor newActor, String surname) {
        int foundIndex = -1;
        int count = 0;

        for (int i = 0; i < listOfActors.size(); i++) {
            if (listOfActors.get(i).getSurname().equals(surname)) {
                foundIndex = i;
                count++;
            }
        }

        if (count == 0) {
            System.out.println("Актёра с фамилией " + surname + " нет в спектакле «" + title + "»");
        } else if (count > 1) {
            System.out.println("В спектакле «" + title + "» несколько актёров с фамилией " + surname
                    + ". Замена не выполнена, уточните, какого актёра заменить");
        } else {
            listOfActors.set(foundIndex, newActor);
        }
    }

    public void replaceActor(Actor newActor, String name, String surname) {
        for (int i = 0; i < listOfActors.size(); i++) {
            Actor actor = listOfActors.get(i);
            if (actor.getName().equals(name) && actor.getSurname().equals(surname)) {
                listOfActors.set(i, newActor);
                return;
            }
        }
        System.out.println("Актёра " + name + " " + surname + " нет в спектакле «" + title + "»");
    }

    public void printDirector() {
        System.out.println("Режиссёр спектакля «" + title + "»: " + director);
    }
}
