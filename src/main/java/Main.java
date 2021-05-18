import com.company.OutTable;
import org.hibernate.HibernateException;
import org.hibernate.Metamodel;
import org.hibernate.query.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import java.util.Scanner;

import javax.persistence.metamodel.EntityType;

import java.util.Map;

public class Main
{
    static Scanner in = new Scanner(System.in);
    private static final SessionFactory ourSessionFactory;
    public static void PrintMenu()
    {
        System.out.println("1) Вывод таблиц");
        System.out.println("2) Добавление");
        System.out.println("3) Удаление");
        System.out.println("4) Редактирование");
    }

    static
    {
        try
        {
            Configuration configuration = new Configuration();
            configuration.configure();

            ourSessionFactory = configuration.buildSessionFactory();
        }
        catch (Throwable ex)
        {
            throw new ExceptionInInitializerError(ex);
        }
    }

    public static Session getSession() throws HibernateException
    {
        return ourSessionFactory.openSession();
    }

    public static void main(final String[] args) throws Exception
    {
        final Session session = getSession();
        try
        {
            System.out.println("querying all the managed entities...");
            final Metamodel metamodel = session.getSessionFactory().getMetamodel();
            for (EntityType<?> entityType : metamodel.getEntities())
            {
                final String entityName = entityType.getName();
                final Query query = session.createQuery("from " + entityName);
                System.out.println("executing: " + query.getQueryString());
                for (Object o : query.list())
                {
                    System.out.println("  " + o);
                }
            }
        }
        finally
        {
            session.close();
        }
        while(true)
        {
            PrintMenu();
            int sw = in.nextInt();
            switch (sw)
            {
                case 1:
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
                    int sww = in.nextInt();
                    OutTable outTable = new OutTable();
                    switch (sww)
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
                    break;
                }
                case 2:
                {

                    break;
                }
            }
        }
    }
}