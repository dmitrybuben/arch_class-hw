package Architecture.modelelements;

/*Текстура хранится, к примеру, в базе данных - есть идентификатор и наименование - сами придумали - на схеме нет,
геттеры для прочтения имени и id. Сеттеров нет - текстура будет инициализироваться только 1 раз, так как лежит в базе
данных при загрузке из базы данных и создании объекта в рамках конструктора. для заполнения id - создаем counter и
добавим инициализатор id = ++counter; каждый раз будет новая текстура со своим id и именем, которое зададим. */

public class Texture {

    static int counter = 0;
    private int id;
    private String name;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    {
        id = ++counter;
    }

    public Texture(String name) {
        this.name = name;
    }
}
