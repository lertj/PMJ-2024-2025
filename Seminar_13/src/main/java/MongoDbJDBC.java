import com.mongodb.client.*;
import com.mongodb.client.internal.MongoDatabaseImpl;
import org.bson.Document;

import java.util.logging.Level;
import java.util.logging.Logger;

public class MongoDbJDBC {
    public static void main(String[] args) {
        String uri = "mongodb://localhost:27017";
        //MongoClient client = new MongoClient...

        Logger mongoLogger = Logger.getLogger("org.mongodb.driver");
        mongoLogger.setLevel(Level.SEVERE);

        try(MongoClient client = MongoClients.create(uri)){
            if(client.getDatabase("StudDb") != null){
                client.getDatabase("StudDb").drop();
            }

            MongoDatabase db = client.getDatabase("StudDb");
            MongoCollection<Document> collection = db.getCollection("Student");

            Document doc1 = new Document().append("name", "Adrian").append("grade", 9.99).append("birthdate", System.currentTimeMillis());
            Document doc2 = new Document().append("name", "Adrian2").append("grade", 9.99).append("birthdate", System.currentTimeMillis());
            collection.insertOne(doc1);
            collection.insertOne(doc2);

            MongoIterable<Document> it = collection.find();
            try( MongoCursor<Document> cursor =  it.cursor()){
                while(cursor.hasNext()){
                    System.out.println(cursor.next());
                }

            }
        }
    }
}
