//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.10.08 at 01:00:53 AM MSK 
//


package parser;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for square complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="square">
 *   &lt;complexContent>
 *     &lt;extension base="{}shape">
 *       &lt;sequence>
 *         &lt;element name="side" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "square", propOrder = {
    "side"
})
public class Square
    extends Shape
{
    @Override
    public Float getArea() {
        return area = (float)Math.pow(side,2);
    }

    protected float side;

    /**
     * Gets the value of the side property.
     * 
     */
    public float getSide() {
        return side;
    }

    /**
     * Sets the value of the side property.
     * 
     */
    public void setSide(float value) {
        this.side = value;
    }

}
