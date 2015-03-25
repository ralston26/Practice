/*************************************************************************
 *  Compilation:  javac Permutations.java
 *  Execution:    java Permutations N
 *  
 *  Enumerates all permutations on N elements.
 *  Two different approaches are included.
 *
 *  % java Permutations 3
 *  abc
 *  acb
 *  bac 
 *  bca
 *  cab
 *  cba
 *
 *************************************************************************/

public class Permutations {

    // print N! permutation of the characters of the string s (in order)
    public  static void perm1(String s) { perm1("", s); }
    private static void perm1(String prefix, String s) {
        int N = s.length();
        if (N == 0) System.out.println(prefix);
        else {
            for (int i = 0; i < N; i++)
            {
            	//System.out.println(prefix+s.charAt(i)+","+s.substring(0, i) + s.substring(i+1, N));
            	perm1(prefix + s.charAt(i), s.substring(0, i) + s.substring(i+1, N));
            }
        }

    }

  


    public static void main(String[] args) {
       
       String alphabet = "abc";
       int N = alphabet.length();
       //String elements = alphabet.substring(0, N);
       //System.out.println(elements);
       perm1("",alphabet);
  
      // perm2(elements);
    }
}