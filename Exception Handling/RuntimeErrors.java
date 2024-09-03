class RuntimeErrors {
    public static void main(String[] args) {
        System.out.println("Before Exception");
        String str = null;
        /*
        try {
            // System.out.println(2/0);
            System.out.println(str.length());
        } catch (ArithmeticException e) {
            // System.out.println(e);
            e.printStackTrace();
            // System.out.println(e.getMessage());
        } catch (NullPointerException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
        */

        try {
            System.out.println(2/0);
        } 
        // catch(Exception e) {
        //     e.printStackTrace();
        // } 
        finally {
            System.out.println("Finally!!!");
        }

        System.out.println("After Exception");
    }
}