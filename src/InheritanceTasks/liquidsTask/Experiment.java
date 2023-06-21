package InheritanceTasks.liquidsTask;

/*
Имеются различные жидкости трех видов — Спирт, Вода, Бензин — и емкости в
которые можно их все размещать. Емкости - баки различной формы — в основании
которых может быть — квадрат, круг, треугольник — и их стенки могут быть или
прямыми, или наклонными (Наклон стенок одинаковый с каждой стороны)

Параметры емкости вводятся вручную.

Смешивать жидкости в одной емкости нельзя.

Плотности жидкостей кг/м3: Спирт — 789, Вода — 997, Бензин - 740


Необходимо создать приложение, которое выполнит следующие операции:
- Произвольным образом залить жидкости в некоторое число емкостей. (не менее 5)
- Отсортировать емкости по массе залитой жидкости.
- Вывести в консоли результат в виде таблицы, отсортированные емкости и их
содержимое (выводить все атрибуты, включая объем жидкости в литрах и параметры емкости)
Все вычисления происходят в системе СИ;
Для упрощения вычислений примем массу пустой емкости равной 0;
 */

import InheritanceTasks.liquidsTask.containers.*;
import InheritanceTasks.liquidsTask.liquids.Ethanol;
import InheritanceTasks.liquidsTask.liquids.Liquid;
import InheritanceTasks.liquidsTask.liquids.Petrol;
import InheritanceTasks.liquidsTask.liquids.Water;

import java.util.Random;

public class Experiment {

    public static Container[] containers = prepareContainers();

    public static void main(String[] args) {
        fillContainersWithLiquids(containers, prepareLiquids());
        sortContainers(containers);
        report(containers);
    }

    public static Container[] prepareContainers() {
        Container[] containers = new Container[6];
        containers[0] = new RoundBasedContainer(0.3, 0.1);
        containers[1] = new InclinedRoundBasedContainer(0.5, 0.1);
        containers[2] = new SquareBasedContainer(0.5, 0.1);
        containers[3] = new InclinedSquareBasedContainer(0.5, 0.1);
        containers[4] = new TriangleBasedContainer(0.7, 0.1);
        containers[5] = new InclinedTriangleBasedContainer(0.7, 0.1);
        return containers;
    }

    public static Liquid[] prepareLiquids() {
        Liquid[] liquids = new Liquid[3];
        liquids[0] = new Water();
        liquids[1] = new Ethanol();
        liquids[2] = new Petrol();
        return liquids;
    }

    public static void fillContainersWithLiquids(Container[] containers, Liquid[] liquids){
        for (Container container : containers) {
            container.fill(liquids[new Random().nextInt(3)]);
        }
    }

    public static void sortContainers(Container[] containers) {
        for (int i = 0; i < containers.length; i++) {
            for (int j = containers.length - 1; j > i; j--) {
                Container tmp;
                if (containers[j].getMass() > containers[j - 1].getMass()) {
                    tmp = containers[j - 1];
                    containers[j - 1] = containers[j];
                    containers[j] = tmp;
                }
            }
        }
    }

    public static void report(Container[] containers) {
        for (int i = 0; i < containers.length; i++) {
            System.out.println(i + 1 + ".");
            System.out.println(containers[i]);
        }
    }
}
