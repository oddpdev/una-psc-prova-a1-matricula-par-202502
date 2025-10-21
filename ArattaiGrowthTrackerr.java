package arattaiGrowthTracker;

public class ArattaiGrowthTrackerr {

	public static void main(String[] args) {
		int[] downloadsDiarios = {850000, 1050000, 1100000, 950000, 1200000, 1000000, 850000};
		
		String[] diasDaSemana = {"Dom", "Seg", "Ter", "Qua", "Qui", "Sex", "Sáb"};
		
		long totalDownloads = 0;

	    System.out.println("Relatório de Downloads da Semana");

	    for (int i = 0; i < diasDaSemana.length; i++) {
	    	String dia = diasDaSemana[i];
	            
	        int downloads = downloadsDiarios[i];

	        System.out.println(dia + ": " + downloads + " downloads");
	    }
	    
	    for (int downloads : downloadsDiarios) {
	    	totalDownloads += downloads;
	    	}
	    
        System.out.println("Total de Downloads na Semana: " + totalDownloads);
        
        int menorDownload = downloadsDiarios[0];
        int maiorDownload = downloadsDiarios[0];
        int diaPico = 0;
        int diaMinimo = 0;
        
        final int Meta = 1000000;
        int diasAcimaDaMeta = 0;
        
        
        for (int i = 0; i < diasDaSemana.length; i++) {
        if (downloadsDiarios[i] > maiorDownload) {
            maiorDownload = downloadsDiarios[i];
            diaPico = i;
        }


        if (downloadsDiarios[i] < menorDownload) {
            menorDownload = downloadsDiarios[i];
            diaMinimo = i;
        }


        if (downloadsDiarios[i] >= Meta) {
            diasAcimaDaMeta++;
        }
        }

        String diaDePico = diasDaSemana[diaPico];
        System.out.println("Dia de Pico de Downloads: " + diaDePico + " com " + maiorDownload + " downloads.");


        String diaDeMinimo = diasDaSemana[diaMinimo];
        System.out.println("Dia de Mínimo de Downloads: " + diaDeMinimo + " com " + menorDownload + " downloads.");
        
        System.out.println("\n--- Análise de Metas ---");
        System.out.println("O Arattai superou a meta diária em " + diasAcimaDaMeta + " dias esta semana.");
	}
}