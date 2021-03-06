package report;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;
import net.masterthought.cucumber.presentation.PresentationMode;
import net.masterthought.cucumber.sorting.SortingMethod;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class CucumberReportBuilder {
    public static String buildNumber = System.getProperty("buildNumber");
    public static void main(String[] args) {
        generateReport();
    }

    /**
     * Generates the actual reports
     * @see <a href="https://github.com/damianszczepanik/cucumber-reporting">HTML Cucumber Reports</a>
     */
    public static void generateReport(){
        File reportOutputDirectory = new File("target");
        List<String> jsonFiles = new ArrayList<String>();
        jsonFiles.add(reportOutputDirectory.getAbsolutePath() + "/cucumber.json");
        String projectName = "FLOW";
        Configuration configuration = new Configuration(reportOutputDirectory, projectName);
        configuration.setBuildNumber("#"+buildNumber);
        configuration.setSortingMethod(SortingMethod.NATURAL);
        configuration.addPresentationModes(PresentationMode.EXPAND_ALL_STEPS);
        configuration.setTrendsStatsFile(new File("target/trends.json"));
        ReportBuilder reportBuilder = new ReportBuilder(jsonFiles, configuration);
        reportBuilder.generateReports();

    }
}
