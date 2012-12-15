package com.example.test1;

import java.io.IOException;

import org.restlet.resource.ClientResource;
import org.restlet.resource.ResourceException;

public class RESTLETinterface {

	public String getLumInt() {
		ClientResource LumInt = new ClientResource(
				"http://192.168.1.26:9000/intLight?method=getBrightness");
		try {
			return LumInt.get().getText();
		} catch (ResourceException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	public static void setValue(String device, String method, int value)
			throws ResourceException, IOException {
		ClientResource resource = new ClientResource("http://192.168.1.26:9000/"
				+ device + "?method=" + method + "&level=" + value);
		resource.get();
		resource.release();
	}
}