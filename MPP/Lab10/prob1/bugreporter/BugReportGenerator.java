package prob1.bugreporter;

import java.io.*;
import java.util.List;

import java.util.logging.Logger;

import prob1.classfinder.*;

/**
 * This class scans the package lesson10.labs.prob2.javapackage
 * for classes with annotation @BugReport. It then generates a bug report
 * bugreport.txt, formatted like this:
 * <p>
 * Joe Smith
 * reportedBy:
 * classname:
 * description:
 * severity:
 * <p>
 * reportedBy:
 * classname:
 * description:
 * severity:
 * <p>
 * Tom Jones
 * reportedBy:
 * classname:
 * description:
 * severity:
 * <p>
 * reportedBy:
 * classname:
 * description:
 * severity:
 */
public class BugReportGenerator {
    private static final Logger LOG = Logger.getLogger(BugReportGenerator.class.getName());
    private static final String PACKAGE_TO_SCAN = "LabTen.prob1.javapackage";
    private static final String REPORT_NAME = "bug_report.txt";
    private static final String REPORTED_BY = "reportedBy: ";
    private static final String CLASS_NAME = "classname: ";
    private static final String DESCRIPTION = "description: ";
    private static final String SEVERITY = "severity: ";

    public void reportGenerator() {
        List<Class<?>> classes = ClassFinder.find(PACKAGE_TO_SCAN);

        String fileName = "bug_report.txt";
        try (PrintWriter printWriter = new PrintWriter(fileName)) {
            for (Class<?> aClass : classes) {
                if (aClass.isAnnotationPresent(BugReport.class)) {
                    BugReport annotation = aClass.getAnnotation(BugReport.class);
                    printWriter.println(annotation.assignedTo());
                    printWriter.println("Reported By: " + annotation.reportedBy());
                    printWriter.println("Class Name: " + aClass.getName());
                    printWriter.println("Description: " + annotation.description());
                    printWriter.println("Severity: " + annotation.severity() + "\n");
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new BugReportGenerator().reportGenerator();
    }


}
