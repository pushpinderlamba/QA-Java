package example.reporting;

public class PDFReports implements Report {

	@Override
	public void generateReport(String reporttype) {
		
		System.out.println("Creating reports in PDF format");
	}

}
