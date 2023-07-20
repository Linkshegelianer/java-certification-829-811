public class ExceptionHandling {

    try {
        // protected code
    } catch (Exception e) { // can have multiple catch blocks, subclass exception must go before superclass
        // if one catch block cannot be executed, the whole code won't compile
        // exception handler
    }

    multi-catch block => exceptions mustnt be related
}