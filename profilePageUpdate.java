//softwaredev work folder DELETE ME///////
//
////
///
import java.util.Scanner;


public class profilePage {

public static void main(String[] args){
updater();}


static void updater(){

    String name = "Jane Doe";                
    String email = "jdoe@gmail.com";             //default values to display to the user initially
    String dob = "03/06/09";
    String aboutme = "I love coding";
    String address = "123 Schoology St";
    String phone = "123-456-7890";
    String cup; //container

//---------------------------------------------------------------------------------------------------

Scanner userInput = new Scanner(system.in);
String yOrN; // for getting yes or no answers 
do {//start 
System.out.printf("Welcome to your profile!%n Would you like to view or edit your profile?(y/n)");
yOrN= userInput.next();

//----------------------------------------------------------------------------------------------

while	(! (     (yOrN.equals("y")) ||    // while loop for making sure user inputs y or n
                 (yOrN.equals("n")) ))

{System.out.printf("y or n needed(you inputted %s)%nPlease try again: ", yOrN);
yOrN = userInput.next();}
///////////////////////////////
if (yOrN.equals("n"))
{System.out.printf("%nHave a wondeful day!");}
else {//profile display and update prompt
    printf ("********************%nWELCOME%nName: %s%nEmail: %s%nDoB: %s%naboutMe: %s%nAddress: %s%nPhone: %s%n********************" , name, email, dob, aboutme, address, phone);
    System.out.printf("%nOkay, heres your profile ... which field would you like to change?(name/email/DoB/aboutMe/address/phone)");}

//-------------------------------------------------------------------------------------------------
//this part handles each case of edits to be made by category---------------------------------------

cup = userInput.next(); 
switch (cup) {
    case name : printf("What would you like to change your name to?; it was %s", name);
                name = userInput.next();
                break;
    case email: printf("What would you like to change your email to?; it was %s", email);
                email = userInput.next();
                break;
    case dob :  printf("What would you like to change your Date of Birth to?(mm/dd/yy); it was %s", dob);
                email = userInput.next();
                break;
    case aboutme :  printf("What would you like to change your about me section to?; it was %s", aboutme);
                    aboutme = userInput.next();
                    break;
    case address :  printf("What would you like to change your address section to?; it was %s", address);
                    address = userInput.next();
                    break;
    case phone :    printf("What would you like to change your phone section to?; it was %s", phone);
                    phone = userInput.next();
                    break;
    default : printf ("Incorrect Input please Restart the program"); break;}
//--------------------------------------------------------------------------------------------------
printf ("********************%nWELCOME%nName: %s%nEmail: %s%nDoB: %s%naboutMe: %s%nAddress: %s%nPhone: %s%n********************" , name, email, dob, aboutme, address, phone);
printf("Here is your profile, would you like to make any more changes?"); 
yOrN = userInput.next();


} while (yOrN.equals(y)); //end of do while 


}










}