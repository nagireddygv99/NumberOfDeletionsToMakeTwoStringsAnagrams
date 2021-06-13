# NumberOfDeletionsToMakeTwoStringsAnagrams
# MakeStringsToAnagrams.java
The program is to find the number of character deletions required to make the two given strings anagrams.
here the method getNumberCount is the method which takes the two strings as input parameters.

                      public static int getNumberCount(String one, String two) {}
                      
one, two are the Strings, while we calling the method we have to pass the arguments.
Here I make use of Map and HashMap as Character as key and Integer as value. 

                                      Map<Character, Integer> map = new HashMap<>()

First the iterations are over the String one.For each character if it's present in the map, the value is incremented by 1 and if not,
putting the character and value 1.
                      
                          for(int i=0;i<one.length();i++) {
                            if(map.get(one.charAt(i))==null) {
                              map.put(one.charAt(i), 1);
                            }
                            else {
                              int pres = map.get(one.charAt(i));
                              map.put(one.charAt(i), pres+1);
                            }
                        }

Now iterations over the second string two.
for each character in string two, if it's present in map the count decremented by 1.If its not present c is incremented by 1 which gives the final result.

                                  for(int i=0;i<two.length();i++) {
                                    if(map.containsKey(two.charAt(i))) {
                                      int pres = map.get(two.charAt(i));
                                      map.put(two.charAt(i), pres-1);
                                    }
                                    else {
                                      c++;
                                    }
                                }
                                
Now the values in the map are added to the c and retured.

                                for(int i:map.values()) {
                                  c+=i;
                                }
                                return c;
                                
                                
                                
Here I just mentioned the main method too.
