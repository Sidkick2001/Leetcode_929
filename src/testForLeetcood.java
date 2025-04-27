//Задача Leetcode 929
import java.util.ArrayList;
import java.util.HashMap;
import java.util.stream.Collectors;

public class testForLeetcood {

    /* ["test.email+alex@leetcode.com",
    "test.e.mail+bob.cathy@leetcode.com",
    "testemail+david@lee.tcode.com"] */

    static public void numUniqueEmails(String[] emails) {
        StringBuilder localName = new StringBuilder();
        StringBuilder domainName = new StringBuilder();

        for (int i = 0; i < emails.length; i++) {
            for (int j = 0; j < emails[i].length(); j++) {
                if (emails[i].charAt(j) == '+') {
                    break;
                } else {
                    localName.append(emails[i].charAt(j));
                }
            }
        }

        for (int i = 0; i < emails.length; i++) {
            for (int j = 0; j < emails[i].length(); j++) {
                if (emails[i].charAt(j) == '@') {
                    domainName.append(emails[i].substring(j + 1));
                    break;
                }
            }
        }


        

        HashMap<Integer, String> result = new HashMap<>(); //toDo

        int test = localName.indexOf("i"); //На подумать
        System.out.println(test);


        System.out.println(localName);
        System.out.println(domainName);
    }
}
