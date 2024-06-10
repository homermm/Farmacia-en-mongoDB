package conexion;

import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoDatabase;

import modelos.Cliente;
import modelos.Domicilio;
import modelos.Empleado;
import modelos.ObraSocial;
import modelos.Producto;
import modelos.ProductoVenta;
import modelos.Sucursal;
import modelos.Venta;

public class MongoDB {
	public static void main(String[] args) {

		// Conexion a la BDD
		String connectionString = "mongodb://localhost:27017";
		MongoClient mongoClient = MongoClients.create(connectionString);
		MongoDatabase database = mongoClient.getDatabase("tpbdd2");

		System.out.println("Conectado a la base de datos MongoDB: " + database.getName());

		// Genero Productos
		List<Producto> productos = new ArrayList<>();
		productos.add(new Producto(1, "Medicamento", "Paracetamol 500mg", "Laboratorio A", 3459, 10.0));
		productos.add(new Producto(2, "Perfumeria", "Shampoo 200ml", "Laboratorio B", 5678, 30.0));
		productos.add(new Producto(3, "Perfumeria", "Acondicionador 200ml", "Laboratorio A", 4467, 20.0));
		productos.add(new Producto(4, "Medicamento", "Xanax", "Laboratorio A", 3108, 90.0));
		productos.add(new Producto(5, "Medicamento", "Magnus 50 mg", "Laboratorio B", 4913, 100.0));

		// Genero Empleados
		Empleado e1 = new Empleado(1, "Perez", "Juan", "12345678", "20-12345678-9",
				new Domicilio("Calle Falsa", 123, "Lanus", "Buenos Aires"), new ObraSocial(1, "OSDE"), "12345");
		Empleado e2 = new Empleado(2, "Gomez", "Maria", "87654321", "20-87654321-8",
				new Domicilio("Calle Real", 456, "Lanus", "Buenos Aires"), new ObraSocial(2, "Swiss Medical"), "67890");

		Empleado e3 = new Empleado(3, "Martínez", "Martín", "40287101", "20-40287101-7",
				new Domicilio("Güemes", 1271, "Avellaneda", "Buenos Aires"), new ObraSocial(3, "OSADEF"), "29981");
		Empleado e4 = new Empleado(4, "González", "Gonzalo", "42773881", "20-42773881-8",
				new Domicilio("Elizalde", 108, "Avellaneda", "Buenos Aires"), new ObraSocial(4, "OSDM"), "38172");

		Empleado e5 = new Empleado(5, "Messi", "Lionel", "33016244", "23-33016244-9",
				new Domicilio("Homero", 976, "Lomas", "Buenos Aires"), new ObraSocial(5, "OSACN"), "17728");
		Empleado e6 = new Empleado(6, "Taylor Joy", "Anya", "93662180", "27-93662180-0",
				new Domicilio("O'Higgins", 308, "Lomas", "Buenos Aires"), new ObraSocial(6, "Galeno"), "64713");

		// Genero Sucursales
		List<Empleado> empleadosLanus = new ArrayList<>(); // Sucursal Lanus
		empleadosLanus.add(e1);
		empleadosLanus.add(e2);
		Sucursal sucursalLanus = new Sucursal(1, new Domicilio("Av. San Martin", 1234, "Lanus", "Buenos Aires"), e1,
				empleadosLanus, "1234");

		List<Empleado> empleadosAvellaneda = new ArrayList<>(); // Sucursal Avellaneda
		empleadosAvellaneda.add(e3);
		empleadosAvellaneda.add(e4);
		Sucursal sucursalAvellaneda = new Sucursal(2, new Domicilio("Bynnon", 1234, "Avellaneda", "Buenos Aires"), e3,
				empleadosAvellaneda, "4567");

		List<Empleado> empleadosLomas = new ArrayList<>(); // Sucursal Lomas
		empleadosLomas.add(e5);
		empleadosLomas.add(e6);
		Sucursal sucursalLomas = new Sucursal(3, new Domicilio("Boedo", 374, "Lomas", "Buenos Aires"), e5,
				empleadosLomas, "7890");

		// Genero Clientes
		List<Cliente> clientes = new ArrayList<>();
		clientes.add(new Cliente(1, "Jose", "San Martin", "12345",
				new Domicilio("Calle A", 123, "Lanus", "Buenos Aires"), new ObraSocial(1, "OSDE"), "1"));
		clientes.add(new Cliente(2, "Maria", "Gonzalez", "54321",
				new Domicilio("Calle B", 456, "Avellaneda", "Buenos Aires"), new ObraSocial(2, "Swiss Medical"), "2"));
		clientes.add(new Cliente(3, "Juan", "Perez", "67890", new Domicilio("Calle C", 789, "Lomas", "Buenos Aires"),
				new ObraSocial(3, "Galeno"), "3"));
		
		// Genero Ventas
		List<Venta> ventas = new ArrayList<>();
		int idVenta = 1;
		Random random = new Random();
		String[] formasDePago = {"EFECTIVO", "TARJETA", "DEBITO"};
		
		for (Sucursal sucursal : List.of(sucursalLanus, sucursalAvellaneda, sucursalLomas)) {
			for (int i = 0; i < 10; i++) {
				Empleado vendedor = sucursal.getEmpleados().get(i % sucursal.getEmpleados().size());
				Empleado cajero = sucursal.getEmpleados().get((i + 1) % sucursal.getEmpleados().size());
				Cliente cliente = clientes.get(i % clientes.size());
				
				List<ProductoVenta> productosVendidos = new ArrayList<>();
				for (Producto producto : productos) {
					productosVendidos.add(new ProductoVenta(idVenta, producto, 1));
				}
				
				String formaPago = formasDePago[random.nextInt(formasDePago.length)];
				
				Venta venta = new Venta(idVenta++, LocalDateTime.now().toString(), String.valueOf(idVenta), formaPago, cliente, vendedor, cajero, sucursal, productosVendidos);
				ventas.add(venta);
			}
		}

		// Serializar ventas a JSON y guardar en un archivo
		Gson gson = new GsonBuilder().enableComplexMapKeySerialization().serializeNulls().setPrettyPrinting().create();

		String json = gson.toJson(ventas);
		System.out.println(json);

		try (FileWriter writer = new FileWriter("json/ventas.json")) {
			writer.write(json);
		} catch (IOException e) {
			e.printStackTrace();
		}

		mongoClient.close();
	}
}
