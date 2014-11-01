package org.xatu.loteria;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class Loteria {

    public static void main(String[] args) {

        try {

            //Conexion y extracion de la pagina
            Document doc = Jsoup.connect("http://www.leidsa.com/").userAgent("Mozilla/5.0 (Windows NT 6.1; WOW64) AppleWebKit/537.31 (KHTML, like Gecko) Chrome/26.0.1410.64 Safari/537.31")
                    .get();
            
            /* System.out.println(doc.select("div[class=fecha-loto]").text());
            System.out.println(doc.select("div[class=lotomas-label]").text()); */
            
            //Traer los resultados
            Elements idresultados = doc.select("div[id=numerosLoto]");
            Elements resultado = idresultados.select("li");

            for (Element e : resultado) {
                // imprimirlos
                System.out.println(e.text());
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
