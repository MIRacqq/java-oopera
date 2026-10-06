import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Actor actor1 = new Actor("Иван", "Петров", Gender.MALE, 182);
        Actor actor2 = new Actor("Анна", "Смирнова", Gender.FEMALE, 168);
        Actor actor3 = new Actor("Олег", "Сидоров", Gender.MALE, 175);
        Actor actor4 = new Actor("Иван", "Сидоров", Gender.MALE, 175);

        Director director1 = new Director("Мария", "Иванова", Gender.FEMALE, 12);
        Director director2 = new Director("Сергей", "Кузнецов", Gender.MALE, 7);

        String musicAuthor = "Пётр Чайковский";
        String choreographer = "Мариус Петипа";

        Show show = new Show("Ревизор", 150, director1, new ArrayList<>());

        Opera opera = new Opera("Травиата", 170, director2, new ArrayList<>(),
                "Джузеппе Верди", "Текст либретто оперы «Травиата»...", 40);

        Ballet ballet = new Ballet("Лебединое озеро", 140, director1, new ArrayList<>(),
                musicAuthor, "Текст либретто балета «Лебединое озеро»...", choreographer);

        show.addActor(actor1);
        opera.addActor(actor2);
        ballet.addActor(actor2);
        ballet.addActor(actor3);
        ballet.addActor(actor4);

        show.printActors();
        opera.printActors();
        ballet.printActors();

        ballet.replaceActor(actor1, "Сидоров");
        ballet.replaceActor(actor1, "Иван", "Сидоров");
        ballet.printActors();

        opera.replaceActor(actor3, "Кузнецов");

        opera.printLibretto();
        ballet.printLibretto();
    }
}
