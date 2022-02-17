package utilities;

public class ExpectedDataSources {
    /**
     * bu metod event adres bolumunun hatali mesajalrinin expected data kaynagi
     * (sabit oldugu icin buraya koydum exceldede olabilirdi)
     * @return expectedEventAddressWarningMessages
     */
    public static String[] eventAddressWarningMessages(){
        String[] expectedData = {"Please enter a valid title.","Please enter a valid address.",
                "Please select a city.","Please select a state.","Please enter a valid postal/zip code."};
        return expectedData;
    }

    public static String[] eventCreateWarningMessages(){
        String[] expectedData = {"Please enter a valid title.", "Please select an address.",
                "Please fill this field", "Please enter a time.", "Please enter a valid duration.",
                "Please enter a valid attendee limit.", "Please enter valid terms and conditions."};
        return expectedData;
    }

    public static String [] invalidDataForUsername() {
        String[] expectedData = {"12@gmail.com", "urbanicfarm@gmail", "urbanicfarm@gmai.com", "urbanicfarm45@gmail.com"};
        return expectedData;
    }

    public static String [] invalidDataForPassword(){
        String [] expectedData = {"123456980","Uf45Uf45?","Uf45Uf45?","Uf45U5?"};
        return expectedData;
    };

    public static String[] aboutUsWarningMessages(){
        String[] expectedData = {"Please enter a valid name.",
                "Please enter a valid email address.","Please enter a message with at least 10 characters."};
        return expectedData;
    }
    public static String[]  invalidRegisterFirstAndLastName(){
        String[] expectedData = {"", "123","Îc", "?C","a"};
        return expectedData;
    }
    public static String[] invalidRegisterMiddleName(){
        String[] expectedData = {"123","Îc", "?C"};
        return expectedData;
    }
    public static String[] invalidRegisterEmail(){
        String[] expectedData = {"","rosekayacnsgmail.com","rosekayacns@gmailcom",
                "rose@kayacns@gmail.com","rosekayacns@gmail..com","rosekayacns@gmail.c","rosekayacns#@gmail.com"};
        return expectedData;
    }
    public static String[] invalidRegisterPassword(){
        String[] expectedData = {"","abcde123","ABCDE123", "ACDEFgde"};
        return expectedData;
    }
    public static String[] invalidZipCode(){
        String[] expectedData = {"1234","abcde", "*****"};
        return expectedData;
    }
    public static String[] invalidRegisterWarningMessages(){
        String[] expectedData = {"Please match the requested format.","Please fill out this field.",
                "Please lengthen this text to 2 characters or more (you are currently using 1 character).",
                "Passwords Don't Match","Please fill in this field.","Please match the format requested.",
                "Please include an '@' in the email address. 'rosekayacnsgmail.com' is missing an '@'.",
                "A part following '@' should not contain the symbol '@'.","'.' is used at a wrong position in 'gmail..com'."};
        return expectedData;
    }

    public static String [] eventCardTexts(){
        String [] expectedData = {"Date","Time","Attendee Limit", "Location","Available Seat"};
        return expectedData;
    }

    public static String [] attendedEventCardTexts(){
        String [] expectedData = {"Date","Time","Attendee Limit", "Location","Details", "Fee"};
        return expectedData;
    }

    //ek
    public static String [] addproductTexts(){
        String [] expectedData = {"You already have this product", "Product added."};
        return expectedData;
    }
}
