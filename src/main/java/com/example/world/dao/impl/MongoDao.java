package com.example.world.dao.impl;

import com.example.world.config.MongoConn;
import com.mongodb.BasicDBObject;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import org.springframework.stereotype.Component;

/**
 * @Author dkw[dongkewei@xinzhili.cn]
 * @data 2018/10/18 下午2:32
 */
@Component
public class MongoDao {

  private DBCollection collection = MongoConn.getCollection("user");

  public void save() {
    BasicDBObject dbObject = new BasicDBObject();
    dbObject.put("name", "kw");
    dbObject.put("id", "1");
    collection.save(dbObject);
    collection.update(dbObject, dbObject);
  }

  private void get() {
    BasicDBObject search = new BasicDBObject();
    search.put("name", "kw");
    DBCursor cursor = collection.find(search);
    if (cursor.hasNext()) {
      System.out.println("查询到的文档为：");
      while (cursor.hasNext()) {
        System.out.println(cursor.next());
      }
    } else {
      System.out.println("该文档不存在！");
    }
  }

  public static void main(String[] args) {
    MongoDao mongoDao = new MongoDao();
//    mongoDao.save();
    mongoDao.get();
  }
}
