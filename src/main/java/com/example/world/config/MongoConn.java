package com.example.world.config;

import com.example.world.Application;
import com.example.world.config.ApplicationConfig;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.MongoClient;
import com.mongodb.gridfs.CLI;
import io.swagger.models.auth.In;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

/**
 * @Author dkw[dongkewei@xinzhili.cn]
 * @data 2018/10/18 下午3:26
 */
//@Configuration
@Slf4j

public class MongoConn {

  private static final ThreadLocal<DB> CONN_HOLDER;
  private static final MongoClient CLIENT;

  private static String host;
  private static Integer port;
  private static String dbName;


  public MongoConn() {
  }

  static {
    host = "127.0.0.1";
    port = 27017;
    dbName = "test";
    CONN_HOLDER = new ThreadLocal<>();
    CLIENT = new MongoClient(host, port);
  }

  public static DB getConn() {
    DB conn = CONN_HOLDER.get();
    try {
      conn = CLIENT.getDB(dbName);
    } catch (Exception e) {
      log.error("get connection failure", e);
      throw new RuntimeException(e);
    } finally {
      CONN_HOLDER.set(conn);
    }
    return conn;
  }

  public static DBCollection getCollection(String table) {
    return getConn().getCollection(table);
  }

}
