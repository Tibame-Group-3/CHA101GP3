package web.hotel.pojo;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class RoomOrder {
	
	private Integer roomOrderId;
	private Integer memId;
	private Integer roomTypeId;
	private Integer roomId;
	private Integer petId;
	private Date roomOrderDate;
	private Date checkInDate;
	private Date checkOutDate;
	private String roomOrderStatus;
	private Integer roomOriginalPrice;
	private Integer roomFinalPrice;
	private Integer roomBonus;
	private String roomOdSpecialReq;
}
