package readPDF;

import com.itextpdf.text.pdf.PdfReader;
import com.itextpdf.text.pdf.parser.PdfTextExtractor;

public class ExtractDataFromPDF
{
	public static void main(String[] args)
	{
		try
		{
			PdfReader pr = new PdfReader("C:\\Users\\use\\workspace\\ReadPDF\\viewDec1426802405230253926.pdf");
			
			String str = PdfTextExtractor.getTextFromPage(pr, 1);
			System.out.println(str);
		}
		
		catch(Exception e){
			System.out.println("Exception caught"+ e);
		}
	}
}