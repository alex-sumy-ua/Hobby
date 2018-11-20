public class Fishing extends Hobby {

    private String  owner;		// owner name
    private String  lakeName;   // lake name

    /** Setter for owner */
    public void setOwner(String owner) {
        this.owner = owner;
    }

    /** Getter for owner */
    public String getOwner() {
        return owner;
    }

    /** Setter for lake name */
    public void setLakeName(String lakeName) {
        this.lakeName = lakeName;
    }

    /** Getter for lake name */
    public String getLakeName() {
        return lakeName;
    }

    /**
     * Constructor1 of the Football without parameters
     */
    public Fishing() {
        super();
    }

    /**
     * Constructor2 of the Football with parameters
     */
    public Fishing(byte number, boolean activity, short nMembers, char region, String name,
                    String owner, String lakeName, int hours, long tHours, float price, double sum) {

        super.setNumber(number);
        super.setActivity(activity);
        super.setNMembers(nMembers);
        super.setRegion(region);
        super.setName(name);
        this.owner      =   owner;
        this.lakeName   =   lakeName;
        this.setHours(hours);
        this.setTHours(tHours);
        this.setPrice(price);
        this.setSum(sum);

    }

    /** Output information about hobby */
    public  void tellAboutHobby(int a) throws HobbyException {

        if (a < 0) throw new HobbyException();
        System.out.println("\n--> Hobby number: "        +   this.getNumber());
        System.out.println("--> Activity now: "          +   this.getActivity());
        System.out.println("--> Quantity of members: "   +   this.getNMembers());
        System.out.println("--> Region symbol: "         +   this.getRegion());
        System.out.println("--> Hobby's name: "          +   this.getName());
        System.out.println("--> Club's owner: "          +   this.getOwner());      // new field
        System.out.println("--> Lake name: "             +   this.getLakeName());   // new field
        System.out.println("--> Everage activity time: " +   this.getHours());
        System.out.println("--> Total time of members: " +   this.getTHours());
        System.out.println("--> Price per month: "       +   this.getPrice());
        System.out.println("--> Total in dollars: "      +   this.getSum());

    }

}
