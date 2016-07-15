package test;

import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.DBObject;
import com.mongodb.Mongo;

public class Test1 {
	public void app() throws Exception{
		//建立与服务器的链接
		Mongo mongo = new Mongo("localhost",28017);
		//得到数据库
		DB db = mongo.getDB("db1");
	//db.authenticate(username, password);//如果有权限
		//得到集合
		DBCollection collection = db.getCollection("user");
		//得到遍历集合的游标
		DBCursor cursor = collection.find();
		//遍历结果集
		while(cursor.hasNext()){
			DBObject object = cursor.next();
			System.out.println(object);
		}
		//释放占用的资源
		mongo.close();
	}
	public static void main(String[] args) throws Exception {
		Test1 test = new Test1();
		test.app();
		
	}

}
