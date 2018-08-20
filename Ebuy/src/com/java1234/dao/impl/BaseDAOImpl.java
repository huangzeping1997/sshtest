package com.java1234.dao.impl;

import com.java1234.dao.BaseDAO;
import com.java1234.entity.PageBean;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.io.Serializable;
import java.util.List;

@Repository("baseDao")
public class BaseDAOImpl<T> implements BaseDAO<T>{

    private SessionFactory sessionFactory;

    public SessionFactory getSessionFactory() {
        return sessionFactory;
    }

    @Autowired
    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    public Session getSession(){
        return sessionFactory.getCurrentSession();
    }

    @Override
    public Serializable save(T o) {
        return null;
    }

    @Override
    public void delete(T o) {

    }

    @Override
    public void update(T o) {

    }

    @Override
    public void saveOrUpdate(T o) {

    }

    @Override
    public void merge(T o) {

    }

    @Override
    public List<T> find(String hql) {
        return this.getSession().createQuery(hql).list();
    }

    @Override
    public List<T> find(String hql, Object[] param) {
        return null;
    }

    @Override
    public List<T> find(String hql, List<Object> param) {
        return null;
    }

    @Override
    public List<T> find(String hql, Object[] param, PageBean pageBean) {
        Query query = getSession().createQuery(hql);
        if(param != null && param.length>0){
            for(int i=0; i<param.length; i++){
                query.setParameter(i,param[i]);
            }
        }
        return query.setFirstResult(pageBean.getStart()).setMaxResults(pageBean.getPageSize()).list();
    }

    @Override
    public List<T> find(String hql, List<Object> param, PageBean pageBean) {
        Query query = getSession().createQuery(hql);
        if(param != null && param.size()>0){
            for(int i=0; i<param.size(); i++){
                query.setParameter(i, param.get(i));
            }
        }
        return query.setFirstResult(pageBean.getStart()).setMaxResults(pageBean.getPageSize()).list();
    }

    @Override
    public T get(Class<T> c, Serializable id) {
        return null;
    }

    @Override
    public T get(String hql, Object[] param) {
        return null;
    }

    @Override
    public T get(String hql, List<Object> param) {
        return null;
    }

    @Override
    public Long count(String hql) {
        return null;
    }

    @Override
    public Long count(String hql, Object[] param) {
        return null;
    }

    @Override
    public Long count(String hql, List<Object> param) {
        return null;
    }

    @Override
    public Integer executeHql(String hql) {
        return null;
    }

    @Override
    public Integer executeHql(String hql, Object[] param) {
        return null;
    }

    @Override
    public Integer executeHql(String hql, List<Object> param) {
        return null;
    }

    @Override
    public Integer executeSql(String sql) {
        return null;
    }
}
