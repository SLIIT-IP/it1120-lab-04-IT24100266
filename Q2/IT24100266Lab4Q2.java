public class IT24100266Lab4Q2{
     public static void main(String[]args){

        double exammarks = (90.0);
        double labsubmissionmarks = (80.0);
        double exampercentage = (50.0);
        double labpercentage = (50.0);
        double finalexammarks = (exammarks*exampercentage/100) + (labsubmissionmarks*labpercentage/100);

            System.out.println("Final Exam Mark is :" + finalexammarks);

           if (0>exammarks||exammarks>100){
             System.out.println("Terminating program");}

        if(exampercentage!=50){
          System.out.println(" Terminating program");}

        if(labpercentage!=50){
          System.out.println("Terminating program");}


       }
}         