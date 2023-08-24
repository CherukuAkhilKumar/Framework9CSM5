package genericlibraries;

	import java.sql.Date;
	import java.text.SimpleDateFormat;
	import java.util.Random;

	public class JavaUtility {
		public int generateRandomNum(int limit) {
			Random random = new Random();
			return random.nextInt(limit);
		}

		public String getCurrentTime() {
			Date date = new Date(0);
			SimpleDateFormat sdf = new SimpleDateFormat("dd_MM_yy_hh_mm_sss");
			return sdf.format(date);
		}
	}

