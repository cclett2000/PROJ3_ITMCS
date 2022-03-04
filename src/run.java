//+++++++++++++++++++++++++++++++++++++++++++++++++++++++++
// Name: run.java
// Function: send data to, and execute linked classes
// Programmer: Charles Lett Jr.
// Last Update: 3/04/22
//+++++++++++++++++++++++++++++++++++++++++++++++++++++++++


public class run {
    public static void main (String[] args){
        // data
        char[] set1 = {'a', 'b', 'c', 'e', 'f'};
        char[] set2 = {'d', 'e', 'f', 'g'};

        // instantiate class
        UnSymProcessor USP = new UnSymProcessor();

        // run class func.
        USP.run(set1, set2);
    }
}
