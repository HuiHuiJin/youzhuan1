package cn.yutongjiaoyu.zhangwei.djzx.model;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.hibernate.Query;
import org.hibernate.criterion.Example;

/**
 * A data access object (DAO) providing persistence and search support for
 * Yuangongzhaopian entities. Transaction control of the save(), update() and
 * delete() operations can directly support Spring container-managed
 * transactions or they can be augmented to handle user-managed Spring
 * transactions. Each of these methods provides additional information for how
 * to configure it for the desired type of transaction control.
 * 
 * @see cn.yutongjiaoyu.zhangwei.djzx.model.Yuangongzhaopian
 * @author MyEclipse Persistence Tools
 */
public class YuangongzhaopianDAO extends BaseHibernateDAO {
	private static final Log log = LogFactory.getLog(YuangongzhaopianDAO.class);
	// property constants
	public static final String ZHAOPIANURI = "zhaopianuri";
	public static final String BEIZHU = "beizhu";

	public void save(Yuangongzhaopian transientInstance) {
		log.debug("saving Yuangongzhaopian instance");
		try {
			getSession().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(Yuangongzhaopian persistentInstance) {
		log.debug("deleting Yuangongzhaopian instance");
		try {
			getSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Yuangongzhaopian findById(java.lang.Integer id) {
		log.debug("getting Yuangongzhaopian instance with id: " + id);
		try {
			Yuangongzhaopian instance = (Yuangongzhaopian) getSession().get(
					"cn.yutongjiaoyu.zhangwei.djzx.model.Yuangongzhaopian", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(Yuangongzhaopian instance) {
		log.debug("finding Yuangongzhaopian instance by example");
		try {
			List results = getSession()
					.createCriteria(
							"cn.yutongjiaoyu.zhangwei.djzx.model.Yuangongzhaopian")
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
		log.debug("finding Yuangongzhaopian instance with property: "
				+ propertyName + ", value: " + value);
		try {
			String queryString = "from Yuangongzhaopian as model where model."
					+ propertyName + "= ?";
			Query queryObject = getSession().createQuery(queryString);
			queryObject.setParameter(0, value);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByZhaopianuri(Object zhaopianuri) {
		return findByProperty(ZHAOPIANURI, zhaopianuri);
	}

	public List findByBeizhu(Object beizhu) {
		return findByProperty(BEIZHU, beizhu);
	}

	public List findAll() {
		log.debug("finding all Yuangongzhaopian instances");
		try {
			String queryString = "from Yuangongzhaopian";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public Yuangongzhaopian merge(Yuangongzhaopian detachedInstance) {
		log.debug("merging Yuangongzhaopian instance");
		try {
			Yuangongzhaopian result = (Yuangongzhaopian) getSession().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(Yuangongzhaopian instance) {
		log.debug("attaching dirty Yuangongzhaopian instance");
		try {
			getSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Yuangongzhaopian instance) {
		log.debug("attaching clean Yuangongzhaopian instance");
		try {
			getSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}
}