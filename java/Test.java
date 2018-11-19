import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Test {

    static final Logger rootLogger = LogManager.getRootLogger();
    static final Logger hobbyLogger = LogManager.getLogger(Hobby.class);

    public static void main (String[] args) throws HobbyException{

        Hobby hobby1 = new Hobby();

        byte    number      = 1;                // number
        boolean activity    = true;             // activity
        short   nMembers    = 12;               // quantity of members
        char    region      = 'P';              // region 'P' - Poltava
        String  name        = "Swimming";       // hobby's name
        int     hours       = 10;               // everage activity hours
        long    tHours      = 878;              // total hours of all members
        float   price       = 100.0f;           // price per month
        double  sum         = 1120.0d;          // total in dollars
        Hobby hobby2 = new Hobby(number, activity, nMembers, region,
                name, hours, tHours, price, sum);

        Hobby hobby3 = new Hobby(activity);

        hobby1.tellAboutHobby(1);
        hobby2.tellAboutHobby(2);
        hobby3.tellAboutHobby(3);

        hobby1.f();

        hobbyLogger.info(hobby1.getName());
        hobbyLogger.info(hobby2.getNMembers());
        rootLogger.info("Root Logger: "  + hobby3.getActivity());

        //debug
        if (rootLogger.isDebugEnabled()) {
            rootLogger.debug("RootLogger: In debug message");
            hobbyLogger.debug("UserLogger in debug");
        }

        try {
            Hobby hobbyNull = new Hobby();
            hobbyNull.getName().toString();
        } catch (NullPointerException ex) {
            hobbyLogger.error("error message: " + ex.getMessage());
            hobbyLogger.fatal("fatal error message: " + ex.getMessage());
        }

    }

    public void secondMethod () {
        System.out.println("This is a second method!!!");
    }

}