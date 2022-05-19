package pe.edu.upc.daoimpl;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import pe.edu.upc.daointerface.IRiskDao;
import pe.edu.upc.entity.Risk;

public class RiskDaoImpl implements Serializable, IRiskDao {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@PersistenceContext(unitName = "exam")
	private EntityManager em;

	@Transactional
	public void insert(Risk r) {
		try {
			em.persist(r);

		} catch (Exception e) {
			System.out.println("Error al insertar riesgo");
		}
	}

	@SuppressWarnings("unchecked")
	public List<Risk> list() {
		List<Risk> lista = new ArrayList<Risk>();
		try {
			Query q = em.createQuery("from Risk r");
			lista = (List<Risk>) q.getResultList();
		} catch (Exception e) {
			System.out.println("Error al listar riesgo");
		}
		return lista;
	}

	@SuppressWarnings("unchecked")
	public List<Risk> findByNameRisk(Risk r) {
		List<Risk> lista = new ArrayList<Risk>();
		try {
			Query q = em.createQuery("from Risk r where r.topicRisk like ?1");
			q.setParameter(1, "%" + r.getTopicRisk() + "%");
			lista = (List<Risk>) q.getResultList();
		} catch (Exception e) {
			System.out.println("Error al buscar riesgo");
		}
		return lista;
	}

}
