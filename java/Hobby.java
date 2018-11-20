import java.util.Scanner;

public abstract class Hobby {

    private	byte 	number;		// hobby number
    private	boolean activity;	// hobby activity at the moment
    private	short	nMembers;	// members quantity
    private	char	region;		// member region
    private String  name;		// hobby name
    private	int     hours;		// everage activity hours
    private	long	tHours;		// total emaunt of hours of all members
    private	float	price;		// price per month
    private	double	sum;		// total in dollars

    /** Setter for number */
    public void setNumber(byte number) {
        if ( number >= 0) {
            this.number = number;
        }
    }

    /** Getter for number */
    public byte getNumber() {
        return number;
    }

    /** Setter for activity */
    public void setActivity(boolean activity) {
        this.activity = activity;
    }

    /** Getter for activity */
    public boolean getActivity() {
        return activity;
    }

    /** Setter for nMembers */
    public void setNMembers(short nMembers) {
        if ( nMembers >= 0 ) {
            this.nMembers = nMembers;
        }
    }

    /** Getter for nMembers */
    public short getNMembers() {
        return nMembers;
    }

    /** Setter for region */
    public void setRegion(char region) {
        this.region = region;
    }

    /** Getter for region */
    public char getRegion() {
        return region;
    }

    /** Setter for name */
    public void setName(String name) {
        this.name = name;
    }

    /** Getter for name */
    public String getName() {
        return name;
    }

    /** Setter for hours */
    public void setHours(int hours) {
        if ( hours >=0 ) {
            this.hours = hours;
        }
    }

    /** Getter for hours */
    public int getHours() {
        return hours;
    }

    /** Setter for tHours */
    public void setTHours(long tHours) {
        if ( tHours >= 0 ) {
            this.tHours = tHours;
        }
    }

    /** Getter for tHours */
    public long getTHours() {
        return tHours;
    }

    /** Setter for price */
    public void setPrice(float price) {
        if ( price >= 0 ) {
            this.price = price;
        }
    }

    /** Getter for price */
    public float getPrice() {
        return price;
    }

    /** Setter for sum */
    public void setSum(double sum) {
        if ( sum >= 0 ) {
            this.sum = sum;
        }
    }

    /** Getter for sum */
    public double getSum() {
        return sum;
    }

    /**
     * Constructor1 of the Hobby without parameters
     */
    public Hobby() {
    }

    /**
     * Constructor2 of the Hobby with parameters
     */
    public Hobby(byte number, boolean activity, short nMembers, char region,
                 String name, int hours, long tHours, float price, double sum) {

        this.number     =	number;
        this.activity	=	activity;
        this.nMembers	=	nMembers;
        this.region     =	region;
        this.name       =   name;
        this.hours      =	hours;
        this.tHours	    =	tHours;
        this.price	    =	price;
        this.sum	    =	sum;

    }

    /**
     * Constructor3 of the Hobby with parameters from keyboard
     */
    public Hobby(boolean activity) {

        this.number     +=	2;
        this.activity	=	activity;
        this.nMembers	+=	3;

        // Input from keyboard
        Scanner in = new Scanner(System.in);
        System.out.println("\n ==> Input region symbol:");
        this.region     =   in.next().charAt(0);

        // Input from keyboard
        System.out.println(" ==> Input hobby's name:");
        this.name       =   in.next();

        this.hours      =	hours;
        this.tHours	    =	tHours;

        // Input from keyboard
        System.out.println(" ==> Input hobby's price:");
        this.price      =   in.nextFloat();

        this.sum	    =	sum;
    }

    /** Output information about hobby */
    public abstract void tellAboutHobby(int a) throws HobbyException;

    public void f() {
        try {
            tellAboutHobby(10);
        }
        catch (HobbyException e) {
            throw new RuntimeException(e);
        }
    }

}