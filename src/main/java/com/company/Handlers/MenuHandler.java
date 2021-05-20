package com.company.Handlers;

import com.company.OutTable;

import java.util.Scanner;

public class MenuHandler
{
    static Scanner in = new Scanner(System.in);
    public void PrintMenu()
    {
        System.out.println("1) Вывод таблиц");
        System.out.println("2) Добавление");
        System.out.println("3) Удаление");
        System.out.println("4) Редактирование");
    }
    public void PrintTablesName()
    {
        System.out.println("Введите номер таблицы");
        System.out.println("1) Cars");
        System.out.println("2) Clients ");
        System.out.println("3) EngineTypes");
        System.out.println("4) TransmissionTypes");
        System.out.println("5) Employeers");
        System.out.println("6) Suppliers");
        System.out.println("7) Sales");
        System.out.println("8) Car_Supplier");
    }
    public void SwitchInMenu(int sw)
    {
        switch (sw)
        {
            case 1:
            {
                PrintTablesName();
                int sww = in.nextInt();
                SwitchTablePrint(sww);
                break;
            }
            case 2:
            {
                PrintTablesName();
                int sww = in.nextInt();

                break;
            }
        }
    }
    public void SwitchTablePrint(int sw)
    {
        OutTable outTable = new OutTable();
        switch (sw)
        {
            case 1:
            {
                outTable.PrintCarsTable();
                break;
            }
            case 2:
            {
                outTable.PrintClientsTable();
                break;
            }
            case 3:
            {
                outTable.PrintEngineTypesTable();
                break;
            }
            case 4:
            {
                outTable.PrintTransmissionTypesTable();
                break;
            }
            case 5:
            {
                outTable.PrintEmployeersTable();
                break;
            }
            case 6:
            {
                outTable.PrintSuppliersTable();
                break;
            }
            case 7:
            {
                outTable.PrintSalesTable();
                break;
            }
            case 8:
            {
                outTable.PrintCarSupplierTable();
                break;
            }
        }
    }
    public void SwitchOnInsertInTables(int sw)
    {
        InsertHandler insertHandler = new InsertHandler();
        switch (sw)
        {
            case 1:
            {
                insertHandler.InsertInCars();
                break;
            }
            case 2:
            {
                insertHandler.InsertInClient();
                break;
            }
            case 3:
            {
                insertHandler.InsertInEngineTypes();
                break;
            }
            case 4:
            {
                insertHandler.InsertInTransmissionType();
                break;
            }
            case 5:
            {
                insertHandler.InsertInEmployees();
                break;
            }
            case 6:
            {
                insertHandler.InsertInSuppliers();
                break;
            }
            case 7:
            {

                break;
            }
            case 8:
            {
                insertHandler.InsertInCarSupplier();
                break;
            }
        }
    }
}
