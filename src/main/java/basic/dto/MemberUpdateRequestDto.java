package basic.dto;

import lombok.Getter;

@Getter
public class MemberUpdateRequestDto {

    private final String name;

    public MemberUpdateRequestDto(String name) {
        this.name = name;
    }
}
