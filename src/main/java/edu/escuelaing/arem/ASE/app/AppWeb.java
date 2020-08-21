package edu.escuelaing.arem.ASE.app;

import static spark.Spark.get;
import static spark.Spark.port;
import static spark.Spark.post;
import org.apache.commons.io.FileUtils;

import java.io.File;
import java.nio.charset.StandardCharsets;

public class AppWeb {

	public static void main(String[] args) {
		port(getPort());
		
		//get("/hello", (req, res) -> "perra");
		get("calculadora", (req, res) -> {
			String result = req.queryParams("data");
			String page = FileUtils.readFileToString(new File("src/main/java/edu/escuelaing/arem/ASE/app/resources/index.HTML"), StandardCharsets.UTF_8);
			System.out.println(result);
			return page;
		});
		
	}
	public static int getPort(){
		if (System.getenv("PORT") != null) {
			return Integer.parseInt(System.getenv("PORT"));
		}
		return 4567; 
	}

}
