package com.eventostec.api.domain.event;

import com.eventostec.api.domain.coupon.Coupon;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Collection;
import java.util.Date;
import java.util.UUID;

@Table(name = "event")
@Entity
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Event {
    @Id
    @GeneratedValue
    private UUID id;

    private String title;
    private String description;
    private String imgUrl;
    private String eventUrl;
    private Boolean remote;
    private Date date;
    @OneToMany(mappedBy = "event")
    private Collection<Coupon> coupon;

    public Collection<Coupon> getCoupon() {
        return coupon;
    }

    public void setCoupon(Collection<Coupon> coupon) {
        this.coupon = coupon;
    }
}
