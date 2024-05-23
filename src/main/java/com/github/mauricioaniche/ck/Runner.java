package com.github.mauricioaniche.ck;

import java.io.PrintStream;
import java.util.Iterator;

import org.apache.log4j.Logger;

public class Runner {

	private static Logger log = Logger.getLogger(Runner.class);

	public static void main(String[] args) {
		if(args==null || args.length < 2) {
			log.error("Usage java -jar ck.jar <path to project> <path to csv>");
			System.exit(1);
		}
		
		String path = args[1];
		
		CKReport report = new CK().calculate(path);
		
		PrintStream ps = System.out;
		ps.print("[");
        Iterator<CKNumber> interactor = report.all().iterator();
		while(interactor.hasNext()){
            CKNumber result = interactor.next();
			if(result.isError()) continue;
			
			ps.print(
				"{"+
						"\"file\": \""+result.getFile() + "\"," +
						"\"className\": \""+result.getClassName() + "\"," +
						"\"type\": \""+result.getType() +  "\"," +
						"\"cbo\": \""+result.getCbo() +  "\"," +
						"\"wmc\": \""+result.getWmc() +  "\"," +
						"\"dit\": \""+result.getDit() +  "\"," +
						"\"noc\": \""+result.getNoc() +  "\"," +
						"\"rfc\": \""+result.getRfc() +  "\"," +
						"\"lcom\": \""+result.getLcom() +  "\"," +
						"\"ncom\": \""+result.getNom() +  "\"," +
						"\"nopm\": \""+result.getNopm() +  "\"," + 
						"\"npsm\": \""+result.getNosm() +  "\"," +
						"\"nof\": \""+result.getNof() +  "\"," +
						"\"nopf\": \""+result.getNopf() +  "\"," + 
						"\"nosf\": \""+result.getNosf() +  "\"," +
						"\"nosi\": \""+result.getNosi() +  "\"," +
						"\"loc\": \""+result.getLoc()+  "\"" +
				"}"
			);
            if(interactor.hasNext()) {
                ps.print(',');
            }
		}
		ps.print("]");
		
	}
}
