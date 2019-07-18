package com.stackroute.keepnote.configuration;

import com.stackroute.keepnote.model.Note;
import com.stackroute.keepnote.repository.NoteRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@ComponentScan({"com.stackroute.keepnote.*"})
public class AppConfig {
    @Bean
    public InternalResourceViewResolver viewResolver()
    {
        InternalResourceViewResolver vr=new InternalResourceViewResolver();
        vr.setPrefix("/WEB-INF/views/");
        vr.setSuffix(".jsp");
        return vr;
    }
    @Bean
    public Note noteObject()
    {
        Note note=new Note();
        return note;
    }
    @Bean
    public NoteRepository noteRepositoryObject()
    {
        NoteRepository noteRepository=new NoteRepository();
        return noteRepository;
    }



}
