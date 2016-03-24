package readPDF;

import com.itextpdf.text.pdf.PdfReader;
import com.itextpdf.text.pdf.parser.PdfReaderContentParser;
import com.itextpdf.text.pdf.parser.SimpleTextExtractionStrategy;
import com.itextpdf.text.pdf.parser.TextExtractionStrategy;

public class ExtractDataFromPDF
{
	public static void main(String[] args)
	{
		try
		{
			PdfReader pdfreader = new PdfReader("viewDec1426802405230253926.pdf");

			PdfReaderContentParser parser = new PdfReaderContentParser(pdfreader);

			TextExtractionStrategy strategy = null;

			for(int pagenumber=1;pagenumber<=pdfreader.getNumberOfPages();pagenumber++)
			{
				strategy = parser.processContent(pagenumber, new SimpleTextExtractionStrategy());
				System.out.println(strategy.getResultantText());
			}
		}

		catch(Exception e){
			System.out.println("Exception caught"+ e);
		}
	}
}