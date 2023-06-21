package figuresTaskInheritance;

/*
Дано: куб, параллелепипед, цилиндр, конус, четырехугольная пирамида и правильная треугольная пирамида
Задача: разлить из наполненного куба жидкость, чтобы она равномерно распределилась по всем оставшимся
ёмкостям. Сгруппировать все ёмкости по весу по порядку от большего к меньшему.
Примечание: Все величины писать согласно системы СИ
 */


import figuresTaskInheritance.figure.Figure;
import figuresTaskInheritance.figure.cylinder.Cone;
import figuresTaskInheritance.figure.cylinder.Cylinder;
import figuresTaskInheritance.figure.parallelepiped.Parallelepiped;
import figuresTaskInheritance.figure.pyramid.Pyramid;
import figuresTaskInheritance.figure.pyramid.RegularTriangularPyramid;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println(solution(
                new Parallelepiped(100, 100, 100, 10000),
                54,
                new Cone(3, 5, 0),
                new Cylinder(3, 5, 0),
                new Parallelepiped(2, 3, 3, 0),
                new Pyramid(3, 5, 10, 0),
                new RegularTriangularPyramid(10, 10, 0)).toString());
    }

    public static List<Figure> solution(Parallelepiped cube, double percentOfFulfillment, Figure... figures) {
        for (Figure figure : figures) {
            cube.fill(figure, figure.getVolume() * (percentOfFulfillment / 100));
        }
        double maxWeight = 0;
        for (int i = 0; i < figures.length; i++) {
            for (int j = figures.length - 1; j > i; j--) {
                maxWeight = figures[i].getWeight();
                if (maxWeight < figures[j].getWeight()) {
                    Figure temp = figures[i];
                    figures[i] = figures[j];
                    figures[j] = temp;
                }
            }
        }
        return Arrays.stream(figures).toList();
    }
}
