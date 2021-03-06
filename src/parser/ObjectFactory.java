//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.10.08 at 01:00:53 AM MSK 
//


package parser;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the generated package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _ShapesRectangle_QNAME = new QName("", "rectangle");
    private final static QName _ShapesTriangle_QNAME = new QName("", "triangle");
    private final static QName _ShapesSquare_QNAME = new QName("", "square");
    private final static QName _ShapesCircle_QNAME = new QName("", "circle");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: generated
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Shapes }
     * 
     */
    public Shapes createShapes() {
        return new Shapes();
    }

    /**
     * Create an instance of {@link Circle }
     * 
     */
    public Circle createCircle() {
        return new Circle();
    }

    /**
     * Create an instance of {@link Triangle }
     * 
     */
    public Triangle createTriangle() {
        return new Triangle();
    }

    /**
     * Create an instance of {@link Square }
     * 
     */
    public Square createSquare() {
        return new Square();
    }

    /**
     * Create an instance of {@link Rectangle }
     * 
     */
    public Rectangle createRectangle() {
        return new Rectangle();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Rectangle }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "rectangle", scope = Shapes.class)
    public JAXBElement<Rectangle> createShapesRectangle(Rectangle value) {
        return new JAXBElement<Rectangle>(_ShapesRectangle_QNAME, Rectangle.class, Shapes.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Triangle }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "triangle", scope = Shapes.class)
    public JAXBElement<Triangle> createShapesTriangle(Triangle value) {
        return new JAXBElement<Triangle>(_ShapesTriangle_QNAME, Triangle.class, Shapes.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Square }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "square", scope = Shapes.class)
    public JAXBElement<Square> createShapesSquare(Square value) {
        return new JAXBElement<Square>(_ShapesSquare_QNAME, Square.class, Shapes.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Circle }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "circle", scope = Shapes.class)
    public JAXBElement<Circle> createShapesCircle(Circle value) {
        return new JAXBElement<Circle>(_ShapesCircle_QNAME, Circle.class, Shapes.class, value);
    }

}
