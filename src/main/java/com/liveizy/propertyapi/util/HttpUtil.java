/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.liveizy.propertyapi.util;

import java.io.BufferedReader;
import java.io.Closeable;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import org.slf4j.LoggerFactory;

/**
 *
 * @author Oluremi Adekanmbi
 */
public class HttpUtil {

    private static org.slf4j.Logger logger = LoggerFactory.getLogger(HttpUtil.class);
    private final static String USER_AGENT = "Mozilla/5.0";
//    public static String token = "";

    public static String sendGet(String url) throws Exception {
        logger.info(url);
        URL obj = new URL(url);
        HttpURLConnection con = (HttpURLConnection) obj.openConnection();

        // optional default is GET
        con.setRequestMethod("GET");
        con.setReadTimeout(10000);

        //add request header
        con.setRequestProperty("User-Agent", USER_AGENT);
        con.setRequestProperty("Authorization", "Bearer " );
//
//        logger.info("token is :: " + MobileService.token);

        int responseCode = con.getResponseCode();
        logger.info("Response Code : " + responseCode);
        BufferedReader in = null;
        if (responseCode == 200) {
            in = new BufferedReader(
                    new InputStreamReader(con.getInputStream()));
        } else {
            in = new BufferedReader(
                    new InputStreamReader(con.getErrorStream()));
        }
        String inputLine;
        StringBuilder response = new StringBuilder();

        while ((inputLine = in.readLine()) != null) {
            response.append(inputLine);
        }
        in.close();
        logger.info("Response in HttpUtil ---->  " + response.toString());
        return response.toString();
    }

    public static String sendPost(String url, String jsonString) throws Exception {
        logger.info("\nSending 'POST' request to URL : " + url);
        logger.info("Post parameters : " + jsonString);
        URL obj = new URL(url);
        //HttpsURLConnection con = (HttpsURLConnection) obj.openConnection();
        HttpURLConnection con = (HttpURLConnection) obj.openConnection();
        //add reuqest header
        con.setRequestMethod("POST");
        con.setRequestProperty("User-Agent", USER_AGENT);
        con.setRequestProperty("Content-Type", "application/json");
        con.setRequestProperty("Accept-Language", "en-US,en;q=0.5");
        con.setDoOutput(true);
        DataOutputStream wr = new DataOutputStream(con.getOutputStream());
        wr.writeBytes(jsonString);
        wr.flush();
        wr.close();

        int responseCode = con.getResponseCode();

        logger.info("Response Code : " + responseCode);

        BufferedReader in = null;
        if (responseCode == 200) {
            in = new BufferedReader(
                    new InputStreamReader(con.getInputStream()));
        } else {
            in = new BufferedReader(
                    new InputStreamReader(con.getErrorStream()));
        }
        String inputLine;
        StringBuffer response = new StringBuffer();

        while ((inputLine = in.readLine()) != null) {
            response.append(inputLine);
        }
        in.close();

        logger.info(response.toString());
        return response.toString();

    }

    public static void close(Closeable cls) {
        try {
            if (cls != null) {
                cls.close();
            }
        } catch (Exception ex) {
        }
    }
}
