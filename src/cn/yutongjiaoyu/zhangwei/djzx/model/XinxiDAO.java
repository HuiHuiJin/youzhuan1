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
 * A data access object (DAO) providing persistence and search support for Xinxi
 * entities. Transaction control of the save(), update() and delete() operations
 * can directly support Spring container-managed transactions or they can be
 * augmented to handle user-managed Spring transactions. Each of these methods
 * provides additional information for how to configure it for the desired type
 * of transaction control.
 * 
 * @see cn.yutongjiaoyu.zhangwei.djzx.model.Xinxi
 * @author MyEclipse Persistence Tools
 */
public class XinxiDAO extends BaseHibernateDAO {
	private static final Log log = LogFactory.getLog(XinxiDAO.class);
	// property constants
	public static final String XINXIBIAOTI = "xinxibiaoti";
	public static final String XINXIFUBIAOTI = "xinxifubiaoti";
	public static final String XINXINEIRONG = "xinxineirong";
	public static final String ZHUANGTAI = "zhuangtai";

	public void save(Xinxi transientInstance) {
		log.debug("saving Xinxi instance");
		try {
			getSession().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(Xinxi persistentInstance) {
		log.debug("deleting Xinxi instance");
		try {
			getSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Xinxi findById(java.lang.Integer id) {
		log.debug("getting Xinxi instance with id: " + id);
		try {
			Xinxi instance = (Xinxi) getSession().get(
					"cn.yutongjiaoyu.zhangwei.djzx.model.Xinxi", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(Xinxi instance) {
		log.debug("finding Xinxi instance by example");
		try {
			List results = getSession()
					.createCriteria("cn.yutongjiaoyu.zhangwei.djzx.model.Xinxi")
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
		log.debug("finding Xinxi instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from Xinxi as model where model."
					+ propertyName + "= ?";
			Query queryObject = getSession().createQuery(queryString);
			queryObject.setParameter(0, value);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByXinxibiaoti(Object xinxibiaoti) {
		return findByProperty(XINXIBIAOTI, xinxibiaoti);
	}

	public List findByXinxifubiaoti(Object xinxifubiaoti) {
		return findByProperty(XINXIFUBIAOTI, xinxifubiaoti);
	}

	public List findByXinxineirong(Object xinxineirong) {
		return findByProperty(XINXINEIRONG, xinxineirong);
	}

	public List findByZhuangtai(Object zhuangtai) {
		return findByProperty(ZHUANGTAI, zhuangtai);
	}

	public List findAll() {
		log.debug("finding all Xinxi instances");
		try {
			String queryString = "from Xinxi";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public Xinxi merge(Xinxi detachedInstance) {
		log.debug("merging Xinxi instance");
		try {
			Xinxi result = (Xinxi) getSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(Xinxi instance) {
		log.debug("attaching dirty Xinxi instance");
		try {
			getSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Xinxi instance) {
		log.debug("attaching clean Xinxi instance");
		try {
			getSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}
}