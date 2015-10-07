package parser;

import javax.xml.bind.*;
import java.io.*;
import java.util.ArrayList;

public class Parser {


    public static void main(String[] args) throws JAXBException, IOException {
        ArrayList<JAXBElement<Shape>> shape = new ArrayList<>();

        try {
            File file = new File(args[0]);

            JAXBContext context = JAXBContext.newInstance(Shapes.class);
            Unmarshaller unmarshaller = context.createUnmarshaller();

            Object object = unmarshaller.unmarshal(file);

            Shapes shapes = (Shapes) object;


            for (int i = 0; i < shapes.getContent().size(); i++) {
                try {
                    shape.add((JAXBElement<Shape>) shapes.getContent().get(i));
                } catch (Exception e) {
                }
            }

            for (int i = 0; i < shape.size(); i++) {

                System.out.println((i + 1) + ":" + shape.get(i).getValue().getColor() + " - " + shape.get(i).getValue().getArea());
            }

        } catch (UnmarshalException e) {
            System.out.println("File not found");
        }


    }
}
