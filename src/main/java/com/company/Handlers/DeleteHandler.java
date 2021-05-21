package com.company.Handlers;

import com.company.*;
import com.company.dao.*;

import java.util.List;
import java.util.Scanner;

public class DeleteHandler
{
    static Scanner in = new Scanner(System.in);
    public void DeleteFromCars()
    {
        System.out.println("Введите id машины, которую хотите удалить");
        int idCar = in.nextInt();
        CarsDao carsDao = new CarsDao();
        List<CarsEntity> listCars = carsDao.GetListCars();
        CarsEntity car = listCars.get(idCar);
        carsDao.Delete(car);
    }
    public void DeleteFromClient()
    {
        System.out.println("Введите id клиента, которого хотите удалить");
        int idClient = in.nextInt();
        ClientsDao clientsDao = new ClientsDao();
        List<ClientsEntity> listClients = clientsDao.GetListClients();
        ClientsEntity client = listClients.get(idClient);
        clientsDao.Delete(client);
    }
    public void DeleteFromCarSuppliers()
    {
        System.out.println("Введите номер поставки, которую хотите удалить");
        int id = in.nextInt();
        CarsSupplerDao carsSupplerDao = new CarsSupplerDao();
        List<CarSupplierEntity> listCarSupplies = carsSupplerDao.GetListCarsSupplers();
        CarSupplierEntity carsupplier = listCarSupplies.get(id);
        carsSupplerDao.Delete(carsupplier);
    }
    public void DeleteFromSupplier()
    {
        System.out.println("Введите id поставщика, которого хотите удалить");
        int idSupplier = in.nextInt();
        SuppliersDao suppliersDao = new SuppliersDao();
        List<SuppliersEntity> listSuppliers = suppliersDao.GetListSuppliers();
        SuppliersEntity supplier = listSuppliers.get(idSupplier);
        suppliersDao.Delete(supplier);
    }
    public void DeleteFromEmployee()
    {
        System.out.println("Введите id сотрудника, которого хотите удалить");
        int idEmploee = in.nextInt();
        EmployeesDao employeesDao = new EmployeesDao();
        List<EmployeersEntity> listEmployees = employeesDao.GetListEmployeers();
        EmployeersEntity employee = listEmployees.get(idEmploee);
        employeesDao.Delete(employee);
    }
    public void DeleteFromEngineTypes()
    {
        System.out.println("Введите id двигателя, кторый хотите удалить");
        int idEngine = in.nextInt();
        EngineTypesDao engineTypesDao = new EngineTypesDao();
        List<EnginetypesEntity> listEngineTypes = engineTypesDao.GetListEngines();
        EnginetypesEntity engine = listEngineTypes.get(idEngine);
        engineTypesDao.Delete(engine);
    }
    public void DeleteFromTransmissionTypes()
    {
        System.out.println("Введите id трансмиссии, которую хотите удалить");
        int id = in.nextInt();
        TransmissionTypesDao transmissionTypesDao = new TransmissionTypesDao();
        List<TransmissiontypesEntity> listTransmissons = transmissionTypesDao.GetListTransmissions();
        TransmissiontypesEntity transmission = listTransmissons.get(id);
        transmissionTypesDao.Delete(transmission);
    }
    public void DeleteFromSales()
    {
        System.out.println("Введите id продажи для удаления");
        int id = in.nextInt();
        SalesDao salesDao = new SalesDao();
        List<SalesEntity> listSales = salesDao.GetListSales();
        SalesEntity sale = listSales.get(id);
        salesDao.Delete(sale);
    }
}
