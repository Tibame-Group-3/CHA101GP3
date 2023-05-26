package web.hotel.pojo;

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

public class RoomReview {

	private Integer roomReviewId;
	private Integer hotelId;
	private Integer roomOrderId;
	private Integer roomReviewScore;
	private String roomReviewContent;
}
