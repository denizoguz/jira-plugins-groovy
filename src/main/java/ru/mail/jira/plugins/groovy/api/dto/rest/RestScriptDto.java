package ru.mail.jira.plugins.groovy.api.dto.rest;

import lombok.Getter;
import lombok.Setter;
import ru.mail.jira.plugins.groovy.api.dto.ChangelogDto;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

@Getter @Setter
@XmlRootElement
public class RestScriptDto extends RestScriptForm {
    @XmlElement
    private Integer id;
    @XmlElement
    private String uuid;
    @XmlElement
    private boolean deleted;
    @XmlElement
    private List<ChangelogDto> changelogs;
}
