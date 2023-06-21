package oopTasks;

//        —оздайте класс, который описывает вектор (в трЄхмерном пространстве).
//
//        ” него должны быть:
//
//        -конструктор с параметрами в виде списка координат x, y, z
//        -метод, вычисл€ющий длину вектора:
//        -метод, вычисл€ющий скал€рное произведение:
//        -метод, вычисл€ющий векторное произведение с другим вектором:
//        -метод, вычисл€ющий угол между векторами (или косинус угла):
//        -методы дл€ суммы и разности:
//        -статический метод, который принимает целое число N, и возвращает массив случайных векторов размером N.
//         ≈сли метод возвращает вектор, то он должен возвращать новый объект, а не мен€ть базовый.
//         “о есть, нужно реализовать шаблон "Ќеизмен€емый объект"


import java.util.Arrays;
import java.util.Objects;
import java.util.Random;

public class Vector {
    private double axisX = 0;
    private double axisY = 0;
    private double axisZ = 0;

    public Vector(double axisX, double axisY, double axisZ) {
        this.axisX = axisX;
        this.axisY = axisY;
        this.axisZ = axisZ;
    }

    public Vector(double axisX, double axisY) {
        this.axisX = axisX;
        this.axisY = axisY;
    }

    public Vector(double axisX) {
        this.axisX = axisX;
    }

    public Vector() {
    }

    public double getAxisX() {
        return axisX;
    }

    public double getAxisY() {
        return axisY;
    }

    public double getAxisZ() {
        return axisZ;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Vector vector = (Vector) o;
        return Double.compare(vector.getAxisX(), getAxisX()) == 0
                && Double.compare(vector.getAxisY(), getAxisY()) == 0
                && Double.compare(vector.getAxisZ(), getAxisZ()) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(getAxisX(), getAxisY(), getAxisZ());
    }

    @Override
    public String toString() {
        return "Vector{" +
                "X=" + String.format("%.3f", axisX) +
                "; Y=" + String.format("%.3f", axisY) +
                "; Z=" + String.format("%.3f", axisZ) +
                '}';
    }

    public double vectorLength() {
        return Math.sqrt(Math.pow(this.getAxisX(), 2)
                + Math.pow(this.getAxisY(), 2)
                + Math.pow(this.getAxisZ(), 2));
    }


    public double vectorsScalarProduct(Vector vector) {
        return (this.getAxisX() * vector.getAxisX())
                + (this.getAxisY() * vector.getAxisY())
                + (this.getAxisZ() * vector.getAxisZ());
    }

    public Vector vectorsVectorProduct(Vector vector) {
        double prodVectorAxisX = (this.getAxisY() * vector.getAxisZ()) - (this.getAxisZ() * vector.getAxisY());
        double prodVectorAxisY = (this.getAxisZ() * vector.getAxisX()) - (this.getAxisX() * vector.getAxisZ());
        double prodVectorAxisZ = (this.getAxisX() * vector.getAxisY()) - (this.getAxisY() * vector.getAxisX());
        return new Vector(prodVectorAxisX, prodVectorAxisY, prodVectorAxisZ);
    }

    public double angleBetweenVectors(Vector vector) {
        return this.vectorsScalarProduct(vector) / (Math.abs(this.vectorLength()) * Math.abs(vector.vectorLength()));
    }

    public static double fromRadianToDegrees (double radianValue) {
        return Math.abs(radianValue * (180/Math.PI));
    }

    public Vector vectorsSum(Vector vector) {
        double sumVectorAxisX = this.getAxisX() + vector.getAxisX();
        double sumVectorAxisY = this.getAxisY() + vector.getAxisY();
        double sumVectorAxisZ = this.getAxisZ() + vector.getAxisZ();
        return new Vector(sumVectorAxisX, sumVectorAxisY, sumVectorAxisZ);
    }

    public Vector vectorsDiff(Vector vector) {
        double diffVectorAxisX = this.getAxisX() - vector.getAxisX();
        double diffVectorAxisY = this.getAxisY() - vector.getAxisY();
        double diffVectorAxisZ = this.getAxisZ() - vector.getAxisZ();
        return new Vector(diffVectorAxisX, diffVectorAxisY, diffVectorAxisZ);
    }

    public static Vector createRandomVector(double axisMinValue,  double axisMaxValue) {
        Random random = new Random();
         return new Vector(
                random.nextDouble(axisMinValue, axisMaxValue),
                random.nextDouble(axisMinValue, axisMaxValue),
                random.nextDouble(axisMinValue, axisMaxValue));
    }

    public static Vector[] createNumberOfRandomVectorsList(int number, double axisMinValue, double axisMaxValue) {
        Vector[] vectorsArray = new Vector[number];
        for (int i = 0; i < vectorsArray.length; i++) {
            vectorsArray[i] = createRandomVector(axisMinValue, axisMaxValue);
        }
        return vectorsArray;
    }

    public static void main(String[] args) {
        Vector[] array = createNumberOfRandomVectorsList(2, -3, 3);
        System.out.println(Arrays.toString(array));
        System.out.println(fromRadianToDegrees(array[0].angleBetweenVectors(array[1])));
    }
}
