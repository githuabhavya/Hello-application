public class UC4{
    public ststic void main(String[] args) {
        String name;

        if (args.length == 0) {
            name = "World";
        } else {
            // code Snippet for HelloApp UC4:
            StringBuilder nameBuilder = new StringBuilder();
            for (int i = 0; i < args.length; i++) {
                nameBuilder.append(args[i]);
                if (i < args.length - 1) {
                    nameBuilder.append(", ");
                }
            }
            name = nameBuilder.toString(); //
        }

        System.out.ptintln("Hello, " + "!");
    }
}