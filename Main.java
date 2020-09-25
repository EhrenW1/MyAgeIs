class CheckMyAge {
  public static void main(String[] args) {
   int age= 15;
   int age2= age+1;
   int myBirthday= 617;
   int todaysDate= 921;
   // inserted variable for age, my birthday, and todays date.
   // Had to add another age variable for age because I could not get age to add one to itself in my print statment.
   if (myBirthday == todaysDate)
   //made if statment for id birthday is eaqual to todays date
   {
     System.out.println("If my birthday is " +myBirthday+ " and todays date is " +todaysDate+ " I am "  + age2 + " years old.");
     //wrote line of code that tells age if birthday is today, did this by adding another variable that add 1 to variable age.
    }else{
     System.out.println("Since my birth day is " +myBirthday+ " and today is " +todaysDate+ " I am still " +age+ " years old ");
     // else stament allows for a line to be printed saying i am still 15 if todaysdate is not the same as my birthday
   }
   }
  }
