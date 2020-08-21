package edu.escuelaing.arem.ASE.app;

import static spark.Spark.get;
import static spark.Spark.port;
import static spark.Spark.post;
import static spark.Spark.staticFiles;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.nio.charset.StandardCharsets;

public class AppWeb {

	public static void main(String[] args) {
		port(getPort());
		staticFiles.location("/public");
		post("/calculadora", (request, response) -> {
			
			Calculadora c = new Calculadora();
			c.leerJson(request.body());
			
			return "{\"media\":" + c.mean() + ", \"desviacion\":" + c.stddev() + "}";
		});
		
	}
	public static int getPort(){
		if (System.getenv("PORT") != null) {
			return Integer.parseInt(System.getenv("PORT"));
		}
		return 4567; 
	}

}
