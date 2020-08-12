public class TypeConversionCasting_Example {
	public static void main(String[] args) {
		// 각 과목 점수
        int koreanScore = 86;
        int mathScore = 94;
        int scienceScore = 87;
        int computerScore = 100;

        // 평균 점수
        double average = (double) (koreanScore + mathScore + scienceScore + computerScore) / 4;
        System.out.println(average);
	}
}
