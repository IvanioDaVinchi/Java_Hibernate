package com.company.Handlers;

import com.company.*;
import com.company.dao.*;

import java.util.List;
import java.util.Scanner;

public class InsertHandler
{
    static Scanner in = new Scanner(System.in);
    public void InsertInCars()
    {
        System.out.println("Введите марку авто");
        String carBrand = in.next();
        System.out.println("Введите модель авто");
        String carModel = in.next();
        System.out.println("Введите скорость авто");
        Double speed = in.nextDouble();
        System.out.println("Введите разгон до 100 авто");
        Double racing = in.nextDouble();
        System.out.println("Введите тип двигателя авто");
        int engineType = in.nextInt();
        System.out.println("Введите тип трансмиссии авто");
        int transmissionType = in.nextInt();
        System.out.println("Введите цвет кузова авто");
        String color = in.next();
        System.out.println("Введите цену авто");
        int price = in.nextInt();
        EnginetypesEntity engine = new EnginetypesEntity();
        EngineTypesDao engineDao = new EngineTypesDao();
        List<EnginetypesEntity> listEngines = engineDao.GetListEngines();
        engine = listEngines.get(engineType);
        TransmissiontypesEntity transmission = new TransmissiontypesEntity();
        TransmissionTypesDao transmissionDao = new TransmissionTypesDao();
        List<TransmissiontypesEntity> listTransmisson = transmissionDao.GetListTransmissions();
        transmission = listTransmisson.get(transmissionType);
        CarsEntity car = new CarsEntity();
        car.setCarBrand(carBrand);
        car.setCarModel(carModel);
        car.setEngineTypeByIdEngine(engine);
        car.setTransmissionTypeByIdTransmission(transmission);
        car.setSpeed(speed);
        car.setRacing(racing);
        car.setCarColor(color);
        car.setPrice(price);
        CarsDao carsDao = new CarsDao();
        List<CarsEntity> listCars = carsDao.GetListCars();
        car.setId(listCars.size()+1);
        carsDao.Insert(car);
    }
    public void InsertInCarSupplier()
    {
        System.out.println("Введите номер авто");
        int idCar = in.nextInt();
        System.out.println("Введите номер поставщика");
        int idSupplier = in.nextInt();
        CarsDao carsDao = new CarsDao();
        List<CarsEntity> listCars = carsDao.GetListCars();
        CarsEntity car = listCars.get(idCar);
        SuppliersDao suppliersDao = new SuppliersDao();
        List<SuppliersEntity> listSuppliers = suppliersDao.GetListSuppliers();
        SuppliersEntity supplier = listSuppliers.get(idSupplier);
        CarSupplierEntity carSupplier = new CarSupplierEntity();
        CarsSupplerDao carsSupplerDao = new CarsSupplerDao();
        List<CarSupplierEntity> carSupplierList = carsSupplerDao.GetListCarsSupplers();
        carSupplier.setCarsByIdCar(car);
        carSupplier.setSupplierByIdSupplier(supplier);
        carSupplier.setId(carSupplierList.size()+1);
        carsSupplerDao.Insert(carSupplier);
    }
    public void InsertInClient()
    {
        ClientsDao clientsDao = new ClientsDao();
        System.out.println("Введите фамилию клиента");
        String fName = in.next();
        System.out.println("Введите имя клиента");
        String sName = in.next();
        System.out.println("Введите отчество клиента");
        String patronymic = in.next();
        System.out.println("Введите телефон клиента");
        String phoneNumber = in.next();
        List<ClientsEntity> listClients = clientsDao.GetListClients();
        ClientsEntity client = new ClientsEntity();
        client.setId(listClients.size() + 1);
        client.setFirstName(fName);
        client.setSecondName(sName);
        client.setPatronymic(patronymic);
        client.setPhoneNumber(phoneNumber);
        clientsDao.Insert(client);
    }
    public void InsertInSuppliers()
    {
        SuppliersDao suppliersDao = new SuppliersDao();
        SuppliersEntity supplier = new SuppliersEntity();
        System.out.println("Введите наименование нового поставщика");
        String nameSupplier = in.next();
        List<SuppliersEntity> listSuppliers = suppliersDao.GetListSuppliers();
        supplier.setId(listSuppliers.size() + 1);
        supplier.setNameSupplier(nameSupplier);
        suppliersDao.Insert(supplier);
    }
    public void InsertInEmployees()
    {
        EmployeesDao employeesDao = new EmployeesDao();
        System.out.println("Введите фамилию работника");
        String fName = in.next();
        System.out.println("Введите имя работника");
        String sName = in.next();
        System.out.println("Введите отчество работника");
        String patronymic = in.next();
        System.out.println("Введите телефон работника");
        String phoneNumber = in.next();
        System.out.println("Введите должность работника");
        String position = in.next();
        List<EmployeersEntity> listEployees = employeesDao.GetListEmployeers();
        EmployeersEntity employee = new EmployeersEntity();
        employee.setId(listEployees.size() + 1);
        employee.setFirstName(fName);
        employee.setSecondName(sName);
        employee.setPatronymic(patronymic);
        employee.setPhoneNumber(phoneNumber);
        employee.setPosition(position);
        employeesDao.Insert(employee);
    }
    public void InsertInEngineTypes()
    {
        System.out.println("Введите ниаименование двигателя");
        String nameEngine = in.next();
        System.out.println("Введите объем двигателя");
        String capacity = in.next();
        System.out.println("Введите мощность двигателя");
        String power = in.next();
        EngineTypesDao engineDao = new EngineTypesDao();

    }
}
