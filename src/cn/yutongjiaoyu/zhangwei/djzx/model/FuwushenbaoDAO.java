package cn.yutongjiaoyu.zhangwei.djzx.model;

import java.sql.Timestamp;
import java.util.List;
import java.util.Set;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.hibernate.Query;
import org.hibernate.criterion.Example;

/**
 * A data access object (DAO) providing persistence and search support for
 * Fuwushenbao entities. Transaction control of the save(), update() and
 * delete() operations can directly support Spring container-managed
 * transactions or they can be augmented to handle user-managed Spring
 * transactions. Each of these methods provides additional information for how
 * to configure it for the desired type of transaction control.
 * 
 * @see cn.yutongjiaoyu.zhangwei.djzx.model.Fuwushenbao
 * @author MyEclipse Persistence Tools
 */
public class FuwushenbaoDAO extends BaseHibernateDAO {
	private static final Log log = LogFactory.getLog(FuwushenbaoDAO.class);
	// property constants
	public static final String SHENBAOXIANGXI = "shenbaoxiangxi";
	public static final String ZHUANGTAI = "zhuangtai";
	public static final String BEIZHU = "beizhu";

	public void save(Fuwushenbao transientInstance) {
		log.debug("saving Fuwushenbao instance");
		try {
			getSession().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(Fuwushenbao persistentInstance) {
		log.debug("deleting Fuwushenbao instance");
		try {
			getSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Fuwushenbao findById(java.lang.Integer id) {
		log.debug("getting Fuwushenbao instance with id: " + id);
		try {
			Fuwushenbao instance = (Fuwushenbao) getSession().get(
					"cn.yutongjiaoyu.zhangwei.djzx.model.Fuwushenbao", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(Fuwushenbao instance) {
		log.debug("finding Fuwushenbao instance by example");
		try {
			List results = getSession()
					.createCriteria(
							"cn.yutongjiaoyu.zhangwei.djzx.model.Fuwushenbao")
					.add(Example.create(instance)).list();
			log.debug("find by example successful, result size: "
					+ results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}

	public List findByProperty(String propertyName, Object value) {
		log.debug("finding Fuwushenbao instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from Fuwushenbao as model where model."
					+ propertyName + "= ?";
			Query queryObject = getSession().createQuery(queryString);
			queryObject.setParameter(0, value);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByShenbaoxiangxi(Object shenbaoxiangxi) {
		return findByProperty(SHENBAOXIANGXI, shenbaoxiangxi);
	}

	public List findByZhuangtai(Object zhuangtai) {
		return findByProperty(ZHUANGTAI, zhuangtai);
	}

	public List findByBeizhu(Object beizhu) {
		return findByProperty(BEIZHU, beizhu);
	}

	public List findAll() {
		log.debug("finding all Fuwushenbao instances");
		try {
			String queryString = "from Fuwushenbao";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public Fuwushenbao merge(Fuwushenbao detachedInstance) {
		log.debug("merging Fuwushenbao instance");
		try {
			Fuwushenbao result = (Fuwushenbao) getSession().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(Fuwushenbao instance) {
		log.debug("attaching dirty Fuwushenbao instance");
		try {
			getSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Fuwushenbao instance) {
		log.debug("attaching clean Fuwushenbao instance");
		try {
			getSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}
}