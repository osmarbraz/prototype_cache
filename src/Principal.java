
import com.prototype.cache.BundledShapeCache;
import com.prototype.shapes.Shape;

public class Principal {

    public static void main(String[] args) {

        BundledShapeCache cache = new BundledShapeCache();

        Shape shape1 = cache.get("Circulo grande verde");
        Shape shape2 = cache.get("Retangulo medio azul");
        Shape shape3 = cache.get("Retangulo medio azul");

        if (shape1 != shape2 && !shape1.equals(shape2)) {
            System.out.println("Circulo grande verde != Retangulo medio azul");
        } else {
            System.out.println("Circulo grade verde == Retangulo medio azul");
        }

        if (shape2 != shape3) {
            System.out.println("Retangulo medio azul sao diferenes objetos");
            if (shape2.equals(shape3)) {
                System.out.println("E eles sao identicos");
            } else {
                System.out.println("Mas eles nao sao identicos");
            }
        } else {
            System.out.println("Objetos retangulo sao o mesmo");
        }
    }
}
