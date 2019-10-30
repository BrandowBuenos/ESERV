package interfaces;

import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.PlainDocument;

/**
 * Tratamento
 */
public class Tratamento extends PlainDocument {

    public void insertString(int offs, String str, AttributeSet a) throws BadLocationException {

        super.insertString(offs, str.replaceAll("[^0-9-]", ""), a);
    }
    
}