package pe.edu.smt.tes.rbc.retrieve;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;

import pe.arc.app.util.exportation.UtilCsv;
import pe.edu.smt.tes.domain.RBCCaso;

public class RBCDataSource {

	/*
	 * public static List<RBCCase> getDataSet(String path, String separator) throws
	 * FileNotFoundException, IOException { return UtilCsv.readFileCsv(path,
	 * separator).stream().filter(element -> !element[0].equals("id")) .map(element
	 * -> { RBCCase caso = new RBCCase();
	 * 
	 * caso.setId(Integer.parseInt(element[0]));
	 * caso.setGender(Integer.parseInt(element[1]));
	 * caso.setAge(Integer.parseInt(element[2]));
	 * 
	 * caso.setD_5100_0(Integer.parseInt(element[3]));
	 * caso.setD_5100_1(Integer.parseInt(element[4]));
	 * caso.setD_5100_2(Integer.parseInt(element[5]));
	 * caso.setD_5100_3(Integer.parseInt(element[6]));
	 * caso.setD_5100_4(Integer.parseInt(element[7]));
	 * caso.setD_5100_8(Integer.parseInt(element[8]));
	 * caso.setD_5100_9(Integer.parseInt(element[9]));
	 * 
	 * caso.setD_5101_0(Integer.parseInt(element[10]));
	 * caso.setD_5101_1(Integer.parseInt(element[11]));
	 * caso.setD_5101_2(Integer.parseInt(element[12]));
	 * caso.setD_5101_3(Integer.parseInt(element[13]));
	 * caso.setD_5101_4(Integer.parseInt(element[14]));
	 * caso.setD_5101_8(Integer.parseInt(element[15]));
	 * caso.setD_5101_9(Integer.parseInt(element[16]));
	 * 
	 * caso.setD_5102_0(Integer.parseInt(element[17]));
	 * caso.setD_5102_1(Integer.parseInt(element[18]));
	 * caso.setD_5102_2(Integer.parseInt(element[19]));
	 * caso.setD_5102_3(Integer.parseInt(element[20]));
	 * caso.setD_5102_4(Integer.parseInt(element[21]));
	 * caso.setD_5102_8(Integer.parseInt(element[22]));
	 * caso.setD_5102_9(Integer.parseInt(element[23]));
	 * 
	 * caso.setD_5200_0(Integer.parseInt(element[24]));
	 * caso.setD_5200_1(Integer.parseInt(element[25]));
	 * caso.setD_5200_2(Integer.parseInt(element[26]));
	 * caso.setD_5200_3(Integer.parseInt(element[27]));
	 * caso.setD_5200_4(Integer.parseInt(element[28]));
	 * caso.setD_5200_8(Integer.parseInt(element[29]));
	 * caso.setD_5200_9(Integer.parseInt(element[30]));
	 * 
	 * caso.setD_5201_0(Integer.parseInt(element[31]));
	 * caso.setD_5201_1(Integer.parseInt(element[32]));
	 * caso.setD_5201_2(Integer.parseInt(element[33]));
	 * caso.setD_5201_3(Integer.parseInt(element[34]));
	 * caso.setD_5201_4(Integer.parseInt(element[35]));
	 * caso.setD_5201_8(Integer.parseInt(element[36]));
	 * caso.setD_5201_9(Integer.parseInt(element[37]));
	 * 
	 * caso.setD_5202_0(Integer.parseInt(element[38]));
	 * caso.setD_5202_1(Integer.parseInt(element[39]));
	 * caso.setD_5202_2(Integer.parseInt(element[40]));
	 * caso.setD_5202_3(Integer.parseInt(element[41]));
	 * caso.setD_5202_4(Integer.parseInt(element[42]));
	 * caso.setD_5202_8(Integer.parseInt(element[43]));
	 * caso.setD_5202_9(Integer.parseInt(element[44]));
	 * 
	 * caso.setD_5203_0(Integer.parseInt(element[45]));
	 * caso.setD_5203_1(Integer.parseInt(element[46]));
	 * caso.setD_5203_2(Integer.parseInt(element[47]));
	 * caso.setD_5203_3(Integer.parseInt(element[48]));
	 * caso.setD_5203_4(Integer.parseInt(element[49]));
	 * caso.setD_5203_8(Integer.parseInt(element[50]));
	 * caso.setD_5203_9(Integer.parseInt(element[51]));
	 * 
	 * caso.setD_5204_0(Integer.parseInt(element[52]));
	 * caso.setD_5204_1(Integer.parseInt(element[53]));
	 * caso.setD_5204_2(Integer.parseInt(element[54]));
	 * caso.setD_5204_3(Integer.parseInt(element[55]));
	 * caso.setD_5204_4(Integer.parseInt(element[56]));
	 * caso.setD_5204_8(Integer.parseInt(element[57]));
	 * caso.setD_5204_9(Integer.parseInt(element[58]));
	 * 
	 * caso.setD_5205_0(Integer.parseInt(element[59]));
	 * caso.setD_5205_1(Integer.parseInt(element[60]));
	 * caso.setD_5205_2(Integer.parseInt(element[61]));
	 * caso.setD_5205_3(Integer.parseInt(element[62]));
	 * caso.setD_5205_4(Integer.parseInt(element[63]));
	 * caso.setD_5205_8(Integer.parseInt(element[64]));
	 * caso.setD_5205_9(Integer.parseInt(element[65]));
	 * 
	 * caso.setD_53000_0(Integer.parseInt(element[66]));
	 * caso.setD_53000_1(Integer.parseInt(element[67]));
	 * caso.setD_53000_2(Integer.parseInt(element[68]));
	 * caso.setD_53000_3(Integer.parseInt(element[69]));
	 * caso.setD_53000_4(Integer.parseInt(element[70]));
	 * caso.setD_53000_8(Integer.parseInt(element[71]));
	 * caso.setD_53000_9(Integer.parseInt(element[72]));
	 * 
	 * caso.setD_53001_0(Integer.parseInt(element[73]));
	 * caso.setD_53001_1(Integer.parseInt(element[74]));
	 * caso.setD_53001_2(Integer.parseInt(element[75]));
	 * caso.setD_53001_3(Integer.parseInt(element[76]));
	 * caso.setD_53001_4(Integer.parseInt(element[77]));
	 * caso.setD_53001_8(Integer.parseInt(element[78]));
	 * caso.setD_53001_9(Integer.parseInt(element[79]));
	 * 
	 * caso.setD_53010_0(Integer.parseInt(element[80]));
	 * caso.setD_53010_1(Integer.parseInt(element[81]));
	 * caso.setD_53010_2(Integer.parseInt(element[82]));
	 * caso.setD_53010_3(Integer.parseInt(element[83]));
	 * caso.setD_53010_4(Integer.parseInt(element[84]));
	 * caso.setD_53010_8(Integer.parseInt(element[85]));
	 * caso.setD_53010_9(Integer.parseInt(element[86]));
	 * 
	 * caso.setD_53011_0(Integer.parseInt(element[87]));
	 * caso.setD_53011_1(Integer.parseInt(element[88]));
	 * caso.setD_53011_2(Integer.parseInt(element[89]));
	 * caso.setD_53011_3(Integer.parseInt(element[90]));
	 * caso.setD_53011_4(Integer.parseInt(element[91]));
	 * caso.setD_53011_8(Integer.parseInt(element[92]));
	 * caso.setD_53011_9(Integer.parseInt(element[93]));
	 * 
	 * caso.setD_5302_0(Integer.parseInt(element[94]));
	 * caso.setD_5302_1(Integer.parseInt(element[95]));
	 * caso.setD_5302_2(Integer.parseInt(element[96]));
	 * caso.setD_5302_3(Integer.parseInt(element[97]));
	 * caso.setD_5302_4(Integer.parseInt(element[98]));
	 * caso.setD_5302_8(Integer.parseInt(element[99]));
	 * caso.setD_5302_9(Integer.parseInt(element[100]));
	 * 
	 * caso.setD_5400_0(Integer.parseInt(element[101]));
	 * caso.setD_5400_1(Integer.parseInt(element[102]));
	 * caso.setD_5400_2(Integer.parseInt(element[103]));
	 * caso.setD_5400_3(Integer.parseInt(element[104]));
	 * caso.setD_5400_4(Integer.parseInt(element[105]));
	 * caso.setD_5400_8(Integer.parseInt(element[106]));
	 * caso.setD_5400_9(Integer.parseInt(element[107]));
	 * 
	 * caso.setD_5401_0(Integer.parseInt(element[108]));
	 * caso.setD_5401_1(Integer.parseInt(element[109]));
	 * caso.setD_5401_2(Integer.parseInt(element[110]));
	 * caso.setD_5401_3(Integer.parseInt(element[111]));
	 * caso.setD_5401_4(Integer.parseInt(element[112]));
	 * caso.setD_5401_8(Integer.parseInt(element[113]));
	 * caso.setD_5401_9(Integer.parseInt(element[114]));
	 * 
	 * caso.setD_5402_0(Integer.parseInt(element[115]));
	 * caso.setD_5402_1(Integer.parseInt(element[116]));
	 * caso.setD_5402_2(Integer.parseInt(element[117]));
	 * caso.setD_5402_3(Integer.parseInt(element[118]));
	 * caso.setD_5402_4(Integer.parseInt(element[119]));
	 * caso.setD_5402_8(Integer.parseInt(element[120]));
	 * caso.setD_5402_9(Integer.parseInt(element[121]));
	 * 
	 * caso.setD_5403_0(Integer.parseInt(element[122]));
	 * caso.setD_5403_1(Integer.parseInt(element[123]));
	 * caso.setD_5403_2(Integer.parseInt(element[124]));
	 * caso.setD_5403_3(Integer.parseInt(element[125]));
	 * caso.setD_5403_4(Integer.parseInt(element[126]));
	 * caso.setD_5403_8(Integer.parseInt(element[127]));
	 * caso.setD_5403_8(Integer.parseInt(element[128]));
	 * 
	 * caso.setD_5404_0(Integer.parseInt(element[129]));
	 * caso.setD_5404_1(Integer.parseInt(element[130]));
	 * caso.setD_5404_2(Integer.parseInt(element[131]));
	 * caso.setD_5404_3(Integer.parseInt(element[132]));
	 * caso.setD_5404_4(Integer.parseInt(element[133]));
	 * caso.setD_5404_8(Integer.parseInt(element[134]));
	 * caso.setD_5404_9(Integer.parseInt(element[135]));
	 * 
	 * caso.setD_5500_0(Integer.parseInt(element[136]));
	 * caso.setD_5500_1(Integer.parseInt(element[137]));
	 * caso.setD_5500_2(Integer.parseInt(element[138]));
	 * caso.setD_5500_3(Integer.parseInt(element[139]));
	 * caso.setD_5500_4(Integer.parseInt(element[140]));
	 * caso.setD_5500_8(Integer.parseInt(element[141]));
	 * caso.setD_5500_9(Integer.parseInt(element[142]));
	 * 
	 * caso.setD_5501_0(Integer.parseInt(element[143]));
	 * caso.setD_5501_1(Integer.parseInt(element[144]));
	 * caso.setD_5501_2(Integer.parseInt(element[145]));
	 * caso.setD_5501_3(Integer.parseInt(element[146]));
	 * caso.setD_5501_4(Integer.parseInt(element[147]));
	 * caso.setD_5501_8(Integer.parseInt(element[148]));
	 * caso.setD_5501_9(Integer.parseInt(element[159]));
	 * 
	 * caso.setD_5600_0(Integer.parseInt(element[150]));
	 * caso.setD_5600_1(Integer.parseInt(element[151]));
	 * caso.setD_5600_2(Integer.parseInt(element[152]));
	 * caso.setD_5600_3(Integer.parseInt(element[153]));
	 * caso.setD_5600_4(Integer.parseInt(element[154]));
	 * caso.setD_5600_8(Integer.parseInt(element[155]));
	 * caso.setD_5600_9(Integer.parseInt(element[156]));
	 * 
	 * caso.setD_5602_0(Integer.parseInt(element[157]));
	 * caso.setD_5602_1(Integer.parseInt(element[158]));
	 * caso.setD_5602_2(Integer.parseInt(element[159]));
	 * caso.setD_5602_3(Integer.parseInt(element[160]));
	 * caso.setD_5602_4(Integer.parseInt(element[161]));
	 * caso.setD_5602_8(Integer.parseInt(element[162]));
	 * caso.setD_5602_9(Integer.parseInt(element[163]));
	 * 
	 * caso.setD_5700_0(Integer.parseInt(element[164]));
	 * caso.setD_5700_1(Integer.parseInt(element[165]));
	 * caso.setD_5700_2(Integer.parseInt(element[166]));
	 * caso.setD_5700_3(Integer.parseInt(element[167]));
	 * caso.setD_5700_4(Integer.parseInt(element[168]));
	 * caso.setD_5700_8(Integer.parseInt(element[169]));
	 * caso.setD_5700_9(Integer.parseInt(element[170]));
	 * 
	 * caso.setD_5701_0(Integer.parseInt(element[171]));
	 * caso.setD_5701_1(Integer.parseInt(element[172]));
	 * caso.setD_5701_2(Integer.parseInt(element[173]));
	 * caso.setD_5701_3(Integer.parseInt(element[174]));
	 * caso.setD_5701_4(Integer.parseInt(element[175]));
	 * caso.setD_5701_8(Integer.parseInt(element[176]));
	 * caso.setD_5701_9(Integer.parseInt(element[177]));
	 * 
	 * caso.setD_57020_0(Integer.parseInt(element[178]));
	 * caso.setD_57020_1(Integer.parseInt(element[179]));
	 * caso.setD_57020_2(Integer.parseInt(element[180]));
	 * caso.setD_57020_3(Integer.parseInt(element[181]));
	 * caso.setD_57020_4(Integer.parseInt(element[182]));
	 * caso.setD_57020_8(Integer.parseInt(element[183]));
	 * caso.setD_57020_9(Integer.parseInt(element[184]));
	 * 
	 * caso.setD_57021_0(Integer.parseInt(element[185]));
	 * caso.setD_57021_1(Integer.parseInt(element[186]));
	 * caso.setD_57021_2(Integer.parseInt(element[187]));
	 * caso.setD_57021_3(Integer.parseInt(element[188]));
	 * caso.setD_57021_4(Integer.parseInt(element[189]));
	 * caso.setD_57021_5(Integer.parseInt(element[190]));
	 * caso.setD_57021_6(Integer.parseInt(element[191]));
	 * 
	 * caso.setD_57022_0(Integer.parseInt(element[192]));
	 * caso.setD_57022_1(Integer.parseInt(element[193]));
	 * caso.setD_57022_2(Integer.parseInt(element[194]));
	 * caso.setD_57022_3(Integer.parseInt(element[195]));
	 * caso.setD_57022_4(Integer.parseInt(element[196]));
	 * caso.setD_57022_8(Integer.parseInt(element[197]));
	 * caso.setD_57022_9(Integer.parseInt(element[198]));
	 * 
	 * caso.setD_571_0(Integer.parseInt(element[199]));
	 * caso.setD_571_1(Integer.parseInt(element[200]));
	 * caso.setD_571_2(Integer.parseInt(element[201]));
	 * caso.setD_571_3(Integer.parseInt(element[202]));
	 * caso.setD_571_4(Integer.parseInt(element[203]));
	 * caso.setD_571_8(Integer.parseInt(element[204]));
	 * caso.setD_571_9(Integer.parseInt(element[205]));
	 * 
	 * caso.setClasss(element[206]); return caso; }).collect(Collectors.toList()); }
	 */
	
	public static void main(String args[]) throws FileNotFoundException, IOException {
		int[] cromosome = new int[205]; 
		for(int i=0; i<205; i++) {
			if(i==1 || i ==0) {
				cromosome[i] = 1;	
			} else {
				cromosome[i] = 0;
			}
			
		}
		getDataSetWithFilterFeatures("/home/luis/Documents/dataset/SCADI.csv", ",", cromosome).forEach(x -> {
			System.out.println("Tiene "+x.getFeatures().length+" features");
			System.out.println(x.toString());
		});;
	}

	public static List<RBCCaso> getDataSet(String path, String separator) throws FileNotFoundException, IOException {
		return UtilCsv.readFileCsv(path, separator).stream().filter(element -> !element[0].equals("id"))
				.map(element -> {
					Integer classIndex = element.length - 1;
					Integer numFeatures = element.length - 2;
					RBCCaso caso = new RBCCaso();
					caso.setId(Integer.parseInt(element[0]));
					String[] features = new String[numFeatures];
					for (int e = 1; e < classIndex; e++) {
						features[e - 1] = element[e];
					}
					caso.setFeatures(features);
					caso.setLabel(element[classIndex]);
					return caso;
				}).collect(Collectors.toList());
	}
	
	public static List<RBCCaso> getDataSetWithFilterFeatures(String path, String separator, int[] cromosome) throws FileNotFoundException, IOException {
		return UtilCsv.readFileCsv(path, separator).stream().filter(element -> !element[0].equals("id"))
				.map(element -> {
					Integer classIndex = element.length - 1;
					Integer numFeatures = element.length - 2;
					RBCCaso caso = new RBCCaso();
					caso.setId(Integer.parseInt(element[0]));
					String[] features = new String[numFeatures];
					for (int e = 1; e < classIndex; e++) {
						features[e - 1] = element[e];
					}
					caso.setFeatures(getFeauturesByCromosome(features, cromosome, countOnes(cromosome)));
					//System.out.println("El elemento tiene "+caso.getFeatures().length+" features");
					caso.setLabel(element[classIndex]);
					return caso;
				}).collect(Collectors.toList());
	}

	public static int countOnes(int[] indicators) {
		int indicator = 0;
		for(int i=0; i<indicators.length; i++) {
			if(indicators[i] == 1) {
				indicator += 1;
			}
		}
		return indicator;
	}
	
	public static String[] getFeauturesByCromosome(String[] features, int[] cromosome, int numNeoFeatures) {
		if(features.length != cromosome.length) {
			throw new IllegalArgumentException("El cromosoma debe tener la misma cantidad de genes que las caracteristicas iniciales");
		}
		
		int size = features.length;
		int index = 0;
		
		String[] newFeatures = new String[numNeoFeatures];
		for(int i=0; i<size; i++) {
			if(cromosome[i] == 1) {
				newFeatures[index] = features[i];
				index++;
			}
		}
		
		return newFeatures;
	}

}
