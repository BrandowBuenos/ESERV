package interfaces;


import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.PlainDocument;

public class Tratamento2 extends PlainDocument {
    	 
private static final long serialVersionUID = 1L;
	 
public void insertString(int offs, String str, javax.swing.text.AttributeSet a) throws BadLocationException {

    // normalmente apenas uma letra � inserida por vez,
    // mas fazendo assim tamb�m previne caso o usu�rio
    // cole algum texto
    for (int i = 0; i < str.length(); i++)
        // Se n�o for uma letra retorna zero
        if (!Character.isLetter(str.charAt(i)))
            return;

    // Aceita apena 1 letra digitada por vez
    int tamMax = 100;
    if ((getLength() + str.length()) <= tamMax)

        super.insertString(offs, str, a);

}
	    
}