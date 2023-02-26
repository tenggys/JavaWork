package Interface;

import java.util.List;
import java.util.Scanner;

import Config.Config;
import Base.View;
import Base.Toy;

public class ConsoleView implements View {
    Scanner in;

    public ConsoleView() {
        in = new Scanner(System.in);
    }

    public int getToyId() {
        System.out.print("Номер: ");
        return Integer.parseInt(in.nextLine());
    }

    public String getToyNaming() {
        System.out.print("Название игрушки: ");
        return in.nextLine();
    }

    public int getToyWeight() {
        System.out.print("Вес игрушки: ");
        return Integer.parseInt(in.nextLine());
    }

    public void showAll(List<Toy> toys) {
        System.out.println("\nВсе игрушки для рисования:");
        for (Toy toy : toys) {
            System.out.println(toy);
        }

    }

    public void showGetToy(Toy toy) {
        System.out.print("\nРезультаты розыграшка: ");
        System.out.println(toy);
    }

    public void loadMessage() {
        System.out.println("\nФайл загружен в текущую сессию");
    }

    public boolean clearAllDecision() {
        boolean f = false;
        System.out.print("\nВы уверены, что очистили все записи (y/n): ");
        if (in.nextLine().equalsIgnoreCase("Y")) {
            f = true;
        }
        return f;
    }

    public void savedAll() {
        System.out.println("\nВсе записи сохраняются в файл: " + Config.pathDb);
    }

    public void savedItem() {
        System.out.println("\nУспешно добавлено в текущий сервис");
    }

    public void saveError() {
        System.out.println("\nНе удалось добавить текущую службу");
    }

    public void emptyListMessage() {
        System.out.println("Список игрушек пуст!");
    }

    public int getDrawTimes() {
        System.out.print("Сколько раз вы хотите нарисовать: ");
        return Integer.parseInt(in.nextLine());
    }

}
