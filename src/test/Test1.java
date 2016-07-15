package test;

import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.DBObject;
import com.mongodb.Mongo;

public class Test1 {
	public void app() throws Exception{
		//�����������������
		Mongo mongo = new Mongo("localhost",28017);
		//�õ����ݿ�
		DB db = mongo.getDB("db1");
	//db.authenticate(username, password);//�����Ȩ��
		//�õ�����
		DBCollection collection = db.getCollection("user");
		//�õ��������ϵ��α�
		DBCursor cursor = collection.find();
		//���������
		while(cursor.hasNext()){
			DBObject object = cursor.next();
			System.out.println(object);
		}
		//�ͷ�ռ�õ���Դ
		mongo.close();
	}
	public static void main(String[] args) throws Exception {
		Test1 test = new Test1();
		test.app();
		
		
		
	}

}
