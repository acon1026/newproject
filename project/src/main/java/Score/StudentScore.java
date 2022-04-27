package Score;

public class StudentScore {
	String score_num;
	int snumber=0;
	int kor=0;
	int eng=0;
	int math=0;
	int total =0;
	double avg =0;
	
	
	
	public StudentScore(String score_num, int snumber, int kor, int eng, int math, int total, double avg) {
		super();
		this.score_num = score_num;
		this.snumber = snumber;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		this.total = total;
		this.avg = avg;
	}
	public StudentScore(String score_num, int snumber, int kor, int eng, int math) {
		super();
		this.score_num = score_num;
		this.snumber = snumber;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		this.total =this.kor+this.eng+this.math;
		this.avg= this.total/3.0;
	}
	public String getScore_num() {
		return score_num;
	}
	public int getSnumber() {
		return snumber;
	}
	public int getKor() {
		return kor;
	}
	public int getEng() {
		return eng;
	}
	public int getMath() {
		return math;
	}
	public int getTotal() {
		return total;
	}
	public double getAvg() {
		return avg;
	}
	@Override
	public String toString() {
		return "[snumber= " + snumber + ", kor= " + kor + ", eng= " + eng
				+ ", math= " + math + ", total= " + total + ", avg= " + avg + "]";
	}
	
	
	
	
	
	

}
