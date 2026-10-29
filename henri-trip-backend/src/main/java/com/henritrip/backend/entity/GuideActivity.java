package com.henritrip.backend.entity;


import jakarta.persistence.*;

@Entity
@Table(
    name = "guide_activities",
    uniqueConstraints = {
        @UniqueConstraint(
            columnNames = {"guide_id", "day_number", "visit_order"}
        )
    }
)
public class GuideActivity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "guide_id", nullable = false)
    private Guide guide;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "activity_id", nullable = false)
    private Activity activity;

    @Column(name = "day_number", nullable = false)
    private Integer dayNumber;

    @Column(name = "visit_order", nullable = false)
    private Integer visitOrder;

    public GuideActivity() {
    }

    public Long getId() {
        return id;
    }

    public Guide getGuide() {
        return guide;
    }

    public void setGuide(Guide guide) {
        this.guide = guide;
    }

    public Activity getActivity() {
        return activity;
    }

    public void setActivity(Activity activity) {
        this.activity = activity;
    }

    public Integer getDayNumber() {
        return dayNumber;
    }

    public void setDayNumber(Integer dayNumber) {
        this.dayNumber = dayNumber;
    }

    public Integer getVisitOrder() {
        return visitOrder;
    }

    public void setVisitOrder(Integer visitOrder) {
        this.visitOrder = visitOrder;
    }
}
