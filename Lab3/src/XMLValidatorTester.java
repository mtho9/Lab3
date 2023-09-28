/**
 * The XMLValidatorTester class evaluates the precision of an XML validator
 * by testing it against a set of sample XML strings.
 *
 * @author JuliaKratzer
 * @version September 27th
 */
public class XMLValidatorTester {
	
/**
 * Calculates the precision of an XML validator
 * @param validator The XML validator to be tested.
 * @param stack     The stack used for XML validation.
 * @return The precision of the XML validator as a double value between 0 and 1.
 */	
    public double precision(IXMLValidator validator, IStack stack) {
        int correctResults = 0;
        int totalTests = 5;

        String[] xmlStrings = {
            "<name>John Doe</name>",
            "<document><header>info</header><body>content</body></document>",
            "<book><title>Java Programming</title><author>John Doe</author></book>",
            "<person><name>Julia</name><age>19</age></person>",
            "<order><item>item1</item><item>item2</item></order>"
        };

        for (String xmlString : xmlStrings) {
            boolean result = validator.validateXML(stack, xmlString);

            if (result) {
                correctResults++;
            }
        }
        double precision = (double) correctResults / totalTests;
        return precision;
    }
    
}