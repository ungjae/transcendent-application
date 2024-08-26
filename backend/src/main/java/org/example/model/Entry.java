package org.example.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Transient;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.UuidGenerator;

import java.math.BigDecimal;
import java.util.UUID;


@Entity(name = "entries")
@Data
@NoArgsConstructor
public class Entry {
    @Id
    @UuidGenerator
    @Column(unique = true, updatable = false)
    private UUID id;
    private BigDecimal input;
    @Transient
    private BigDecimal doubleValue;
    private BigDecimal doubleSquaredValue;

    public Entry(BigDecimal input) {
        this.input = input;
        this.doubleValue = input.multiply(BigDecimal.valueOf(2));
        this.doubleSquaredValue = getDoubleValue().pow(2);
    }

    public BigDecimal getDoubleValue() { return this.input.multiply(BigDecimal.valueOf(2)); }
}
