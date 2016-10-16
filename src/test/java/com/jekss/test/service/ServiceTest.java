package com.jekss.test.service;


import com.jekss.entityes.Product;
import com.jekss.service.ProductService;
import com.jekss.test.config.TestDataBaseConfig;

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
    private Environment env;

    @Resource
    private ProductService productService;

    @Resource
    private ParsingCsvInBase base;



    @Before
    public void setUp() throws Exception {
        em = emf.createEntityManager();
    }

//    @Test
//    public void createDB() {
//        Product productAll = new Product();
//        productAll.setName("prod");
//        productService.addProduct(productAll);
//    }

//    @Test
//    public void craDB(){
//        base.setCsvProdAll( "8128_21_07_201.csv","/home/jekss");
//    }
//
    @Test
    public void workInRepo(){
        for (String p :
                productService.getCategName1All()) {
            System.out.println(p);
        }
        //System.out.println(p.getName());

    }

//    @Test
//    public void worTest(){
//        for (Product p :
//                productService.getAll()) {
//            System.out.println(p.toString());
//        }
//    }


}
