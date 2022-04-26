package com.prototype.cache;

import com.prototype.shapes.Circle;
import com.prototype.shapes.Rectangle;
import com.prototype.shapes.Shape;
import java.util.HashMap;
import java.util.Map;

public class BundledShapeCache {

    private Map<String, Shape> cache = new HashMap<>();

    public BundledShapeCache() {
        Circle circle = new Circle();
        circle.setX(5);
        //A linha anterior é equivalente próxima a se x fosse públíco
        //circle.x = 5;
        circle.setY(7);
        //A linha anterior é equivalente próxima a se y fosse públíco
        //circle.y = 7;
        circle.setRadius(45);
        //A linha anterior é equivalente próxima a se radius fosse públíco
        //circle.radius = 45;
        circle.setColor("Verde");
        //A linha anterior é equivalente próxima a se color fosse públíco
        //circle.color = "Verde";

        Rectangle rectangle = new Rectangle();
        rectangle.setX(6);
        //A linha anterior é equivalente próxima a se y fosse públíco
        //rectangle.x = 6;
        rectangle.setY(9);
        //A linha anterior é equivalente próxima a se y fosse públíco
        //rectangle.y = 9;
        rectangle.setWidth(8);
        //A linha anterior é equivalente próxima a se width fosse públíco
        //rectangle.width = 8;
        rectangle.setHeight(10);
        //A linha anterior é equivalente próxima a se height fosse públíco
        //rectangle.height = 10;
        rectangle.setColor("Azul");
        //A linha anterior é equivalente próxima a se color fosse públíco
        //rectangle.color = "Azul";

        cache.put("Circulo grande verde", circle);
        cache.put("Retangulo medio azul", rectangle);
    }

    public Shape put(String key, Shape shape) {
        cache.put(key, shape);
        return shape;
    }

    public Shape get(String key) {
        return cache.get(key).clone();
    }
}
