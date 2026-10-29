package com.henritrip.backend.repository;

import com.henritrip.backend.entity.GuideInvitation;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface GuideInvitationRepository
        extends JpaRepository<GuideInvitation, Long> {

    List<GuideInvitation> findByUserId(Long userId);

    List<GuideInvitation> findByGuideId(Long guideId);

    boolean existsByUserIdAndGuideId(Long userId, Long guideId);

    void deleteByUserIdAndGuideId(Long userId, Long guideId);
}