public class TipeDataBukanPrimitif {
    public static void main(String[] args) {
        Integer iniInteger = 100;
        Long iniLong = 1000L;

        Byte iniByte;
        iniByte = 100;

        int iniInt = 100;
        Integer iniObject = iniInt;
        short iniShort = iniObject.shortValue();

        System.out.println(iniInteger);
        System.out.println(iniLong);
        System.out.println(iniByte);
        System.out.println(iniShort);
    }
}
