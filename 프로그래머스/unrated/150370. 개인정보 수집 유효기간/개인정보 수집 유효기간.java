import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Solution {
    public List<Integer> solution(String today, String[] terms, String[] privacies) {
       List<Integer> answer = new ArrayList<>();
        Map<String, Integer> termMap = new HashMap<>();
        Calendar privacie = Calendar.getInstance();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd");
        Calendar todayCal = Calendar.getInstance();
        
        try {
			todayCal.setTime(sdf.parse(today));
		} catch (ParseException e1) {
			e1.printStackTrace();
		}
        
        for (int i = 0; i < terms.length; i++) {
        	termMap.put(terms[i].substring(0, 1), Integer.parseInt(terms[i].substring(2)));
        }
        
        for (int i = 0; i < privacies.length; i++) {
        	try {
        		privacie.setTime(sdf.parse(privacies[i].substring(0, 10)));
			} catch (ParseException e) {
				e.printStackTrace();
			}
        	
        	privacie.add(Calendar.MONTH, termMap.get(privacies[i].substring(11)));
        	
        	if (privacie.get(Calendar.DATE) > 28) {
        		privacie.add(Calendar.DATE, 28);
        	}
        	
        	if (todayCal.after(privacie) || todayCal.equals(privacie)) {
        		answer.add(i + 1);
        	}
        }
 
        return answer;
    }
}