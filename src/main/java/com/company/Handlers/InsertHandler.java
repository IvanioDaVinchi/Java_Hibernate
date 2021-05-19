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
        Double patronymic = in.nextDouble();
        System.out.println("Введите телефон клиента");
        Double phoneNumber = in.nextDouble();
    }
}
