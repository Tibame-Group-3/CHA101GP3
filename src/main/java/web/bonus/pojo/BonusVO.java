package web.bonus.pojo;

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


public class BonusVO {
	private Integer bonusID;
	private Integer memID;
	private Integer bonus;
	private Integer bonusType;
	private Date bonusDate;
	private Character bonusStatus;
	private String bonusContent;

}