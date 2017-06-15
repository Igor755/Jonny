import com.sun.org.apache.xpath.internal.SourceTree;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;

import static java.awt.Color.black;
//http://info.javarush.ru/translation/2015/10/13/15-%D0%B2%D0%BE%D0%BF%D1%80%D0%BE%D1%81%D0%BE%D0%B2-%D0%B4%D0%BB%D1%8F-%D1%81%D0%BE%D0%B1%D0%B5%D1%81%D0%B5%D0%B4%D0%BE%D0%B2%D0%B0%D0%BD%D0%B8%D1%8F-%D1%80%D0%B0%D0%B7%D1%80%D0%B0%D0%B1%D0%BE%D1%82%D1%87%D0%B8%D0%BA%D0%BE%D0%B2-%D0%BE%D1%82%D0%BD%D0%BE%D1%81%D0%B8%D1%82%D0%B5%D0%BB%D1%8C%D0%BD%D0%BE-Enum-%D0%B2-%D0%94%D0%B6%D0%B0%D0%B2%D0%B5-%D1%81-%D0%BE%D1%82%D0%B2%D0%B5%D1%82%D0%B0%D0%BC%D0%B8-.html
//Хортсман, Глава 1, страница 77, а также глава 5




/**
 * Created by i.metlin on 14.06.2017.
 */
public class EnumInJava {

    enum Country {Russia, Ukraine, China, USA}


    public static void main(String[] args){
        //JFrame frame = new ImageViewerFrame();
       //enum Country {Russia, Ukraine, China, USA}

        Country Strana1 = Country.China;
        Country Strana2 = Country.USA;

        System.out.println(Strana1);
        System.out.print(Strana2);

    }
}
