package leetcode2018;

public class StudentAttendanceRecordI {
	public boolean checkRecord(String s) {
		if(s.length() == 0)  return true;
		int i=0;
		int j=0;
		
		for(char c: s.toCharArray()){
		    if(c!='L') j=0;
		    if(c=='A') i++;
		    if(c=='L') j++;
		    if(j>2) return false;
		}
		if(i>1) return  false;
		return true;
    }
}
