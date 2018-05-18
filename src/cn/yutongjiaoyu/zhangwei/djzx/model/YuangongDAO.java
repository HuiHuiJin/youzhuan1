package cn.yutongjiaoyu.zhangwei.djzx.model;

import java.util.List;
import java.util.Set;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.hibernate.Query;
import org.hibernate.criterion.Example;

/**
 * A data access object (DAO) providing persistence and search support for
 * Yuangong entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see cn.yutongjiaoyu.zhangwei.djzx.model.Yuangong
 * @author MyEclipse Persistence Tools
 */
public class YuangongDAO extends BaseHibernateDAO {
	private static final Log log = LogFactory.getLog(YuangongDAO.class);
	// property constants
	public static final String YUANGONGMING = "yuangongming";
	public static final String SHENGRI = "shengri";
	public static final String XINGBIE = "xingbie";
	public static final String ZHENGZHIMIANMAO = "zhengzhimianmao";
	public static final String RUZHISHIJIAN = "ruzhishijian";
	public static final String BEIZHU = "beizhu";
	public static final String DENGLUMING = "dengluming";
	public static final String DENGLUMIMA = "denglumima";

	public void save(Yuangong transientInstance) {
		log.debug("saving Yuangong instance");
		try {
			getSession().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(Yuangong persistentInstance) {
		log.debug("deleting Yuangong instance");
		try {
			getSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Yuangong findById(java.lang.Integer id) {
		log.debug("getting Yuangong instance with id: " + id);
		try {
			Yuangong instance = (Yuangong) getSession().get(
					"cn.yutongjiaoyu.zhangwei.djzx.model.Yuangong", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(Yuangong instance) {
		log.debug("finding Yuangong instance by example");
		try {
			List results = getSession()
					.createCriteria(
							"cn.yutongjiaoyu.zhangwei.djzx.model.Yuangong")
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
		log.debug("finding Yuangong instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from Yuangong as model where model."
					+ propertyName + "= ?";
			Query queryObject = getSession().createQuery(queryString);
			queryObject.setParameter(0, value);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByYuangongming(Object yuangongming) {
		return findByProperty(YUANGONGMING, yuangongming);
	}

	public List findByShengri(Object shengri) {
		return findByProperty(SHENGRI, shengri);
	}

	public List findByXingbie(Object xingbie) {
		return findByProperty(XINGBIE, xingbie);
	}

	public List findByZhengzhimianmao(Object zhengzhimianmao) {
		return findByProperty(ZHENGZHIMIANMAO, zhengzhimianmao);
	}

	public List findByRuzhishijian(Object ruzhishijian) {
		return findByProperty(RUZHISHIJIAN, ruzhishijian);
	}

	public List findByBeizhu(Object beizhu) {
		return findByProperty(BEIZHU, beizhu);
	}

	public List findByDengluming(Object dengluming) {
		return findByProperty(DENGLUMING, dengluming);
	}

	public List findByDenglumima(Object denglumima) {
		return findByProperty(DENGLUMIMA, denglumima);
	}

	public List findAll() {
		log.debug("finding all Yuangong instances");
		try {
			String queryString = "from Yuangong";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public Yuangong merge(Yuangong detachedInstance) {
		log.debug("merging Yuangong instance");
		try {
			Yuangong result = (Yuangong) getSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(Yuangong instance) {
		log.debug("attaching dirty Yuangong instance");
		try {
			getSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Yuangong instance) {
		log.debug("attaching clean Yuangong instance");
		try {
			getSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}
}