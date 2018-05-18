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
 * Yuangongrenwu entities. Transaction control of the save(), update() and
 * delete() operations can directly support Spring container-managed
 * transactions or they can be augmented to handle user-managed Spring
 * transactions. Each of these methods provides additional information for how
 * to configure it for the desired type of transaction control.
 * 
 * @see cn.yutongjiaoyu.zhangwei.djzx.model.Yuangongrenwu
 * @author MyEclipse Persistence Tools
 */
public class YuangongrenwuDAO extends BaseHibernateDAO {
	private static final Log log = LogFactory.getLog(YuangongrenwuDAO.class);
	// property constants
	public static final String ZHUANGTAI = "zhuangtai";
	public static final String BEIZHU = "beizhu";

	public void save(Yuangongrenwu transientInstance) {
		log.debug("saving Yuangongrenwu instance");
		try {
			getSession().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(Yuangongrenwu persistentInstance) {
		log.debug("deleting Yuangongrenwu instance");
		try {
			getSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Yuangongrenwu findById(java.lang.Integer id) {
		log.debug("getting Yuangongrenwu instance with id: " + id);
		try {
			Yuangongrenwu instance = (Yuangongrenwu) getSession().get(
					"cn.yutongjiaoyu.zhangwei.djzx.model.Yuangongrenwu", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(Yuangongrenwu instance) {
		log.debug("finding Yuangongrenwu instance by example");
		try {
			List results = getSession()
					.createCriteria(
							"cn.yutongjiaoyu.zhangwei.djzx.model.Yuangongrenwu")
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
		log.debug("finding Yuangongrenwu instance with property: "
				+ propertyName + ", value: " + value);
		try {
			String queryString = "from Yuangongrenwu as model where model."
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

	public List findByBeizhu(Object beizhu) {
		return findByProperty(BEIZHU, beizhu);
	}

	public List findAll() {
		log.debug("finding all Yuangongrenwu instances");
		try {
			String queryString = "from Yuangongrenwu";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public Yuangongrenwu merge(Yuangongrenwu detachedInstance) {
		log.debug("merging Yuangongrenwu instance");
		try {
			Yuangongrenwu result = (Yuangongrenwu) getSession().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(Yuangongrenwu instance) {
		log.debug("attaching dirty Yuangongrenwu instance");
		try {
			getSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Yuangongrenwu instance) {
		log.debug("attaching clean Yuangongrenwu instance");
		try {
			getSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}
}