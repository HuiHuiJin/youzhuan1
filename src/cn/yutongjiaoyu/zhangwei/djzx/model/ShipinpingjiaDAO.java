package cn.yutongjiaoyu.zhangwei.djzx.model;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Example;

public class ShipinpingjiaDAO extends BaseHibernateDAO {
	private static final Log log = LogFactory.getLog(ShipinpingjiaDAO.class);
	public static final String PINGJIAXINXI = "pingjiaxinxi";

	//分页功能方法
	@SuppressWarnings("unchecked")
	public List<Shipinpingjia> findPage(Integer currentPage,Integer pageSize){
		Query query=null;
		int length=pageSize*(currentPage-1);
		try {
			String hql="from Shipinpingjia order by pingjiaid asc";
			query=getSession().createQuery(hql);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return query.setFirstResult(length).setMaxResults(pageSize).list();
	
	}
	
	public void save(Shipinpingjia transientInstance) {
		Session session=null;
		Transaction transaction=null;
		log.debug("saving Shipinpingjia instance");
		try {
			session=getSession();
			transaction=session.beginTransaction();
			session.save(transientInstance);
			transaction.commit();
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			transaction.rollback();
			throw re;
		}
	}

	public void delete(Shipinpingjia persistentInstance) {
		log.debug("deleting Shipinpingjia instance");
		try {
			getSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Shipinpingjia findById(java.lang.Integer id) {
		log.debug("getting Shipinpingjia instance with id: " + id);
		try {
			Shipinpingjia instance = (Shipinpingjia) getSession().get(
					"cn.yutongjiaoyu.zhangwei.djzx.model.Shipinpingjia", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	@SuppressWarnings("rawtypes")
	public List findByExample(Shipinpingjia instance) {
		log.debug("finding Shipinpingjia instance by example");
		try {
			List results = getSession()
					.createCriteria(
							"cn.yutongjiaoyu.zhangwei.djzx.model.Shipinpingjia")
					.add(Example.create(instance)).list();
			log.debug("find by example successful, result size: "
					+ results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}

	@SuppressWarnings("rawtypes")
	public List findByProperty(String propertyName, Object value) {
		log.debug("finding Shipinpingjia instance with property: "
				+ propertyName + ", value: " + value);
		try {
			String queryString = "from Shipinpingjia as model where model."
					+ propertyName + "= ?";
			Query queryObject = getSession().createQuery(queryString);
			queryObject.setParameter(0, value);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	@SuppressWarnings("rawtypes")
	public List findByPingjiaxinxi(Object pingjiaxinxi) {
		return findByProperty(PINGJIAXINXI, pingjiaxinxi);
	}

	@SuppressWarnings("rawtypes")
	public List findAll() {
		log.debug("finding all Shipinpingjia instances");
		try {
			String queryString = "from Shipinpingjia";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public Shipinpingjia merge(Shipinpingjia detachedInstance) {
		log.debug("merging Shipinpingjia instance");
		try {
			Shipinpingjia result = (Shipinpingjia) getSession().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(Shipinpingjia instance) {
		log.debug("attaching dirty Shipinpingjia instance");
		try {
			getSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Shipinpingjia instance) {
		log.debug("attaching clean Shipinpingjia instance");
		try {
			getSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}
}