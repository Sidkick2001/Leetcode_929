//Задача Leetcode 929
import java.util.*;

public class testForLeetcood {

    /* ["test.email+alex@leetcode.com",
    "test.e.mail+bob.cathy@leetcode.com",
    "testemail+david@lee.tcode.com"] */

    static void numUniqueEmails(String[] emails) {
        List<String> localName = new ArrayList<>();
        List<String> domainName = new ArrayList<>();
        HashSet<Object> result = new HashSet<>();


        for (int i = 0; i < emails.length; i++) {
            for (int j = 0; j < emails[i].length(); j++) {
                if (emails[i].charAt(j) == '+') {
                    localName.add(emails[i].substring(0, emails[i].indexOf('+')));
                    break;
                }
                else if (emails[i].charAt(j) == '@') {
                    localName.add(emails[i].substring(0, emails[i].indexOf('@')));
                }
            }
        }

        for (int i = 0; i < emails.length; i++) {
            for (int j = 0; j < emails[i].length(); j++) {
                if (emails[i].charAt(j) == '@') {
                    domainName.add(emails[i].substring(j));
                    break;
                }
            }
        }

        localName = localName.stream().map(s -> s.replace(".", "")).toList();

        for (int i = 0; i < emails.length; i++) {
            result.add(localName.get(i) + domainName.get(i));
        }

        System.out.println(localName);
        System.out.println(domainName);
        System.out.println(result);
        System.out.println(result.size());

    }
}
