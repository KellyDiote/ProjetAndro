package com.example.test1;

import java.io.IOException;

import org.restlet.resource.ClientResource;
import org.restlet.resource.ResourceException;

public class RESTLETinterface {

	public static String getLumInt() {
		ClientResource LumInt = new ClientResource(
				"http://10.0.2.2:9000/intLight?method=getBrightness");
		String renvoiLum=null;
		try {
			renvoiLum = LumInt.get().getText();
		} catch (ResourceException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		LumInt.release();
		return renvoiLum;
	}

	public static void setValue(String device, String method, int value)
			throws ResourceException, IOException {
		ClientResource resource = new ClientResource("http://192.168.1.26:9000/"
				+ device + "?method=" + method + "&level=" + value);
		resource.get();
		resource.release();
	}
}