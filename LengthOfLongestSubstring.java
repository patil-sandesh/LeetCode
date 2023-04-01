public class LengthOfLongestSubstring {
public static void main(String[] args) {
        System.out.println("Hello World!");
        int[]test=new int[]{2,7,11,15};
        
        System.out.println(LengthOfLongestSubstring.lengthOfLongestSubstring("abcabca"));
    }
    public static int lengthOfLongestSubstring(String s) {
      int start=0;
      int end=0;
      int mlength=0;
      Set<Character> set=new HashSet();
      while(end<s.length()){
          if(!set.contains(s.charAt(end))){
              set.add(s.charAt(end));
              end++;
              mlength=Math.max(mlength,set.size());
          }
          else{
              set.remove(s.charAt(start));
              start++;
          }
      }
      return mlength;
    }
}
