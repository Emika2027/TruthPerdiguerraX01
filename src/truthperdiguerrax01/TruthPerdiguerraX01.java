/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package truthperdiguerrax01;

/**
 *
 * @author emika
 */
public class TruthPerdiguerraX01 {
    
  private static void printStudentInfo(String name, int age, String birthday) {
      System.out.println("Name: " + name);
      System.out.println("Age: " + age);
      System.out.println("Birthday: " + birthday);
      System.out.println();
      
  }
    
    
    public static void main(String[] args) {
        // name, age, birthdays 
        String s1Name = "Emika";
        int s1Age = 16;
        String s1Birthday = "April 22";
        boolean s1sameBirthday = true;
        
        String s2Name = "Anne";
        int s2Age = 15;
        String s2Birthday = "April 22";
        boolean s2sameBirthday = true;
        
        String s3Name = "Chariz";
        int s3Age = 15;
        String s3Birthday = "March 20";
        boolean s3sameBirthday = true;
        
        System.out.println("Student 1");
        printStudentInfo(s1Name, s1Age, s1Birthday);

        System.out.println("Student 2");
        printStudentInfo(s2Name, s2Age, s2Birthday);

        System.out.println("Student 3");
        printStudentInfo(s3Name, s3Age, s3Birthday);
        
        int sum1 = s1Age + s2Age + s3Age; 
        int sum2 = s1Age - s2Age;
        
        System.out.println("Emika, Anne, and Chariz have a combined age of " + sum1 + ".");
        System.out.println("Emika is older than Anne and Chariz by " + sum2 + " year.");
        
        // Determine if students share the same birthday
        boolean s1AndS2SameBirthday = s1Birthday.equals(s2Birthday);
        boolean s1AndS3SameBirthday = s1Birthday.equals(s3Birthday);
        boolean s2AndS3SameBirthday = s2Birthday.equals(s3Birthday);

        // Print summary statements
        System.out.println(s1Name + " and " + s2Name + " have the same birthday: " + s1AndS2SameBirthday);
        System.out.println(s1Name + " and " + s3Name + " have the same birthday: " + s1AndS3SameBirthday);
        System.out.println(s2Name + " and " + s3Name + " have the same birthday: " + s2AndS3SameBirthday);
        
        
    }
    
}
