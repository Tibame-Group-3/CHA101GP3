package web.client.pojo;

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

public class Pet {

	private Integer petID;
	private Integer memID;
	private String petName;
	private String petType;
	private Character petSize;
	private Character petStatus;
}
