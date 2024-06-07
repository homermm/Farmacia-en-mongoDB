package conexion;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoDatabase;

public class MongoDB {
	public static void main(String[] args) {
        String connectionString = "mongodb://localhost:27017";
        MongoClient mongoClient = MongoClients.create(connectionString);
        MongoDatabase database = mongoClient.getDatabase("tpbdd2");

        System.out.println("Conectado a la base de datos MongoDB: " + database.getName());

        // Realizar operaciones CRUD en la base de datos aquí

        mongoClient.close();
    }
}
