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



            base.setBufferedReader(env.getRequiredProperty(PATH_IN_FILE)); // устанавливаем звачение BufferedReader
            //base.setCountAll();                                                   // когда запускаем счетчик общего колличества трок в файле
            //System.out.println(base.getCountAll() +" get count all in test");   // счетчик срабатывает нормально но дальше мы пытаемся запустить
        // загрузку файла в базу где пропадает bufferedReader
        // если выключить счетчик то загрузка проходит нормально
        //
            base.setCsv(env.getRequiredProperty(PATH_IN_FILE));




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
