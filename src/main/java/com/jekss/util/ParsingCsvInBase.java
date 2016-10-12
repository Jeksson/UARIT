package com.jekss.util;

import com.jekss.entityes.*;
import com.jekss.repository.ProductRepository;
import com.jekss.service.*;
import com.jekss.util.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/**
 * Created by jekss on 20.07.16.
 */
@Service
@PropertySource("classpath:app.properties")
public class ParsingCsvInBase {

    private static final String PATH_IN_FILE = "path.in.file";


    String fileName;
    String oneStringInFile = "v_products_id;v_products_name_1;v_products_price;v_products_price_UAH;v_date_added;v_manufacturers_name;v_categories_name_1;v_categories_name_2;v_categories_name_3;v_categories_name_4;v_categories_name_5;v_categories_name_6;v_status;v_picture";


    @Resource
    private Environment env;

    private volatile BufferedReader bufferedReader;

    private Product product = new Product();



    // cчетчик считаных строк из файла csv находится в setCsv();
    private volatile int count = 0;

    private volatile int countAll;

    private volatile String savePath;

    private List <Product> lp;


    @Resource
    private ProductService productService;

    @Resource
    private ProductRepository productRepository;


    //вынес логику из контроллера
    public boolean uploadFile(MultipartFile multipartFile, HttpServletRequest request) {
        BufferedOutputStream stream = null;

        System.out.println("+++++++++++++===");

        setSavePath(request);
        fileName = multipartFile.getOriginalFilename();
        System.out.println(fileName);
        if (!multipartFile.isEmpty()) {


            try {
                byte[] bytes = multipartFile.getBytes();

                File fileSaveDir = new File(getSavePath());
                if (!fileSaveDir.exists()) {
                    fileSaveDir.mkdir();
                }
                stream = new BufferedOutputStream(
                        new FileOutputStream(fileSaveDir + File.separator + fileName));
                stream.write(bytes);

            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                try {
                    stream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

            return true;

        } else {
            return false;
        }
    }


    //метод определения расширения файла
    public String getFileExtension(MultipartFile multipartFile) {
        String fileName = multipartFile.getOriginalFilename();
        // если в имени файла есть точка и она не является первым символом в названии файла
        if (fileName.lastIndexOf(".") != -1 && fileName.lastIndexOf(".") != 0)
            // то вырезаем все знаки после последней точки в названии файла, то есть ХХХХХ.txt -> txt
            return fileName.substring(fileName.lastIndexOf(".") + 1);
            // в противном случае возвращаем заглушку, то есть расширение не найдено
        else return " расширение не найдено";
    }


  // парсинг и загрузка файла + счетчик count;

    @Transactional
    public void setCsvProdAll(String name, String path) {

        lp = new ArrayList<>();

        String mtp = "";
        BufferedReader bf = null;
        //setBufferedReader(path);
        try {
            bf = bufferedReader = new BufferedReader(
                    new InputStreamReader(
                            new FileInputStream(
                                    new File(path + File.separator + name)),
                            "windows-1251"));
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }


        try {
            while ((mtp = bf.readLine()) != null) {
                //System.out.println(" while in work");

                setCount(getCount() + 1);


                if (getCount() > 1 && !mtp.equals(oneStringInFile)) {
                    String[] s = mtp.split(";");
                    //System.out.println(s.length);
                    //System.out.println(s[0].trim());
                    product.setId_product(Integer.parseInt(s[0].trim()));

                    //System.out.println(s[1] + " 1");

                    product.setName(s[1] + " 1");

                    //System.out.println(s[2] + " 2");
                    if (s[2].equals(null) || s[2].equals("")) {
                        product.setPrice(0.0);
                    } else if (!s[2].equals(null) || !s[2].equals("")) {
                        product.setPrice(Double.parseDouble(s[2].replace(',', '.')));
                    }

                    //System.out.println(s[4] + " 4");
                    product.setDateAdded(s[4]);

                    //System.out.println(s[5] + " 5");
                    if (s[5].equals(null) || s[5].trim().equals("")) {
                        product.setManufactures("NoNaMe");
                    } else if (!s[5].equals(null) || !s[5].trim().equals("")) {
                        product.setManufactures(s[5]);
                    }

                    //System.out.println(s[6] + " 6");
                    if (s[6].equals(null) || s[6].trim().equals("")) {
                        product.setCategoriesName1("\"NoCat1\"");
                    } else {
                        product.setCategoriesName1(s[6]);
                    }


                    //System.out.println(s[7] + " 7");
                    if (s[7].equals(null) || s[7].trim().equals("")) {
                        product.setCategoriesName2("\"NoCat2\"");
                    } else if (!s[7].equals(null) || !s[7].equals("")) {
                        product.setCategoriesName2(s[7]);
                    }

                    //System.out.println(s[8] + " 8");
                    if (s[8].equals(null) || s[8].equals("")) {
                        product.setCategoriesName3("\"NoCat3\"");
                    } else if (!s[8].equals(null) || !s[8].equals("")) {
                        product.setCategoriesName3(s[8]);
                    }

                    //System.out.println(s[9] + " 9");
                    if (s[9].equals(null) || s[9].equals("")) {
                        product.setCategoriesName4("\"NoCat4\"");
                    } else if (!s[9].equals(null) || !s[9].equals("")) {
                        product.setCategoriesName4(s[9]);
                    }

                    //System.out.println(s[10] + " 10");
                    if (s[10].equals(null) || s[10].equals("")) {
                        product.setCategoriesName5("\"NoCat5\"");

                    } else if (!s[10].equals(null) || !s[10].equals("")) {
                        product.setCategoriesName5(s[10]);
                    }

                    //System.out.println(s[13] + " 13");

                }

                //productService.addProduct(product);
                //lp.add(product);
                //System.out.println(product.toString());
                //productService.saveNewProduct(product);
                productService.saveNewProduct(product);
                System.out.println("--------------------------------------------------   " + getCount());
            }
            //productRepository.save(lp);
            //lp.clear();

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                bufferedReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }


    // берет count & countAll и вычисляет процент прохода загрузки файла в базу

    public int getProcentUploadFileInBase() {
        //System.out.println(getCountAll() + " get procent upload method");
        //System.out.println(" in procent upload file in base");
        //System.out.println(" count = " + getCount() + " get count //////");
        int result = 0;
        if (getCount() != 0) {
            result = (getCount() * 100) / getCountAll();
        } else System.out.println(" count = " + getCount() + "=-=-=-=-=-=-=-=-=-=");

        return result;
    }

    // открывает файл и считает количчество строк которые пишутся в countAll;

    public synchronized void setCountAll(String name, String path) {
        int couAll = 0;
        BufferedReader bf = null;
        try {
            bf = bufferedReader = new BufferedReader(
                    new InputStreamReader(
                            new FileInputStream(
                                    new File(path + File.separator + name)),
                            "windows-1251"));
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        try {
            while (bf.readLine() != null) {
                couAll++;
            }
        } catch (IOException e) {
            e.printStackTrace();
            try {
                bufferedReader.close();
            } catch (IOException e1) {
                e1.printStackTrace();
            }
        }
        this.countAll = couAll;
    }

    public synchronized int getCountAll() {
        return countAll;
    }


    public void setSavePath(HttpServletRequest request) {
        //System.out.println(request.getServletContext().getRealPath("") + env.getRequiredProperty(PATH_IN_FILE) + "то что записалось в переменную");
        this.savePath = request.getServletContext().getRealPath("") + env.getRequiredProperty(PATH_IN_FILE);
    }

    public String getSavePath() {
        return savePath;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

}
