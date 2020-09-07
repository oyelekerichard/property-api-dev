/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.liveizy.propertyapi.dto.misc;

import com.liveizy.propertyapi.dto.output.TokenDetails;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *
 * @author richard.oyeleke
 */
public class SessionManager {

    protected static Logger logger = LoggerFactory.getLogger(SessionManager.class);
    private static ConcurrentHashMap<String, TokenDetails> HTABLE = new ConcurrentHashMap<String, TokenDetails>();
    private static final SessionManager USSDMGR = new SessionManager();
    //private static final Logger LOG = Logger.getLogger(SessionManager.class);

    //Attention: Do not instatiate this guy directly ever. Always use getInstance();
    private SessionManager() {
        new Thread(new SessionCleaner()).start();
    }

    public static SessionManager getInstance() {
        return USSDMGR;
    }

    public void add(TokenDetails session) {
        HTABLE.put(session.getToken(), session);
    }

    public void destroySession(String id) {
        HTABLE.remove(id);
        System.out.println("Session " + id + " was forcefully destroyed after process completed...");
    }

    public TokenDetails getSession(String sessionId) {
        return HTABLE.get(sessionId);
    }

    public void destroyAllSessions() {
        for (Map.Entry<String, TokenDetails> entry : HTABLE.entrySet()) {
            String key = entry.getKey();
            HTABLE.remove(key);
        }
    }

    public boolean previousExist(String token) {
        boolean exist = false;
        for (Map.Entry<String, TokenDetails> entry : HTABLE.entrySet()) {
            String key = entry.getKey();
            TokenDetails session = entry.getValue();
            if (session.getToken().equals(token)) {
                exist = true;
            }
        }
        return exist;
    }

    public TokenDetails checkForPreviousSession(String token) {
        TokenDetails queueDetails = null;
        for (Map.Entry<String, TokenDetails> entry : HTABLE.entrySet()) {
            String key = entry.getKey();
            TokenDetails session = entry.getValue();
            if (session.getToken().equals(token)) {
                queueDetails = session;
            }
        }
        return queueDetails;
    }

    public class SessionCleaner implements Runnable {

        public void run() {
            System.out.println("Session Cleaner Started...");
            java.util.Enumeration<String> keys = null;
            while (true) {
                try {
                    keys = HTABLE.keys();
                    while (keys.hasMoreElements()) {
                        String id = keys.nextElement();
                        TokenDetails session = HTABLE.get(id);
//                        if (session.getExpiry().after(DateTimeUtil.getCurrentDate())) {
//                            System.out.println("Session " + id + " was destroyed by cleaner after expiry....");
//                            destroySession(session.getToken());
//                        }

                    }
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }

        }

    }

}

