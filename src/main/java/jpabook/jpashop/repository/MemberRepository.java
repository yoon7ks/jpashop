package jpabook.jpashop.repository;

import jpabook.jpashop.domain.Member;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceContext;
import javax.persistence.PersistenceUnit;
import java.util.List;

@Repository
public class MemberRepository {

//    @PersistenceUnit // 엔터티 매니저 팩토리를 직접 사용할 일은 없을 수도 ,
//    EntityManagerFactory emf;

    @PersistenceContext // 컨테이너가 관리하는 엔터티 매니져 주입
    EntityManager em;

    public void save(Member member) {
        em.persist(member); // 회원 엔터티를 영속화
    }

    public Member findOne(Long id) {
        return em.find(Member.class, id); // 식별자로 엔터티 조회
    }

    public List<Member> findAll() {
        return em.createQuery("select m from Member m", Member.class) // 모두 조회
                .getResultList();
    }

    public List<Member> findByName(String name) { // 이름으로 엔터티 조회
        return em.createQuery("select m from Member m where m.name = :name", Member.class)
                .setParameter("name", name)
                .getResultList();
    }

}
