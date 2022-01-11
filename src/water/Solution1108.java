package water;

public class Solution1108 {
    public String defangIPaddr(String address) {
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < address.length(); i++) {
            if (address.charAt(i) == '.') {
                stringBuffer.append("[.]");
            } else {
                stringBuffer.append(address.charAt(i));
            }
        }
        return stringBuffer.toString();
    }
}
