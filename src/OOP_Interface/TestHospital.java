package OOP_Interface;

public class TestHospital {

	public static void main(String[] args) {
		
		FortisHospital fh = new FortisHospital();
		fh.cardioServices();
		fh.neuroServices();
		fh.dentalServices();
		fh.oncologyServices();
		fh.entServices();
		
		fh.emergencyServices();
		
		fh.medicalInsurance();
		fh.medicalTraining();
		fh.medicalRD();
		fh.medicalNews();
		fh.covidVaccination();
		
		System.out.println(fh.min_fee);
		System.out.println(USMedical.min_fee);
		System.out.println(fh.min_fee);
		
		USMedical.taxCalculation();
		FortisHospital.taxCalculation();
		
		
		fh.getMedicalServices();
		
		//Not Applicable
		//USMedical us = new USMedical();
		
		//TopCasting
		//child class object can be referred by parent interface reference variable
		
		USMedical us = new FortisHospital();
		us.cardioServices();
		us.neuroServices();
		us.physioServices();
		us.emergencyServices();
		
		UKMedical uk = new FortisHospital();
		uk.dentalServices();
		uk.entServices();
		uk.emergencyServices();
		
		IndianMedical in = new FortisHospital();
		in.gynicServices();
		in.oncologyServices();
		in.orthoServices();
		in.emergencyServices();
		
		//DownCasting ? at compile time ?
		//FortisHospital fh1 = new USMedical();  ===Not allowed
		
		//use constants:
		System.out.println((Constants.DEFAULT_TIME_OUT));
		System.out.println((Constants.OK_MESSG_200));
		

	}

}
