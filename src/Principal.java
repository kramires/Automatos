import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.StringTokenizer;

public class Principal {

	public static void main(String[] args) {
		
		try
		{
			List <Transicao> transicao = new ArrayList<>();
			BufferedReader br = new BufferedReader(new FileReader("src/Arquivo.txt"));
			
			String s = br.readLine();  
			
			while(s.compareTo("-1") != 0) { 
				
				StringTokenizer st = new StringTokenizer(s, " ");
				
				Transicao t = new Transicao();
				
				t.setEstadoInicial(Integer.parseInt(st.nextToken()));
				t.setSimbolo(st.nextToken().charAt(0));
				t.setEstadoFinal(Integer.parseInt(st.nextToken()));
				
				transicao.add(t);
				
				s = br.readLine();
				
              }	
			Transicao t = new Transicao();
			for (int i = 0 ; i < transicao.size(); i++) {
				t = transicao.get(i);
				t.imprime();
			}
			BufferedReader bre2 = new BufferedReader(new FileReader("src/Arquivo.txt"));
			
			//StringTokenizer st = new StringTokenizer(s, "");
			
			String str2 = bre2.readLine();  
			int estadoInicial = Integer.parseInt(str2);
			
			
			
			BufferedReader bre = new BufferedReader(new FileReader("src/Arquivo.txt"));
			String str = bre.readLine();  
			int estadoFinal = Integer.parseInt(str);
			
			BufferedReader bre3 = new BufferedReader(new FileReader("src/Arquivo.txt"));
			String s2 = br.readLine();  
			
			while(s2 != null) { 
				
				StringTokenizer st = new StringTokenizer(s2, "");
				
				Transicao t = new Transicao();
				
				t.setEstadoInicial(Integer.parseInt(st.nextToken()));
				t.setSimbolo(st.nextToken().charAt(0));
				t.setEstadoFinal(Integer.parseInt(st.nextToken()));
				
				transicao.add(t);
				
				s = br.readLine();
				
              }	
			
			
			
			String str3 = bre.readLine(); 
			int n = 
			
			
			
			
			for(int i = 0; i < transicao.size(); i++) {
				
				for(int j = 0; j < transicao.size();j++) {
					Transicao t1 = transicao.get(j);
					//Transicao t2 = new Transicao();
					
					if(t1.getEstadoInicial()== estadoInicial) {
						if(t1.getSimbolo() == ) {
							
						}
						
					}
					
					transicao.get(i).getSimbolo();		
				}
			}
			
		}catch(Exception e){
  			System.out.println("Erro: " + e.getMessage());
  			}
		
	}

}
