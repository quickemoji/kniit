class Container  
{
    double mx_volume;
    double cr_volume = 0;

    Container(double volume)
    {
        this.mx_volume = volume;
    }

    void add(Shape obj)
    {
        double volume = obj.getVolume();
        if (cr_volume + volume <= this.mx_volume)
        {
            this.cr_volume = cr_volume + volume;
            System.out.println("Текущий объём: " + cr_volume);
        }
        else
        {
            System.out.println("фигуру невозможно добавить");
        }
    }
}


class Shape  
{
    double volume;
    double getVolume()
    {
        return volume;
    }
}


class Sphere extends Shape
{
    Sphere(double r)
    {
        this.volume = (4.0 / 3.0) * 3.14 * r * r * r;
    }
}


class Cube extends Shape
{
    Cube(double a)
    {
        this.volume = a * a * a;
    }
}


class Cylinder extends Shape
{
    Cylinder(double r, double h)
    {
        this.volume = 3.14 * r * r * h;
    }
}



public class Main {
    public static void main(String[] args) {
        Container container = new Container(1000);  // Создаем контейнер с объемом 1000

        Shape sphere = new Sphere(5);   // Создаем сферу с радиусом 5
        Shape cube = new Cube(3);       // Создаем куб со стороной 3
        Shape cylinder = new Cylinder(30,10);       // Создаем куб со стороной 3

        System.out.println(cube.getVolume());

        container.add(sphere);  // Проверяем, можно ли добавить сферу
        container.add(cube);    // Проверяем, можно ли добавить куб
        container.add(cylinder);    // Проверяем, можно ли добавить куб
    }
}


