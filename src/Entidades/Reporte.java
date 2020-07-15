package Entidades;

import Service.PackClientFinal;
import com.itextpdf.text.BadElementException;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Image;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
import java.awt.Desktop;
import java.awt.Font;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Reporte extends PackClientFinal {

    public static void reporte(String id) throws FileNotFoundException, DocumentException {

        FileOutputStream a = new FileOutputStream(id + ".pdf");
        Document b = new Document();
        PdfWriter.getInstance(b, a);

        b.open();

        Paragraph titulo = new Paragraph("\nHOTEL MONARCA\n");
        b.add(new Paragraph("\n"));
        titulo.setAlignment(1);
        titulo.getFont().setSize(13);
        titulo.getFont().setSize(Font.BOLD);
        b.add(titulo);

        Paragraph Subtitulo = new Paragraph("\nDATOS DEL CLIENTE\n");
        Subtitulo.getFont().setSize(13);
        Subtitulo.getFont().setSize(Font.BOLD);
        b.add(Subtitulo);
        b.add(new Paragraph("\n"));
        b.add(new Paragraph("NOMBRE: " + nombre.getText()));
        b.add(new Paragraph("DIRECCION: " + direccion.getText()));
        b.add(new Paragraph("TELEFONO MOVIL: " + movil.getText()));
        b.add(new Paragraph("EMAIL: " + correo.getText()));

        Paragraph Subtitulo2 = new Paragraph("\nRESERVACIÓN\n");
        Subtitulo2.getFont().setSize(13);
        Subtitulo.getFont().setSize(Font.BOLD);
        b.add(Subtitulo2);
        b.add(new Paragraph("\n"));
        b.add(new Paragraph("ENTRADA: " + entrada.getText()));
        b.add(new Paragraph("SALIDA: " + salida.getText()));
        b.add(new Paragraph("TOTAL: " + total.getText()));
        b.add(new Paragraph("HABITACIONES: " + habitacion.getText()));
        b.add(new Paragraph("\n"));
        b.add(new Paragraph("\n"));

        try {
            Image img = Image.getInstance("src/Images/fondo2.png");
            img.setAlignment(1);
            b.add(img);
        } catch (BadElementException ex) {
            Logger.getLogger(Reporte.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Reporte.class.getName()).log(Level.SEVERE, null, ex);
        }

        b.close();

    }

    public static void abrir(String id) {

        try {
            File path = new File(id + ".pdf");
            Desktop.getDesktop().open(path);
        } catch (IOException ex) {
            System.out.println("ERROR ABRIR REPORTE: " + ex);
        }

    }

}
