package readingLogFiles;

import java.util.*;
import edu.duke.*;

public class LogAnalyzer
{
     private ArrayList<LogEntry> records;
     
     public LogAnalyzer() {
         // complete constructor
         records = new ArrayList<LogEntry>();
     }
        
     public void readFile() {
         // complete method
         FileResource fr = new FileResource();
         for (String line : fr.lines()) {
             WebLogParser parser = new WebLogParser();
             LogEntry newEntry = parser.parseEntry(line);
             records.add(newEntry);
         }
     }
        
     public void printAll() {
         for (LogEntry le : records) {
             System.out.println(le);
         }
     }
     
     
}
