/* 
 * CreditCard.java - checks whether or not a credit card number is valid
 */



public class CreditCard {
    
    private String creditCardNumber;
    private boolean valid;
    private int code = 0;

// the private variables are being declared here

    public CreditCard(String n)
    {
        creditCardNumber = n;
        valid = true;
        //constructor is being built

    }
    
    public void check()
    {
    check1();
    if (valid == true)
    {
       check2();
    } 
        else 
    {
       getErrorCode();
    }
    if (valid == true)
    {
       check3();
    } 
        else
    {
       getErrorCode();
    }
    if (valid == true)
    {
       check4();
    } 
        else
    {
       getErrorCode();
    }
    if (valid == true)
    {
        check5();
    } 
        else 
    {
        getErrorCode();
    }
    if (valid == true)
    {
           check6();
    } 
        else 
    {
          getErrorCode();
    }
        //Goes through every check() method. If valid is false, the tests stop
    }
   
    private void check1(){        
    int firstDigit = Integer.parseInt(creditCardNumber.substring(0,1));
    
        if (firstDigit == 4)
        {
          valid = true;
          code = 0;
        } 
        else 
        {
          valid = false;
          code = 1;
        }
    //Gets the first digit to see if it's four or not.
    //If it is not, then the check method gives the error code, and tests stop.
    }
    
    private void check2()
    {
    int fourthDigit = Integer.parseInt(creditCardNumber.substring(3,4));
    int fifthDigit = Integer.parseInt(creditCardNumber.substring(5,6));
        
        if(!(fourthDigit- fifthDigit == 1))
        {
          valid = false;
          code = 2;
        } 
        else 
        {
          valid = true;
          code = 0;
        }
    // Calls the fourth and fifth digit with substring method.
    //The fourth digit is one less than the other, one has to be the difference.
    }
    
    private void check3()
    {
    int firstDigit = Integer.parseInt(creditCardNumber.substring(0,1));
    int fifthDigit = Integer.parseInt(creditCardNumber.substring(5,6));
    int ninthDigit = Integer.parseInt(creditCardNumber.substring(10,11));
    int productOfDigits = fifthDigit * firstDigit * ninthDigit;
        
        if(productOfDigits == 24)
        {
            valid = true;
            code = 0;
        } 
        else
        {
            valid = false;
            code = 3;
        }
    // Calls the first, fifth, and ninth digit and multiplies them together.
    // If the product is 24, then method checks out, and check3 is carried out.
    } 
    private void check4()
    {
    int firstDigit = Integer.parseInt(creditCardNumber.substring(0,1));
    int secondDigit = Integer.parseInt(creditCardNumber.substring(1,2));
    int thirdDigit = Integer.parseInt(creditCardNumber.substring(2,3));
    int fourthDigit = Integer.parseInt(creditCardNumber.substring(3,4));
        
    int sumOfFirstFour= firstDigit + secondDigit + thirdDigit + fourthDigit; 
        
    int fifthDigit = Integer.parseInt(creditCardNumber.substring(5,6));
    int sixthDigit = Integer.parseInt(creditCardNumber.substring(6,7));
    int seventhDigit= Integer.parseInt(creditCardNumber.substring(7,8));
    int eighthDigit= Integer.parseInt(creditCardNumber.substring(8,9));

    int sumOfNextFour = fifthDigit + sixthDigit + seventhDigit + eighthDigit;
 
    int ninthDigit  = Integer.parseInt(creditCardNumber.substring(10,11));
    int tenthDigit = Integer.parseInt(creditCardNumber.substring(11,12));
    int eleventhDigit = Integer.parseInt(creditCardNumber.substring(12,13));
    int twelfthDigit = Integer.parseInt(creditCardNumber.substring(13,14));
        
    int sumOfLastFour = ninthDigit + tenthDigit + eleventhDigit + twelfthDigit;
        
    int sumOfAll = sumOfFirstFour + sumOfNextFour + sumOfLastFour;
        
        if(sumOfAll % 4 == 0)
        {
            valid = true;
            code = 0;
        } 
        else 
        {
           valid = false;
            code = 4;
        }
    //Calls the digits and, in groups of four, adds them.
    //Takes the sum of all the digits and divides it by four.
    //If there is no remainder, that means sum is evenly divisible by four.
    } 
    private void check5()
    {
    int firstDigit = Integer.parseInt(creditCardNumber.substring(0,1));
    int secondDigit = Integer.parseInt(creditCardNumber.substring(1,2));
    int thirdDigit = Integer.parseInt(creditCardNumber.substring(2,3));
    int fourthDigit = Integer.parseInt(creditCardNumber.substring(3,4));
        
    int sumOfFour = firstDigit + secondDigit + thirdDigit + fourthDigit;
        
    int ninthDigit  = Integer.parseInt(creditCardNumber.substring(10,11));
    int tenthDigit = Integer.parseInt(creditCardNumber.substring(11,12));
    int eleventhDigit = Integer.parseInt(creditCardNumber.substring(12,13));
    int twelfthDigit = Integer.parseInt(creditCardNumber.substring(13,14));

    int sumOfLastFour = ninthDigit + tenthDigit + eleventhDigit + twelfthDigit;

        if (sumOfLastFour - sumOfFour == 1)
        {
            valid = true;
            code = 0;
            
        } 
        else 
        {
            valid =false;
            code = 5;
        }
    //Takes the sum of first four and last four digits of the credit card.
    //Takes the difference between the sum. If difference is one, it passes.
    }
    private void check6()
    {
    int twoDigits = Integer.parseInt(creditCardNumber.substring(0,2));
    int otherTwoDigits = Integer.parseInt(creditCardNumber.substring(7,9));
        
        if((twoDigits + otherTwoDigits == 100))
        {
            valid = true;
            code = 0;
        } 
        else
        {
            valid = false;
            code = 6 ;
        }
    //Calls two groups of two digits and adds them to see if they equal 100.
    //If they do, this check passes and code isn't changed.
    }
    public boolean isValid()
    {
       return valid;
    //Returns the value of the variable valid.
    }
    
    public int getErrorCode()
    {
       return code;
    }
    // Returns the value of variable code, based on what the check methods return.
}
