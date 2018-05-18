package cn.yutongjiaoyu.zhangwei.djzx.model;

import java.sql.Timestamp;
import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.hibernate.Query;
import org.hibernate.criterion.Example;

/**
 * A data access object (DAO) providing persistence and search support for
 * Fuwujilu entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see cn.yutongjiaoyu.zhangwei.djzx.model.Fuwujilu
 * @author MyEclipse Persistence Tools
 */
public class FuwujiluDAO extends BaseHibernateDAO {
	private static final Log log = LogFactory.getLog(FuwujiluDAO.class);
	// property constants
	public static final String ZHUANGTAI = "zhuangtai";
	public static final String BEIZHUXINXI = "beizhuxinxi";

	public void save(Fuwujilu transientInstance) {
		log.debug("saving Fuwujilu instance");
		try {
			getSession().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(Fuwujilu persistentInstance) {
		log.debug("deleting Fuwujilu instance");
		try {
			getSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Fuwujilu findById(java.lang.Integer id) {
		log.debug("getting Fuwujilu instance with id: " + id);
		try {
			Fuwujilu instance = (Fuwujilu) getSession().get(
					"cn.yutongjiaoyu.zhangwei.djzx.model.Fuwujilu", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(Fuwujilu instance) {
		log.debug("finding Fuwujilu instance by example");
		try {
			List results = getSession()
					.createCriteria(
							"cn.yutongjiaoyu.zhangwei.djzx.model.Fuwujilu")
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
		log.debug("finding Fuwujilu instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from Fuwujilu as model where model."
					+ propertyName + "= ?";
			Query queryObject = getSession().createQuery(queryString);
			queryObject.setParameter(0, value);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByZhuangtai(Object zhuangtai) {
		return findByProperty(ZHUANGTAI, zhuangtai);
	}

	public List findByBeizhuxinxi(Object beizhuxinxi) {
		return findByProperty(BEIZHUXINXI, beizhuxinxi);
	}

	public List findAll() {
		log.debug("finding all Fuwujilu instances");
		try {
			String queryString = "from Fuwujilu";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public Fuwujilu merge(Fuwujilu detachedInstance) {
		log.debug("merging Fuwujilu instance");
		try {
			Fuwujilu result = (Fuwujilu) getSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(Fuwujilu instance) {
		log.debug("attaching dirty Fuwujilu instance");
		try {
			getSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Fuwujilu instance) {
		log.debug("attaching clean Fuwujilu instance");
		try {
			getSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}
}