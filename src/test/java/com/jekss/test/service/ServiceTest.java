package com.jekss.test.service;


import com.jekss.entityes.ManufacturesName;
import com.jekss.service.CategoriesName1Service;
import com.jekss.service.ManufacturesNameService;
import com.jekss.service.ProductService;
import com.jekss.test.config.TestDataBaseConfig;
import com.jekss.test.util.ProductUtil;

import com.jekss.util.ParsingCsvInBase;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;


import javax.annotation.Resource;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import java.io.IOException;


@DirtiesContext
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = TestDataBaseConfig.class)
@PropertySource("classpath:app.properties")
@WebAppConfiguration
public class ServiceTest {

    private static final String PATH_IN_FILE = "path.in.file2";
    private static final String FILE_NAME = "name.file";

    @Resource
    private EntityManagerFactory emf;
    protected EntityManager em;

    @Resource
    Environment env;

    @Resource
    private ProductService productService;

    @Resource
    private CategoriesName1Service categoriesName1Service;

    @Resource
    private ManufacturesNameService manufacturesNameService;

    @Resource
    ParsingCsvInBase base;

    @Before
    public void setUp() throws Exception {
        em = emf.createEntityManager();
    }



//    @Test
//    public void testSaveProduct() throws Exception {
//        System.out.println((productService.addProduct(ProductUtil.createProduct())).toString());
//    }
//    @Test
//    public void testSaveProductAll(){
//        System.out.println((productService.addProduct(ProductUtil.createProductAll())).toString());
//
//        System.out.println((manufacturesNameService.getByIdManufacturesName(1).toString()));
//        ManufacturesName manufacturesName = new ManufacturesName();
//        ManufacturesName manufacturesNameq = new ManufacturesName();
//        manufacturesName.setName("qwerty");
//        manufacturesNameq.setName("zxcvb");
//        manufacturesNameService.addManufacturesName(manufacturesName);
//        manufacturesNameService.addManufacturesName(manufacturesNameq);
//    }

    @Test
    public void testSETCSV(){

        //запуск счетчика общего колличества фалов
            base.setCountAll(env.getRequiredProperty(FILE_NAME), env.getRequiredProperty(PATH_IN_FILE));
            System.out.println(base.getCountAll() +" get count all in test");


// перед запуском загрузки в бвзу в другом потоке запускаем вычисление процентов
        final Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                do {
                    System.out.println(base.getProcentUploadFileInBase()+ "     %%%%%%%%%%%%%%%");

                    if (base.getProcentUploadFileInBase() == 100) System.out.println("DONE!!!!!!!!!!!");
                    try {
                        Thread.sleep(500);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }while (base.getProcentUploadFileInBase() < 100);
            }
        });

        thread.start();

        // запуск загрузки в базу
        base.setCsv(env.getRequiredProperty(FILE_NAME), env.getRequiredProperty(PATH_IN_FILE));

    }



//    @Test
//    public void testSaveCategories1(){
//        CategoriesName1 categoriesName1 = new CategoriesName1();
//        categoriesName1.setName("categoriesNAME11111");
//        System.out.println(categoriesName1Service.addCategoriesName1(categoriesName1).toString());
//    }
//

//    @Test
//    public void testCash(){
//
//        cashingDB.getCashingManufacturedName("manufactur", manufacturesNameService.getAll());
//    }
//
//    @Test
//    public void testManufAll(){
//        System.out.println((productService.addProduct(ProductUtil.createProductAll())).toString());
//
//        System.out.println((manufacturesNameService.getByIdManufacturesName(1).toString()));
//        ManufacturesName manufacturesName = new ManufacturesName();
//        ManufacturesName manufacturesNameq = new ManufacturesName();
//        manufacturesName.setName("qwerty");
//        manufacturesNameq.setName("zxcvb");
//        manufacturesNameService.addManufacturesName(manufacturesName);
//        manufacturesNameService.addManufacturesName(manufacturesNameq);
//        for (int i = 0; i < (manufacturesNameService.getAll().size() - 1); i++){
//            System.out.println(manufacturesNameService.getAll().get(i).getName().toString()+"----");
//        }
//        CashingDB.getCashingManufacturedName("manufactur", manufacturesNameService.getAll());
//    }

}
