import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Test {

    static final Logger rootLogger = LogManager.getRootLogger();
    static final Logger hobbyLogger = LogManager.getLogger(Test.class);

    public static void main (String[] args) throws HobbyException{

        Football football1 = new Football();

        byte    number      = 1;                // number
        boolean activity    = true;             // activity
        short   nMembers    = 12;               // quantity of members
        char    region      = 'P';              // region 'P' - Poltava
        String  name        = "Football";       // hobby name
        String  clubName    = "Manchester";     // club name
        String  owner       = "Woodward";       // club owner
        int     hours       = 10;               // everage activity hours
        long    tHours      = 878;              // total hours of all members
        float   price       = 100.0f;           // price per month
        double  sum         = 1120.0d;          // total in dollars
        Football football2 = new Football(number, activity, nMembers, region, name,
                                          clubName, owner, hours, tHours, price, sum);

        Fishing fishing1 = new Fishing((byte)3, true, (short)36, 'K', "Shark",
                                       "Rabinovich", "Blue Lake", 56, 1024L,
                                       28F, 1000586D);

//        football1.tellAboutHobby(1);
//        football2.tellAboutHobby(2);

//        football1.f();
        hobbyLogger.info(football1.getName());
        hobbyLogger.info(football2.getNMembers());
        rootLogger.info("Root Logger: "  + football2.getActivity());

        //debug
        if (rootLogger.isDebugEnabled()) {
            rootLogger.debug("RootLogger: In debug message");
            hobbyLogger.debug("UserLogger in debug");
        }

        try {
            Football hobbyNull = new Football();
            hobbyNull.getName().toString();
        } catch (NullPointerException ex) {
            hobbyLogger.error("error message: " + ex.getMessage());
            hobbyLogger.fatal("fatal error message: " + ex.getMessage());
        }

        // Task #5, Point #3
        Hobby[] hobby = new Hobby[3];
        hobby[0] = football1;
        hobby[1] = football2;
        hobby[2] = fishing1;

        for (Hobby obj : hobby) {
            obj.tellAboutHobby(20);
        }

    }

    public void secondMethod () {
        System.out.println("This is a second method!!!");
    }

}