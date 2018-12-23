package ParserPack;

import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class ParserHandler extends DefaultHandler {

    //override the method from DefaultHandler class

    public void startDocument()throws SAXException{}
    public void endDocument() throws SAXException{}

    public void startElement()throws SAXException{}
    public void endElement (String url, String localName, String qName)throws SAXException{}
    public void characters (char ch[], int start, int length)throws SAXException{}



}
