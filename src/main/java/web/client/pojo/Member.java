package web.client.pojo;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor

public class Member {
	private Integer memID;
	private String memName;
	private String memAccount;
	private String memPassword;
	private Date memBirthday;
	private String memPhone;
	private String memEmail;
	private String memAddress;
	private Character memAccess;
	private Integer memBonus;


}
