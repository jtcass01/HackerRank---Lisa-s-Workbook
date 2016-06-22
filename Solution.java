import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        int numberOfChapters=0, maxProbPP=0, numberOfProblems=0, page=0, chapterProb=0, result=0;
        Scanner scan = new Scanner(System.in);
        numberOfChapters = scan.nextInt();
        maxProbPP = scan.nextInt();
        for(int chapter_i=0; chapter_i<numberOfChapters; chapter_i++){
            chapterProb = scan.nextInt();
            for(int chapterProb_i = 0; chapterProb_i<chapterProb; chapterProb_i++){
                if(chapterProb_i == page){
                    result++;
                }
                if((chapterProb_i+1) % maxProbPP == 0 && chapterProb_i != (chapterProb-1)){
                    page++;
                }
            }
            page++;
        }
        System.out.println(result);
    }
}
