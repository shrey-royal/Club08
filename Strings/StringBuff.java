public class StringBuff {
    public static void main(String[] args) {
        StringBuffer s = new StringBuffer("StringBuffer");

        // System.out.println(s.hashCode());
        // System.out.println(s.length());
        // System.out.println(s.capacity());
        // s.ensureCapacity(30);
        // System.out.println(s.capacity());

        // s.append(" - New String");
        // System.out.println(s.hashCode());
        // s.insert(0, "ram ram, ");
        s.delete(0, 6);
        s.reverse();
        System.out.println(s);

        StringBuilder sbuild = new StringBuilder("StringBuilder");  //Not Thread Safe
        System.out.println(sbuild);
    }
}
/*
StringBuffer class is used to create mutable String objects.
Thread Safe (multiple thread can't access it simultaneously)

default capacity: 16

append(String s)
insert(int offset, String s)
replace(int startindex, int endindex, String s)
delete(int startindex, int endindex)
reverse()
capacity() - new cpaacity will be allocated to the string acc. to ((oldCapacity*2) + 2)
ensureCapacity(int minimumCapacity)

*/