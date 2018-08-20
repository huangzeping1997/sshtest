package com.java1234.action;

import com.java1234.entity.*;
import com.java1234.service.*;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import java.util.List;

@Component
public class InitAction implements ServletContextListener, ApplicationContextAware{

    private static ApplicationContext applicationContext;

    @Override
    public void contextInitialized(ServletContextEvent servletContextEvent) {

        ServletContext servletContext = servletContextEvent.getServletContext();

        ProductBigTypeService productBigTypeService = (ProductBigTypeService) applicationContext.getBean("productBigTypeService");
        List<ProductBigType> productBigTypeList = productBigTypeService.findAllProductBigType();
        servletContext.setAttribute("productBigTypeList", productBigTypeList);

        TagService tagService = (TagService) applicationContext.getBean("tagService");
        List<Tag> tagList = tagService.findTagList();
        servletContext.setAttribute("tagList", tagList);

        NoticeService noticeService = (NoticeService) applicationContext.getBean("noticeService");
        List<Notice> noticeList = noticeService.findNoticeList(null, new PageBean(1,7));
        servletContext.setAttribute("noticeList", noticeList);

        NewsService newsService = (NewsService) applicationContext.getBean("newsService");
        List<News> newsList = newsService.findNewsList(null, new PageBean(1,7));
        servletContext.setAttribute("newsList", newsList);

        ProductService productService = (ProductService) applicationContext.getBean("productService");
        Product hotProduct = new Product();
        hotProduct.setHot(1);
        List<Product> hotProductList = productService.findProductList(hotProduct, new PageBean(1,8));
        servletContext.setAttribute("hotProductList", hotProductList);

        Product specialPriceProduct = new Product();
        specialPriceProduct.setSpecialPrice(1);
        List<Product> specialPriceProductList = productService.findProductList(specialPriceProduct, new PageBean(1,8));
        servletContext.setAttribute("specialPriceProductList", specialPriceProductList);
    }

    @Override
    public void contextDestroyed(ServletContextEvent servletContextEvent) {

    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
    }
}
