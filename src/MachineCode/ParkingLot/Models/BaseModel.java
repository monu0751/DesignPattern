package MachineCode.ParkingLot.Models;

import java.time.LocalDateTime;

public abstract class BaseModel {
    private int Id;
    private LocalDateTime CreatedAt;
    private LocalDateTime UpdatedAt;
    private String CreatedBy;
    private String UpdatedBy;

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public LocalDateTime getCreatedAt() {
        return CreatedAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        CreatedAt = createdAt;
    }

    public LocalDateTime getUpdatedAt() {
        return UpdatedAt;
    }

    public void setUpdatedAt(LocalDateTime updatedAt) {
        UpdatedAt = updatedAt;
    }

    public String getCreatedBy() {
        return CreatedBy;
    }

    public void setCreatedBy(String createdBy) {
        CreatedBy = createdBy;
    }

    public String getUpdatedBy() {
        return UpdatedBy;
    }

    public void setUpdatedBy(String updatedBy) {
        UpdatedBy = updatedBy;
    }
}
