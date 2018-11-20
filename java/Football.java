public class Football extends Hobby {

    private String  owner;		// owner name
    private String  clubName;   // club name

    /** Setter for owner */
    public void setOwner(String owner) {
        this.owner = owner;
    }

    /** Getter for owner */
    public String getOwner() {
        return owner;
    }

    /** Setter for club name */
    public void setClubName(String clubName) {
        this.clubName = clubName;
    }

    /** Getter for club name */
    public String getClubName() {
        return clubName;
    }

    /**
     * Constructor1 of the Football without parameters
     */
    public Football() {
        super();
    }

    /**
     * Constructor2 of the Football with parameters
     */
    public Football(byte number, boolean activity, short nMembers, char region, String name,
                    String owner, String clubName, int hours, long tHours, float price, double sum) {

        super.setNumber(number);
        super.setActivity(activity);
        super.setNMembers(nMembers);
        super.setRegion(region);
        super.setName(name);
        this.owner      =   owner;
        this.clubName   =   clubName;
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
        System.out.println("--> Club name: "             +   this.getClubName());   // new field
        System.out.println("--> Everage activity time: " +   this.getHours());
        System.out.println("--> Total time of members: " +   this.getTHours());
        System.out.println("--> Price per month: "       +   this.getPrice());
        System.out.println("--> Total in dollars: "      +   this.getSum());

    }

}
