///Author Name: Sabina Oliveira
//Date: 5/29/2022
//Program Name: TextAnalyzer_Oliveira
//Purpose: Module 3 Assignment (Write a text analyzer)

import java.io.*;
import java.util.*;

public class TextAnalyzer_Oliveira
    {
        public static void main(String[] args) throws IOException {
            //read the text file
            File file = new File("C:\\Users\\sabin\\OneDrive\\Documents\\Seminole State\\CDA 3100\\filetoanalyze.txt");
           // use the buffer reader
            BufferedReader br = new BufferedReader(new FileReader(file));
            String line;
            // create map to store key pair
            Map<String, Long> counts = new HashMap<>();
            while ((line = br.readLine()) != null) {
                // recognize the word splitting
                String[] words = line.split("[\\s.;,?:!()\"]+");
                for (String word : words) {
                    word = word.trim();
                    if (word.length() > 0) {
                        if (counts.containsKey(word)) {
                            counts.put(word, counts.get(word) + 1);
                        } else {
                            counts.put(word, 1L);
                        }
                    }
                }
            }
            // print the list
            for (Map.Entry<String, Long> entry : counts.entrySet()) {
                System.out.println(entry.getKey() + " : " + entry.getValue());
            }
            br.close();
        }
    }

