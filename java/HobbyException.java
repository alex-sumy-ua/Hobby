    /**
     * Description of HobbyException - expansion of the class Exception.
     * Index out of range of the list.
     */
public class HobbyException extends Exception {

        public HobbyException() {
            super("Doing home-task #6");
        }

        public HobbyException(String descry) {
            super(descry);
        }

        public HobbyException(Throwable cause) {
            super(cause);
        }

        public HobbyException(String descry, Throwable cause) {
            super(descry, cause);
        }

}
