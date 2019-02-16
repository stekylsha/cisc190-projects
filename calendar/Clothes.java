public class Clothes
{
    public String dressMe(Month month)
    {
        String dressing = "I'm dressing in ";
        switch (month) {
            case DECEMBER:
            case JANUARY:
            case FEBRUARY:
                dressing += "warm stuff!";
                break;
            case MARCH:
            case APRIL:
                dressing += "light fleece.";
                break;
            case MAY:
                dressing += "kleenex.";
                break;
            case JUNE:
            case JULY:
            case AUGUST:
            case SEPTEMBER:
                dressing += "short shorts.";
                break;
            default:
                dressing += "clothing.";
        }
        return dressing;
    }

    public static void main(String[] args)
    {
        Clothes clothes = new Clothes();
        for (int i = 0 ; i < args.length ; i++) {
            System.out.println("I got " + args[i]);
            int m = Integer.parseInt(args[i]);
            Month[] months = Month.values();
            if (m >= months.length || m < 0) {
                System.out.println("there are only 11 months!");
                continue;
            }
            Month month = months[m];
            String s  = clothes.dressMe(month);
            System.out.println(s);
        }
    }
}
