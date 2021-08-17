package flataf;

import com.sun.java.accessibility.util.Translator;
import nl.siegmann.epublib.domain.Book;
import nl.siegmann.epublib.domain.Resource;

import java.io.IOException;
import java.io.InputStream;

public class EpubDemo {
    public static void main(String[] args) {
        EpubReader reader=new EpubReader();
        InputStream in = getResource("重塑大脑回路.epub");
//        try {
//
//           // Book book = reader.readEpub(in);
//           // System.out.println(book.getContents());
//
//
//
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

    }

    private static InputStream getResource(String path ) {
        return Translator.class.getResourceAsStream( path );
    }

    private static Resource getResource(String path, String href ) {
        Resource resource = null;
        try {
            resource = new Resource( getResource( path ), href );
        } catch (IOException e) {
            e.printStackTrace();
        }
        return resource;
    }
}
