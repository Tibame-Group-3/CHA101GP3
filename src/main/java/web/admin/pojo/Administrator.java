package web.admin.pojo;

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
public class Administrator {
	
	private Integer adimnId;
	private String adminName;
	private String adminAccount;
	private String adminPassword;
	private String adminPhone;
	private String adminAddress;
	private String adminEmail;
	private String admimTitle;
	private String adminStatus;
	
}
